// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: model.proto

package benchmark.speedb.proto;

public interface WorkflowOrBuilder extends
    // @@protoc_insertion_point(interface_extends:streamspeedb.Workflow)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string id = 1;</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <code>string id = 1;</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <code>.google.protobuf.Timestamp launch_time = 2;</code>
   * @return Whether the launchTime field is set.
   */
  boolean hasLaunchTime();
  /**
   * <code>.google.protobuf.Timestamp launch_time = 2;</code>
   * @return The launchTime.
   */
  com.google.protobuf.Timestamp getLaunchTime();
  /**
   * <code>.google.protobuf.Timestamp launch_time = 2;</code>
   */
  com.google.protobuf.TimestampOrBuilder getLaunchTimeOrBuilder();

  /**
   * <code>.google.protobuf.Timestamp start_time = 3;</code>
   * @return Whether the startTime field is set.
   */
  boolean hasStartTime();
  /**
   * <code>.google.protobuf.Timestamp start_time = 3;</code>
   * @return The startTime.
   */
  com.google.protobuf.Timestamp getStartTime();
  /**
   * <code>.google.protobuf.Timestamp start_time = 3;</code>
   */
  com.google.protobuf.TimestampOrBuilder getStartTimeOrBuilder();

  /**
   * <code>bool completed = 4;</code>
   * @return The completed.
   */
  boolean getCompleted();

  /**
   * <code>int32 current_task_run_number = 5;</code>
   * @return The currentTaskRunNumber.
   */
  int getCurrentTaskRunNumber();
}
