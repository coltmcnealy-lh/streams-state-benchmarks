package benchmark.speedb.utils;

import benchmark.speedb.proto.MetricsWindow;
import benchmark.speedb.proto.TaskRun;
import benchmark.speedb.proto.WorfklowMetricsResponse;
import benchmark.speedb.proto.Workflow;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Timestamp;
import org.apache.kafka.common.utils.Bytes;
import org.apache.kafka.streams.KeyValue;
import org.apache.kafka.streams.state.KeyValueIterator;
import org.apache.kafka.streams.state.ReadOnlyKeyValueStore;

public class ROStore {

    private ReadOnlyKeyValueStore<String, Bytes> rawStore;

    public ROStore(ReadOnlyKeyValueStore<String, Bytes> rawStore) {
        this.rawStore = rawStore;
    }

    public Workflow getWorkflow(String id) {
        String key = "WORKFLOW/" + id;
        Bytes result = rawStore.get(key);
        if (result == null) return null;

        try {
            return Workflow.parseFrom(result.get());
        } catch (InvalidProtocolBufferException exn) {
            exn.printStackTrace();
            throw new RuntimeException(exn);
        }
    }

    public TaskRun getTaskRun(String wfId, int number) {
        String key = "TASK_RUN/" + wfId + "/" + number;
        Bytes result = rawStore.get(key);
        if (result == null) return null;

        try {
            return TaskRun.parseFrom(result.get());
        } catch (InvalidProtocolBufferException exn) {
            exn.printStackTrace();
            throw new RuntimeException(exn);
        }
    }

    public static String timestampToDbFormat(long timestamp) {
        return String.format("%012d", timestamp);
    }

    public static final long WINDOW_LENGTH = 30 * 1000;

    /*
     * Metrics Windows are 30-second windows. They have well-defined start
     * times.
     */
    public static long getWindowStart(long time) {
        long numWindows = time / WINDOW_LENGTH;
        return numWindows * WINDOW_LENGTH;
    }

    public MetricsWindow getMetricsWindow(long time) {
        String id = "METRICS_WINDOW/" + timestampToDbFormat(getWindowStart(time));
        Bytes result = rawStore.get(id);
        if (result == null) return null;

        try {
            return MetricsWindow.parseFrom(result.get());
        } catch (InvalidProtocolBufferException exn) {
            throw new RuntimeException(exn);
        }
    }

    public MetricsWindow getCurrentMetricsWindow() {
        long timestamp = getWindowStart(System.currentTimeMillis());
        MetricsWindow out = getMetricsWindow(timestamp);
        if (out != null) {
            return out;
        }

        return MetricsWindow
            .newBuilder()
            .setWindowStart(
                Timestamp.newBuilder().setSeconds(timestamp / 1000).build()
            )
            .build();
    }

    public TimerObjectIterator getTimersUntil(long timestamp) {
        String startKey = "TIMER_OBJECT/";
        String endKey = startKey + timestampToDbFormat(timestamp);

        KeyValueIterator<String, Bytes> rawIter = rawStore.range(startKey, endKey);
        return new TimerObjectIterator(rawIter);
    }

    public WorfklowMetricsResponse scanWorkflowMetrics(
        long lastWindowTime,
        int numWindows
    ) {
        lastWindowTime = getWindowStart(lastWindowTime);
        long firstWindowTime = lastWindowTime - (WINDOW_LENGTH * numWindows);

        String firstWindow = "METRICS_WINDOW/" + timestampToDbFormat(firstWindowTime);
        String lastWindow = "METRICS_WINDOW/" + timestampToDbFormat(firstWindowTime);

        firstWindow = "METRICS_WINDOW/";
        lastWindow = "METRICS_WINDOW/~";

        WorfklowMetricsResponse.Builder out = WorfklowMetricsResponse.newBuilder();
        try (
            KeyValueIterator<String, Bytes> raw = rawStore.range(
                firstWindow,
                lastWindow
            )
        ) {
            while (raw.hasNext()) {
                KeyValue<String, Bytes> next = raw.next();
                out.addMetrics(MetricsWindow.parseFrom(next.value.get()));
            }
        } catch (InvalidProtocolBufferException exn) {
            throw new RuntimeException(exn);
        }

        return out.build();
    }
}
