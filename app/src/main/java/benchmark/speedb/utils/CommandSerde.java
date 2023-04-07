package benchmark.speedb.utils;

import benchmark.speedb.proto.Command;
import com.google.protobuf.InvalidProtocolBufferException;
import org.apache.kafka.common.serialization.Deserializer;
import org.apache.kafka.common.serialization.Serde;
import org.apache.kafka.common.serialization.Serializer;

public class CommandSerde implements Serde<Command> {

    public Serializer<Command> serializer() {
        return new Serializer<Command>() {
            public byte[] serialize(String topic, Command thing) {
                return thing.toByteArray();
            }
        };
    }

    public Deserializer<Command> deserializer() {
        return new Deserializer<Command>() {
            public Command deserialize(String topic, byte[] data) {
                try {
                    return Command.parseFrom(data);
                } catch (InvalidProtocolBufferException exn) {
                    throw new RuntimeException(exn);
                }
            }
        };
    }
}
