package benchmark.speedb.utils;

import com.google.protobuf.Timestamp;

public class Util {

    public static Timestamp fromTime(long timestamp) {
        return Timestamp
            .newBuilder()
            .setSeconds(timestamp / 1000)
            .setNanos((int) ((timestamp % 1000) * 1000000))
            .build();
    }

    public static long fromTime(Timestamp timestamp) {
        long seconds = timestamp.getSeconds();
        int nanos = timestamp.getNanos();
        return (seconds * 1000) + (nanos / 1000000);
    }
}
