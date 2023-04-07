package benchmark.speedb;

import benchmark.speedb.proto.Command;
import java.util.Arrays;
import java.util.Map;
import java.util.Properties;
import org.apache.kafka.clients.admin.Admin;
import org.apache.kafka.clients.admin.AdminClientConfig;
import org.apache.kafka.clients.admin.CreateTopicsResult;
import org.apache.kafka.clients.admin.NewTopic;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.KafkaFuture;
import org.apache.kafka.common.errors.TopicExistsException;
import org.apache.kafka.common.serialization.Serdes;
import org.apache.kafka.common.utils.Bytes;

public class Config {

    private Properties props;
    private KafkaProducer<String, Bytes> producer;

    public Config(Properties overrides) {
        Properties defaults = new Properties();

        // prettier-ignore
        defaults.putAll(Map.of(
            "kafka.bootstrap.servers", "localhost:9092",
            "kafka.replication.factor", 1,
            "kafka.state.dir", "/tmp/kafkaState",
            "advertised.host", "localhost",
            "advertised.port", 5000
        ));
        for (Map.Entry<Object, Object> e : overrides.entrySet()) {
            defaults.put(e.getKey(), e.getValue());
        }
        props = defaults;

        Properties producerCfg = new Properties();
        producerCfg.put("bootstrap.servers", props.get("kafka.bootstrap.servers"));
        producerCfg.put(
            ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG,
            Serdes.Bytes().serializer().getClass()
        );
        producerCfg.put(
            ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG,
            org.apache.kafka.common.serialization.StringSerializer.class
        );
        producerCfg.put("client.id", "benchmark-speedb");
        producer = new KafkaProducer<>(producerCfg);
    }

    public String getBootstrapServers() {
        return (String) props.get("kafka.bootstrap.servers");
    }

    public String getStateDir() {
        return (String) props.get("kafka.state.dir");
    }

    public void doIdempotentSetup() {
        Properties adminProps = new Properties();
        adminProps.put(
            AdminClientConfig.BOOTSTRAP_SERVERS_CONFIG,
            (String) props.get("kafka.bootstrap.servers")
        );
        Admin admin = Admin.create(adminProps);
        short replicationFactor =
            ((Integer) (props.get("kafka.replication.factor"))).shortValue();
        int inputPartitions = 1;

        NewTopic inputTopic = new NewTopic(
            "input",
            inputPartitions,
            replicationFactor
        );

        NewTopic metricsUpdateTopic = new NewTopic(
            "metrics",
            inputPartitions,
            replicationFactor
        );

        CreateTopicsResult result = admin.createTopics(
            Arrays.asList(inputTopic, metricsUpdateTopic)
        );
        for (String topicName : Arrays.asList("input", "metrics")) {
            KafkaFuture<Void> future = result.values().get(topicName);
            try {
                future.get();
            } catch (Exception e) {
                if (
                    e.getCause() != null &&
                    e.getCause() instanceof TopicExistsException
                ) {
                    System.out.println("Topic " + topicName + " already exists.");
                } else {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    /*
     * Yeah...I know this is really sloppy and doesn't actually guarantee that
     * the records get sent (it's fire-and-forget), but it serves the purpose
     * of benchmarking rocksdb.
     *
     * It also doesn't use keys, but hey, there's just one partition.
     */
    public void sendRecord(Command thing) {
        producer.send(
            new ProducerRecord<String, Bytes>("input", new Bytes(thing.toByteArray()))
        );
    }

    public void flush() {
        producer.flush();
    }
}
