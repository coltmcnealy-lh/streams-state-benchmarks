// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: model.proto

package benchmark.speedb.proto;

public interface TaskRunOrBuilder extends
    // @@protoc_insertion_point(interface_extends:streamspeedb.TaskRun)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string wf_id = 1;</code>
   * @return The wfId.
   */
  java.lang.String getWfId();
  /**
   * <code>string wf_id = 1;</code>
   * @return The bytes for wfId.
   */
  com.google.protobuf.ByteString
      getWfIdBytes();

  /**
   * <code>int32 number = 2;</code>
   * @return The number.
   */
  int getNumber();

  /**
   * <code>.google.protobuf.Timestamp launch_time = 3;</code>
   * @return Whether the launchTime field is set.
   */
  boolean hasLaunchTime();
  /**
   * <code>.google.protobuf.Timestamp launch_time = 3;</code>
   * @return The launchTime.
   */
  com.google.protobuf.Timestamp getLaunchTime();
  /**
   * <code>.google.protobuf.Timestamp launch_time = 3;</code>
   */
  com.google.protobuf.TimestampOrBuilder getLaunchTimeOrBuilder();

  /**
   * <code>.google.protobuf.Timestamp start_time = 4;</code>
   * @return Whether the startTime field is set.
   */
  boolean hasStartTime();
  /**
   * <code>.google.protobuf.Timestamp start_time = 4;</code>
   * @return The startTime.
   */
  com.google.protobuf.Timestamp getStartTime();
  /**
   * <code>.google.protobuf.Timestamp start_time = 4;</code>
   */
  com.google.protobuf.TimestampOrBuilder getStartTimeOrBuilder();

  /**
   * <code>.google.protobuf.Timestamp complete_time = 5;</code>
   * @return Whether the completeTime field is set.
   */
  boolean hasCompleteTime();
  /**
   * <code>.google.protobuf.Timestamp complete_time = 5;</code>
   * @return The completeTime.
   */
  com.google.protobuf.Timestamp getCompleteTime();
  /**
   * <code>.google.protobuf.Timestamp complete_time = 5;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCompleteTimeOrBuilder();

  /**
   * <code>string payload = 6;</code>
   * @return Whether the payload field is set.
   */
  boolean hasPayload();
  /**
   * <code>string payload = 6;</code>
   * @return The payload.
   */
  java.lang.String getPayload();
  /**
   * <code>string payload = 6;</code>
   * @return The bytes for payload.
   */
  com.google.protobuf.ByteString
      getPayloadBytes();
}
