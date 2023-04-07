package benchmark.speedb.utils;

import benchmark.speedb.proto.TimerObject;
import com.google.protobuf.InvalidProtocolBufferException;
import io.grpc.util.AdvancedTlsX509KeyManager.Closeable;
import java.util.Iterator;
import org.apache.commons.lang3.tuple.Pair;
import org.apache.kafka.common.utils.Bytes;
import org.apache.kafka.streams.KeyValue;
import org.apache.kafka.streams.state.KeyValueIterator;

public class TimerObjectIterator
    implements Iterator<Pair<String, TimerObject>>, Closeable {

    private KeyValueIterator<String, Bytes> kafkaIter;

    public TimerObjectIterator(KeyValueIterator<String, Bytes> kafkaIter) {
        this.kafkaIter = kafkaIter;
    }

    public boolean hasNext() {
        return kafkaIter.hasNext();
    }

    public Pair<String, TimerObject> next() {
        KeyValue<String, Bytes> raw = kafkaIter.next();

        TimerObject to;
        try {
            to = TimerObject.parseFrom(raw.value.get());
        } catch (InvalidProtocolBufferException exn) {
            exn.printStackTrace();
            throw new RuntimeException(exn);
        }

        return Pair.of(raw.key.split("/")[1] + "/" + raw.key.split("/")[2], to);
    }

    public void close() {
        kafkaIter.close();
    }
}
