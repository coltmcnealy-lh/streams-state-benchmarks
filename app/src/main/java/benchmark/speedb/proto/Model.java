// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: model.proto

package benchmark.speedb.proto;

public final class Model {
  private Model() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_streamspeedb_Workflow_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_streamspeedb_Workflow_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_streamspeedb_TaskRun_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_streamspeedb_TaskRun_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_streamspeedb_TimerObject_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_streamspeedb_TimerObject_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_streamspeedb_MetricsWindow_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_streamspeedb_MetricsWindow_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_streamspeedb_Command_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_streamspeedb_Command_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_streamspeedb_Command_StartWf_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_streamspeedb_Command_StartWf_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_streamspeedb_Command_StartTask_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_streamspeedb_Command_StartTask_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_streamspeedb_Command_CompleteTask_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_streamspeedb_Command_CompleteTask_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_streamspeedb_KafkaStreamsMetricsReply_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_streamspeedb_KafkaStreamsMetricsReply_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_streamspeedb_KafkaStreamsMetricsReply_MetricsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_streamspeedb_KafkaStreamsMetricsReply_MetricsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_streamspeedb_WorkflowMetricsQuery_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_streamspeedb_WorkflowMetricsQuery_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_streamspeedb_WorfklowMetricsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_streamspeedb_WorfklowMetricsResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\013model.proto\022\014streamspeedb\032\037google/prot" +
      "obuf/timestamp.proto\032\033google/protobuf/em" +
      "pty.proto\"\253\001\n\010Workflow\022\n\n\002id\030\001 \001(\t\022/\n\013la" +
      "unch_time\030\002 \001(\0132\032.google.protobuf.Timest" +
      "amp\022.\n\nstart_time\030\003 \001(\0132\032.google.protobu" +
      "f.Timestamp\022\021\n\tcompleted\030\004 \001(\010\022\037\n\027curren" +
      "t_task_run_number\030\005 \001(\005\"\336\001\n\007TaskRun\022\r\n\005w" +
      "f_id\030\001 \001(\t\022\016\n\006number\030\002 \001(\005\022/\n\013launch_tim" +
      "e\030\003 \001(\0132\032.google.protobuf.Timestamp\022.\n\ns" +
      "tart_time\030\004 \001(\0132\032.google.protobuf.Timest" +
      "amp\0221\n\rcomplete_time\030\005 \001(\0132\032.google.prot" +
      "obuf.Timestamp\022\024\n\007payload\030\006 \001(\tH\000\210\001\001B\n\n\010" +
      "_payload\"a\n\013TimerObject\022\017\n\007payload\030\001 \001(\t" +
      "\0223\n\017maturation_time\030\002 \001(\0132\032.google.proto" +
      "buf.Timestamp\022\014\n\004guid\030\003 \001(\t\"\204\002\n\rMetricsW" +
      "indow\022\031\n\021total_task_starts\030\001 \001(\003\022 \n\030tota" +
      "l_task_start_latency\030\002 \001(\003\022\036\n\026max_task_s" +
      "tart_latency\030\003 \001(\003\022\034\n\024total_task_complet" +
      "es\030\004 \001(\003\022#\n\033total_task_complete_latency\030" +
      "\005 \001(\003\022!\n\031max_task_complete_latency\030\006 \001(\003" +
      "\0220\n\014window_start\030\007 \001(\0132\032.google.protobuf" +
      ".Timestamp\"\310\002\n\007Command\0225\n\nstart_task\030\001 \001" +
      "(\0132\037.streamspeedb.Command.StartTaskH\000\022;\n" +
      "\rcomplete_task\030\002 \001(\0132\".streamspeedb.Comm" +
      "and.CompleteTaskH\000\0221\n\010start_wf\030\003 \001(\0132\035.s" +
      "treamspeedb.Command.StartWfH\000\032\025\n\007StartWf" +
      "\022\n\n\002id\030\001 \001(\t\032/\n\tStartTask\022\r\n\005wf_id\030\001 \001(\t" +
      "\022\023\n\013task_number\030\002 \001(\005\032C\n\014CompleteTask\022\r\n" +
      "\005wf_id\030\001 \001(\t\022\023\n\013task_number\030\002 \001(\005\022\017\n\007pay" +
      "load\030\003 \001(\tB\t\n\007command\"\220\001\n\030KafkaStreamsMe" +
      "tricsReply\022D\n\007metrics\030\001 \003(\01323.streamspee" +
      "db.KafkaStreamsMetricsReply.MetricsEntry" +
      "\032.\n\014MetricsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002" +
      " \001(\t:\0028\001\"d\n\024WorkflowMetricsQuery\0227\n\023late" +
      "st_window_start\030\001 \001(\0132\032.google.protobuf." +
      "Timestamp\022\023\n\013num_windows\030\002 \001(\005\"G\n\027Worfkl" +
      "owMetricsResponse\022,\n\007metrics\030\001 \003(\0132\033.str" +
      "eamspeedb.MetricsWindow2\311\001\n\016MetricsServi" +
      "ce\022W\n\023KafkaStreamsMetrics\022\026.google.proto" +
      "buf.Empty\032&.streamspeedb.KafkaStreamsMet" +
      "ricsReply\"\000\022^\n\017WorkflowMetrics\022\".streams" +
      "peedb.WorkflowMetricsQuery\032%.streamspeed" +
      "b.WorfklowMetricsResponse\"\000B\032\n\026benchmark" +
      ".speedb.protoP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.TimestampProto.getDescriptor(),
          com.google.protobuf.EmptyProto.getDescriptor(),
        });
    internal_static_streamspeedb_Workflow_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_streamspeedb_Workflow_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_streamspeedb_Workflow_descriptor,
        new java.lang.String[] { "Id", "LaunchTime", "StartTime", "Completed", "CurrentTaskRunNumber", });
    internal_static_streamspeedb_TaskRun_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_streamspeedb_TaskRun_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_streamspeedb_TaskRun_descriptor,
        new java.lang.String[] { "WfId", "Number", "LaunchTime", "StartTime", "CompleteTime", "Payload", "Payload", });
    internal_static_streamspeedb_TimerObject_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_streamspeedb_TimerObject_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_streamspeedb_TimerObject_descriptor,
        new java.lang.String[] { "Payload", "MaturationTime", "Guid", });
    internal_static_streamspeedb_MetricsWindow_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_streamspeedb_MetricsWindow_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_streamspeedb_MetricsWindow_descriptor,
        new java.lang.String[] { "TotalTaskStarts", "TotalTaskStartLatency", "MaxTaskStartLatency", "TotalTaskCompletes", "TotalTaskCompleteLatency", "MaxTaskCompleteLatency", "WindowStart", });
    internal_static_streamspeedb_Command_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_streamspeedb_Command_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_streamspeedb_Command_descriptor,
        new java.lang.String[] { "StartTask", "CompleteTask", "StartWf", "Command", });
    internal_static_streamspeedb_Command_StartWf_descriptor =
      internal_static_streamspeedb_Command_descriptor.getNestedTypes().get(0);
    internal_static_streamspeedb_Command_StartWf_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_streamspeedb_Command_StartWf_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_streamspeedb_Command_StartTask_descriptor =
      internal_static_streamspeedb_Command_descriptor.getNestedTypes().get(1);
    internal_static_streamspeedb_Command_StartTask_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_streamspeedb_Command_StartTask_descriptor,
        new java.lang.String[] { "WfId", "TaskNumber", });
    internal_static_streamspeedb_Command_CompleteTask_descriptor =
      internal_static_streamspeedb_Command_descriptor.getNestedTypes().get(2);
    internal_static_streamspeedb_Command_CompleteTask_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_streamspeedb_Command_CompleteTask_descriptor,
        new java.lang.String[] { "WfId", "TaskNumber", "Payload", });
    internal_static_streamspeedb_KafkaStreamsMetricsReply_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_streamspeedb_KafkaStreamsMetricsReply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_streamspeedb_KafkaStreamsMetricsReply_descriptor,
        new java.lang.String[] { "Metrics", });
    internal_static_streamspeedb_KafkaStreamsMetricsReply_MetricsEntry_descriptor =
      internal_static_streamspeedb_KafkaStreamsMetricsReply_descriptor.getNestedTypes().get(0);
    internal_static_streamspeedb_KafkaStreamsMetricsReply_MetricsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_streamspeedb_KafkaStreamsMetricsReply_MetricsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_streamspeedb_WorkflowMetricsQuery_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_streamspeedb_WorkflowMetricsQuery_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_streamspeedb_WorkflowMetricsQuery_descriptor,
        new java.lang.String[] { "LatestWindowStart", "NumWindows", });
    internal_static_streamspeedb_WorfklowMetricsResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_streamspeedb_WorfklowMetricsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_streamspeedb_WorfklowMetricsResponse_descriptor,
        new java.lang.String[] { "Metrics", });
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
