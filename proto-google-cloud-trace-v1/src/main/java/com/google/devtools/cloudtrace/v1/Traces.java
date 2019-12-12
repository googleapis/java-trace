/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/cloudtrace/v1/trace.proto

package com.google.devtools.cloudtrace.v1;

/**
 *
 *
 * <pre>
 * List of new or updated traces.
 * </pre>
 *
 * Protobuf type {@code google.devtools.cloudtrace.v1.Traces}
 */
public final class Traces extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.devtools.cloudtrace.v1.Traces)
    TracesOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use Traces.newBuilder() to construct.
  private Traces(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private Traces() {
    traces_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new Traces();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private Traces(
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
          case 10:
            {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                traces_ = new java.util.ArrayList<com.google.devtools.cloudtrace.v1.Trace>();
                mutable_bitField0_ |= 0x00000001;
              }
              traces_.add(
                  input.readMessage(
                      com.google.devtools.cloudtrace.v1.Trace.parser(), extensionRegistry));
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        traces_ = java.util.Collections.unmodifiableList(traces_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.devtools.cloudtrace.v1.TraceProto
        .internal_static_google_devtools_cloudtrace_v1_Traces_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.devtools.cloudtrace.v1.TraceProto
        .internal_static_google_devtools_cloudtrace_v1_Traces_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.devtools.cloudtrace.v1.Traces.class,
            com.google.devtools.cloudtrace.v1.Traces.Builder.class);
  }

  public static final int TRACES_FIELD_NUMBER = 1;
  private java.util.List<com.google.devtools.cloudtrace.v1.Trace> traces_;
  /**
   *
   *
   * <pre>
   * List of traces.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudtrace.v1.Trace traces = 1;</code>
   */
  public java.util.List<com.google.devtools.cloudtrace.v1.Trace> getTracesList() {
    return traces_;
  }
  /**
   *
   *
   * <pre>
   * List of traces.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudtrace.v1.Trace traces = 1;</code>
   */
  public java.util.List<? extends com.google.devtools.cloudtrace.v1.TraceOrBuilder>
      getTracesOrBuilderList() {
    return traces_;
  }
  /**
   *
   *
   * <pre>
   * List of traces.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudtrace.v1.Trace traces = 1;</code>
   */
  public int getTracesCount() {
    return traces_.size();
  }
  /**
   *
   *
   * <pre>
   * List of traces.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudtrace.v1.Trace traces = 1;</code>
   */
  public com.google.devtools.cloudtrace.v1.Trace getTraces(int index) {
    return traces_.get(index);
  }
  /**
   *
   *
   * <pre>
   * List of traces.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudtrace.v1.Trace traces = 1;</code>
   */
  public com.google.devtools.cloudtrace.v1.TraceOrBuilder getTracesOrBuilder(int index) {
    return traces_.get(index);
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    for (int i = 0; i < traces_.size(); i++) {
      output.writeMessage(1, traces_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < traces_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, traces_.get(i));
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
    if (!(obj instanceof com.google.devtools.cloudtrace.v1.Traces)) {
      return super.equals(obj);
    }
    com.google.devtools.cloudtrace.v1.Traces other = (com.google.devtools.cloudtrace.v1.Traces) obj;

    if (!getTracesList().equals(other.getTracesList())) return false;
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
    if (getTracesCount() > 0) {
      hash = (37 * hash) + TRACES_FIELD_NUMBER;
      hash = (53 * hash) + getTracesList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.devtools.cloudtrace.v1.Traces parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.devtools.cloudtrace.v1.Traces parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.devtools.cloudtrace.v1.Traces parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.devtools.cloudtrace.v1.Traces parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.devtools.cloudtrace.v1.Traces parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.devtools.cloudtrace.v1.Traces parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.devtools.cloudtrace.v1.Traces parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.devtools.cloudtrace.v1.Traces parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.devtools.cloudtrace.v1.Traces parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.devtools.cloudtrace.v1.Traces parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.devtools.cloudtrace.v1.Traces parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.devtools.cloudtrace.v1.Traces parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.devtools.cloudtrace.v1.Traces prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * List of new or updated traces.
   * </pre>
   *
   * Protobuf type {@code google.devtools.cloudtrace.v1.Traces}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.devtools.cloudtrace.v1.Traces)
      com.google.devtools.cloudtrace.v1.TracesOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.devtools.cloudtrace.v1.TraceProto
          .internal_static_google_devtools_cloudtrace_v1_Traces_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.devtools.cloudtrace.v1.TraceProto
          .internal_static_google_devtools_cloudtrace_v1_Traces_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.devtools.cloudtrace.v1.Traces.class,
              com.google.devtools.cloudtrace.v1.Traces.Builder.class);
    }

    // Construct using com.google.devtools.cloudtrace.v1.Traces.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getTracesFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (tracesBuilder_ == null) {
        traces_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        tracesBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.devtools.cloudtrace.v1.TraceProto
          .internal_static_google_devtools_cloudtrace_v1_Traces_descriptor;
    }

    @java.lang.Override
    public com.google.devtools.cloudtrace.v1.Traces getDefaultInstanceForType() {
      return com.google.devtools.cloudtrace.v1.Traces.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.devtools.cloudtrace.v1.Traces build() {
      com.google.devtools.cloudtrace.v1.Traces result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.devtools.cloudtrace.v1.Traces buildPartial() {
      com.google.devtools.cloudtrace.v1.Traces result =
          new com.google.devtools.cloudtrace.v1.Traces(this);
      int from_bitField0_ = bitField0_;
      if (tracesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          traces_ = java.util.Collections.unmodifiableList(traces_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.traces_ = traces_;
      } else {
        result.traces_ = tracesBuilder_.build();
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
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.devtools.cloudtrace.v1.Traces) {
        return mergeFrom((com.google.devtools.cloudtrace.v1.Traces) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.devtools.cloudtrace.v1.Traces other) {
      if (other == com.google.devtools.cloudtrace.v1.Traces.getDefaultInstance()) return this;
      if (tracesBuilder_ == null) {
        if (!other.traces_.isEmpty()) {
          if (traces_.isEmpty()) {
            traces_ = other.traces_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureTracesIsMutable();
            traces_.addAll(other.traces_);
          }
          onChanged();
        }
      } else {
        if (!other.traces_.isEmpty()) {
          if (tracesBuilder_.isEmpty()) {
            tracesBuilder_.dispose();
            tracesBuilder_ = null;
            traces_ = other.traces_;
            bitField0_ = (bitField0_ & ~0x00000001);
            tracesBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getTracesFieldBuilder()
                    : null;
          } else {
            tracesBuilder_.addAllMessages(other.traces_);
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
      com.google.devtools.cloudtrace.v1.Traces parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.devtools.cloudtrace.v1.Traces) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private java.util.List<com.google.devtools.cloudtrace.v1.Trace> traces_ =
        java.util.Collections.emptyList();

    private void ensureTracesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        traces_ = new java.util.ArrayList<com.google.devtools.cloudtrace.v1.Trace>(traces_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.devtools.cloudtrace.v1.Trace,
            com.google.devtools.cloudtrace.v1.Trace.Builder,
            com.google.devtools.cloudtrace.v1.TraceOrBuilder>
        tracesBuilder_;

    /**
     *
     *
     * <pre>
     * List of traces.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudtrace.v1.Trace traces = 1;</code>
     */
    public java.util.List<com.google.devtools.cloudtrace.v1.Trace> getTracesList() {
      if (tracesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(traces_);
      } else {
        return tracesBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * List of traces.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudtrace.v1.Trace traces = 1;</code>
     */
    public int getTracesCount() {
      if (tracesBuilder_ == null) {
        return traces_.size();
      } else {
        return tracesBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * List of traces.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudtrace.v1.Trace traces = 1;</code>
     */
    public com.google.devtools.cloudtrace.v1.Trace getTraces(int index) {
      if (tracesBuilder_ == null) {
        return traces_.get(index);
      } else {
        return tracesBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * List of traces.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudtrace.v1.Trace traces = 1;</code>
     */
    public Builder setTraces(int index, com.google.devtools.cloudtrace.v1.Trace value) {
      if (tracesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTracesIsMutable();
        traces_.set(index, value);
        onChanged();
      } else {
        tracesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of traces.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudtrace.v1.Trace traces = 1;</code>
     */
    public Builder setTraces(
        int index, com.google.devtools.cloudtrace.v1.Trace.Builder builderForValue) {
      if (tracesBuilder_ == null) {
        ensureTracesIsMutable();
        traces_.set(index, builderForValue.build());
        onChanged();
      } else {
        tracesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of traces.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudtrace.v1.Trace traces = 1;</code>
     */
    public Builder addTraces(com.google.devtools.cloudtrace.v1.Trace value) {
      if (tracesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTracesIsMutable();
        traces_.add(value);
        onChanged();
      } else {
        tracesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of traces.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudtrace.v1.Trace traces = 1;</code>
     */
    public Builder addTraces(int index, com.google.devtools.cloudtrace.v1.Trace value) {
      if (tracesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTracesIsMutable();
        traces_.add(index, value);
        onChanged();
      } else {
        tracesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of traces.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudtrace.v1.Trace traces = 1;</code>
     */
    public Builder addTraces(com.google.devtools.cloudtrace.v1.Trace.Builder builderForValue) {
      if (tracesBuilder_ == null) {
        ensureTracesIsMutable();
        traces_.add(builderForValue.build());
        onChanged();
      } else {
        tracesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of traces.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudtrace.v1.Trace traces = 1;</code>
     */
    public Builder addTraces(
        int index, com.google.devtools.cloudtrace.v1.Trace.Builder builderForValue) {
      if (tracesBuilder_ == null) {
        ensureTracesIsMutable();
        traces_.add(index, builderForValue.build());
        onChanged();
      } else {
        tracesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of traces.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudtrace.v1.Trace traces = 1;</code>
     */
    public Builder addAllTraces(
        java.lang.Iterable<? extends com.google.devtools.cloudtrace.v1.Trace> values) {
      if (tracesBuilder_ == null) {
        ensureTracesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, traces_);
        onChanged();
      } else {
        tracesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of traces.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudtrace.v1.Trace traces = 1;</code>
     */
    public Builder clearTraces() {
      if (tracesBuilder_ == null) {
        traces_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        tracesBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of traces.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudtrace.v1.Trace traces = 1;</code>
     */
    public Builder removeTraces(int index) {
      if (tracesBuilder_ == null) {
        ensureTracesIsMutable();
        traces_.remove(index);
        onChanged();
      } else {
        tracesBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of traces.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudtrace.v1.Trace traces = 1;</code>
     */
    public com.google.devtools.cloudtrace.v1.Trace.Builder getTracesBuilder(int index) {
      return getTracesFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * List of traces.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudtrace.v1.Trace traces = 1;</code>
     */
    public com.google.devtools.cloudtrace.v1.TraceOrBuilder getTracesOrBuilder(int index) {
      if (tracesBuilder_ == null) {
        return traces_.get(index);
      } else {
        return tracesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * List of traces.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudtrace.v1.Trace traces = 1;</code>
     */
    public java.util.List<? extends com.google.devtools.cloudtrace.v1.TraceOrBuilder>
        getTracesOrBuilderList() {
      if (tracesBuilder_ != null) {
        return tracesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(traces_);
      }
    }
    /**
     *
     *
     * <pre>
     * List of traces.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudtrace.v1.Trace traces = 1;</code>
     */
    public com.google.devtools.cloudtrace.v1.Trace.Builder addTracesBuilder() {
      return getTracesFieldBuilder()
          .addBuilder(com.google.devtools.cloudtrace.v1.Trace.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * List of traces.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudtrace.v1.Trace traces = 1;</code>
     */
    public com.google.devtools.cloudtrace.v1.Trace.Builder addTracesBuilder(int index) {
      return getTracesFieldBuilder()
          .addBuilder(index, com.google.devtools.cloudtrace.v1.Trace.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * List of traces.
     * </pre>
     *
     * <code>repeated .google.devtools.cloudtrace.v1.Trace traces = 1;</code>
     */
    public java.util.List<com.google.devtools.cloudtrace.v1.Trace.Builder> getTracesBuilderList() {
      return getTracesFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.devtools.cloudtrace.v1.Trace,
            com.google.devtools.cloudtrace.v1.Trace.Builder,
            com.google.devtools.cloudtrace.v1.TraceOrBuilder>
        getTracesFieldBuilder() {
      if (tracesBuilder_ == null) {
        tracesBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.devtools.cloudtrace.v1.Trace,
                com.google.devtools.cloudtrace.v1.Trace.Builder,
                com.google.devtools.cloudtrace.v1.TraceOrBuilder>(
                traces_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        traces_ = null;
      }
      return tracesBuilder_;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.devtools.cloudtrace.v1.Traces)
  }

  // @@protoc_insertion_point(class_scope:google.devtools.cloudtrace.v1.Traces)
  private static final com.google.devtools.cloudtrace.v1.Traces DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.devtools.cloudtrace.v1.Traces();
  }

  public static com.google.devtools.cloudtrace.v1.Traces getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Traces> PARSER =
      new com.google.protobuf.AbstractParser<Traces>() {
        @java.lang.Override
        public Traces parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new Traces(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<Traces> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Traces> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.devtools.cloudtrace.v1.Traces getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
