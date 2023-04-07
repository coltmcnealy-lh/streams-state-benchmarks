// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: model.proto

package benchmark.speedb.proto;

public interface MetricsWindowOrBuilder extends
    // @@protoc_insertion_point(interface_extends:streamspeedb.MetricsWindow)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 total_task_starts = 1;</code>
   * @return The totalTaskStarts.
   */
  long getTotalTaskStarts();

  /**
   * <code>int64 total_task_start_latency = 2;</code>
   * @return The totalTaskStartLatency.
   */
  long getTotalTaskStartLatency();

  /**
   * <code>int64 max_task_start_latency = 3;</code>
   * @return The maxTaskStartLatency.
   */
  long getMaxTaskStartLatency();

  /**
   * <code>int64 total_task_completes = 4;</code>
   * @return The totalTaskCompletes.
   */
  long getTotalTaskCompletes();

  /**
   * <code>int64 total_task_complete_latency = 5;</code>
   * @return The totalTaskCompleteLatency.
   */
  long getTotalTaskCompleteLatency();

  /**
   * <code>int64 max_task_complete_latency = 6;</code>
   * @return The maxTaskCompleteLatency.
   */
  long getMaxTaskCompleteLatency();

  /**
   * <code>.google.protobuf.Timestamp window_start = 7;</code>
   * @return Whether the windowStart field is set.
   */
  boolean hasWindowStart();
  /**
   * <code>.google.protobuf.Timestamp window_start = 7;</code>
   * @return The windowStart.
   */
  com.google.protobuf.Timestamp getWindowStart();
  /**
   * <code>.google.protobuf.Timestamp window_start = 7;</code>
   */
  com.google.protobuf.TimestampOrBuilder getWindowStartOrBuilder();
}