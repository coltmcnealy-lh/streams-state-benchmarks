package benchmark.speedb.proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.50.2)",
    comments = "Source: model.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MetricsServiceGrpc {

  private MetricsServiceGrpc() {}

  public static final String SERVICE_NAME = "streamspeedb.MetricsService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      benchmark.speedb.proto.KafkaStreamsMetricsReply> getKafkaStreamsMetricsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "KafkaStreamsMetrics",
      requestType = com.google.protobuf.Empty.class,
      responseType = benchmark.speedb.proto.KafkaStreamsMetricsReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      benchmark.speedb.proto.KafkaStreamsMetricsReply> getKafkaStreamsMetricsMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, benchmark.speedb.proto.KafkaStreamsMetricsReply> getKafkaStreamsMetricsMethod;
    if ((getKafkaStreamsMetricsMethod = MetricsServiceGrpc.getKafkaStreamsMetricsMethod) == null) {
      synchronized (MetricsServiceGrpc.class) {
        if ((getKafkaStreamsMetricsMethod = MetricsServiceGrpc.getKafkaStreamsMetricsMethod) == null) {
          MetricsServiceGrpc.getKafkaStreamsMetricsMethod = getKafkaStreamsMetricsMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, benchmark.speedb.proto.KafkaStreamsMetricsReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "KafkaStreamsMetrics"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  benchmark.speedb.proto.KafkaStreamsMetricsReply.getDefaultInstance()))
              .setSchemaDescriptor(new MetricsServiceMethodDescriptorSupplier("KafkaStreamsMetrics"))
              .build();
        }
      }
    }
    return getKafkaStreamsMetricsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<benchmark.speedb.proto.WorkflowMetricsQuery,
      benchmark.speedb.proto.WorfklowMetricsResponse> getWorkflowMetricsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WorkflowMetrics",
      requestType = benchmark.speedb.proto.WorkflowMetricsQuery.class,
      responseType = benchmark.speedb.proto.WorfklowMetricsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<benchmark.speedb.proto.WorkflowMetricsQuery,
      benchmark.speedb.proto.WorfklowMetricsResponse> getWorkflowMetricsMethod() {
    io.grpc.MethodDescriptor<benchmark.speedb.proto.WorkflowMetricsQuery, benchmark.speedb.proto.WorfklowMetricsResponse> getWorkflowMetricsMethod;
    if ((getWorkflowMetricsMethod = MetricsServiceGrpc.getWorkflowMetricsMethod) == null) {
      synchronized (MetricsServiceGrpc.class) {
        if ((getWorkflowMetricsMethod = MetricsServiceGrpc.getWorkflowMetricsMethod) == null) {
          MetricsServiceGrpc.getWorkflowMetricsMethod = getWorkflowMetricsMethod =
              io.grpc.MethodDescriptor.<benchmark.speedb.proto.WorkflowMetricsQuery, benchmark.speedb.proto.WorfklowMetricsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "WorkflowMetrics"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  benchmark.speedb.proto.WorkflowMetricsQuery.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  benchmark.speedb.proto.WorfklowMetricsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MetricsServiceMethodDescriptorSupplier("WorkflowMetrics"))
              .build();
        }
      }
    }
    return getWorkflowMetricsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MetricsServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MetricsServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MetricsServiceStub>() {
        @java.lang.Override
        public MetricsServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MetricsServiceStub(channel, callOptions);
        }
      };
    return MetricsServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MetricsServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MetricsServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MetricsServiceBlockingStub>() {
        @java.lang.Override
        public MetricsServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MetricsServiceBlockingStub(channel, callOptions);
        }
      };
    return MetricsServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MetricsServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MetricsServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MetricsServiceFutureStub>() {
        @java.lang.Override
        public MetricsServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MetricsServiceFutureStub(channel, callOptions);
        }
      };
    return MetricsServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class MetricsServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void kafkaStreamsMetrics(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<benchmark.speedb.proto.KafkaStreamsMetricsReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getKafkaStreamsMetricsMethod(), responseObserver);
    }

    /**
     */
    public void workflowMetrics(benchmark.speedb.proto.WorkflowMetricsQuery request,
        io.grpc.stub.StreamObserver<benchmark.speedb.proto.WorfklowMetricsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getWorkflowMetricsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getKafkaStreamsMetricsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                benchmark.speedb.proto.KafkaStreamsMetricsReply>(
                  this, METHODID_KAFKA_STREAMS_METRICS)))
          .addMethod(
            getWorkflowMetricsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                benchmark.speedb.proto.WorkflowMetricsQuery,
                benchmark.speedb.proto.WorfklowMetricsResponse>(
                  this, METHODID_WORKFLOW_METRICS)))
          .build();
    }
  }

  /**
   */
  public static final class MetricsServiceStub extends io.grpc.stub.AbstractAsyncStub<MetricsServiceStub> {
    private MetricsServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MetricsServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MetricsServiceStub(channel, callOptions);
    }

    /**
     */
    public void kafkaStreamsMetrics(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<benchmark.speedb.proto.KafkaStreamsMetricsReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getKafkaStreamsMetricsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void workflowMetrics(benchmark.speedb.proto.WorkflowMetricsQuery request,
        io.grpc.stub.StreamObserver<benchmark.speedb.proto.WorfklowMetricsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getWorkflowMetricsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class MetricsServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<MetricsServiceBlockingStub> {
    private MetricsServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MetricsServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MetricsServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public benchmark.speedb.proto.KafkaStreamsMetricsReply kafkaStreamsMetrics(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getKafkaStreamsMetricsMethod(), getCallOptions(), request);
    }

    /**
     */
    public benchmark.speedb.proto.WorfklowMetricsResponse workflowMetrics(benchmark.speedb.proto.WorkflowMetricsQuery request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getWorkflowMetricsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class MetricsServiceFutureStub extends io.grpc.stub.AbstractFutureStub<MetricsServiceFutureStub> {
    private MetricsServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MetricsServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MetricsServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<benchmark.speedb.proto.KafkaStreamsMetricsReply> kafkaStreamsMetrics(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getKafkaStreamsMetricsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<benchmark.speedb.proto.WorfklowMetricsResponse> workflowMetrics(
        benchmark.speedb.proto.WorkflowMetricsQuery request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getWorkflowMetricsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_KAFKA_STREAMS_METRICS = 0;
  private static final int METHODID_WORKFLOW_METRICS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MetricsServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MetricsServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_KAFKA_STREAMS_METRICS:
          serviceImpl.kafkaStreamsMetrics((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<benchmark.speedb.proto.KafkaStreamsMetricsReply>) responseObserver);
          break;
        case METHODID_WORKFLOW_METRICS:
          serviceImpl.workflowMetrics((benchmark.speedb.proto.WorkflowMetricsQuery) request,
              (io.grpc.stub.StreamObserver<benchmark.speedb.proto.WorfklowMetricsResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class MetricsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MetricsServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return benchmark.speedb.proto.Model.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MetricsService");
    }
  }

  private static final class MetricsServiceFileDescriptorSupplier
      extends MetricsServiceBaseDescriptorSupplier {
    MetricsServiceFileDescriptorSupplier() {}
  }

  private static final class MetricsServiceMethodDescriptorSupplier
      extends MetricsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MetricsServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (MetricsServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MetricsServiceFileDescriptorSupplier())
              .addMethod(getKafkaStreamsMetricsMethod())
              .addMethod(getWorkflowMetricsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
