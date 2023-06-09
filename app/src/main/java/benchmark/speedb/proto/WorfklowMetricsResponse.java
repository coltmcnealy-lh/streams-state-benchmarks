// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: model.proto

package benchmark.speedb.proto;

/**
 * Protobuf type {@code streamspeedb.WorfklowMetricsResponse}
 */
public final class WorfklowMetricsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:streamspeedb.WorfklowMetricsResponse)
    WorfklowMetricsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use WorfklowMetricsResponse.newBuilder() to construct.
  private WorfklowMetricsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private WorfklowMetricsResponse() {
    metrics_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new WorfklowMetricsResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private WorfklowMetricsResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              metrics_ = new java.util.ArrayList<benchmark.speedb.proto.MetricsWindow>();
              mutable_bitField0_ |= 0x00000001;
            }
            metrics_.add(
                input.readMessage(benchmark.speedb.proto.MetricsWindow.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        metrics_ = java.util.Collections.unmodifiableList(metrics_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return benchmark.speedb.proto.Model.internal_static_streamspeedb_WorfklowMetricsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return benchmark.speedb.proto.Model.internal_static_streamspeedb_WorfklowMetricsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            benchmark.speedb.proto.WorfklowMetricsResponse.class, benchmark.speedb.proto.WorfklowMetricsResponse.Builder.class);
  }

  public static final int METRICS_FIELD_NUMBER = 1;
  private java.util.List<benchmark.speedb.proto.MetricsWindow> metrics_;
  /**
   * <code>repeated .streamspeedb.MetricsWindow metrics = 1;</code>
   */
  @java.lang.Override
  public java.util.List<benchmark.speedb.proto.MetricsWindow> getMetricsList() {
    return metrics_;
  }
  /**
   * <code>repeated .streamspeedb.MetricsWindow metrics = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends benchmark.speedb.proto.MetricsWindowOrBuilder> 
      getMetricsOrBuilderList() {
    return metrics_;
  }
  /**
   * <code>repeated .streamspeedb.MetricsWindow metrics = 1;</code>
   */
  @java.lang.Override
  public int getMetricsCount() {
    return metrics_.size();
  }
  /**
   * <code>repeated .streamspeedb.MetricsWindow metrics = 1;</code>
   */
  @java.lang.Override
  public benchmark.speedb.proto.MetricsWindow getMetrics(int index) {
    return metrics_.get(index);
  }
  /**
   * <code>repeated .streamspeedb.MetricsWindow metrics = 1;</code>
   */
  @java.lang.Override
  public benchmark.speedb.proto.MetricsWindowOrBuilder getMetricsOrBuilder(
      int index) {
    return metrics_.get(index);
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
    for (int i = 0; i < metrics_.size(); i++) {
      output.writeMessage(1, metrics_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < metrics_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, metrics_.get(i));
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
    if (!(obj instanceof benchmark.speedb.proto.WorfklowMetricsResponse)) {
      return super.equals(obj);
    }
    benchmark.speedb.proto.WorfklowMetricsResponse other = (benchmark.speedb.proto.WorfklowMetricsResponse) obj;

    if (!getMetricsList()
        .equals(other.getMetricsList())) return false;
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
    if (getMetricsCount() > 0) {
      hash = (37 * hash) + METRICS_FIELD_NUMBER;
      hash = (53 * hash) + getMetricsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static benchmark.speedb.proto.WorfklowMetricsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static benchmark.speedb.proto.WorfklowMetricsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static benchmark.speedb.proto.WorfklowMetricsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static benchmark.speedb.proto.WorfklowMetricsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static benchmark.speedb.proto.WorfklowMetricsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static benchmark.speedb.proto.WorfklowMetricsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static benchmark.speedb.proto.WorfklowMetricsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static benchmark.speedb.proto.WorfklowMetricsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static benchmark.speedb.proto.WorfklowMetricsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static benchmark.speedb.proto.WorfklowMetricsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static benchmark.speedb.proto.WorfklowMetricsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static benchmark.speedb.proto.WorfklowMetricsResponse parseFrom(
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
  public static Builder newBuilder(benchmark.speedb.proto.WorfklowMetricsResponse prototype) {
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
   * Protobuf type {@code streamspeedb.WorfklowMetricsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:streamspeedb.WorfklowMetricsResponse)
      benchmark.speedb.proto.WorfklowMetricsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return benchmark.speedb.proto.Model.internal_static_streamspeedb_WorfklowMetricsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return benchmark.speedb.proto.Model.internal_static_streamspeedb_WorfklowMetricsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              benchmark.speedb.proto.WorfklowMetricsResponse.class, benchmark.speedb.proto.WorfklowMetricsResponse.Builder.class);
    }

    // Construct using benchmark.speedb.proto.WorfklowMetricsResponse.newBuilder()
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
        getMetricsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (metricsBuilder_ == null) {
        metrics_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        metricsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return benchmark.speedb.proto.Model.internal_static_streamspeedb_WorfklowMetricsResponse_descriptor;
    }

    @java.lang.Override
    public benchmark.speedb.proto.WorfklowMetricsResponse getDefaultInstanceForType() {
      return benchmark.speedb.proto.WorfklowMetricsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public benchmark.speedb.proto.WorfklowMetricsResponse build() {
      benchmark.speedb.proto.WorfklowMetricsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public benchmark.speedb.proto.WorfklowMetricsResponse buildPartial() {
      benchmark.speedb.proto.WorfklowMetricsResponse result = new benchmark.speedb.proto.WorfklowMetricsResponse(this);
      int from_bitField0_ = bitField0_;
      if (metricsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          metrics_ = java.util.Collections.unmodifiableList(metrics_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.metrics_ = metrics_;
      } else {
        result.metrics_ = metricsBuilder_.build();
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
      if (other instanceof benchmark.speedb.proto.WorfklowMetricsResponse) {
        return mergeFrom((benchmark.speedb.proto.WorfklowMetricsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(benchmark.speedb.proto.WorfklowMetricsResponse other) {
      if (other == benchmark.speedb.proto.WorfklowMetricsResponse.getDefaultInstance()) return this;
      if (metricsBuilder_ == null) {
        if (!other.metrics_.isEmpty()) {
          if (metrics_.isEmpty()) {
            metrics_ = other.metrics_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureMetricsIsMutable();
            metrics_.addAll(other.metrics_);
          }
          onChanged();
        }
      } else {
        if (!other.metrics_.isEmpty()) {
          if (metricsBuilder_.isEmpty()) {
            metricsBuilder_.dispose();
            metricsBuilder_ = null;
            metrics_ = other.metrics_;
            bitField0_ = (bitField0_ & ~0x00000001);
            metricsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getMetricsFieldBuilder() : null;
          } else {
            metricsBuilder_.addAllMessages(other.metrics_);
          }
        }
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
      benchmark.speedb.proto.WorfklowMetricsResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (benchmark.speedb.proto.WorfklowMetricsResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<benchmark.speedb.proto.MetricsWindow> metrics_ =
      java.util.Collections.emptyList();
    private void ensureMetricsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        metrics_ = new java.util.ArrayList<benchmark.speedb.proto.MetricsWindow>(metrics_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        benchmark.speedb.proto.MetricsWindow, benchmark.speedb.proto.MetricsWindow.Builder, benchmark.speedb.proto.MetricsWindowOrBuilder> metricsBuilder_;

    /**
     * <code>repeated .streamspeedb.MetricsWindow metrics = 1;</code>
     */
    public java.util.List<benchmark.speedb.proto.MetricsWindow> getMetricsList() {
      if (metricsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(metrics_);
      } else {
        return metricsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .streamspeedb.MetricsWindow metrics = 1;</code>
     */
    public int getMetricsCount() {
      if (metricsBuilder_ == null) {
        return metrics_.size();
      } else {
        return metricsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .streamspeedb.MetricsWindow metrics = 1;</code>
     */
    public benchmark.speedb.proto.MetricsWindow getMetrics(int index) {
      if (metricsBuilder_ == null) {
        return metrics_.get(index);
      } else {
        return metricsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .streamspeedb.MetricsWindow metrics = 1;</code>
     */
    public Builder setMetrics(
        int index, benchmark.speedb.proto.MetricsWindow value) {
      if (metricsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMetricsIsMutable();
        metrics_.set(index, value);
        onChanged();
      } else {
        metricsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .streamspeedb.MetricsWindow metrics = 1;</code>
     */
    public Builder setMetrics(
        int index, benchmark.speedb.proto.MetricsWindow.Builder builderForValue) {
      if (metricsBuilder_ == null) {
        ensureMetricsIsMutable();
        metrics_.set(index, builderForValue.build());
        onChanged();
      } else {
        metricsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .streamspeedb.MetricsWindow metrics = 1;</code>
     */
    public Builder addMetrics(benchmark.speedb.proto.MetricsWindow value) {
      if (metricsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMetricsIsMutable();
        metrics_.add(value);
        onChanged();
      } else {
        metricsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .streamspeedb.MetricsWindow metrics = 1;</code>
     */
    public Builder addMetrics(
        int index, benchmark.speedb.proto.MetricsWindow value) {
      if (metricsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMetricsIsMutable();
        metrics_.add(index, value);
        onChanged();
      } else {
        metricsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .streamspeedb.MetricsWindow metrics = 1;</code>
     */
    public Builder addMetrics(
        benchmark.speedb.proto.MetricsWindow.Builder builderForValue) {
      if (metricsBuilder_ == null) {
        ensureMetricsIsMutable();
        metrics_.add(builderForValue.build());
        onChanged();
      } else {
        metricsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .streamspeedb.MetricsWindow metrics = 1;</code>
     */
    public Builder addMetrics(
        int index, benchmark.speedb.proto.MetricsWindow.Builder builderForValue) {
      if (metricsBuilder_ == null) {
        ensureMetricsIsMutable();
        metrics_.add(index, builderForValue.build());
        onChanged();
      } else {
        metricsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .streamspeedb.MetricsWindow metrics = 1;</code>
     */
    public Builder addAllMetrics(
        java.lang.Iterable<? extends benchmark.speedb.proto.MetricsWindow> values) {
      if (metricsBuilder_ == null) {
        ensureMetricsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, metrics_);
        onChanged();
      } else {
        metricsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .streamspeedb.MetricsWindow metrics = 1;</code>
     */
    public Builder clearMetrics() {
      if (metricsBuilder_ == null) {
        metrics_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        metricsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .streamspeedb.MetricsWindow metrics = 1;</code>
     */
    public Builder removeMetrics(int index) {
      if (metricsBuilder_ == null) {
        ensureMetricsIsMutable();
        metrics_.remove(index);
        onChanged();
      } else {
        metricsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .streamspeedb.MetricsWindow metrics = 1;</code>
     */
    public benchmark.speedb.proto.MetricsWindow.Builder getMetricsBuilder(
        int index) {
      return getMetricsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .streamspeedb.MetricsWindow metrics = 1;</code>
     */
    public benchmark.speedb.proto.MetricsWindowOrBuilder getMetricsOrBuilder(
        int index) {
      if (metricsBuilder_ == null) {
        return metrics_.get(index);  } else {
        return metricsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .streamspeedb.MetricsWindow metrics = 1;</code>
     */
    public java.util.List<? extends benchmark.speedb.proto.MetricsWindowOrBuilder> 
         getMetricsOrBuilderList() {
      if (metricsBuilder_ != null) {
        return metricsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(metrics_);
      }
    }
    /**
     * <code>repeated .streamspeedb.MetricsWindow metrics = 1;</code>
     */
    public benchmark.speedb.proto.MetricsWindow.Builder addMetricsBuilder() {
      return getMetricsFieldBuilder().addBuilder(
          benchmark.speedb.proto.MetricsWindow.getDefaultInstance());
    }
    /**
     * <code>repeated .streamspeedb.MetricsWindow metrics = 1;</code>
     */
    public benchmark.speedb.proto.MetricsWindow.Builder addMetricsBuilder(
        int index) {
      return getMetricsFieldBuilder().addBuilder(
          index, benchmark.speedb.proto.MetricsWindow.getDefaultInstance());
    }
    /**
     * <code>repeated .streamspeedb.MetricsWindow metrics = 1;</code>
     */
    public java.util.List<benchmark.speedb.proto.MetricsWindow.Builder> 
         getMetricsBuilderList() {
      return getMetricsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        benchmark.speedb.proto.MetricsWindow, benchmark.speedb.proto.MetricsWindow.Builder, benchmark.speedb.proto.MetricsWindowOrBuilder> 
        getMetricsFieldBuilder() {
      if (metricsBuilder_ == null) {
        metricsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            benchmark.speedb.proto.MetricsWindow, benchmark.speedb.proto.MetricsWindow.Builder, benchmark.speedb.proto.MetricsWindowOrBuilder>(
                metrics_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        metrics_ = null;
      }
      return metricsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:streamspeedb.WorfklowMetricsResponse)
  }

  // @@protoc_insertion_point(class_scope:streamspeedb.WorfklowMetricsResponse)
  private static final benchmark.speedb.proto.WorfklowMetricsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new benchmark.speedb.proto.WorfklowMetricsResponse();
  }

  public static benchmark.speedb.proto.WorfklowMetricsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<WorfklowMetricsResponse>
      PARSER = new com.google.protobuf.AbstractParser<WorfklowMetricsResponse>() {
    @java.lang.Override
    public WorfklowMetricsResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new WorfklowMetricsResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<WorfklowMetricsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<WorfklowMetricsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public benchmark.speedb.proto.WorfklowMetricsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

