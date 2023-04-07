package benchmark.speedb.utils;

import benchmark.speedb.proto.Command;
import benchmark.speedb.proto.Command.CompleteTask;
import benchmark.speedb.proto.Command.StartTask;
import benchmark.speedb.proto.Command.StartWf;
import benchmark.speedb.proto.MetricsWindow;
import benchmark.speedb.proto.TaskRun;
import benchmark.speedb.proto.TimerObject;
import benchmark.speedb.proto.Workflow;
import java.time.Duration;
import java.util.UUID;
import org.apache.commons.lang3.tuple.Pair;
import org.apache.kafka.streams.processor.PunctuationType;
import org.apache.kafka.streams.processor.api.Processor;
import org.apache.kafka.streams.processor.api.ProcessorContext;
import org.apache.kafka.streams.processor.api.Record;

public class CoreProcessor
    implements Processor<String, Command, String, MetricsWindow> {

    private RWStore store;

    public void init(final ProcessorContext<String, MetricsWindow> ctx) {
        store = new RWStore(ctx.getStateStore("core-store"));
        ctx.schedule(
            Duration.ofSeconds(40),
            PunctuationType.WALL_CLOCK_TIME,
            this::clearTimers
        );
    }

    public void process(final Record<String, Command> record) {
        Command cmd = record.value();
        switch (cmd.getCommandCase()) {
            case START_TASK:
                startTask(record);
                break;
            case COMPLETE_TASK:
                completeTask(record);
                break;
            case START_WF:
                startWf(record);
                break;
            case COMMAND_NOT_SET:
            default:
                System.out.println("yikes this houldn't happen");
        }
    }

    private void startWf(final Record<String, Command> record) {
        Command cmd = record.value();
        StartWf sw = cmd.getStartWf();

        Workflow wf = Workflow
            .newBuilder()
            .setId(sw.getId())
            .setLaunchTime(Util.fromTime(record.timestamp()))
            .setStartTime(Util.fromTime(System.currentTimeMillis()))
            .build();
        store.putWorkflow(wf);
    }

    private void startTask(final Record<String, Command> record) {
        Command cmd = record.value();
        StartTask st = cmd.getStartTask();

        String[] split = st.getWfId().split("-");
        int wfNum = Integer.valueOf(split[split.length - 1]);
        if (wfNum % 500 == 0) {
            System.out.println(
                System.currentTimeMillis() +
                " Wf " +
                wfNum +
                " processing task " +
                st.getTaskNumber()
            );
        }

        Workflow.Builder wf = store.getWorkflow(st.getWfId()).toBuilder();

        long launchTime;

        if (st.getTaskNumber() == 0) {
            launchTime = Util.fromTime(wf.getStartTime());
        } else {
            TaskRun lastTask = store.getTaskRun(
                wf.getId(),
                wf.getCurrentTaskRunNumber()
            );
            launchTime = Util.fromTime(lastTask.getCompleteTime());
        }
        long scheduleToStartLatency = System.currentTimeMillis() - launchTime;

        MetricsWindow.Builder metrics = store.getCurrentMetricsWindow().toBuilder();
        metrics.setTotalTaskStarts(metrics.getTotalTaskStarts() + 1);
        metrics.setTotalTaskStartLatency(
            metrics.getTotalTaskStartLatency() + scheduleToStartLatency
        );
        if (scheduleToStartLatency > metrics.getMaxTaskStartLatency()) {
            metrics.setMaxTaskStartLatency(scheduleToStartLatency);
        }

        wf.setCurrentTaskRunNumber(st.getTaskNumber());

        TaskRun newTask = TaskRun
            .newBuilder()
            .setLaunchTime(Util.fromTime(launchTime))
            .setStartTime(Util.fromTime(System.currentTimeMillis()))
            .setWfId(st.getWfId())
            .setNumber(st.getTaskNumber())
            .build();

        // Put a fake "timer" object in there.
        TimerObject to = TimerObject
            .newBuilder()
            .setGuid(UUID.randomUUID().toString())
            .setPayload("SomeRandomStuffThatDoesn'tMatter")
            .setMaturationTime(Util.fromTime(System.currentTimeMillis() + 1000 * 10))
            .build();

        store.putTimerObject(to);
        store.putTaskRun(newTask);
        store.putMetricsWindow(metrics.build());
        store.putWorkflow(wf.build());
    }

    private void completeTask(final Record<String, Command> record) {
        Command cmd = record.value();
        CompleteTask ct = cmd.getCompleteTask();

        Workflow wf = store.getWorkflow(ct.getWfId());
        TaskRun.Builder lastTask = store
            .getTaskRun(wf.getId(), wf.getCurrentTaskRunNumber())
            .toBuilder();

        lastTask
            .setCompleteTime(Util.fromTime(System.currentTimeMillis()))
            .setPayload(ct.getPayload());

        long startToCompleteLatency =
            System.currentTimeMillis() - Util.fromTime(lastTask.getStartTime());

        MetricsWindow.Builder metrics = store.getCurrentMetricsWindow().toBuilder();
        metrics.setTotalTaskCompletes(metrics.getTotalTaskCompletes() + 1);
        metrics.setTotalTaskCompleteLatency(
            metrics.getTotalTaskCompleteLatency() + startToCompleteLatency
        );
        if (startToCompleteLatency > metrics.getMaxTaskCompleteLatency()) {
            metrics.setMaxTaskCompleteLatency(startToCompleteLatency);
        }

        store.putMetricsWindow(metrics.build());
        store.putTaskRun(lastTask.build());
    }

    private void clearTimers(long punctuationTime) {
        long startTime = System.currentTimeMillis();
        System.out.println("Doing a range scan in punctuator");

        int numEntries = 0;

        // NOTE: it would be more efficient to do a `deleteRange` here. However,
        // in the actual LittleHorse topology we only delete certain keys depending
        // on what's in their value, so this implementation mirrors that workload
        // better. And I also wanted to put rangescans in this test topology
        // somewhere.
        try (TimerObjectIterator it = store.getTimersUntil(punctuationTime)) {
            while (it.hasNext()) {
                Pair<String, TimerObject> pair = it.next();
                store.deleteTimerObject(pair.getValue());
                numEntries++;
            }
        }

        System.out.println(
            "Completed range scan and deleted " +
            numEntries +
            " entries in " +
            (System.currentTimeMillis() - startTime) +
            " milliseconds"
        );
    }
}
