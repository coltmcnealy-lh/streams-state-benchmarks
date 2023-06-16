package benchmark.speedb;

import benchmark.speedb.proto.Command;
import benchmark.speedb.proto.KafkaStreamsMetricsReply;
import benchmark.speedb.proto.MetricsServiceGrpc.MetricsServiceImplBase;
import benchmark.speedb.proto.WorfklowMetricsResponse;
import benchmark.speedb.proto.WorkflowMetricsQuery;
import benchmark.speedb.utils.CommandSerde;
import benchmark.speedb.utils.CoreProcessor;
import benchmark.speedb.utils.ROStore;
import benchmark.speedb.utils.Util;
import com.google.protobuf.Empty;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import java.io.Closeable;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;
import org.apache.kafka.common.Metric;
import org.apache.kafka.common.MetricName;
import org.apache.kafka.common.TopicPartition;
import org.apache.kafka.common.serialization.Serde;
import org.apache.kafka.common.serialization.Serdes;
import org.apache.kafka.common.utils.Bytes;
import org.apache.kafka.streams.KafkaStreams;
import org.apache.kafka.streams.StoreQueryParameters;
import org.apache.kafka.streams.StreamsConfig;
import org.apache.kafka.streams.Topology;
import org.apache.kafka.streams.processor.StateRestoreListener;
import org.apache.kafka.streams.state.KeyValueStore;
import org.apache.kafka.streams.state.QueryableStoreTypes;
import org.apache.kafka.streams.state.ReadOnlyKeyValueStore;
import org.apache.kafka.streams.state.StoreBuilder;
import org.apache.kafka.streams.state.Stores;

public class BenchmarkServer extends MetricsServiceImplBase implements Closeable {

    private KafkaStreams streams;
    private Server grpcServer;

    public BenchmarkServer(Config cfg) {
        Serde<Command> cmdSerde = new CommandSerde();
        Runtime.getRuntime().addShutdownHook(new Thread(cmdSerde::close));

        Topology topo = new Topology();

        topo.addSource(
            "source",
            Serdes.String().deserializer(),
            cmdSerde.deserializer(),
            "input"
        );

        topo.addProcessor(
            "core-processor",
            () -> {
                return new CoreProcessor();
            },
            "source"
        );

        StoreBuilder<KeyValueStore<String, Bytes>> builder = Stores.keyValueStoreBuilder(
            Stores.persistentKeyValueStore("core-store"),
            Serdes.String(),
            Serdes.Bytes()
        );
        topo.addStateStore(builder, "core-processor");

        Properties props = new Properties();
        props.put("bootstrap.servers", cfg.getBootstrapServers());
        props.put("application.id", "benchmark-speedb");
        props.put("state.dir", cfg.getStateDir());
        props.put("group.instance.id", "the-one-and-only");
        props.put(
            StreamsConfig.ROCKSDB_CONFIG_SETTER_CLASS_CONFIG,
            RocksConfigSetter.class
        );

        // Maybe might want this to be trace, but most rocksdb metrics
        // are "debug" so it should be good enough I think.
        props.put("metrics.recording.level", "DEBUG");

        streams = new KafkaStreams(topo, props);

        streams.setStateListener((oldState, newState) -> {
            System.out.println(new Date().toString() + " new State: " + newState);
        });

        streams.setGlobalStateRestoreListener(
            new StateRestoreListener() {
                public void onBatchRestored(
                    TopicPartition tp,
                    String unknown,
                    long foo,
                    long bar
                ) {}

                public void onRestoreStart(
                    TopicPartition tp,
                    String unknown,
                    long foo,
                    long bar
                ) {
                    System.out.println(
                        "Starting restore at " + System.currentTimeMillis()
                    );
                }

                public void onRestoreEnd(
                    TopicPartition tp,
                    String unknown,
                    long bar
                ) {
                    System.out.println(
                        "Finished restore at " + System.currentTimeMillis()
                    );
                }
            }
        );

        grpcServer = ServerBuilder.forPort(5000).addService(this).build();
    }

    public void run() throws IOException {
        streams.start();
        grpcServer.start();
    }

    public void close() {
        System.out.println("Closing streams");
        streams.close();
        System.out.println("Done closing streams");
    }

    @Override
    public void kafkaStreamsMetrics(
        Empty req,
        StreamObserver<KafkaStreamsMetricsReply> ctx
    ) {
        KafkaStreamsMetricsReply.Builder out = KafkaStreamsMetricsReply.newBuilder();

        for (Metric metric : streams.metrics().values()) {
            MetricName name = metric.metricName();
            String strName = name.group() + "-" + name.name();
            out.putMetrics(strName, metric.metricValue().toString());
        }

        ctx.onNext(out.build());
        ctx.onCompleted();
    }

    @Override
    public void workflowMetrics(
        WorkflowMetricsQuery req,
        StreamObserver<WorfklowMetricsResponse> ctx
    ) {
        ReadOnlyKeyValueStore<String, Bytes> rawStore = streams.store(
            StoreQueryParameters.fromNameAndType(
                "core-store",
                QueryableStoreTypes.keyValueStore()
            )
        );

        ROStore store = new ROStore(rawStore);
        ctx.onNext(
            store.scanWorkflowMetrics(
                Util.fromTime(req.getLatestWindowStart()),
                req.getNumWindows()
            )
        );
        ctx.onCompleted();
    }
}
