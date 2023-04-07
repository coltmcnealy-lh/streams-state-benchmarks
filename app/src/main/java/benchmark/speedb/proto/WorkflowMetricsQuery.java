// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: model.proto

package benchmark.speedb.proto;

/**
 * Protobuf type {@code streamspeedb.WorkflowMetricsQuery}
 */
public final class WorkflowMetricsQuery extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:streamspeedb.WorkflowMetricsQuery)
    WorkflowMetricsQueryOrBuilder {
private static final long serialVersionUID = 0L;
  // Use WorkflowMetricsQuery.newBuilder() to construct.
  private WorkflowMetricsQuery(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private WorkflowMetricsQuery() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new WorkflowMetricsQuery();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private WorkflowMetricsQuery(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            com.google.protobuf.Timestamp.Builder subBuilder = null;
            if (latestWindowStart_ != null) {
              subBuilder = latestWindowStart_.toBuilder();
            }
            latestWindowStart_ = input.readMessage(com.google.protobuf.Timestamp.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(latestWindowStart_);
              latestWindowStart_ = subBuilder.buildPartial();
            }

            break;
          }
          case 16: {

            numWindows_ = input.readInt32();
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return benchmark.speedb.proto.Model.internal_static_streamspeedb_WorkflowMetricsQuery_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return benchmark.speedb.proto.Model.internal_static_streamspeedb_WorkflowMetricsQuery_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            benchmark.speedb.proto.WorkflowMetricsQuery.class, benchmark.speedb.proto.WorkflowMetricsQuery.Builder.class);
  }

  public static final int LATEST_WINDOW_START_FIELD_NUMBER = 1;
  private com.google.protobuf.Timestamp latestWindowStart_;
  /**
   * <code>.google.protobuf.Timestamp latest_window_start = 1;</code>
   * @return Whether the latestWindowStart field is set.
   */
  @java.lang.Override
  public boolean hasLatestWindowStart() {
    return latestWindowStart_ != null;
  }
  /**
   * <code>.google.protobuf.Timestamp latest_window_start = 1;</code>
   * @return The latestWindowStart.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getLatestWindowStart() {
    return latestWindowStart_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : latestWindowStart_;
  }
  /**
   * <code>.google.protobuf.Timestamp latest_window_start = 1;</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getLatestWindowStartOrBuilder() {
    return getLatestWindowStart();
  }

  public static final int NUM_WINDOWS_FIELD_NUMBER = 2;
  private int numWindows_;
  /**
   * <code>int32 num_windows = 2;</code>
   * @return The numWindows.
   */
  @java.lang.Override
  public int getNumWindows() {
    return numWindows_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (latestWindowStart_ != null) {
      output.writeMessage(1, getLatestWindowStart());
    }
    if (numWindows_ != 0) {
      output.writeInt32(2, numWindows_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (latestWindowStart_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getLatestWindowStart());
    }
    if (numWindows_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, numWindows_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof benchmark.speedb.proto.WorkflowMetricsQuery)) {
      return super.equals(obj);
    }
    benchmark.speedb.proto.WorkflowMetricsQuery other = (benchmark.speedb.proto.WorkflowMetricsQuery) obj;

    if (hasLatestWindowStart() != other.hasLatestWindowStart()) return false;
    if (hasLatestWindowStart()) {
      if (!getLatestWindowStart()
          .equals(other.getLatestWindowStart())) return false;
    }
    if (getNumWindows()
        != other.getNumWindows()) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasLatestWindowStart()) {
      hash = (37 * hash) + LATEST_WINDOW_START_FIELD_NUMBER;
      hash = (53 * hash) + getLatestWindowStart().hashCode();
    }
    hash = (37 * hash) + NUM_WINDOWS_FIELD_NUMBER;
    hash = (53 * hash) + getNumWindows();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static benchmark.speedb.proto.WorkflowMetricsQuery parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static benchmark.speedb.proto.WorkflowMetricsQuery parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static benchmark.speedb.proto.WorkflowMetricsQuery parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static benchmark.speedb.proto.WorkflowMetricsQuery parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static benchmark.speedb.proto.WorkflowMetricsQuery parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static benchmark.speedb.proto.WorkflowMetricsQuery parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static benchmark.speedb.proto.WorkflowMetricsQuery parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static benchmark.speedb.proto.WorkflowMetricsQuery parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static benchmark.speedb.proto.WorkflowMetricsQuery parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static benchmark.speedb.proto.WorkflowMetricsQuery parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static benchmark.speedb.proto.WorkflowMetricsQuery parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static benchmark.speedb.proto.WorkflowMetricsQuery parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(benchmark.speedb.proto.WorkflowMetricsQuery prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code streamspeedb.WorkflowMetricsQuery}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:streamspeedb.WorkflowMetricsQuery)
      benchmark.speedb.proto.WorkflowMetricsQueryOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return benchmark.speedb.proto.Model.internal_static_streamspeedb_WorkflowMetricsQuery_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return benchmark.speedb.proto.Model.internal_static_streamspeedb_WorkflowMetricsQuery_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              benchmark.speedb.proto.WorkflowMetricsQuery.class, benchmark.speedb.proto.WorkflowMetricsQuery.Builder.class);
    }

    // Construct using benchmark.speedb.proto.WorkflowMetricsQuery.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (latestWindowStartBuilder_ == null) {
        latestWindowStart_ = null;
      } else {
        latestWindowStart_ = null;
        latestWindowStartBuilder_ = null;
      }
      numWindows_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return benchmark.speedb.proto.Model.internal_static_streamspeedb_WorkflowMetricsQuery_descriptor;
    }

    @java.lang.Override
    public benchmark.speedb.proto.WorkflowMetricsQuery getDefaultInstanceForType() {
      return benchmark.speedb.proto.WorkflowMetricsQuery.getDefaultInstance();
    }

    @java.lang.Override
    public benchmark.speedb.proto.WorkflowMetricsQuery build() {
      benchmark.speedb.proto.WorkflowMetricsQuery result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public benchmark.speedb.proto.WorkflowMetricsQuery buildPartial() {
      benchmark.speedb.proto.WorkflowMetricsQuery result = new benchmark.speedb.proto.WorkflowMetricsQuery(this);
      if (latestWindowStartBuilder_ == null) {
        result.latestWindowStart_ = latestWindowStart_;
      } else {
        result.latestWindowStart_ = latestWindowStartBuilder_.build();
      }
      result.numWindows_ = numWindows_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof benchmark.speedb.proto.WorkflowMetricsQuery) {
        return mergeFrom((benchmark.speedb.proto.WorkflowMetricsQuery)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(benchmark.speedb.proto.WorkflowMetricsQuery other) {
      if (other == benchmark.speedb.proto.WorkflowMetricsQuery.getDefaultInstance()) return this;
      if (other.hasLatestWindowStart()) {
        mergeLatestWindowStart(other.getLatestWindowStart());
      }
      if (other.getNumWindows() != 0) {
        setNumWindows(other.getNumWindows());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      benchmark.speedb.proto.WorkflowMetricsQuery parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (benchmark.speedb.proto.WorkflowMetricsQuery) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.Timestamp latestWindowStart_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> latestWindowStartBuilder_;
    /**
     * <code>.google.protobuf.Timestamp latest_window_start = 1;</code>
     * @return Whether the latestWindowStart field is set.
     */
    public boolean hasLatestWindowStart() {
      return latestWindowStartBuilder_ != null || latestWindowStart_ != null;
    }
    /**
     * <code>.google.protobuf.Timestamp latest_window_start = 1;</code>
     * @return The latestWindowStart.
     */
    public com.google.protobuf.Timestamp getLatestWindowStart() {
      if (latestWindowStartBuilder_ == null) {
        return latestWindowStart_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : latestWindowStart_;
      } else {
        return latestWindowStartBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.Timestamp latest_window_start = 1;</code>
     */
    public Builder setLatestWindowStart(com.google.protobuf.Timestamp value) {
      if (latestWindowStartBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        latestWindowStart_ = value;
        onChanged();
      } else {
        latestWindowStartBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp latest_window_start = 1;</code>
     */
    public Builder setLatestWindowStart(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (latestWindowStartBuilder_ == null) {
        latestWindowStart_ = builderForValue.build();
        onChanged();
      } else {
        latestWindowStartBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp latest_window_start = 1;</code>
     */
    public Builder mergeLatestWindowStart(com.google.protobuf.Timestamp value) {
      if (latestWindowStartBuilder_ == null) {
        if (latestWindowStart_ != null) {
          latestWindowStart_ =
            com.google.protobuf.Timestamp.newBuilder(latestWindowStart_).mergeFrom(value).buildPartial();
        } else {
          latestWindowStart_ = value;
        }
        onChanged();
      } else {
        latestWindowStartBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp latest_window_start = 1;</code>
     */
    public Builder clearLatestWindowStart() {
      if (latestWindowStartBuilder_ == null) {
        latestWindowStart_ = null;
        onChanged();
      } else {
        latestWindowStart_ = null;
        latestWindowStartBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp latest_window_start = 1;</code>
     */
    public com.google.protobuf.Timestamp.Builder getLatestWindowStartBuilder() {
      
      onChanged();
      return getLatestWindowStartFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.Timestamp latest_window_start = 1;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getLatestWindowStartOrBuilder() {
      if (latestWindowStartBuilder_ != null) {
        return latestWindowStartBuilder_.getMessageOrBuilder();
      } else {
        return latestWindowStart_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : latestWindowStart_;
      }
    }
    /**
     * <code>.google.protobuf.Timestamp latest_window_start = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getLatestWindowStartFieldBuilder() {
      if (latestWindowStartBuilder_ == null) {
        latestWindowStartBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getLatestWindowStart(),
                getParentForChildren(),
                isClean());
        latestWindowStart_ = null;
      }
      return latestWindowStartBuilder_;
    }

    private int numWindows_ ;
    /**
     * <code>int32 num_windows = 2;</code>
     * @return The numWindows.
     */
    @java.lang.Override
    public int getNumWindows() {
      return numWindows_;
    }
    /**
     * <code>int32 num_windows = 2;</code>
     * @param value The numWindows to set.
     * @return This builder for chaining.
     */
    public Builder setNumWindows(int value) {
      
      numWindows_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 num_windows = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearNumWindows() {
      
      numWindows_ = 0;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:streamspeedb.WorkflowMetricsQuery)
  }

  // @@protoc_insertion_point(class_scope:streamspeedb.WorkflowMetricsQuery)
  private static final benchmark.speedb.proto.WorkflowMetricsQuery DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new benchmark.speedb.proto.WorkflowMetricsQuery();
  }

  public static benchmark.speedb.proto.WorkflowMetricsQuery getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<WorkflowMetricsQuery>
      PARSER = new com.google.protobuf.AbstractParser<WorkflowMetricsQuery>() {
    @java.lang.Override
    public WorkflowMetricsQuery parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new WorkflowMetricsQuery(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<WorkflowMetricsQuery> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<WorkflowMetricsQuery> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public benchmark.speedb.proto.WorkflowMetricsQuery getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
