// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: model.proto

package benchmark.speedb.proto;

/**
 * Protobuf type {@code streamspeedb.Workflow}
 */
public final class Workflow extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:streamspeedb.Workflow)
    WorkflowOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Workflow.newBuilder() to construct.
  private Workflow(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Workflow() {
    id_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Workflow();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Workflow(
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
            java.lang.String s = input.readStringRequireUtf8();

            id_ = s;
            break;
          }
          case 18: {
            com.google.protobuf.Timestamp.Builder subBuilder = null;
            if (launchTime_ != null) {
              subBuilder = launchTime_.toBuilder();
            }
            launchTime_ = input.readMessage(com.google.protobuf.Timestamp.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(launchTime_);
              launchTime_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            com.google.protobuf.Timestamp.Builder subBuilder = null;
            if (startTime_ != null) {
              subBuilder = startTime_.toBuilder();
            }
            startTime_ = input.readMessage(com.google.protobuf.Timestamp.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(startTime_);
              startTime_ = subBuilder.buildPartial();
            }

            break;
          }
          case 32: {

            completed_ = input.readBool();
            break;
          }
          case 40: {

            currentTaskRunNumber_ = input.readInt32();
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
    return benchmark.speedb.proto.Model.internal_static_streamspeedb_Workflow_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return benchmark.speedb.proto.Model.internal_static_streamspeedb_Workflow_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            benchmark.speedb.proto.Workflow.class, benchmark.speedb.proto.Workflow.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object id_;
  /**
   * <code>string id = 1;</code>
   * @return The id.
   */
  @java.lang.Override
  public java.lang.String getId() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      id_ = s;
      return s;
    }
  }
  /**
   * <code>string id = 1;</code>
   * @return The bytes for id.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getIdBytes() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      id_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LAUNCH_TIME_FIELD_NUMBER = 2;
  private com.google.protobuf.Timestamp launchTime_;
  /**
   * <code>.google.protobuf.Timestamp launch_time = 2;</code>
   * @return Whether the launchTime field is set.
   */
  @java.lang.Override
  public boolean hasLaunchTime() {
    return launchTime_ != null;
  }
  /**
   * <code>.google.protobuf.Timestamp launch_time = 2;</code>
   * @return The launchTime.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getLaunchTime() {
    return launchTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : launchTime_;
  }
  /**
   * <code>.google.protobuf.Timestamp launch_time = 2;</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getLaunchTimeOrBuilder() {
    return getLaunchTime();
  }

  public static final int START_TIME_FIELD_NUMBER = 3;
  private com.google.protobuf.Timestamp startTime_;
  /**
   * <code>.google.protobuf.Timestamp start_time = 3;</code>
   * @return Whether the startTime field is set.
   */
  @java.lang.Override
  public boolean hasStartTime() {
    return startTime_ != null;
  }
  /**
   * <code>.google.protobuf.Timestamp start_time = 3;</code>
   * @return The startTime.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getStartTime() {
    return startTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : startTime_;
  }
  /**
   * <code>.google.protobuf.Timestamp start_time = 3;</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getStartTimeOrBuilder() {
    return getStartTime();
  }

  public static final int COMPLETED_FIELD_NUMBER = 4;
  private boolean completed_;
  /**
   * <code>bool completed = 4;</code>
   * @return The completed.
   */
  @java.lang.Override
  public boolean getCompleted() {
    return completed_;
  }

  public static final int CURRENT_TASK_RUN_NUMBER_FIELD_NUMBER = 5;
  private int currentTaskRunNumber_;
  /**
   * <code>int32 current_task_run_number = 5;</code>
   * @return The currentTaskRunNumber.
   */
  @java.lang.Override
  public int getCurrentTaskRunNumber() {
    return currentTaskRunNumber_;
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
    if (!getIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, id_);
    }
    if (launchTime_ != null) {
      output.writeMessage(2, getLaunchTime());
    }
    if (startTime_ != null) {
      output.writeMessage(3, getStartTime());
    }
    if (completed_ != false) {
      output.writeBool(4, completed_);
    }
    if (currentTaskRunNumber_ != 0) {
      output.writeInt32(5, currentTaskRunNumber_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, id_);
    }
    if (launchTime_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getLaunchTime());
    }
    if (startTime_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getStartTime());
    }
    if (completed_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, completed_);
    }
    if (currentTaskRunNumber_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(5, currentTaskRunNumber_);
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
    if (!(obj instanceof benchmark.speedb.proto.Workflow)) {
      return super.equals(obj);
    }
    benchmark.speedb.proto.Workflow other = (benchmark.speedb.proto.Workflow) obj;

    if (!getId()
        .equals(other.getId())) return false;
    if (hasLaunchTime() != other.hasLaunchTime()) return false;
    if (hasLaunchTime()) {
      if (!getLaunchTime()
          .equals(other.getLaunchTime())) return false;
    }
    if (hasStartTime() != other.hasStartTime()) return false;
    if (hasStartTime()) {
      if (!getStartTime()
          .equals(other.getStartTime())) return false;
    }
    if (getCompleted()
        != other.getCompleted()) return false;
    if (getCurrentTaskRunNumber()
        != other.getCurrentTaskRunNumber()) return false;
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
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + getId().hashCode();
    if (hasLaunchTime()) {
      hash = (37 * hash) + LAUNCH_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getLaunchTime().hashCode();
    }
    if (hasStartTime()) {
      hash = (37 * hash) + START_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getStartTime().hashCode();
    }
    hash = (37 * hash) + COMPLETED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getCompleted());
    hash = (37 * hash) + CURRENT_TASK_RUN_NUMBER_FIELD_NUMBER;
    hash = (53 * hash) + getCurrentTaskRunNumber();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static benchmark.speedb.proto.Workflow parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static benchmark.speedb.proto.Workflow parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static benchmark.speedb.proto.Workflow parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static benchmark.speedb.proto.Workflow parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static benchmark.speedb.proto.Workflow parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static benchmark.speedb.proto.Workflow parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static benchmark.speedb.proto.Workflow parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static benchmark.speedb.proto.Workflow parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static benchmark.speedb.proto.Workflow parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static benchmark.speedb.proto.Workflow parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static benchmark.speedb.proto.Workflow parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static benchmark.speedb.proto.Workflow parseFrom(
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
  public static Builder newBuilder(benchmark.speedb.proto.Workflow prototype) {
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
   * Protobuf type {@code streamspeedb.Workflow}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:streamspeedb.Workflow)
      benchmark.speedb.proto.WorkflowOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return benchmark.speedb.proto.Model.internal_static_streamspeedb_Workflow_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return benchmark.speedb.proto.Model.internal_static_streamspeedb_Workflow_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              benchmark.speedb.proto.Workflow.class, benchmark.speedb.proto.Workflow.Builder.class);
    }

    // Construct using benchmark.speedb.proto.Workflow.newBuilder()
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
      id_ = "";

      if (launchTimeBuilder_ == null) {
        launchTime_ = null;
      } else {
        launchTime_ = null;
        launchTimeBuilder_ = null;
      }
      if (startTimeBuilder_ == null) {
        startTime_ = null;
      } else {
        startTime_ = null;
        startTimeBuilder_ = null;
      }
      completed_ = false;

      currentTaskRunNumber_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return benchmark.speedb.proto.Model.internal_static_streamspeedb_Workflow_descriptor;
    }

    @java.lang.Override
    public benchmark.speedb.proto.Workflow getDefaultInstanceForType() {
      return benchmark.speedb.proto.Workflow.getDefaultInstance();
    }

    @java.lang.Override
    public benchmark.speedb.proto.Workflow build() {
      benchmark.speedb.proto.Workflow result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public benchmark.speedb.proto.Workflow buildPartial() {
      benchmark.speedb.proto.Workflow result = new benchmark.speedb.proto.Workflow(this);
      result.id_ = id_;
      if (launchTimeBuilder_ == null) {
        result.launchTime_ = launchTime_;
      } else {
        result.launchTime_ = launchTimeBuilder_.build();
      }
      if (startTimeBuilder_ == null) {
        result.startTime_ = startTime_;
      } else {
        result.startTime_ = startTimeBuilder_.build();
      }
      result.completed_ = completed_;
      result.currentTaskRunNumber_ = currentTaskRunNumber_;
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
      if (other instanceof benchmark.speedb.proto.Workflow) {
        return mergeFrom((benchmark.speedb.proto.Workflow)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(benchmark.speedb.proto.Workflow other) {
      if (other == benchmark.speedb.proto.Workflow.getDefaultInstance()) return this;
      if (!other.getId().isEmpty()) {
        id_ = other.id_;
        onChanged();
      }
      if (other.hasLaunchTime()) {
        mergeLaunchTime(other.getLaunchTime());
      }
      if (other.hasStartTime()) {
        mergeStartTime(other.getStartTime());
      }
      if (other.getCompleted() != false) {
        setCompleted(other.getCompleted());
      }
      if (other.getCurrentTaskRunNumber() != 0) {
        setCurrentTaskRunNumber(other.getCurrentTaskRunNumber());
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
      benchmark.speedb.proto.Workflow parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (benchmark.speedb.proto.Workflow) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object id_ = "";
    /**
     * <code>string id = 1;</code>
     * @return The id.
     */
    public java.lang.String getId() {
      java.lang.Object ref = id_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        id_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string id = 1;</code>
     * @return The bytes for id.
     */
    public com.google.protobuf.ByteString
        getIdBytes() {
      java.lang.Object ref = id_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        id_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string id = 1;</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      
      id_ = getDefaultInstance().getId();
      onChanged();
      return this;
    }
    /**
     * <code>string id = 1;</code>
     * @param value The bytes for id to set.
     * @return This builder for chaining.
     */
    public Builder setIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      id_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.Timestamp launchTime_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> launchTimeBuilder_;
    /**
     * <code>.google.protobuf.Timestamp launch_time = 2;</code>
     * @return Whether the launchTime field is set.
     */
    public boolean hasLaunchTime() {
      return launchTimeBuilder_ != null || launchTime_ != null;
    }
    /**
     * <code>.google.protobuf.Timestamp launch_time = 2;</code>
     * @return The launchTime.
     */
    public com.google.protobuf.Timestamp getLaunchTime() {
      if (launchTimeBuilder_ == null) {
        return launchTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : launchTime_;
      } else {
        return launchTimeBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.Timestamp launch_time = 2;</code>
     */
    public Builder setLaunchTime(com.google.protobuf.Timestamp value) {
      if (launchTimeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        launchTime_ = value;
        onChanged();
      } else {
        launchTimeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp launch_time = 2;</code>
     */
    public Builder setLaunchTime(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (launchTimeBuilder_ == null) {
        launchTime_ = builderForValue.build();
        onChanged();
      } else {
        launchTimeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp launch_time = 2;</code>
     */
    public Builder mergeLaunchTime(com.google.protobuf.Timestamp value) {
      if (launchTimeBuilder_ == null) {
        if (launchTime_ != null) {
          launchTime_ =
            com.google.protobuf.Timestamp.newBuilder(launchTime_).mergeFrom(value).buildPartial();
        } else {
          launchTime_ = value;
        }
        onChanged();
      } else {
        launchTimeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp launch_time = 2;</code>
     */
    public Builder clearLaunchTime() {
      if (launchTimeBuilder_ == null) {
        launchTime_ = null;
        onChanged();
      } else {
        launchTime_ = null;
        launchTimeBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp launch_time = 2;</code>
     */
    public com.google.protobuf.Timestamp.Builder getLaunchTimeBuilder() {
      
      onChanged();
      return getLaunchTimeFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.Timestamp launch_time = 2;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getLaunchTimeOrBuilder() {
      if (launchTimeBuilder_ != null) {
        return launchTimeBuilder_.getMessageOrBuilder();
      } else {
        return launchTime_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : launchTime_;
      }
    }
    /**
     * <code>.google.protobuf.Timestamp launch_time = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getLaunchTimeFieldBuilder() {
      if (launchTimeBuilder_ == null) {
        launchTimeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getLaunchTime(),
                getParentForChildren(),
                isClean());
        launchTime_ = null;
      }
      return launchTimeBuilder_;
    }

    private com.google.protobuf.Timestamp startTime_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> startTimeBuilder_;
    /**
     * <code>.google.protobuf.Timestamp start_time = 3;</code>
     * @return Whether the startTime field is set.
     */
    public boolean hasStartTime() {
      return startTimeBuilder_ != null || startTime_ != null;
    }
    /**
     * <code>.google.protobuf.Timestamp start_time = 3;</code>
     * @return The startTime.
     */
    public com.google.protobuf.Timestamp getStartTime() {
      if (startTimeBuilder_ == null) {
        return startTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : startTime_;
      } else {
        return startTimeBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.Timestamp start_time = 3;</code>
     */
    public Builder setStartTime(com.google.protobuf.Timestamp value) {
      if (startTimeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        startTime_ = value;
        onChanged();
      } else {
        startTimeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp start_time = 3;</code>
     */
    public Builder setStartTime(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (startTimeBuilder_ == null) {
        startTime_ = builderForValue.build();
        onChanged();
      } else {
        startTimeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp start_time = 3;</code>
     */
    public Builder mergeStartTime(com.google.protobuf.Timestamp value) {
      if (startTimeBuilder_ == null) {
        if (startTime_ != null) {
          startTime_ =
            com.google.protobuf.Timestamp.newBuilder(startTime_).mergeFrom(value).buildPartial();
        } else {
          startTime_ = value;
        }
        onChanged();
      } else {
        startTimeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp start_time = 3;</code>
     */
    public Builder clearStartTime() {
      if (startTimeBuilder_ == null) {
        startTime_ = null;
        onChanged();
      } else {
        startTime_ = null;
        startTimeBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp start_time = 3;</code>
     */
    public com.google.protobuf.Timestamp.Builder getStartTimeBuilder() {
      
      onChanged();
      return getStartTimeFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.Timestamp start_time = 3;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getStartTimeOrBuilder() {
      if (startTimeBuilder_ != null) {
        return startTimeBuilder_.getMessageOrBuilder();
      } else {
        return startTime_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : startTime_;
      }
    }
    /**
     * <code>.google.protobuf.Timestamp start_time = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getStartTimeFieldBuilder() {
      if (startTimeBuilder_ == null) {
        startTimeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getStartTime(),
                getParentForChildren(),
                isClean());
        startTime_ = null;
      }
      return startTimeBuilder_;
    }

    private boolean completed_ ;
    /**
     * <code>bool completed = 4;</code>
     * @return The completed.
     */
    @java.lang.Override
    public boolean getCompleted() {
      return completed_;
    }
    /**
     * <code>bool completed = 4;</code>
     * @param value The completed to set.
     * @return This builder for chaining.
     */
    public Builder setCompleted(boolean value) {
      
      completed_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool completed = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearCompleted() {
      
      completed_ = false;
      onChanged();
      return this;
    }

    private int currentTaskRunNumber_ ;
    /**
     * <code>int32 current_task_run_number = 5;</code>
     * @return The currentTaskRunNumber.
     */
    @java.lang.Override
    public int getCurrentTaskRunNumber() {
      return currentTaskRunNumber_;
    }
    /**
     * <code>int32 current_task_run_number = 5;</code>
     * @param value The currentTaskRunNumber to set.
     * @return This builder for chaining.
     */
    public Builder setCurrentTaskRunNumber(int value) {
      
      currentTaskRunNumber_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 current_task_run_number = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearCurrentTaskRunNumber() {
      
      currentTaskRunNumber_ = 0;
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


    // @@protoc_insertion_point(builder_scope:streamspeedb.Workflow)
  }

  // @@protoc_insertion_point(class_scope:streamspeedb.Workflow)
  private static final benchmark.speedb.proto.Workflow DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new benchmark.speedb.proto.Workflow();
  }

  public static benchmark.speedb.proto.Workflow getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Workflow>
      PARSER = new com.google.protobuf.AbstractParser<Workflow>() {
    @java.lang.Override
    public Workflow parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Workflow(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Workflow> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Workflow> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public benchmark.speedb.proto.Workflow getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
