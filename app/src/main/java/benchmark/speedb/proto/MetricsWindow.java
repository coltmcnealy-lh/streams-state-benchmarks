// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: model.proto

package benchmark.speedb.proto;

/**
 * Protobuf type {@code streamspeedb.MetricsWindow}
 */
public final class MetricsWindow extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:streamspeedb.MetricsWindow)
    MetricsWindowOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MetricsWindow.newBuilder() to construct.
  private MetricsWindow(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MetricsWindow() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MetricsWindow();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MetricsWindow(
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
          case 8: {

            totalTaskStarts_ = input.readInt64();
            break;
          }
          case 16: {

            totalTaskStartLatency_ = input.readInt64();
            break;
          }
          case 24: {

            maxTaskStartLatency_ = input.readInt64();
            break;
          }
          case 32: {

            totalTaskCompletes_ = input.readInt64();
            break;
          }
          case 40: {

            totalTaskCompleteLatency_ = input.readInt64();
            break;
          }
          case 48: {

            maxTaskCompleteLatency_ = input.readInt64();
            break;
          }
          case 58: {
            com.google.protobuf.Timestamp.Builder subBuilder = null;
            if (windowStart_ != null) {
              subBuilder = windowStart_.toBuilder();
            }
            windowStart_ = input.readMessage(com.google.protobuf.Timestamp.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(windowStart_);
              windowStart_ = subBuilder.buildPartial();
            }

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
    return benchmark.speedb.proto.Model.internal_static_streamspeedb_MetricsWindow_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return benchmark.speedb.proto.Model.internal_static_streamspeedb_MetricsWindow_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            benchmark.speedb.proto.MetricsWindow.class, benchmark.speedb.proto.MetricsWindow.Builder.class);
  }

  public static final int TOTAL_TASK_STARTS_FIELD_NUMBER = 1;
  private long totalTaskStarts_;
  /**
   * <code>int64 total_task_starts = 1;</code>
   * @return The totalTaskStarts.
   */
  @java.lang.Override
  public long getTotalTaskStarts() {
    return totalTaskStarts_;
  }

  public static final int TOTAL_TASK_START_LATENCY_FIELD_NUMBER = 2;
  private long totalTaskStartLatency_;
  /**
   * <code>int64 total_task_start_latency = 2;</code>
   * @return The totalTaskStartLatency.
   */
  @java.lang.Override
  public long getTotalTaskStartLatency() {
    return totalTaskStartLatency_;
  }

  public static final int MAX_TASK_START_LATENCY_FIELD_NUMBER = 3;
  private long maxTaskStartLatency_;
  /**
   * <code>int64 max_task_start_latency = 3;</code>
   * @return The maxTaskStartLatency.
   */
  @java.lang.Override
  public long getMaxTaskStartLatency() {
    return maxTaskStartLatency_;
  }

  public static final int TOTAL_TASK_COMPLETES_FIELD_NUMBER = 4;
  private long totalTaskCompletes_;
  /**
   * <code>int64 total_task_completes = 4;</code>
   * @return The totalTaskCompletes.
   */
  @java.lang.Override
  public long getTotalTaskCompletes() {
    return totalTaskCompletes_;
  }

  public static final int TOTAL_TASK_COMPLETE_LATENCY_FIELD_NUMBER = 5;
  private long totalTaskCompleteLatency_;
  /**
   * <code>int64 total_task_complete_latency = 5;</code>
   * @return The totalTaskCompleteLatency.
   */
  @java.lang.Override
  public long getTotalTaskCompleteLatency() {
    return totalTaskCompleteLatency_;
  }

  public static final int MAX_TASK_COMPLETE_LATENCY_FIELD_NUMBER = 6;
  private long maxTaskCompleteLatency_;
  /**
   * <code>int64 max_task_complete_latency = 6;</code>
   * @return The maxTaskCompleteLatency.
   */
  @java.lang.Override
  public long getMaxTaskCompleteLatency() {
    return maxTaskCompleteLatency_;
  }

  public static final int WINDOW_START_FIELD_NUMBER = 7;
  private com.google.protobuf.Timestamp windowStart_;
  /**
   * <code>.google.protobuf.Timestamp window_start = 7;</code>
   * @return Whether the windowStart field is set.
   */
  @java.lang.Override
  public boolean hasWindowStart() {
    return windowStart_ != null;
  }
  /**
   * <code>.google.protobuf.Timestamp window_start = 7;</code>
   * @return The windowStart.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getWindowStart() {
    return windowStart_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : windowStart_;
  }
  /**
   * <code>.google.protobuf.Timestamp window_start = 7;</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getWindowStartOrBuilder() {
    return getWindowStart();
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
    if (totalTaskStarts_ != 0L) {
      output.writeInt64(1, totalTaskStarts_);
    }
    if (totalTaskStartLatency_ != 0L) {
      output.writeInt64(2, totalTaskStartLatency_);
    }
    if (maxTaskStartLatency_ != 0L) {
      output.writeInt64(3, maxTaskStartLatency_);
    }
    if (totalTaskCompletes_ != 0L) {
      output.writeInt64(4, totalTaskCompletes_);
    }
    if (totalTaskCompleteLatency_ != 0L) {
      output.writeInt64(5, totalTaskCompleteLatency_);
    }
    if (maxTaskCompleteLatency_ != 0L) {
      output.writeInt64(6, maxTaskCompleteLatency_);
    }
    if (windowStart_ != null) {
      output.writeMessage(7, getWindowStart());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (totalTaskStarts_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, totalTaskStarts_);
    }
    if (totalTaskStartLatency_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, totalTaskStartLatency_);
    }
    if (maxTaskStartLatency_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, maxTaskStartLatency_);
    }
    if (totalTaskCompletes_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, totalTaskCompletes_);
    }
    if (totalTaskCompleteLatency_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(5, totalTaskCompleteLatency_);
    }
    if (maxTaskCompleteLatency_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(6, maxTaskCompleteLatency_);
    }
    if (windowStart_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(7, getWindowStart());
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
    if (!(obj instanceof benchmark.speedb.proto.MetricsWindow)) {
      return super.equals(obj);
    }
    benchmark.speedb.proto.MetricsWindow other = (benchmark.speedb.proto.MetricsWindow) obj;

    if (getTotalTaskStarts()
        != other.getTotalTaskStarts()) return false;
    if (getTotalTaskStartLatency()
        != other.getTotalTaskStartLatency()) return false;
    if (getMaxTaskStartLatency()
        != other.getMaxTaskStartLatency()) return false;
    if (getTotalTaskCompletes()
        != other.getTotalTaskCompletes()) return false;
    if (getTotalTaskCompleteLatency()
        != other.getTotalTaskCompleteLatency()) return false;
    if (getMaxTaskCompleteLatency()
        != other.getMaxTaskCompleteLatency()) return false;
    if (hasWindowStart() != other.hasWindowStart()) return false;
    if (hasWindowStart()) {
      if (!getWindowStart()
          .equals(other.getWindowStart())) return false;
    }
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
    hash = (37 * hash) + TOTAL_TASK_STARTS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTotalTaskStarts());
    hash = (37 * hash) + TOTAL_TASK_START_LATENCY_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTotalTaskStartLatency());
    hash = (37 * hash) + MAX_TASK_START_LATENCY_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getMaxTaskStartLatency());
    hash = (37 * hash) + TOTAL_TASK_COMPLETES_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTotalTaskCompletes());
    hash = (37 * hash) + TOTAL_TASK_COMPLETE_LATENCY_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTotalTaskCompleteLatency());
    hash = (37 * hash) + MAX_TASK_COMPLETE_LATENCY_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getMaxTaskCompleteLatency());
    if (hasWindowStart()) {
      hash = (37 * hash) + WINDOW_START_FIELD_NUMBER;
      hash = (53 * hash) + getWindowStart().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static benchmark.speedb.proto.MetricsWindow parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static benchmark.speedb.proto.MetricsWindow parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static benchmark.speedb.proto.MetricsWindow parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static benchmark.speedb.proto.MetricsWindow parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static benchmark.speedb.proto.MetricsWindow parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static benchmark.speedb.proto.MetricsWindow parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static benchmark.speedb.proto.MetricsWindow parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static benchmark.speedb.proto.MetricsWindow parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static benchmark.speedb.proto.MetricsWindow parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static benchmark.speedb.proto.MetricsWindow parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static benchmark.speedb.proto.MetricsWindow parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static benchmark.speedb.proto.MetricsWindow parseFrom(
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
  public static Builder newBuilder(benchmark.speedb.proto.MetricsWindow prototype) {
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
   * Protobuf type {@code streamspeedb.MetricsWindow}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:streamspeedb.MetricsWindow)
      benchmark.speedb.proto.MetricsWindowOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return benchmark.speedb.proto.Model.internal_static_streamspeedb_MetricsWindow_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return benchmark.speedb.proto.Model.internal_static_streamspeedb_MetricsWindow_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              benchmark.speedb.proto.MetricsWindow.class, benchmark.speedb.proto.MetricsWindow.Builder.class);
    }

    // Construct using benchmark.speedb.proto.MetricsWindow.newBuilder()
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
      totalTaskStarts_ = 0L;

      totalTaskStartLatency_ = 0L;

      maxTaskStartLatency_ = 0L;

      totalTaskCompletes_ = 0L;

      totalTaskCompleteLatency_ = 0L;

      maxTaskCompleteLatency_ = 0L;

      if (windowStartBuilder_ == null) {
        windowStart_ = null;
      } else {
        windowStart_ = null;
        windowStartBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return benchmark.speedb.proto.Model.internal_static_streamspeedb_MetricsWindow_descriptor;
    }

    @java.lang.Override
    public benchmark.speedb.proto.MetricsWindow getDefaultInstanceForType() {
      return benchmark.speedb.proto.MetricsWindow.getDefaultInstance();
    }

    @java.lang.Override
    public benchmark.speedb.proto.MetricsWindow build() {
      benchmark.speedb.proto.MetricsWindow result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public benchmark.speedb.proto.MetricsWindow buildPartial() {
      benchmark.speedb.proto.MetricsWindow result = new benchmark.speedb.proto.MetricsWindow(this);
      result.totalTaskStarts_ = totalTaskStarts_;
      result.totalTaskStartLatency_ = totalTaskStartLatency_;
      result.maxTaskStartLatency_ = maxTaskStartLatency_;
      result.totalTaskCompletes_ = totalTaskCompletes_;
      result.totalTaskCompleteLatency_ = totalTaskCompleteLatency_;
      result.maxTaskCompleteLatency_ = maxTaskCompleteLatency_;
      if (windowStartBuilder_ == null) {
        result.windowStart_ = windowStart_;
      } else {
        result.windowStart_ = windowStartBuilder_.build();
      }
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
      if (other instanceof benchmark.speedb.proto.MetricsWindow) {
        return mergeFrom((benchmark.speedb.proto.MetricsWindow)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(benchmark.speedb.proto.MetricsWindow other) {
      if (other == benchmark.speedb.proto.MetricsWindow.getDefaultInstance()) return this;
      if (other.getTotalTaskStarts() != 0L) {
        setTotalTaskStarts(other.getTotalTaskStarts());
      }
      if (other.getTotalTaskStartLatency() != 0L) {
        setTotalTaskStartLatency(other.getTotalTaskStartLatency());
      }
      if (other.getMaxTaskStartLatency() != 0L) {
        setMaxTaskStartLatency(other.getMaxTaskStartLatency());
      }
      if (other.getTotalTaskCompletes() != 0L) {
        setTotalTaskCompletes(other.getTotalTaskCompletes());
      }
      if (other.getTotalTaskCompleteLatency() != 0L) {
        setTotalTaskCompleteLatency(other.getTotalTaskCompleteLatency());
      }
      if (other.getMaxTaskCompleteLatency() != 0L) {
        setMaxTaskCompleteLatency(other.getMaxTaskCompleteLatency());
      }
      if (other.hasWindowStart()) {
        mergeWindowStart(other.getWindowStart());
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
      benchmark.speedb.proto.MetricsWindow parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (benchmark.speedb.proto.MetricsWindow) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long totalTaskStarts_ ;
    /**
     * <code>int64 total_task_starts = 1;</code>
     * @return The totalTaskStarts.
     */
    @java.lang.Override
    public long getTotalTaskStarts() {
      return totalTaskStarts_;
    }
    /**
     * <code>int64 total_task_starts = 1;</code>
     * @param value The totalTaskStarts to set.
     * @return This builder for chaining.
     */
    public Builder setTotalTaskStarts(long value) {
      
      totalTaskStarts_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 total_task_starts = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearTotalTaskStarts() {
      
      totalTaskStarts_ = 0L;
      onChanged();
      return this;
    }

    private long totalTaskStartLatency_ ;
    /**
     * <code>int64 total_task_start_latency = 2;</code>
     * @return The totalTaskStartLatency.
     */
    @java.lang.Override
    public long getTotalTaskStartLatency() {
      return totalTaskStartLatency_;
    }
    /**
     * <code>int64 total_task_start_latency = 2;</code>
     * @param value The totalTaskStartLatency to set.
     * @return This builder for chaining.
     */
    public Builder setTotalTaskStartLatency(long value) {
      
      totalTaskStartLatency_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 total_task_start_latency = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearTotalTaskStartLatency() {
      
      totalTaskStartLatency_ = 0L;
      onChanged();
      return this;
    }

    private long maxTaskStartLatency_ ;
    /**
     * <code>int64 max_task_start_latency = 3;</code>
     * @return The maxTaskStartLatency.
     */
    @java.lang.Override
    public long getMaxTaskStartLatency() {
      return maxTaskStartLatency_;
    }
    /**
     * <code>int64 max_task_start_latency = 3;</code>
     * @param value The maxTaskStartLatency to set.
     * @return This builder for chaining.
     */
    public Builder setMaxTaskStartLatency(long value) {
      
      maxTaskStartLatency_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 max_task_start_latency = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearMaxTaskStartLatency() {
      
      maxTaskStartLatency_ = 0L;
      onChanged();
      return this;
    }

    private long totalTaskCompletes_ ;
    /**
     * <code>int64 total_task_completes = 4;</code>
     * @return The totalTaskCompletes.
     */
    @java.lang.Override
    public long getTotalTaskCompletes() {
      return totalTaskCompletes_;
    }
    /**
     * <code>int64 total_task_completes = 4;</code>
     * @param value The totalTaskCompletes to set.
     * @return This builder for chaining.
     */
    public Builder setTotalTaskCompletes(long value) {
      
      totalTaskCompletes_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 total_task_completes = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearTotalTaskCompletes() {
      
      totalTaskCompletes_ = 0L;
      onChanged();
      return this;
    }

    private long totalTaskCompleteLatency_ ;
    /**
     * <code>int64 total_task_complete_latency = 5;</code>
     * @return The totalTaskCompleteLatency.
     */
    @java.lang.Override
    public long getTotalTaskCompleteLatency() {
      return totalTaskCompleteLatency_;
    }
    /**
     * <code>int64 total_task_complete_latency = 5;</code>
     * @param value The totalTaskCompleteLatency to set.
     * @return This builder for chaining.
     */
    public Builder setTotalTaskCompleteLatency(long value) {
      
      totalTaskCompleteLatency_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 total_task_complete_latency = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearTotalTaskCompleteLatency() {
      
      totalTaskCompleteLatency_ = 0L;
      onChanged();
      return this;
    }

    private long maxTaskCompleteLatency_ ;
    /**
     * <code>int64 max_task_complete_latency = 6;</code>
     * @return The maxTaskCompleteLatency.
     */
    @java.lang.Override
    public long getMaxTaskCompleteLatency() {
      return maxTaskCompleteLatency_;
    }
    /**
     * <code>int64 max_task_complete_latency = 6;</code>
     * @param value The maxTaskCompleteLatency to set.
     * @return This builder for chaining.
     */
    public Builder setMaxTaskCompleteLatency(long value) {
      
      maxTaskCompleteLatency_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 max_task_complete_latency = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearMaxTaskCompleteLatency() {
      
      maxTaskCompleteLatency_ = 0L;
      onChanged();
      return this;
    }

    private com.google.protobuf.Timestamp windowStart_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> windowStartBuilder_;
    /**
     * <code>.google.protobuf.Timestamp window_start = 7;</code>
     * @return Whether the windowStart field is set.
     */
    public boolean hasWindowStart() {
      return windowStartBuilder_ != null || windowStart_ != null;
    }
    /**
     * <code>.google.protobuf.Timestamp window_start = 7;</code>
     * @return The windowStart.
     */
    public com.google.protobuf.Timestamp getWindowStart() {
      if (windowStartBuilder_ == null) {
        return windowStart_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : windowStart_;
      } else {
        return windowStartBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.Timestamp window_start = 7;</code>
     */
    public Builder setWindowStart(com.google.protobuf.Timestamp value) {
      if (windowStartBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        windowStart_ = value;
        onChanged();
      } else {
        windowStartBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp window_start = 7;</code>
     */
    public Builder setWindowStart(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (windowStartBuilder_ == null) {
        windowStart_ = builderForValue.build();
        onChanged();
      } else {
        windowStartBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp window_start = 7;</code>
     */
    public Builder mergeWindowStart(com.google.protobuf.Timestamp value) {
      if (windowStartBuilder_ == null) {
        if (windowStart_ != null) {
          windowStart_ =
            com.google.protobuf.Timestamp.newBuilder(windowStart_).mergeFrom(value).buildPartial();
        } else {
          windowStart_ = value;
        }
        onChanged();
      } else {
        windowStartBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp window_start = 7;</code>
     */
    public Builder clearWindowStart() {
      if (windowStartBuilder_ == null) {
        windowStart_ = null;
        onChanged();
      } else {
        windowStart_ = null;
        windowStartBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp window_start = 7;</code>
     */
    public com.google.protobuf.Timestamp.Builder getWindowStartBuilder() {
      
      onChanged();
      return getWindowStartFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.Timestamp window_start = 7;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getWindowStartOrBuilder() {
      if (windowStartBuilder_ != null) {
        return windowStartBuilder_.getMessageOrBuilder();
      } else {
        return windowStart_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : windowStart_;
      }
    }
    /**
     * <code>.google.protobuf.Timestamp window_start = 7;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getWindowStartFieldBuilder() {
      if (windowStartBuilder_ == null) {
        windowStartBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getWindowStart(),
                getParentForChildren(),
                isClean());
        windowStart_ = null;
      }
      return windowStartBuilder_;
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


    // @@protoc_insertion_point(builder_scope:streamspeedb.MetricsWindow)
  }

  // @@protoc_insertion_point(class_scope:streamspeedb.MetricsWindow)
  private static final benchmark.speedb.proto.MetricsWindow DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new benchmark.speedb.proto.MetricsWindow();
  }

  public static benchmark.speedb.proto.MetricsWindow getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MetricsWindow>
      PARSER = new com.google.protobuf.AbstractParser<MetricsWindow>() {
    @java.lang.Override
    public MetricsWindow parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MetricsWindow(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MetricsWindow> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MetricsWindow> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public benchmark.speedb.proto.MetricsWindow getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

