package benchmark.speedb.utils;

import benchmark.speedb.proto.MetricsWindow;
import benchmark.speedb.proto.TaskRun;
import benchmark.speedb.proto.TimerObject;
import benchmark.speedb.proto.Workflow;
import org.apache.kafka.common.utils.Bytes;
import org.apache.kafka.streams.state.KeyValueStore;

public class RWStore extends ROStore {

    private KeyValueStore<String, Bytes> rawStore;

    public RWStore(KeyValueStore<String, Bytes> rawStore) {
        super(rawStore);
        this.rawStore = rawStore;
    }

    public void putWorkflow(Workflow wf) {
        String id = "WORKFLOW/" + wf.getId();
        rawStore.put(id, new Bytes(wf.toByteArray()));
    }

    public void putTaskRun(TaskRun tr) {
        String id = "TASK_RUN/" + tr.getWfId() + "/" + tr.getNumber();
        rawStore.put(id, new Bytes(tr.toByteArray()));
    }

    public void putTimerObject(TimerObject to) {
        String id =
            "TIMER_OBJECT/" +
            timestampToDbFormat(Util.fromTime(to.getMaturationTime())) +
            "/" +
            to.getGuid();
        rawStore.put(id, new Bytes(to.toByteArray()));
    }

    public void deleteTimerObject(TimerObject to) {
        String id =
            "TIMER_OBJECT/" +
            timestampToDbFormat(Util.fromTime(to.getMaturationTime())) +
            "/" +
            to.getGuid();
        rawStore.delete(id);
    }

    public void putMetricsWindow(MetricsWindow mw) {
        String id =
            "METRICS_WINDOW/" +
            timestampToDbFormat(mw.getWindowStart().getSeconds() * 1000);
        rawStore.put(id, new Bytes(mw.toByteArray()));
    }
}
