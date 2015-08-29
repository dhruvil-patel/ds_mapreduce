package HDFSPackage;

/**
 * @author dpate19
 * 
 *         This file is generated using google protobuf.
 *
 */

public final class HDFS {
  private HDFS() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface BlockReportRequestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:BlockReportRequest)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional int32 id = 1;</code>
     *
     * <pre>
     * identity of the DN. All communication to the NN uses the same id
     * </pre>
     */
    boolean hasId();
    /**
     * <code>optional int32 id = 1;</code>
     *
     * <pre>
     * identity of the DN. All communication to the NN uses the same id
     * </pre>
     */
    int getId();

    /**
     * <code>optional .DataNodeLocation location = 2;</code>
     */
    boolean hasLocation();
    /**
     * <code>optional .DataNodeLocation location = 2;</code>
     */
    HDFS.DataNodeLocation getLocation();
    /**
     * <code>optional .DataNodeLocation location = 2;</code>
     */
    HDFS.DataNodeLocationOrBuilder getLocationOrBuilder();

    /**
     * <code>repeated int32 blockNumbers = 3;</code>
     */
    java.util.List<java.lang.Integer> getBlockNumbersList();
    /**
     * <code>repeated int32 blockNumbers = 3;</code>
     */
    int getBlockNumbersCount();
    /**
     * <code>repeated int32 blockNumbers = 3;</code>
     */
    int getBlockNumbers(int index);
  }
  /**
   * Protobuf type {@code BlockReportRequest}
   */
  public static final class BlockReportRequest extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:BlockReportRequest)
      BlockReportRequestOrBuilder {
    // Use BlockReportRequest.newBuilder() to construct.
    private BlockReportRequest(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private BlockReportRequest(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final BlockReportRequest defaultInstance;
    public static BlockReportRequest getDefaultInstance() {
      return defaultInstance;
    }

    public BlockReportRequest getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private BlockReportRequest(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
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
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              id_ = input.readInt32();
              break;
            }
            case 18: {
              HDFS.DataNodeLocation.Builder subBuilder = null;
              if (((bitField0_ & 0x00000002) == 0x00000002)) {
                subBuilder = location_.toBuilder();
              }
              location_ = input.readMessage(HDFS.DataNodeLocation.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(location_);
                location_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000002;
              break;
            }
            case 24: {
              if (!((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
                blockNumbers_ = new java.util.ArrayList<java.lang.Integer>();
                mutable_bitField0_ |= 0x00000004;
              }
              blockNumbers_.add(input.readInt32());
              break;
            }
            case 26: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000004) == 0x00000004) && input.getBytesUntilLimit() > 0) {
                blockNumbers_ = new java.util.ArrayList<java.lang.Integer>();
                mutable_bitField0_ |= 0x00000004;
              }
              while (input.getBytesUntilLimit() > 0) {
                blockNumbers_.add(input.readInt32());
              }
              input.popLimit(limit);
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
          blockNumbers_ = java.util.Collections.unmodifiableList(blockNumbers_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return HDFS.internal_static_BlockReportRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return HDFS.internal_static_BlockReportRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              HDFS.BlockReportRequest.class, HDFS.BlockReportRequest.Builder.class);
    }

    public static com.google.protobuf.Parser<BlockReportRequest> PARSER =
        new com.google.protobuf.AbstractParser<BlockReportRequest>() {
      public BlockReportRequest parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new BlockReportRequest(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<BlockReportRequest> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int ID_FIELD_NUMBER = 1;
    private int id_;
    /**
     * <code>optional int32 id = 1;</code>
     *
     * <pre>
     * identity of the DN. All communication to the NN uses the same id
     * </pre>
     */
    public boolean hasId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional int32 id = 1;</code>
     *
     * <pre>
     * identity of the DN. All communication to the NN uses the same id
     * </pre>
     */
    public int getId() {
      return id_;
    }

    public static final int LOCATION_FIELD_NUMBER = 2;
    private HDFS.DataNodeLocation location_;
    /**
     * <code>optional .DataNodeLocation location = 2;</code>
     */
    public boolean hasLocation() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional .DataNodeLocation location = 2;</code>
     */
    public HDFS.DataNodeLocation getLocation() {
      return location_;
    }
    /**
     * <code>optional .DataNodeLocation location = 2;</code>
     */
    public HDFS.DataNodeLocationOrBuilder getLocationOrBuilder() {
      return location_;
    }

    public static final int BLOCKNUMBERS_FIELD_NUMBER = 3;
    private java.util.List<java.lang.Integer> blockNumbers_;
    /**
     * <code>repeated int32 blockNumbers = 3;</code>
     */
    public java.util.List<java.lang.Integer>
        getBlockNumbersList() {
      return blockNumbers_;
    }
    /**
     * <code>repeated int32 blockNumbers = 3;</code>
     */
    public int getBlockNumbersCount() {
      return blockNumbers_.size();
    }
    /**
     * <code>repeated int32 blockNumbers = 3;</code>
     */
    public int getBlockNumbers(int index) {
      return blockNumbers_.get(index);
    }

    private void initFields() {
      id_ = 0;
      location_ = HDFS.DataNodeLocation.getDefaultInstance();
      blockNumbers_ = java.util.Collections.emptyList();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt32(1, id_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeMessage(2, location_);
      }
      for (int i = 0; i < blockNumbers_.size(); i++) {
        output.writeInt32(3, blockNumbers_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, id_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, location_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < blockNumbers_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(blockNumbers_.get(i));
        }
        size += dataSize;
        size += 1 * getBlockNumbersList().size();
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static HDFS.BlockReportRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static HDFS.BlockReportRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static HDFS.BlockReportRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static HDFS.BlockReportRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static HDFS.BlockReportRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static HDFS.BlockReportRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static HDFS.BlockReportRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static HDFS.BlockReportRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static HDFS.BlockReportRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static HDFS.BlockReportRequest parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(HDFS.BlockReportRequest prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code BlockReportRequest}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:BlockReportRequest)
        HDFS.BlockReportRequestOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return HDFS.internal_static_BlockReportRequest_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return HDFS.internal_static_BlockReportRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                HDFS.BlockReportRequest.class, HDFS.BlockReportRequest.Builder.class);
      }

      // Construct using HDFS.BlockReportRequest.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getLocationFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        id_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        if (locationBuilder_ == null) {
          location_ = HDFS.DataNodeLocation.getDefaultInstance();
        } else {
          locationBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        blockNumbers_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return HDFS.internal_static_BlockReportRequest_descriptor;
      }

      public HDFS.BlockReportRequest getDefaultInstanceForType() {
        return HDFS.BlockReportRequest.getDefaultInstance();
      }

      public HDFS.BlockReportRequest build() {
        HDFS.BlockReportRequest result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public HDFS.BlockReportRequest buildPartial() {
        HDFS.BlockReportRequest result = new HDFS.BlockReportRequest(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.id_ = id_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        if (locationBuilder_ == null) {
          result.location_ = location_;
        } else {
          result.location_ = locationBuilder_.build();
        }
        if (((bitField0_ & 0x00000004) == 0x00000004)) {
          blockNumbers_ = java.util.Collections.unmodifiableList(blockNumbers_);
          bitField0_ = (bitField0_ & ~0x00000004);
        }
        result.blockNumbers_ = blockNumbers_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof HDFS.BlockReportRequest) {
          return mergeFrom((HDFS.BlockReportRequest)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(HDFS.BlockReportRequest other) {
        if (other == HDFS.BlockReportRequest.getDefaultInstance()) return this;
        if (other.hasId()) {
          setId(other.getId());
        }
        if (other.hasLocation()) {
          mergeLocation(other.getLocation());
        }
        if (!other.blockNumbers_.isEmpty()) {
          if (blockNumbers_.isEmpty()) {
            blockNumbers_ = other.blockNumbers_;
            bitField0_ = (bitField0_ & ~0x00000004);
          } else {
            ensureBlockNumbersIsMutable();
            blockNumbers_.addAll(other.blockNumbers_);
          }
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        HDFS.BlockReportRequest parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (HDFS.BlockReportRequest) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int id_ ;
      /**
       * <code>optional int32 id = 1;</code>
       *
       * <pre>
       * identity of the DN. All communication to the NN uses the same id
       * </pre>
       */
      public boolean hasId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional int32 id = 1;</code>
       *
       * <pre>
       * identity of the DN. All communication to the NN uses the same id
       * </pre>
       */
      public int getId() {
        return id_;
      }
      /**
       * <code>optional int32 id = 1;</code>
       *
       * <pre>
       * identity of the DN. All communication to the NN uses the same id
       * </pre>
       */
      public Builder setId(int value) {
        bitField0_ |= 0x00000001;
        id_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 id = 1;</code>
       *
       * <pre>
       * identity of the DN. All communication to the NN uses the same id
       * </pre>
       */
      public Builder clearId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        id_ = 0;
        onChanged();
        return this;
      }

      private HDFS.DataNodeLocation location_ = HDFS.DataNodeLocation.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          HDFS.DataNodeLocation, HDFS.DataNodeLocation.Builder, HDFS.DataNodeLocationOrBuilder> locationBuilder_;
      /**
       * <code>optional .DataNodeLocation location = 2;</code>
       */
      public boolean hasLocation() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional .DataNodeLocation location = 2;</code>
       */
      public HDFS.DataNodeLocation getLocation() {
        if (locationBuilder_ == null) {
          return location_;
        } else {
          return locationBuilder_.getMessage();
        }
      }
      /**
       * <code>optional .DataNodeLocation location = 2;</code>
       */
      public Builder setLocation(HDFS.DataNodeLocation value) {
        if (locationBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          location_ = value;
          onChanged();
        } else {
          locationBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <code>optional .DataNodeLocation location = 2;</code>
       */
      public Builder setLocation(
          HDFS.DataNodeLocation.Builder builderForValue) {
        if (locationBuilder_ == null) {
          location_ = builderForValue.build();
          onChanged();
        } else {
          locationBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <code>optional .DataNodeLocation location = 2;</code>
       */
      public Builder mergeLocation(HDFS.DataNodeLocation value) {
        if (locationBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002) &&
              location_ != HDFS.DataNodeLocation.getDefaultInstance()) {
            location_ =
              HDFS.DataNodeLocation.newBuilder(location_).mergeFrom(value).buildPartial();
          } else {
            location_ = value;
          }
          onChanged();
        } else {
          locationBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <code>optional .DataNodeLocation location = 2;</code>
       */
      public Builder clearLocation() {
        if (locationBuilder_ == null) {
          location_ = HDFS.DataNodeLocation.getDefaultInstance();
          onChanged();
        } else {
          locationBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      /**
       * <code>optional .DataNodeLocation location = 2;</code>
       */
      public HDFS.DataNodeLocation.Builder getLocationBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getLocationFieldBuilder().getBuilder();
      }
      /**
       * <code>optional .DataNodeLocation location = 2;</code>
       */
      public HDFS.DataNodeLocationOrBuilder getLocationOrBuilder() {
        if (locationBuilder_ != null) {
          return locationBuilder_.getMessageOrBuilder();
        } else {
          return location_;
        }
      }
      /**
       * <code>optional .DataNodeLocation location = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilder<
          HDFS.DataNodeLocation, HDFS.DataNodeLocation.Builder, HDFS.DataNodeLocationOrBuilder> 
          getLocationFieldBuilder() {
        if (locationBuilder_ == null) {
          locationBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              HDFS.DataNodeLocation, HDFS.DataNodeLocation.Builder, HDFS.DataNodeLocationOrBuilder>(
                  getLocation(),
                  getParentForChildren(),
                  isClean());
          location_ = null;
        }
        return locationBuilder_;
      }

      private java.util.List<java.lang.Integer> blockNumbers_ = java.util.Collections.emptyList();
      private void ensureBlockNumbersIsMutable() {
        if (!((bitField0_ & 0x00000004) == 0x00000004)) {
          blockNumbers_ = new java.util.ArrayList<java.lang.Integer>(blockNumbers_);
          bitField0_ |= 0x00000004;
         }
      }
      /**
       * <code>repeated int32 blockNumbers = 3;</code>
       */
      public java.util.List<java.lang.Integer>
          getBlockNumbersList() {
        return java.util.Collections.unmodifiableList(blockNumbers_);
      }
      /**
       * <code>repeated int32 blockNumbers = 3;</code>
       */
      public int getBlockNumbersCount() {
        return blockNumbers_.size();
      }
      /**
       * <code>repeated int32 blockNumbers = 3;</code>
       */
      public int getBlockNumbers(int index) {
        return blockNumbers_.get(index);
      }
      /**
       * <code>repeated int32 blockNumbers = 3;</code>
       */
      public Builder setBlockNumbers(
          int index, int value) {
        ensureBlockNumbersIsMutable();
        blockNumbers_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated int32 blockNumbers = 3;</code>
       */
      public Builder addBlockNumbers(int value) {
        ensureBlockNumbersIsMutable();
        blockNumbers_.add(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated int32 blockNumbers = 3;</code>
       */
      public Builder addAllBlockNumbers(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureBlockNumbersIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, blockNumbers_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated int32 blockNumbers = 3;</code>
       */
      public Builder clearBlockNumbers() {
        blockNumbers_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:BlockReportRequest)
    }

    static {
      defaultInstance = new BlockReportRequest(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:BlockReportRequest)
  }

  public interface BlockReportResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:BlockReportResponse)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated int32 status = 1;</code>
     */
    java.util.List<java.lang.Integer> getStatusList();
    /**
     * <code>repeated int32 status = 1;</code>
     */
    int getStatusCount();
    /**
     * <code>repeated int32 status = 1;</code>
     */
    int getStatus(int index);
  }
  /**
   * Protobuf type {@code BlockReportResponse}
   */
  public static final class BlockReportResponse extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:BlockReportResponse)
      BlockReportResponseOrBuilder {
    // Use BlockReportResponse.newBuilder() to construct.
    private BlockReportResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private BlockReportResponse(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final BlockReportResponse defaultInstance;
    public static BlockReportResponse getDefaultInstance() {
      return defaultInstance;
    }

    public BlockReportResponse getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private BlockReportResponse(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
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
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                status_ = new java.util.ArrayList<java.lang.Integer>();
                mutable_bitField0_ |= 0x00000001;
              }
              status_.add(input.readInt32());
              break;
            }
            case 10: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) == 0x00000001) && input.getBytesUntilLimit() > 0) {
                status_ = new java.util.ArrayList<java.lang.Integer>();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                status_.add(input.readInt32());
              }
              input.popLimit(limit);
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
          status_ = java.util.Collections.unmodifiableList(status_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return HDFS.internal_static_BlockReportResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return HDFS.internal_static_BlockReportResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              HDFS.BlockReportResponse.class, HDFS.BlockReportResponse.Builder.class);
    }

    public static com.google.protobuf.Parser<BlockReportResponse> PARSER =
        new com.google.protobuf.AbstractParser<BlockReportResponse>() {
      public BlockReportResponse parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new BlockReportResponse(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<BlockReportResponse> getParserForType() {
      return PARSER;
    }

    public static final int STATUS_FIELD_NUMBER = 1;
    private java.util.List<java.lang.Integer> status_;
    /**
     * <code>repeated int32 status = 1;</code>
     */
    public java.util.List<java.lang.Integer>
        getStatusList() {
      return status_;
    }
    /**
     * <code>repeated int32 status = 1;</code>
     */
    public int getStatusCount() {
      return status_.size();
    }
    /**
     * <code>repeated int32 status = 1;</code>
     */
    public int getStatus(int index) {
      return status_.get(index);
    }

    private void initFields() {
      status_ = java.util.Collections.emptyList();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      for (int i = 0; i < status_.size(); i++) {
        output.writeInt32(1, status_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      {
        int dataSize = 0;
        for (int i = 0; i < status_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(status_.get(i));
        }
        size += dataSize;
        size += 1 * getStatusList().size();
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static HDFS.BlockReportResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static HDFS.BlockReportResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static HDFS.BlockReportResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static HDFS.BlockReportResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static HDFS.BlockReportResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static HDFS.BlockReportResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static HDFS.BlockReportResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static HDFS.BlockReportResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static HDFS.BlockReportResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static HDFS.BlockReportResponse parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(HDFS.BlockReportResponse prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code BlockReportResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:BlockReportResponse)
        HDFS.BlockReportResponseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return HDFS.internal_static_BlockReportResponse_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return HDFS.internal_static_BlockReportResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                HDFS.BlockReportResponse.class, HDFS.BlockReportResponse.Builder.class);
      }

      // Construct using HDFS.BlockReportResponse.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        status_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return HDFS.internal_static_BlockReportResponse_descriptor;
      }

      public HDFS.BlockReportResponse getDefaultInstanceForType() {
        return HDFS.BlockReportResponse.getDefaultInstance();
      }

      public HDFS.BlockReportResponse build() {
        HDFS.BlockReportResponse result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public HDFS.BlockReportResponse buildPartial() {
        HDFS.BlockReportResponse result = new HDFS.BlockReportResponse(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          status_ = java.util.Collections.unmodifiableList(status_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.status_ = status_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof HDFS.BlockReportResponse) {
          return mergeFrom((HDFS.BlockReportResponse)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(HDFS.BlockReportResponse other) {
        if (other == HDFS.BlockReportResponse.getDefaultInstance()) return this;
        if (!other.status_.isEmpty()) {
          if (status_.isEmpty()) {
            status_ = other.status_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureStatusIsMutable();
            status_.addAll(other.status_);
          }
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        HDFS.BlockReportResponse parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (HDFS.BlockReportResponse) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<java.lang.Integer> status_ = java.util.Collections.emptyList();
      private void ensureStatusIsMutable() {
        if (!((bitField0_ & 0x00000001) == 0x00000001)) {
          status_ = new java.util.ArrayList<java.lang.Integer>(status_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated int32 status = 1;</code>
       */
      public java.util.List<java.lang.Integer>
          getStatusList() {
        return java.util.Collections.unmodifiableList(status_);
      }
      /**
       * <code>repeated int32 status = 1;</code>
       */
      public int getStatusCount() {
        return status_.size();
      }
      /**
       * <code>repeated int32 status = 1;</code>
       */
      public int getStatus(int index) {
        return status_.get(index);
      }
      /**
       * <code>repeated int32 status = 1;</code>
       */
      public Builder setStatus(
          int index, int value) {
        ensureStatusIsMutable();
        status_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated int32 status = 1;</code>
       */
      public Builder addStatus(int value) {
        ensureStatusIsMutable();
        status_.add(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated int32 status = 1;</code>
       */
      public Builder addAllStatus(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureStatusIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, status_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated int32 status = 1;</code>
       */
      public Builder clearStatus() {
        status_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:BlockReportResponse)
    }

    static {
      defaultInstance = new BlockReportResponse(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:BlockReportResponse)
  }

  public interface HeartBeatRequestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:HeartBeatRequest)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional int32 id = 1;</code>
     */
    boolean hasId();
    /**
     * <code>optional int32 id = 1;</code>
     */
    int getId();
  }
  /**
   * Protobuf type {@code HeartBeatRequest}
   */
  public static final class HeartBeatRequest extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:HeartBeatRequest)
      HeartBeatRequestOrBuilder {
    // Use HeartBeatRequest.newBuilder() to construct.
    private HeartBeatRequest(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private HeartBeatRequest(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final HeartBeatRequest defaultInstance;
    public static HeartBeatRequest getDefaultInstance() {
      return defaultInstance;
    }

    public HeartBeatRequest getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private HeartBeatRequest(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
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
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              id_ = input.readInt32();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return HDFS.internal_static_HeartBeatRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return HDFS.internal_static_HeartBeatRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              HDFS.HeartBeatRequest.class, HDFS.HeartBeatRequest.Builder.class);
    }

    public static com.google.protobuf.Parser<HeartBeatRequest> PARSER =
        new com.google.protobuf.AbstractParser<HeartBeatRequest>() {
      public HeartBeatRequest parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new HeartBeatRequest(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<HeartBeatRequest> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int ID_FIELD_NUMBER = 1;
    private int id_;
    /**
     * <code>optional int32 id = 1;</code>
     */
    public boolean hasId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional int32 id = 1;</code>
     */
    public int getId() {
      return id_;
    }

    private void initFields() {
      id_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt32(1, id_);
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, id_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static HDFS.HeartBeatRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static HDFS.HeartBeatRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static HDFS.HeartBeatRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static HDFS.HeartBeatRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static HDFS.HeartBeatRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static HDFS.HeartBeatRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static HDFS.HeartBeatRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static HDFS.HeartBeatRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static HDFS.HeartBeatRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static HDFS.HeartBeatRequest parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(HDFS.HeartBeatRequest prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code HeartBeatRequest}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:HeartBeatRequest)
        HDFS.HeartBeatRequestOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return HDFS.internal_static_HeartBeatRequest_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return HDFS.internal_static_HeartBeatRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                HDFS.HeartBeatRequest.class, HDFS.HeartBeatRequest.Builder.class);
      }

      // Construct using HDFS.HeartBeatRequest.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        id_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return HDFS.internal_static_HeartBeatRequest_descriptor;
      }

      public HDFS.HeartBeatRequest getDefaultInstanceForType() {
        return HDFS.HeartBeatRequest.getDefaultInstance();
      }

      public HDFS.HeartBeatRequest build() {
        HDFS.HeartBeatRequest result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public HDFS.HeartBeatRequest buildPartial() {
        HDFS.HeartBeatRequest result = new HDFS.HeartBeatRequest(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.id_ = id_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof HDFS.HeartBeatRequest) {
          return mergeFrom((HDFS.HeartBeatRequest)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(HDFS.HeartBeatRequest other) {
        if (other == HDFS.HeartBeatRequest.getDefaultInstance()) return this;
        if (other.hasId()) {
          setId(other.getId());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        HDFS.HeartBeatRequest parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (HDFS.HeartBeatRequest) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int id_ ;
      /**
       * <code>optional int32 id = 1;</code>
       */
      public boolean hasId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional int32 id = 1;</code>
       */
      public int getId() {
        return id_;
      }
      /**
       * <code>optional int32 id = 1;</code>
       */
      public Builder setId(int value) {
        bitField0_ |= 0x00000001;
        id_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 id = 1;</code>
       */
      public Builder clearId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        id_ = 0;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:HeartBeatRequest)
    }

    static {
      defaultInstance = new HeartBeatRequest(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:HeartBeatRequest)
  }

  public interface HeartBeatResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:HeartBeatResponse)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional int32 status = 1;</code>
     */
    boolean hasStatus();
    /**
     * <code>optional int32 status = 1;</code>
     */
    int getStatus();
  }
  /**
   * Protobuf type {@code HeartBeatResponse}
   */
  public static final class HeartBeatResponse extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:HeartBeatResponse)
      HeartBeatResponseOrBuilder {
    // Use HeartBeatResponse.newBuilder() to construct.
    private HeartBeatResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private HeartBeatResponse(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final HeartBeatResponse defaultInstance;
    public static HeartBeatResponse getDefaultInstance() {
      return defaultInstance;
    }

    public HeartBeatResponse getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private HeartBeatResponse(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
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
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              status_ = input.readInt32();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return HDFS.internal_static_HeartBeatResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return HDFS.internal_static_HeartBeatResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              HDFS.HeartBeatResponse.class, HDFS.HeartBeatResponse.Builder.class);
    }

    public static com.google.protobuf.Parser<HeartBeatResponse> PARSER =
        new com.google.protobuf.AbstractParser<HeartBeatResponse>() {
      public HeartBeatResponse parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new HeartBeatResponse(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<HeartBeatResponse> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int STATUS_FIELD_NUMBER = 1;
    private int status_;
    /**
     * <code>optional int32 status = 1;</code>
     */
    public boolean hasStatus() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional int32 status = 1;</code>
     */
    public int getStatus() {
      return status_;
    }

    private void initFields() {
      status_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt32(1, status_);
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, status_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static HDFS.HeartBeatResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static HDFS.HeartBeatResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static HDFS.HeartBeatResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static HDFS.HeartBeatResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static HDFS.HeartBeatResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static HDFS.HeartBeatResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static HDFS.HeartBeatResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static HDFS.HeartBeatResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static HDFS.HeartBeatResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static HDFS.HeartBeatResponse parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(HDFS.HeartBeatResponse prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code HeartBeatResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:HeartBeatResponse)
        HDFS.HeartBeatResponseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return HDFS.internal_static_HeartBeatResponse_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return HDFS.internal_static_HeartBeatResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                HDFS.HeartBeatResponse.class, HDFS.HeartBeatResponse.Builder.class);
      }

      // Construct using HDFS.HeartBeatResponse.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        status_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return HDFS.internal_static_HeartBeatResponse_descriptor;
      }

      public HDFS.HeartBeatResponse getDefaultInstanceForType() {
        return HDFS.HeartBeatResponse.getDefaultInstance();
      }

      public HDFS.HeartBeatResponse build() {
        HDFS.HeartBeatResponse result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public HDFS.HeartBeatResponse buildPartial() {
        HDFS.HeartBeatResponse result = new HDFS.HeartBeatResponse(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.status_ = status_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof HDFS.HeartBeatResponse) {
          return mergeFrom((HDFS.HeartBeatResponse)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(HDFS.HeartBeatResponse other) {
        if (other == HDFS.HeartBeatResponse.getDefaultInstance()) return this;
        if (other.hasStatus()) {
          setStatus(other.getStatus());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        HDFS.HeartBeatResponse parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (HDFS.HeartBeatResponse) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int status_ ;
      /**
       * <code>optional int32 status = 1;</code>
       */
      public boolean hasStatus() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional int32 status = 1;</code>
       */
      public int getStatus() {
        return status_;
      }
      /**
       * <code>optional int32 status = 1;</code>
       */
      public Builder setStatus(int value) {
        bitField0_ |= 0x00000001;
        status_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 status = 1;</code>
       */
      public Builder clearStatus() {
        bitField0_ = (bitField0_ & ~0x00000001);
        status_ = 0;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:HeartBeatResponse)
    }

    static {
      defaultInstance = new HeartBeatResponse(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:HeartBeatResponse)
  }

  public interface WriteBlockRequestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:WriteBlockRequest)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional .BlockLocations blockInfo = 1;</code>
     */
    boolean hasBlockInfo();
    /**
     * <code>optional .BlockLocations blockInfo = 1;</code>
     */
    HDFS.BlockLocations getBlockInfo();
    /**
     * <code>optional .BlockLocations blockInfo = 1;</code>
     */
    HDFS.BlockLocationsOrBuilder getBlockInfoOrBuilder();

    /**
     * <code>repeated bytes data = 2;</code>
     */
    java.util.List<com.google.protobuf.ByteString> getDataList();
    /**
     * <code>repeated bytes data = 2;</code>
     */
    int getDataCount();
    /**
     * <code>repeated bytes data = 2;</code>
     */
    com.google.protobuf.ByteString getData(int index);
  }
  /**
   * Protobuf type {@code WriteBlockRequest}
   */
  public static final class WriteBlockRequest extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:WriteBlockRequest)
      WriteBlockRequestOrBuilder {
    // Use WriteBlockRequest.newBuilder() to construct.
    private WriteBlockRequest(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private WriteBlockRequest(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final WriteBlockRequest defaultInstance;
    public static WriteBlockRequest getDefaultInstance() {
      return defaultInstance;
    }

    public WriteBlockRequest getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private WriteBlockRequest(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
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
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              HDFS.BlockLocations.Builder subBuilder = null;
              if (((bitField0_ & 0x00000001) == 0x00000001)) {
                subBuilder = blockInfo_.toBuilder();
              }
              blockInfo_ = input.readMessage(HDFS.BlockLocations.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(blockInfo_);
                blockInfo_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000001;
              break;
            }
            case 18: {
              if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                data_ = new java.util.ArrayList<com.google.protobuf.ByteString>();
                mutable_bitField0_ |= 0x00000002;
              }
              data_.add(input.readBytes());
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
          data_ = java.util.Collections.unmodifiableList(data_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return HDFS.internal_static_WriteBlockRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return HDFS.internal_static_WriteBlockRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              HDFS.WriteBlockRequest.class, HDFS.WriteBlockRequest.Builder.class);
    }

    public static com.google.protobuf.Parser<WriteBlockRequest> PARSER =
        new com.google.protobuf.AbstractParser<WriteBlockRequest>() {
      public WriteBlockRequest parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new WriteBlockRequest(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<WriteBlockRequest> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int BLOCKINFO_FIELD_NUMBER = 1;
    private HDFS.BlockLocations blockInfo_;
    /**
     * <code>optional .BlockLocations blockInfo = 1;</code>
     */
    public boolean hasBlockInfo() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional .BlockLocations blockInfo = 1;</code>
     */
    public HDFS.BlockLocations getBlockInfo() {
      return blockInfo_;
    }
    /**
     * <code>optional .BlockLocations blockInfo = 1;</code>
     */
    public HDFS.BlockLocationsOrBuilder getBlockInfoOrBuilder() {
      return blockInfo_;
    }

    public static final int DATA_FIELD_NUMBER = 2;
    private java.util.List<com.google.protobuf.ByteString> data_;
    /**
     * <code>repeated bytes data = 2;</code>
     */
    public java.util.List<com.google.protobuf.ByteString>
        getDataList() {
      return data_;
    }
    /**
     * <code>repeated bytes data = 2;</code>
     */
    public int getDataCount() {
      return data_.size();
    }
    /**
     * <code>repeated bytes data = 2;</code>
     */
    public com.google.protobuf.ByteString getData(int index) {
      return data_.get(index);
    }

    private void initFields() {
      blockInfo_ = HDFS.BlockLocations.getDefaultInstance();
      data_ = java.util.Collections.emptyList();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeMessage(1, blockInfo_);
      }
      for (int i = 0; i < data_.size(); i++) {
        output.writeBytes(2, data_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, blockInfo_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < data_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeBytesSizeNoTag(data_.get(i));
        }
        size += dataSize;
        size += 1 * getDataList().size();
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static HDFS.WriteBlockRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static HDFS.WriteBlockRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static HDFS.WriteBlockRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static HDFS.WriteBlockRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static HDFS.WriteBlockRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static HDFS.WriteBlockRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static HDFS.WriteBlockRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static HDFS.WriteBlockRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static HDFS.WriteBlockRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static HDFS.WriteBlockRequest parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(HDFS.WriteBlockRequest prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code WriteBlockRequest}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:WriteBlockRequest)
        HDFS.WriteBlockRequestOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return HDFS.internal_static_WriteBlockRequest_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return HDFS.internal_static_WriteBlockRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                HDFS.WriteBlockRequest.class, HDFS.WriteBlockRequest.Builder.class);
      }

      // Construct using HDFS.WriteBlockRequest.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getBlockInfoFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        if (blockInfoBuilder_ == null) {
          blockInfo_ = HDFS.BlockLocations.getDefaultInstance();
        } else {
          blockInfoBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        data_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return HDFS.internal_static_WriteBlockRequest_descriptor;
      }

      public HDFS.WriteBlockRequest getDefaultInstanceForType() {
        return HDFS.WriteBlockRequest.getDefaultInstance();
      }

      public HDFS.WriteBlockRequest build() {
        HDFS.WriteBlockRequest result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public HDFS.WriteBlockRequest buildPartial() {
        HDFS.WriteBlockRequest result = new HDFS.WriteBlockRequest(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        if (blockInfoBuilder_ == null) {
          result.blockInfo_ = blockInfo_;
        } else {
          result.blockInfo_ = blockInfoBuilder_.build();
        }
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          data_ = java.util.Collections.unmodifiableList(data_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.data_ = data_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof HDFS.WriteBlockRequest) {
          return mergeFrom((HDFS.WriteBlockRequest)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(HDFS.WriteBlockRequest other) {
        if (other == HDFS.WriteBlockRequest.getDefaultInstance()) return this;
        if (other.hasBlockInfo()) {
          mergeBlockInfo(other.getBlockInfo());
        }
        if (!other.data_.isEmpty()) {
          if (data_.isEmpty()) {
            data_ = other.data_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureDataIsMutable();
            data_.addAll(other.data_);
          }
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        HDFS.WriteBlockRequest parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (HDFS.WriteBlockRequest) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private HDFS.BlockLocations blockInfo_ = HDFS.BlockLocations.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          HDFS.BlockLocations, HDFS.BlockLocations.Builder, HDFS.BlockLocationsOrBuilder> blockInfoBuilder_;
      /**
       * <code>optional .BlockLocations blockInfo = 1;</code>
       */
      public boolean hasBlockInfo() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional .BlockLocations blockInfo = 1;</code>
       */
      public HDFS.BlockLocations getBlockInfo() {
        if (blockInfoBuilder_ == null) {
          return blockInfo_;
        } else {
          return blockInfoBuilder_.getMessage();
        }
      }
      /**
       * <code>optional .BlockLocations blockInfo = 1;</code>
       */
      public Builder setBlockInfo(HDFS.BlockLocations value) {
        if (blockInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          blockInfo_ = value;
          onChanged();
        } else {
          blockInfoBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>optional .BlockLocations blockInfo = 1;</code>
       */
      public Builder setBlockInfo(
          HDFS.BlockLocations.Builder builderForValue) {
        if (blockInfoBuilder_ == null) {
          blockInfo_ = builderForValue.build();
          onChanged();
        } else {
          blockInfoBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>optional .BlockLocations blockInfo = 1;</code>
       */
      public Builder mergeBlockInfo(HDFS.BlockLocations value) {
        if (blockInfoBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001) &&
              blockInfo_ != HDFS.BlockLocations.getDefaultInstance()) {
            blockInfo_ =
              HDFS.BlockLocations.newBuilder(blockInfo_).mergeFrom(value).buildPartial();
          } else {
            blockInfo_ = value;
          }
          onChanged();
        } else {
          blockInfoBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>optional .BlockLocations blockInfo = 1;</code>
       */
      public Builder clearBlockInfo() {
        if (blockInfoBuilder_ == null) {
          blockInfo_ = HDFS.BlockLocations.getDefaultInstance();
          onChanged();
        } else {
          blockInfoBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       * <code>optional .BlockLocations blockInfo = 1;</code>
       */
      public HDFS.BlockLocations.Builder getBlockInfoBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getBlockInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>optional .BlockLocations blockInfo = 1;</code>
       */
      public HDFS.BlockLocationsOrBuilder getBlockInfoOrBuilder() {
        if (blockInfoBuilder_ != null) {
          return blockInfoBuilder_.getMessageOrBuilder();
        } else {
          return blockInfo_;
        }
      }
      /**
       * <code>optional .BlockLocations blockInfo = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilder<
          HDFS.BlockLocations, HDFS.BlockLocations.Builder, HDFS.BlockLocationsOrBuilder> 
          getBlockInfoFieldBuilder() {
        if (blockInfoBuilder_ == null) {
          blockInfoBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              HDFS.BlockLocations, HDFS.BlockLocations.Builder, HDFS.BlockLocationsOrBuilder>(
                  getBlockInfo(),
                  getParentForChildren(),
                  isClean());
          blockInfo_ = null;
        }
        return blockInfoBuilder_;
      }

      private java.util.List<com.google.protobuf.ByteString> data_ = java.util.Collections.emptyList();
      private void ensureDataIsMutable() {
        if (!((bitField0_ & 0x00000002) == 0x00000002)) {
          data_ = new java.util.ArrayList<com.google.protobuf.ByteString>(data_);
          bitField0_ |= 0x00000002;
         }
      }
      /**
       * <code>repeated bytes data = 2;</code>
       */
      public java.util.List<com.google.protobuf.ByteString>
          getDataList() {
        return java.util.Collections.unmodifiableList(data_);
      }
      /**
       * <code>repeated bytes data = 2;</code>
       */
      public int getDataCount() {
        return data_.size();
      }
      /**
       * <code>repeated bytes data = 2;</code>
       */
      public com.google.protobuf.ByteString getData(int index) {
        return data_.get(index);
      }
      /**
       * <code>repeated bytes data = 2;</code>
       */
      public Builder setData(
          int index, com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureDataIsMutable();
        data_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated bytes data = 2;</code>
       */
      public Builder addData(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureDataIsMutable();
        data_.add(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated bytes data = 2;</code>
       */
      public Builder addAllData(
          java.lang.Iterable<? extends com.google.protobuf.ByteString> values) {
        ensureDataIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, data_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated bytes data = 2;</code>
       */
      public Builder clearData() {
        data_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:WriteBlockRequest)
    }

    static {
      defaultInstance = new WriteBlockRequest(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:WriteBlockRequest)
  }

  public interface WriteBlockResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:WriteBlockResponse)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional int32 status = 1;</code>
     */
    boolean hasStatus();
    /**
     * <code>optional int32 status = 1;</code>
     */
    int getStatus();
  }
  /**
   * Protobuf type {@code WriteBlockResponse}
   */
  public static final class WriteBlockResponse extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:WriteBlockResponse)
      WriteBlockResponseOrBuilder {
    // Use WriteBlockResponse.newBuilder() to construct.
    private WriteBlockResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private WriteBlockResponse(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final WriteBlockResponse defaultInstance;
    public static WriteBlockResponse getDefaultInstance() {
      return defaultInstance;
    }

    public WriteBlockResponse getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private WriteBlockResponse(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
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
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              status_ = input.readInt32();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return HDFS.internal_static_WriteBlockResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return HDFS.internal_static_WriteBlockResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              HDFS.WriteBlockResponse.class, HDFS.WriteBlockResponse.Builder.class);
    }

    public static com.google.protobuf.Parser<WriteBlockResponse> PARSER =
        new com.google.protobuf.AbstractParser<WriteBlockResponse>() {
      public WriteBlockResponse parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new WriteBlockResponse(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<WriteBlockResponse> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int STATUS_FIELD_NUMBER = 1;
    private int status_;
    /**
     * <code>optional int32 status = 1;</code>
     */
    public boolean hasStatus() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional int32 status = 1;</code>
     */
    public int getStatus() {
      return status_;
    }

    private void initFields() {
      status_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt32(1, status_);
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, status_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static HDFS.WriteBlockResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static HDFS.WriteBlockResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static HDFS.WriteBlockResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static HDFS.WriteBlockResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static HDFS.WriteBlockResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static HDFS.WriteBlockResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static HDFS.WriteBlockResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static HDFS.WriteBlockResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static HDFS.WriteBlockResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static HDFS.WriteBlockResponse parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(HDFS.WriteBlockResponse prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code WriteBlockResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:WriteBlockResponse)
        HDFS.WriteBlockResponseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return HDFS.internal_static_WriteBlockResponse_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return HDFS.internal_static_WriteBlockResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                HDFS.WriteBlockResponse.class, HDFS.WriteBlockResponse.Builder.class);
      }

      // Construct using HDFS.WriteBlockResponse.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        status_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return HDFS.internal_static_WriteBlockResponse_descriptor;
      }

      public HDFS.WriteBlockResponse getDefaultInstanceForType() {
        return HDFS.WriteBlockResponse.getDefaultInstance();
      }

      public HDFS.WriteBlockResponse build() {
        HDFS.WriteBlockResponse result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public HDFS.WriteBlockResponse buildPartial() {
        HDFS.WriteBlockResponse result = new HDFS.WriteBlockResponse(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.status_ = status_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof HDFS.WriteBlockResponse) {
          return mergeFrom((HDFS.WriteBlockResponse)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(HDFS.WriteBlockResponse other) {
        if (other == HDFS.WriteBlockResponse.getDefaultInstance()) return this;
        if (other.hasStatus()) {
          setStatus(other.getStatus());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        HDFS.WriteBlockResponse parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (HDFS.WriteBlockResponse) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int status_ ;
      /**
       * <code>optional int32 status = 1;</code>
       */
      public boolean hasStatus() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional int32 status = 1;</code>
       */
      public int getStatus() {
        return status_;
      }
      /**
       * <code>optional int32 status = 1;</code>
       */
      public Builder setStatus(int value) {
        bitField0_ |= 0x00000001;
        status_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 status = 1;</code>
       */
      public Builder clearStatus() {
        bitField0_ = (bitField0_ & ~0x00000001);
        status_ = 0;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:WriteBlockResponse)
    }

    static {
      defaultInstance = new WriteBlockResponse(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:WriteBlockResponse)
  }

  public interface CloseFileRequestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CloseFileRequest)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional int32 handle = 1;</code>
     *
     * <pre>
     * obtained from OpenFile
     * </pre>
     */
    boolean hasHandle();
    /**
     * <code>optional int32 handle = 1;</code>
     *
     * <pre>
     * obtained from OpenFile
     * </pre>
     */
    int getHandle();
  }
  /**
   * Protobuf type {@code CloseFileRequest}
   */
  public static final class CloseFileRequest extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:CloseFileRequest)
      CloseFileRequestOrBuilder {
    // Use CloseFileRequest.newBuilder() to construct.
    private CloseFileRequest(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private CloseFileRequest(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final CloseFileRequest defaultInstance;
    public static CloseFileRequest getDefaultInstance() {
      return defaultInstance;
    }

    public CloseFileRequest getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private CloseFileRequest(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
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
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              handle_ = input.readInt32();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return HDFS.internal_static_CloseFileRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return HDFS.internal_static_CloseFileRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              HDFS.CloseFileRequest.class, HDFS.CloseFileRequest.Builder.class);
    }

    public static com.google.protobuf.Parser<CloseFileRequest> PARSER =
        new com.google.protobuf.AbstractParser<CloseFileRequest>() {
      public CloseFileRequest parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new CloseFileRequest(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<CloseFileRequest> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int HANDLE_FIELD_NUMBER = 1;
    private int handle_;
    /**
     * <code>optional int32 handle = 1;</code>
     *
     * <pre>
     * obtained from OpenFile
     * </pre>
     */
    public boolean hasHandle() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional int32 handle = 1;</code>
     *
     * <pre>
     * obtained from OpenFile
     * </pre>
     */
    public int getHandle() {
      return handle_;
    }

    private void initFields() {
      handle_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt32(1, handle_);
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, handle_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static HDFS.CloseFileRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static HDFS.CloseFileRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static HDFS.CloseFileRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static HDFS.CloseFileRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static HDFS.CloseFileRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static HDFS.CloseFileRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static HDFS.CloseFileRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static HDFS.CloseFileRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static HDFS.CloseFileRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static HDFS.CloseFileRequest parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(HDFS.CloseFileRequest prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code CloseFileRequest}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CloseFileRequest)
        HDFS.CloseFileRequestOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return HDFS.internal_static_CloseFileRequest_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return HDFS.internal_static_CloseFileRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                HDFS.CloseFileRequest.class, HDFS.CloseFileRequest.Builder.class);
      }

      // Construct using HDFS.CloseFileRequest.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        handle_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return HDFS.internal_static_CloseFileRequest_descriptor;
      }

      public HDFS.CloseFileRequest getDefaultInstanceForType() {
        return HDFS.CloseFileRequest.getDefaultInstance();
      }

      public HDFS.CloseFileRequest build() {
        HDFS.CloseFileRequest result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public HDFS.CloseFileRequest buildPartial() {
        HDFS.CloseFileRequest result = new HDFS.CloseFileRequest(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.handle_ = handle_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof HDFS.CloseFileRequest) {
          return mergeFrom((HDFS.CloseFileRequest)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(HDFS.CloseFileRequest other) {
        if (other == HDFS.CloseFileRequest.getDefaultInstance()) return this;
        if (other.hasHandle()) {
          setHandle(other.getHandle());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        HDFS.CloseFileRequest parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (HDFS.CloseFileRequest) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int handle_ ;
      /**
       * <code>optional int32 handle = 1;</code>
       *
       * <pre>
       * obtained from OpenFile
       * </pre>
       */
      public boolean hasHandle() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional int32 handle = 1;</code>
       *
       * <pre>
       * obtained from OpenFile
       * </pre>
       */
      public int getHandle() {
        return handle_;
      }
      /**
       * <code>optional int32 handle = 1;</code>
       *
       * <pre>
       * obtained from OpenFile
       * </pre>
       */
      public Builder setHandle(int value) {
        bitField0_ |= 0x00000001;
        handle_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 handle = 1;</code>
       *
       * <pre>
       * obtained from OpenFile
       * </pre>
       */
      public Builder clearHandle() {
        bitField0_ = (bitField0_ & ~0x00000001);
        handle_ = 0;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:CloseFileRequest)
    }

    static {
      defaultInstance = new CloseFileRequest(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:CloseFileRequest)
  }

  public interface CloseFileResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CloseFileResponse)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional int32 status = 1;</code>
     */
    boolean hasStatus();
    /**
     * <code>optional int32 status = 1;</code>
     */
    int getStatus();
  }
  /**
   * Protobuf type {@code CloseFileResponse}
   */
  public static final class CloseFileResponse extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:CloseFileResponse)
      CloseFileResponseOrBuilder {
    // Use CloseFileResponse.newBuilder() to construct.
    private CloseFileResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private CloseFileResponse(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final CloseFileResponse defaultInstance;
    public static CloseFileResponse getDefaultInstance() {
      return defaultInstance;
    }

    public CloseFileResponse getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private CloseFileResponse(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
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
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              status_ = input.readInt32();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return HDFS.internal_static_CloseFileResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return HDFS.internal_static_CloseFileResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              HDFS.CloseFileResponse.class, HDFS.CloseFileResponse.Builder.class);
    }

    public static com.google.protobuf.Parser<CloseFileResponse> PARSER =
        new com.google.protobuf.AbstractParser<CloseFileResponse>() {
      public CloseFileResponse parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new CloseFileResponse(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<CloseFileResponse> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int STATUS_FIELD_NUMBER = 1;
    private int status_;
    /**
     * <code>optional int32 status = 1;</code>
     */
    public boolean hasStatus() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional int32 status = 1;</code>
     */
    public int getStatus() {
      return status_;
    }

    private void initFields() {
      status_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt32(1, status_);
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, status_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static HDFS.CloseFileResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static HDFS.CloseFileResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static HDFS.CloseFileResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static HDFS.CloseFileResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static HDFS.CloseFileResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static HDFS.CloseFileResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static HDFS.CloseFileResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static HDFS.CloseFileResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static HDFS.CloseFileResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static HDFS.CloseFileResponse parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(HDFS.CloseFileResponse prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code CloseFileResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CloseFileResponse)
        HDFS.CloseFileResponseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return HDFS.internal_static_CloseFileResponse_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return HDFS.internal_static_CloseFileResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                HDFS.CloseFileResponse.class, HDFS.CloseFileResponse.Builder.class);
      }

      // Construct using HDFS.CloseFileResponse.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        status_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return HDFS.internal_static_CloseFileResponse_descriptor;
      }

      public HDFS.CloseFileResponse getDefaultInstanceForType() {
        return HDFS.CloseFileResponse.getDefaultInstance();
      }

      public HDFS.CloseFileResponse build() {
        HDFS.CloseFileResponse result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public HDFS.CloseFileResponse buildPartial() {
        HDFS.CloseFileResponse result = new HDFS.CloseFileResponse(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.status_ = status_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof HDFS.CloseFileResponse) {
          return mergeFrom((HDFS.CloseFileResponse)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(HDFS.CloseFileResponse other) {
        if (other == HDFS.CloseFileResponse.getDefaultInstance()) return this;
        if (other.hasStatus()) {
          setStatus(other.getStatus());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        HDFS.CloseFileResponse parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (HDFS.CloseFileResponse) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int status_ ;
      /**
       * <code>optional int32 status = 1;</code>
       */
      public boolean hasStatus() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional int32 status = 1;</code>
       */
      public int getStatus() {
        return status_;
      }
      /**
       * <code>optional int32 status = 1;</code>
       */
      public Builder setStatus(int value) {
        bitField0_ |= 0x00000001;
        status_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 status = 1;</code>
       */
      public Builder clearStatus() {
        bitField0_ = (bitField0_ & ~0x00000001);
        status_ = 0;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:CloseFileResponse)
    }

    static {
      defaultInstance = new CloseFileResponse(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:CloseFileResponse)
  }

  public interface DataNodeLocationOrBuilder extends
      // @@protoc_insertion_point(interface_extends:DataNodeLocation)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional int32 ip = 1;</code>
     */
    boolean hasIp();
    /**
     * <code>optional int32 ip = 1;</code>
     */
    int getIp();

    /**
     * <code>optional int32 port = 2;</code>
     */
    boolean hasPort();
    /**
     * <code>optional int32 port = 2;</code>
     */
    int getPort();
  }
  /**
   * Protobuf type {@code DataNodeLocation}
   */
  public static final class DataNodeLocation extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:DataNodeLocation)
      DataNodeLocationOrBuilder {
    // Use DataNodeLocation.newBuilder() to construct.
    private DataNodeLocation(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private DataNodeLocation(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final DataNodeLocation defaultInstance;
    public static DataNodeLocation getDefaultInstance() {
      return defaultInstance;
    }

    public DataNodeLocation getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private DataNodeLocation(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
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
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              ip_ = input.readInt32();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              port_ = input.readInt32();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return HDFS.internal_static_DataNodeLocation_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return HDFS.internal_static_DataNodeLocation_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              HDFS.DataNodeLocation.class, HDFS.DataNodeLocation.Builder.class);
    }

    public static com.google.protobuf.Parser<DataNodeLocation> PARSER =
        new com.google.protobuf.AbstractParser<DataNodeLocation>() {
      public DataNodeLocation parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new DataNodeLocation(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<DataNodeLocation> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int IP_FIELD_NUMBER = 1;
    private int ip_;
    /**
     * <code>optional int32 ip = 1;</code>
     */
    public boolean hasIp() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional int32 ip = 1;</code>
     */
    public int getIp() {
      return ip_;
    }

    public static final int PORT_FIELD_NUMBER = 2;
    private int port_;
    /**
     * <code>optional int32 port = 2;</code>
     */
    public boolean hasPort() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional int32 port = 2;</code>
     */
    public int getPort() {
      return port_;
    }

    private void initFields() {
      ip_ = 0;
      port_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt32(1, ip_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, port_);
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, ip_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, port_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static HDFS.DataNodeLocation parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static HDFS.DataNodeLocation parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static HDFS.DataNodeLocation parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static HDFS.DataNodeLocation parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static HDFS.DataNodeLocation parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static HDFS.DataNodeLocation parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static HDFS.DataNodeLocation parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static HDFS.DataNodeLocation parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static HDFS.DataNodeLocation parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static HDFS.DataNodeLocation parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(HDFS.DataNodeLocation prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code DataNodeLocation}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:DataNodeLocation)
        HDFS.DataNodeLocationOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return HDFS.internal_static_DataNodeLocation_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return HDFS.internal_static_DataNodeLocation_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                HDFS.DataNodeLocation.class, HDFS.DataNodeLocation.Builder.class);
      }

      // Construct using HDFS.DataNodeLocation.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        ip_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        port_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return HDFS.internal_static_DataNodeLocation_descriptor;
      }

      public HDFS.DataNodeLocation getDefaultInstanceForType() {
        return HDFS.DataNodeLocation.getDefaultInstance();
      }

      public HDFS.DataNodeLocation build() {
        HDFS.DataNodeLocation result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public HDFS.DataNodeLocation buildPartial() {
        HDFS.DataNodeLocation result = new HDFS.DataNodeLocation(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.ip_ = ip_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.port_ = port_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof HDFS.DataNodeLocation) {
          return mergeFrom((HDFS.DataNodeLocation)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(HDFS.DataNodeLocation other) {
        if (other == HDFS.DataNodeLocation.getDefaultInstance()) return this;
        if (other.hasIp()) {
          setIp(other.getIp());
        }
        if (other.hasPort()) {
          setPort(other.getPort());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        HDFS.DataNodeLocation parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (HDFS.DataNodeLocation) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int ip_ ;
      /**
       * <code>optional int32 ip = 1;</code>
       */
      public boolean hasIp() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional int32 ip = 1;</code>
       */
      public int getIp() {
        return ip_;
      }
      /**
       * <code>optional int32 ip = 1;</code>
       */
      public Builder setIp(int value) {
        bitField0_ |= 0x00000001;
        ip_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 ip = 1;</code>
       */
      public Builder clearIp() {
        bitField0_ = (bitField0_ & ~0x00000001);
        ip_ = 0;
        onChanged();
        return this;
      }

      private int port_ ;
      /**
       * <code>optional int32 port = 2;</code>
       */
      public boolean hasPort() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional int32 port = 2;</code>
       */
      public int getPort() {
        return port_;
      }
      /**
       * <code>optional int32 port = 2;</code>
       */
      public Builder setPort(int value) {
        bitField0_ |= 0x00000002;
        port_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 port = 2;</code>
       */
      public Builder clearPort() {
        bitField0_ = (bitField0_ & ~0x00000002);
        port_ = 0;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:DataNodeLocation)
    }

    static {
      defaultInstance = new DataNodeLocation(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:DataNodeLocation)
  }

  public interface BlockLocationsOrBuilder extends
      // @@protoc_insertion_point(interface_extends:BlockLocations)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional int32 blockNumber = 1;</code>
     */
    boolean hasBlockNumber();
    /**
     * <code>optional int32 blockNumber = 1;</code>
     */
    int getBlockNumber();

    /**
     * <code>repeated .DataNodeLocation locations = 2;</code>
     */
    java.util.List<HDFS.DataNodeLocation> 
        getLocationsList();
    /**
     * <code>repeated .DataNodeLocation locations = 2;</code>
     */
    HDFS.DataNodeLocation getLocations(int index);
    /**
     * <code>repeated .DataNodeLocation locations = 2;</code>
     */
    int getLocationsCount();
    /**
     * <code>repeated .DataNodeLocation locations = 2;</code>
     */
    java.util.List<? extends HDFS.DataNodeLocationOrBuilder> 
        getLocationsOrBuilderList();
    /**
     * <code>repeated .DataNodeLocation locations = 2;</code>
     */
    HDFS.DataNodeLocationOrBuilder getLocationsOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code BlockLocations}
   */
  public static final class BlockLocations extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:BlockLocations)
      BlockLocationsOrBuilder {
    // Use BlockLocations.newBuilder() to construct.
    private BlockLocations(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private BlockLocations(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final BlockLocations defaultInstance;
    public static BlockLocations getDefaultInstance() {
      return defaultInstance;
    }

    public BlockLocations getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private BlockLocations(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
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
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              blockNumber_ = input.readInt32();
              break;
            }
            case 18: {
              if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                locations_ = new java.util.ArrayList<HDFS.DataNodeLocation>();
                mutable_bitField0_ |= 0x00000002;
              }
              locations_.add(input.readMessage(HDFS.DataNodeLocation.PARSER, extensionRegistry));
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
          locations_ = java.util.Collections.unmodifiableList(locations_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return HDFS.internal_static_BlockLocations_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return HDFS.internal_static_BlockLocations_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              HDFS.BlockLocations.class, HDFS.BlockLocations.Builder.class);
    }

    public static com.google.protobuf.Parser<BlockLocations> PARSER =
        new com.google.protobuf.AbstractParser<BlockLocations>() {
      public BlockLocations parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new BlockLocations(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<BlockLocations> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int BLOCKNUMBER_FIELD_NUMBER = 1;
    private int blockNumber_;
    /**
     * <code>optional int32 blockNumber = 1;</code>
     */
    public boolean hasBlockNumber() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional int32 blockNumber = 1;</code>
     */
    public int getBlockNumber() {
      return blockNumber_;
    }

    public static final int LOCATIONS_FIELD_NUMBER = 2;
    private java.util.List<HDFS.DataNodeLocation> locations_;
    /**
     * <code>repeated .DataNodeLocation locations = 2;</code>
     */
    public java.util.List<HDFS.DataNodeLocation> getLocationsList() {
      return locations_;
    }
    /**
     * <code>repeated .DataNodeLocation locations = 2;</code>
     */
    public java.util.List<? extends HDFS.DataNodeLocationOrBuilder> 
        getLocationsOrBuilderList() {
      return locations_;
    }
    /**
     * <code>repeated .DataNodeLocation locations = 2;</code>
     */
    public int getLocationsCount() {
      return locations_.size();
    }
    /**
     * <code>repeated .DataNodeLocation locations = 2;</code>
     */
    public HDFS.DataNodeLocation getLocations(int index) {
      return locations_.get(index);
    }
    /**
     * <code>repeated .DataNodeLocation locations = 2;</code>
     */
    public HDFS.DataNodeLocationOrBuilder getLocationsOrBuilder(
        int index) {
      return locations_.get(index);
    }

    private void initFields() {
      blockNumber_ = 0;
      locations_ = java.util.Collections.emptyList();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt32(1, blockNumber_);
      }
      for (int i = 0; i < locations_.size(); i++) {
        output.writeMessage(2, locations_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, blockNumber_);
      }
      for (int i = 0; i < locations_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, locations_.get(i));
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static HDFS.BlockLocations parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static HDFS.BlockLocations parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static HDFS.BlockLocations parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static HDFS.BlockLocations parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static HDFS.BlockLocations parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static HDFS.BlockLocations parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static HDFS.BlockLocations parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static HDFS.BlockLocations parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static HDFS.BlockLocations parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static HDFS.BlockLocations parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(HDFS.BlockLocations prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code BlockLocations}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:BlockLocations)
        HDFS.BlockLocationsOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return HDFS.internal_static_BlockLocations_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return HDFS.internal_static_BlockLocations_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                HDFS.BlockLocations.class, HDFS.BlockLocations.Builder.class);
      }

      // Construct using HDFS.BlockLocations.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getLocationsFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        blockNumber_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        if (locationsBuilder_ == null) {
          locations_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          locationsBuilder_.clear();
        }
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return HDFS.internal_static_BlockLocations_descriptor;
      }

      public HDFS.BlockLocations getDefaultInstanceForType() {
        return HDFS.BlockLocations.getDefaultInstance();
      }

      public HDFS.BlockLocations build() {
        HDFS.BlockLocations result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public HDFS.BlockLocations buildPartial() {
        HDFS.BlockLocations result = new HDFS.BlockLocations(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.blockNumber_ = blockNumber_;
        if (locationsBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)) {
            locations_ = java.util.Collections.unmodifiableList(locations_);
            bitField0_ = (bitField0_ & ~0x00000002);
          }
          result.locations_ = locations_;
        } else {
          result.locations_ = locationsBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof HDFS.BlockLocations) {
          return mergeFrom((HDFS.BlockLocations)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(HDFS.BlockLocations other) {
        if (other == HDFS.BlockLocations.getDefaultInstance()) return this;
        if (other.hasBlockNumber()) {
          setBlockNumber(other.getBlockNumber());
        }
        if (locationsBuilder_ == null) {
          if (!other.locations_.isEmpty()) {
            if (locations_.isEmpty()) {
              locations_ = other.locations_;
              bitField0_ = (bitField0_ & ~0x00000002);
            } else {
              ensureLocationsIsMutable();
              locations_.addAll(other.locations_);
            }
            onChanged();
          }
        } else {
          if (!other.locations_.isEmpty()) {
            if (locationsBuilder_.isEmpty()) {
              locationsBuilder_.dispose();
              locationsBuilder_ = null;
              locations_ = other.locations_;
              bitField0_ = (bitField0_ & ~0x00000002);
              locationsBuilder_ = 
                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                   getLocationsFieldBuilder() : null;
            } else {
              locationsBuilder_.addAllMessages(other.locations_);
            }
          }
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        HDFS.BlockLocations parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (HDFS.BlockLocations) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int blockNumber_ ;
      /**
       * <code>optional int32 blockNumber = 1;</code>
       */
      public boolean hasBlockNumber() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional int32 blockNumber = 1;</code>
       */
      public int getBlockNumber() {
        return blockNumber_;
      }
      /**
       * <code>optional int32 blockNumber = 1;</code>
       */
      public Builder setBlockNumber(int value) {
        bitField0_ |= 0x00000001;
        blockNumber_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 blockNumber = 1;</code>
       */
      public Builder clearBlockNumber() {
        bitField0_ = (bitField0_ & ~0x00000001);
        blockNumber_ = 0;
        onChanged();
        return this;
      }

      private java.util.List<HDFS.DataNodeLocation> locations_ =
        java.util.Collections.emptyList();
      private void ensureLocationsIsMutable() {
        if (!((bitField0_ & 0x00000002) == 0x00000002)) {
          locations_ = new java.util.ArrayList<HDFS.DataNodeLocation>(locations_);
          bitField0_ |= 0x00000002;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilder<
          HDFS.DataNodeLocation, HDFS.DataNodeLocation.Builder, HDFS.DataNodeLocationOrBuilder> locationsBuilder_;

      /**
       * <code>repeated .DataNodeLocation locations = 2;</code>
       */
      public java.util.List<HDFS.DataNodeLocation> getLocationsList() {
        if (locationsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(locations_);
        } else {
          return locationsBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .DataNodeLocation locations = 2;</code>
       */
      public int getLocationsCount() {
        if (locationsBuilder_ == null) {
          return locations_.size();
        } else {
          return locationsBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .DataNodeLocation locations = 2;</code>
       */
      public HDFS.DataNodeLocation getLocations(int index) {
        if (locationsBuilder_ == null) {
          return locations_.get(index);
        } else {
          return locationsBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .DataNodeLocation locations = 2;</code>
       */
      public Builder setLocations(
          int index, HDFS.DataNodeLocation value) {
        if (locationsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureLocationsIsMutable();
          locations_.set(index, value);
          onChanged();
        } else {
          locationsBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .DataNodeLocation locations = 2;</code>
       */
      public Builder setLocations(
          int index, HDFS.DataNodeLocation.Builder builderForValue) {
        if (locationsBuilder_ == null) {
          ensureLocationsIsMutable();
          locations_.set(index, builderForValue.build());
          onChanged();
        } else {
          locationsBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .DataNodeLocation locations = 2;</code>
       */
      public Builder addLocations(HDFS.DataNodeLocation value) {
        if (locationsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureLocationsIsMutable();
          locations_.add(value);
          onChanged();
        } else {
          locationsBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .DataNodeLocation locations = 2;</code>
       */
      public Builder addLocations(
          int index, HDFS.DataNodeLocation value) {
        if (locationsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureLocationsIsMutable();
          locations_.add(index, value);
          onChanged();
        } else {
          locationsBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .DataNodeLocation locations = 2;</code>
       */
      public Builder addLocations(
          HDFS.DataNodeLocation.Builder builderForValue) {
        if (locationsBuilder_ == null) {
          ensureLocationsIsMutable();
          locations_.add(builderForValue.build());
          onChanged();
        } else {
          locationsBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .DataNodeLocation locations = 2;</code>
       */
      public Builder addLocations(
          int index, HDFS.DataNodeLocation.Builder builderForValue) {
        if (locationsBuilder_ == null) {
          ensureLocationsIsMutable();
          locations_.add(index, builderForValue.build());
          onChanged();
        } else {
          locationsBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .DataNodeLocation locations = 2;</code>
       */
      public Builder addAllLocations(
          java.lang.Iterable<? extends HDFS.DataNodeLocation> values) {
        if (locationsBuilder_ == null) {
          ensureLocationsIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, locations_);
          onChanged();
        } else {
          locationsBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .DataNodeLocation locations = 2;</code>
       */
      public Builder clearLocations() {
        if (locationsBuilder_ == null) {
          locations_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
          onChanged();
        } else {
          locationsBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .DataNodeLocation locations = 2;</code>
       */
      public Builder removeLocations(int index) {
        if (locationsBuilder_ == null) {
          ensureLocationsIsMutable();
          locations_.remove(index);
          onChanged();
        } else {
          locationsBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .DataNodeLocation locations = 2;</code>
       */
      public HDFS.DataNodeLocation.Builder getLocationsBuilder(
          int index) {
        return getLocationsFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .DataNodeLocation locations = 2;</code>
       */
      public HDFS.DataNodeLocationOrBuilder getLocationsOrBuilder(
          int index) {
        if (locationsBuilder_ == null) {
          return locations_.get(index);  } else {
          return locationsBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .DataNodeLocation locations = 2;</code>
       */
      public java.util.List<? extends HDFS.DataNodeLocationOrBuilder> 
           getLocationsOrBuilderList() {
        if (locationsBuilder_ != null) {
          return locationsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(locations_);
        }
      }
      /**
       * <code>repeated .DataNodeLocation locations = 2;</code>
       */
      public HDFS.DataNodeLocation.Builder addLocationsBuilder() {
        return getLocationsFieldBuilder().addBuilder(
            HDFS.DataNodeLocation.getDefaultInstance());
      }
      /**
       * <code>repeated .DataNodeLocation locations = 2;</code>
       */
      public HDFS.DataNodeLocation.Builder addLocationsBuilder(
          int index) {
        return getLocationsFieldBuilder().addBuilder(
            index, HDFS.DataNodeLocation.getDefaultInstance());
      }
      /**
       * <code>repeated .DataNodeLocation locations = 2;</code>
       */
      public java.util.List<HDFS.DataNodeLocation.Builder> 
           getLocationsBuilderList() {
        return getLocationsFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          HDFS.DataNodeLocation, HDFS.DataNodeLocation.Builder, HDFS.DataNodeLocationOrBuilder> 
          getLocationsFieldBuilder() {
        if (locationsBuilder_ == null) {
          locationsBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              HDFS.DataNodeLocation, HDFS.DataNodeLocation.Builder, HDFS.DataNodeLocationOrBuilder>(
                  locations_,
                  ((bitField0_ & 0x00000002) == 0x00000002),
                  getParentForChildren(),
                  isClean());
          locations_ = null;
        }
        return locationsBuilder_;
      }

      // @@protoc_insertion_point(builder_scope:BlockLocations)
    }

    static {
      defaultInstance = new BlockLocations(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:BlockLocations)
  }

  public interface BlockLocationRequestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:BlockLocationRequest)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated int32 blockNums = 1;</code>
     */
    java.util.List<java.lang.Integer> getBlockNumsList();
    /**
     * <code>repeated int32 blockNums = 1;</code>
     */
    int getBlockNumsCount();
    /**
     * <code>repeated int32 blockNums = 1;</code>
     */
    int getBlockNums(int index);
  }
  /**
   * Protobuf type {@code BlockLocationRequest}
   */
  public static final class BlockLocationRequest extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:BlockLocationRequest)
      BlockLocationRequestOrBuilder {
    // Use BlockLocationRequest.newBuilder() to construct.
    private BlockLocationRequest(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private BlockLocationRequest(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final BlockLocationRequest defaultInstance;
    public static BlockLocationRequest getDefaultInstance() {
      return defaultInstance;
    }

    public BlockLocationRequest getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private BlockLocationRequest(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
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
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                blockNums_ = new java.util.ArrayList<java.lang.Integer>();
                mutable_bitField0_ |= 0x00000001;
              }
              blockNums_.add(input.readInt32());
              break;
            }
            case 10: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) == 0x00000001) && input.getBytesUntilLimit() > 0) {
                blockNums_ = new java.util.ArrayList<java.lang.Integer>();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                blockNums_.add(input.readInt32());
              }
              input.popLimit(limit);
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
          blockNums_ = java.util.Collections.unmodifiableList(blockNums_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return HDFS.internal_static_BlockLocationRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return HDFS.internal_static_BlockLocationRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              HDFS.BlockLocationRequest.class, HDFS.BlockLocationRequest.Builder.class);
    }

    public static com.google.protobuf.Parser<BlockLocationRequest> PARSER =
        new com.google.protobuf.AbstractParser<BlockLocationRequest>() {
      public BlockLocationRequest parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new BlockLocationRequest(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<BlockLocationRequest> getParserForType() {
      return PARSER;
    }

    public static final int BLOCKNUMS_FIELD_NUMBER = 1;
    private java.util.List<java.lang.Integer> blockNums_;
    /**
     * <code>repeated int32 blockNums = 1;</code>
     */
    public java.util.List<java.lang.Integer>
        getBlockNumsList() {
      return blockNums_;
    }
    /**
     * <code>repeated int32 blockNums = 1;</code>
     */
    public int getBlockNumsCount() {
      return blockNums_.size();
    }
    /**
     * <code>repeated int32 blockNums = 1;</code>
     */
    public int getBlockNums(int index) {
      return blockNums_.get(index);
    }

    private void initFields() {
      blockNums_ = java.util.Collections.emptyList();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      for (int i = 0; i < blockNums_.size(); i++) {
        output.writeInt32(1, blockNums_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      {
        int dataSize = 0;
        for (int i = 0; i < blockNums_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(blockNums_.get(i));
        }
        size += dataSize;
        size += 1 * getBlockNumsList().size();
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static HDFS.BlockLocationRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static HDFS.BlockLocationRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static HDFS.BlockLocationRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static HDFS.BlockLocationRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static HDFS.BlockLocationRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static HDFS.BlockLocationRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static HDFS.BlockLocationRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static HDFS.BlockLocationRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static HDFS.BlockLocationRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static HDFS.BlockLocationRequest parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(HDFS.BlockLocationRequest prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code BlockLocationRequest}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:BlockLocationRequest)
        HDFS.BlockLocationRequestOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return HDFS.internal_static_BlockLocationRequest_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return HDFS.internal_static_BlockLocationRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                HDFS.BlockLocationRequest.class, HDFS.BlockLocationRequest.Builder.class);
      }

      // Construct using HDFS.BlockLocationRequest.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        blockNums_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return HDFS.internal_static_BlockLocationRequest_descriptor;
      }

      public HDFS.BlockLocationRequest getDefaultInstanceForType() {
        return HDFS.BlockLocationRequest.getDefaultInstance();
      }

      public HDFS.BlockLocationRequest build() {
        HDFS.BlockLocationRequest result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public HDFS.BlockLocationRequest buildPartial() {
        HDFS.BlockLocationRequest result = new HDFS.BlockLocationRequest(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          blockNums_ = java.util.Collections.unmodifiableList(blockNums_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.blockNums_ = blockNums_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof HDFS.BlockLocationRequest) {
          return mergeFrom((HDFS.BlockLocationRequest)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(HDFS.BlockLocationRequest other) {
        if (other == HDFS.BlockLocationRequest.getDefaultInstance()) return this;
        if (!other.blockNums_.isEmpty()) {
          if (blockNums_.isEmpty()) {
            blockNums_ = other.blockNums_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureBlockNumsIsMutable();
            blockNums_.addAll(other.blockNums_);
          }
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        HDFS.BlockLocationRequest parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (HDFS.BlockLocationRequest) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<java.lang.Integer> blockNums_ = java.util.Collections.emptyList();
      private void ensureBlockNumsIsMutable() {
        if (!((bitField0_ & 0x00000001) == 0x00000001)) {
          blockNums_ = new java.util.ArrayList<java.lang.Integer>(blockNums_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated int32 blockNums = 1;</code>
       */
      public java.util.List<java.lang.Integer>
          getBlockNumsList() {
        return java.util.Collections.unmodifiableList(blockNums_);
      }
      /**
       * <code>repeated int32 blockNums = 1;</code>
       */
      public int getBlockNumsCount() {
        return blockNums_.size();
      }
      /**
       * <code>repeated int32 blockNums = 1;</code>
       */
      public int getBlockNums(int index) {
        return blockNums_.get(index);
      }
      /**
       * <code>repeated int32 blockNums = 1;</code>
       */
      public Builder setBlockNums(
          int index, int value) {
        ensureBlockNumsIsMutable();
        blockNums_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated int32 blockNums = 1;</code>
       */
      public Builder addBlockNums(int value) {
        ensureBlockNumsIsMutable();
        blockNums_.add(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated int32 blockNums = 1;</code>
       */
      public Builder addAllBlockNums(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureBlockNumsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, blockNums_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated int32 blockNums = 1;</code>
       */
      public Builder clearBlockNums() {
        blockNums_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:BlockLocationRequest)
    }

    static {
      defaultInstance = new BlockLocationRequest(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:BlockLocationRequest)
  }

  public interface BlockLocationResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:BlockLocationResponse)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional int32 status = 1;</code>
     */
    boolean hasStatus();
    /**
     * <code>optional int32 status = 1;</code>
     */
    int getStatus();

    /**
     * <code>repeated .BlockLocations blockLocations = 2;</code>
     */
    java.util.List<HDFS.BlockLocations> 
        getBlockLocationsList();
    /**
     * <code>repeated .BlockLocations blockLocations = 2;</code>
     */
    HDFS.BlockLocations getBlockLocations(int index);
    /**
     * <code>repeated .BlockLocations blockLocations = 2;</code>
     */
    int getBlockLocationsCount();
    /**
     * <code>repeated .BlockLocations blockLocations = 2;</code>
     */
    java.util.List<? extends HDFS.BlockLocationsOrBuilder> 
        getBlockLocationsOrBuilderList();
    /**
     * <code>repeated .BlockLocations blockLocations = 2;</code>
     */
    HDFS.BlockLocationsOrBuilder getBlockLocationsOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code BlockLocationResponse}
   */
  public static final class BlockLocationResponse extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:BlockLocationResponse)
      BlockLocationResponseOrBuilder {
    // Use BlockLocationResponse.newBuilder() to construct.
    private BlockLocationResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private BlockLocationResponse(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final BlockLocationResponse defaultInstance;
    public static BlockLocationResponse getDefaultInstance() {
      return defaultInstance;
    }

    public BlockLocationResponse getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private BlockLocationResponse(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
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
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              status_ = input.readInt32();
              break;
            }
            case 18: {
              if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                blockLocations_ = new java.util.ArrayList<HDFS.BlockLocations>();
                mutable_bitField0_ |= 0x00000002;
              }
              blockLocations_.add(input.readMessage(HDFS.BlockLocations.PARSER, extensionRegistry));
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
          blockLocations_ = java.util.Collections.unmodifiableList(blockLocations_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return HDFS.internal_static_BlockLocationResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return HDFS.internal_static_BlockLocationResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              HDFS.BlockLocationResponse.class, HDFS.BlockLocationResponse.Builder.class);
    }

    public static com.google.protobuf.Parser<BlockLocationResponse> PARSER =
        new com.google.protobuf.AbstractParser<BlockLocationResponse>() {
      public BlockLocationResponse parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new BlockLocationResponse(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<BlockLocationResponse> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int STATUS_FIELD_NUMBER = 1;
    private int status_;
    /**
     * <code>optional int32 status = 1;</code>
     */
    public boolean hasStatus() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional int32 status = 1;</code>
     */
    public int getStatus() {
      return status_;
    }

    public static final int BLOCKLOCATIONS_FIELD_NUMBER = 2;
    private java.util.List<HDFS.BlockLocations> blockLocations_;
    /**
     * <code>repeated .BlockLocations blockLocations = 2;</code>
     */
    public java.util.List<HDFS.BlockLocations> getBlockLocationsList() {
      return blockLocations_;
    }
    /**
     * <code>repeated .BlockLocations blockLocations = 2;</code>
     */
    public java.util.List<? extends HDFS.BlockLocationsOrBuilder> 
        getBlockLocationsOrBuilderList() {
      return blockLocations_;
    }
    /**
     * <code>repeated .BlockLocations blockLocations = 2;</code>
     */
    public int getBlockLocationsCount() {
      return blockLocations_.size();
    }
    /**
     * <code>repeated .BlockLocations blockLocations = 2;</code>
     */
    public HDFS.BlockLocations getBlockLocations(int index) {
      return blockLocations_.get(index);
    }
    /**
     * <code>repeated .BlockLocations blockLocations = 2;</code>
     */
    public HDFS.BlockLocationsOrBuilder getBlockLocationsOrBuilder(
        int index) {
      return blockLocations_.get(index);
    }

    private void initFields() {
      status_ = 0;
      blockLocations_ = java.util.Collections.emptyList();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt32(1, status_);
      }
      for (int i = 0; i < blockLocations_.size(); i++) {
        output.writeMessage(2, blockLocations_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, status_);
      }
      for (int i = 0; i < blockLocations_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, blockLocations_.get(i));
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static HDFS.BlockLocationResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static HDFS.BlockLocationResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static HDFS.BlockLocationResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static HDFS.BlockLocationResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static HDFS.BlockLocationResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static HDFS.BlockLocationResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static HDFS.BlockLocationResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static HDFS.BlockLocationResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static HDFS.BlockLocationResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static HDFS.BlockLocationResponse parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(HDFS.BlockLocationResponse prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code BlockLocationResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:BlockLocationResponse)
        HDFS.BlockLocationResponseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return HDFS.internal_static_BlockLocationResponse_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return HDFS.internal_static_BlockLocationResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                HDFS.BlockLocationResponse.class, HDFS.BlockLocationResponse.Builder.class);
      }

      // Construct using HDFS.BlockLocationResponse.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getBlockLocationsFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        status_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        if (blockLocationsBuilder_ == null) {
          blockLocations_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          blockLocationsBuilder_.clear();
        }
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return HDFS.internal_static_BlockLocationResponse_descriptor;
      }

      public HDFS.BlockLocationResponse getDefaultInstanceForType() {
        return HDFS.BlockLocationResponse.getDefaultInstance();
      }

      public HDFS.BlockLocationResponse build() {
        HDFS.BlockLocationResponse result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public HDFS.BlockLocationResponse buildPartial() {
        HDFS.BlockLocationResponse result = new HDFS.BlockLocationResponse(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.status_ = status_;
        if (blockLocationsBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)) {
            blockLocations_ = java.util.Collections.unmodifiableList(blockLocations_);
            bitField0_ = (bitField0_ & ~0x00000002);
          }
          result.blockLocations_ = blockLocations_;
        } else {
          result.blockLocations_ = blockLocationsBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof HDFS.BlockLocationResponse) {
          return mergeFrom((HDFS.BlockLocationResponse)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(HDFS.BlockLocationResponse other) {
        if (other == HDFS.BlockLocationResponse.getDefaultInstance()) return this;
        if (other.hasStatus()) {
          setStatus(other.getStatus());
        }
        if (blockLocationsBuilder_ == null) {
          if (!other.blockLocations_.isEmpty()) {
            if (blockLocations_.isEmpty()) {
              blockLocations_ = other.blockLocations_;
              bitField0_ = (bitField0_ & ~0x00000002);
            } else {
              ensureBlockLocationsIsMutable();
              blockLocations_.addAll(other.blockLocations_);
            }
            onChanged();
          }
        } else {
          if (!other.blockLocations_.isEmpty()) {
            if (blockLocationsBuilder_.isEmpty()) {
              blockLocationsBuilder_.dispose();
              blockLocationsBuilder_ = null;
              blockLocations_ = other.blockLocations_;
              bitField0_ = (bitField0_ & ~0x00000002);
              blockLocationsBuilder_ = 
                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                   getBlockLocationsFieldBuilder() : null;
            } else {
              blockLocationsBuilder_.addAllMessages(other.blockLocations_);
            }
          }
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        HDFS.BlockLocationResponse parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (HDFS.BlockLocationResponse) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int status_ ;
      /**
       * <code>optional int32 status = 1;</code>
       */
      public boolean hasStatus() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional int32 status = 1;</code>
       */
      public int getStatus() {
        return status_;
      }
      /**
       * <code>optional int32 status = 1;</code>
       */
      public Builder setStatus(int value) {
        bitField0_ |= 0x00000001;
        status_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 status = 1;</code>
       */
      public Builder clearStatus() {
        bitField0_ = (bitField0_ & ~0x00000001);
        status_ = 0;
        onChanged();
        return this;
      }

      private java.util.List<HDFS.BlockLocations> blockLocations_ =
        java.util.Collections.emptyList();
      private void ensureBlockLocationsIsMutable() {
        if (!((bitField0_ & 0x00000002) == 0x00000002)) {
          blockLocations_ = new java.util.ArrayList<HDFS.BlockLocations>(blockLocations_);
          bitField0_ |= 0x00000002;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilder<
          HDFS.BlockLocations, HDFS.BlockLocations.Builder, HDFS.BlockLocationsOrBuilder> blockLocationsBuilder_;

      /**
       * <code>repeated .BlockLocations blockLocations = 2;</code>
       */
      public java.util.List<HDFS.BlockLocations> getBlockLocationsList() {
        if (blockLocationsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(blockLocations_);
        } else {
          return blockLocationsBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .BlockLocations blockLocations = 2;</code>
       */
      public int getBlockLocationsCount() {
        if (blockLocationsBuilder_ == null) {
          return blockLocations_.size();
        } else {
          return blockLocationsBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .BlockLocations blockLocations = 2;</code>
       */
      public HDFS.BlockLocations getBlockLocations(int index) {
        if (blockLocationsBuilder_ == null) {
          return blockLocations_.get(index);
        } else {
          return blockLocationsBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .BlockLocations blockLocations = 2;</code>
       */
      public Builder setBlockLocations(
          int index, HDFS.BlockLocations value) {
        if (blockLocationsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureBlockLocationsIsMutable();
          blockLocations_.set(index, value);
          onChanged();
        } else {
          blockLocationsBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .BlockLocations blockLocations = 2;</code>
       */
      public Builder setBlockLocations(
          int index, HDFS.BlockLocations.Builder builderForValue) {
        if (blockLocationsBuilder_ == null) {
          ensureBlockLocationsIsMutable();
          blockLocations_.set(index, builderForValue.build());
          onChanged();
        } else {
          blockLocationsBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .BlockLocations blockLocations = 2;</code>
       */
      public Builder addBlockLocations(HDFS.BlockLocations value) {
        if (blockLocationsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureBlockLocationsIsMutable();
          blockLocations_.add(value);
          onChanged();
        } else {
          blockLocationsBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .BlockLocations blockLocations = 2;</code>
       */
      public Builder addBlockLocations(
          int index, HDFS.BlockLocations value) {
        if (blockLocationsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureBlockLocationsIsMutable();
          blockLocations_.add(index, value);
          onChanged();
        } else {
          blockLocationsBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .BlockLocations blockLocations = 2;</code>
       */
      public Builder addBlockLocations(
          HDFS.BlockLocations.Builder builderForValue) {
        if (blockLocationsBuilder_ == null) {
          ensureBlockLocationsIsMutable();
          blockLocations_.add(builderForValue.build());
          onChanged();
        } else {
          blockLocationsBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .BlockLocations blockLocations = 2;</code>
       */
      public Builder addBlockLocations(
          int index, HDFS.BlockLocations.Builder builderForValue) {
        if (blockLocationsBuilder_ == null) {
          ensureBlockLocationsIsMutable();
          blockLocations_.add(index, builderForValue.build());
          onChanged();
        } else {
          blockLocationsBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .BlockLocations blockLocations = 2;</code>
       */
      public Builder addAllBlockLocations(
          java.lang.Iterable<? extends HDFS.BlockLocations> values) {
        if (blockLocationsBuilder_ == null) {
          ensureBlockLocationsIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, blockLocations_);
          onChanged();
        } else {
          blockLocationsBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .BlockLocations blockLocations = 2;</code>
       */
      public Builder clearBlockLocations() {
        if (blockLocationsBuilder_ == null) {
          blockLocations_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
          onChanged();
        } else {
          blockLocationsBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .BlockLocations blockLocations = 2;</code>
       */
      public Builder removeBlockLocations(int index) {
        if (blockLocationsBuilder_ == null) {
          ensureBlockLocationsIsMutable();
          blockLocations_.remove(index);
          onChanged();
        } else {
          blockLocationsBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .BlockLocations blockLocations = 2;</code>
       */
      public HDFS.BlockLocations.Builder getBlockLocationsBuilder(
          int index) {
        return getBlockLocationsFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .BlockLocations blockLocations = 2;</code>
       */
      public HDFS.BlockLocationsOrBuilder getBlockLocationsOrBuilder(
          int index) {
        if (blockLocationsBuilder_ == null) {
          return blockLocations_.get(index);  } else {
          return blockLocationsBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .BlockLocations blockLocations = 2;</code>
       */
      public java.util.List<? extends HDFS.BlockLocationsOrBuilder> 
           getBlockLocationsOrBuilderList() {
        if (blockLocationsBuilder_ != null) {
          return blockLocationsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(blockLocations_);
        }
      }
      /**
       * <code>repeated .BlockLocations blockLocations = 2;</code>
       */
      public HDFS.BlockLocations.Builder addBlockLocationsBuilder() {
        return getBlockLocationsFieldBuilder().addBuilder(
            HDFS.BlockLocations.getDefaultInstance());
      }
      /**
       * <code>repeated .BlockLocations blockLocations = 2;</code>
       */
      public HDFS.BlockLocations.Builder addBlockLocationsBuilder(
          int index) {
        return getBlockLocationsFieldBuilder().addBuilder(
            index, HDFS.BlockLocations.getDefaultInstance());
      }
      /**
       * <code>repeated .BlockLocations blockLocations = 2;</code>
       */
      public java.util.List<HDFS.BlockLocations.Builder> 
           getBlockLocationsBuilderList() {
        return getBlockLocationsFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          HDFS.BlockLocations, HDFS.BlockLocations.Builder, HDFS.BlockLocationsOrBuilder> 
          getBlockLocationsFieldBuilder() {
        if (blockLocationsBuilder_ == null) {
          blockLocationsBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              HDFS.BlockLocations, HDFS.BlockLocations.Builder, HDFS.BlockLocationsOrBuilder>(
                  blockLocations_,
                  ((bitField0_ & 0x00000002) == 0x00000002),
                  getParentForChildren(),
                  isClean());
          blockLocations_ = null;
        }
        return blockLocationsBuilder_;
      }

      // @@protoc_insertion_point(builder_scope:BlockLocationResponse)
    }

    static {
      defaultInstance = new BlockLocationResponse(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:BlockLocationResponse)
  }

  public interface AssignBlockRequestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:AssignBlockRequest)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional int32 handle = 1;</code>
     *
     * <pre>
     * obtain using call to OpenFile
     * </pre>
     */
    boolean hasHandle();
    /**
     * <code>optional int32 handle = 1;</code>
     *
     * <pre>
     * obtain using call to OpenFile
     * </pre>
     */
    int getHandle();
  }
  /**
   * Protobuf type {@code AssignBlockRequest}
   */
  public static final class AssignBlockRequest extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:AssignBlockRequest)
      AssignBlockRequestOrBuilder {
    // Use AssignBlockRequest.newBuilder() to construct.
    private AssignBlockRequest(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private AssignBlockRequest(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final AssignBlockRequest defaultInstance;
    public static AssignBlockRequest getDefaultInstance() {
      return defaultInstance;
    }

    public AssignBlockRequest getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private AssignBlockRequest(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
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
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              handle_ = input.readInt32();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return HDFS.internal_static_AssignBlockRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return HDFS.internal_static_AssignBlockRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              HDFS.AssignBlockRequest.class, HDFS.AssignBlockRequest.Builder.class);
    }

    public static com.google.protobuf.Parser<AssignBlockRequest> PARSER =
        new com.google.protobuf.AbstractParser<AssignBlockRequest>() {
      public AssignBlockRequest parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new AssignBlockRequest(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<AssignBlockRequest> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int HANDLE_FIELD_NUMBER = 1;
    private int handle_;
    /**
     * <code>optional int32 handle = 1;</code>
     *
     * <pre>
     * obtain using call to OpenFile
     * </pre>
     */
    public boolean hasHandle() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional int32 handle = 1;</code>
     *
     * <pre>
     * obtain using call to OpenFile
     * </pre>
     */
    public int getHandle() {
      return handle_;
    }

    private void initFields() {
      handle_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt32(1, handle_);
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, handle_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static HDFS.AssignBlockRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static HDFS.AssignBlockRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static HDFS.AssignBlockRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static HDFS.AssignBlockRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static HDFS.AssignBlockRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static HDFS.AssignBlockRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static HDFS.AssignBlockRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static HDFS.AssignBlockRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static HDFS.AssignBlockRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static HDFS.AssignBlockRequest parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(HDFS.AssignBlockRequest prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code AssignBlockRequest}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:AssignBlockRequest)
        HDFS.AssignBlockRequestOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return HDFS.internal_static_AssignBlockRequest_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return HDFS.internal_static_AssignBlockRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                HDFS.AssignBlockRequest.class, HDFS.AssignBlockRequest.Builder.class);
      }

      // Construct using HDFS.AssignBlockRequest.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        handle_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return HDFS.internal_static_AssignBlockRequest_descriptor;
      }

      public HDFS.AssignBlockRequest getDefaultInstanceForType() {
        return HDFS.AssignBlockRequest.getDefaultInstance();
      }

      public HDFS.AssignBlockRequest build() {
        HDFS.AssignBlockRequest result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public HDFS.AssignBlockRequest buildPartial() {
        HDFS.AssignBlockRequest result = new HDFS.AssignBlockRequest(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.handle_ = handle_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof HDFS.AssignBlockRequest) {
          return mergeFrom((HDFS.AssignBlockRequest)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(HDFS.AssignBlockRequest other) {
        if (other == HDFS.AssignBlockRequest.getDefaultInstance()) return this;
        if (other.hasHandle()) {
          setHandle(other.getHandle());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        HDFS.AssignBlockRequest parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (HDFS.AssignBlockRequest) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int handle_ ;
      /**
       * <code>optional int32 handle = 1;</code>
       *
       * <pre>
       * obtain using call to OpenFile
       * </pre>
       */
      public boolean hasHandle() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional int32 handle = 1;</code>
       *
       * <pre>
       * obtain using call to OpenFile
       * </pre>
       */
      public int getHandle() {
        return handle_;
      }
      /**
       * <code>optional int32 handle = 1;</code>
       *
       * <pre>
       * obtain using call to OpenFile
       * </pre>
       */
      public Builder setHandle(int value) {
        bitField0_ |= 0x00000001;
        handle_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 handle = 1;</code>
       *
       * <pre>
       * obtain using call to OpenFile
       * </pre>
       */
      public Builder clearHandle() {
        bitField0_ = (bitField0_ & ~0x00000001);
        handle_ = 0;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:AssignBlockRequest)
    }

    static {
      defaultInstance = new AssignBlockRequest(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:AssignBlockRequest)
  }

  public interface AssignBlockResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:AssignBlockResponse)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional int32 status = 1;</code>
     */
    boolean hasStatus();
    /**
     * <code>optional int32 status = 1;</code>
     */
    int getStatus();

    /**
     * <code>optional .BlockLocations newBlock = 2;</code>
     */
    boolean hasNewBlock();
    /**
     * <code>optional .BlockLocations newBlock = 2;</code>
     */
    HDFS.BlockLocations getNewBlock();
    /**
     * <code>optional .BlockLocations newBlock = 2;</code>
     */
    HDFS.BlockLocationsOrBuilder getNewBlockOrBuilder();
  }
  /**
   * Protobuf type {@code AssignBlockResponse}
   */
  public static final class AssignBlockResponse extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:AssignBlockResponse)
      AssignBlockResponseOrBuilder {
    // Use AssignBlockResponse.newBuilder() to construct.
    private AssignBlockResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private AssignBlockResponse(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final AssignBlockResponse defaultInstance;
    public static AssignBlockResponse getDefaultInstance() {
      return defaultInstance;
    }

    public AssignBlockResponse getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private AssignBlockResponse(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
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
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              status_ = input.readInt32();
              break;
            }
            case 18: {
              HDFS.BlockLocations.Builder subBuilder = null;
              if (((bitField0_ & 0x00000002) == 0x00000002)) {
                subBuilder = newBlock_.toBuilder();
              }
              newBlock_ = input.readMessage(HDFS.BlockLocations.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(newBlock_);
                newBlock_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000002;
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return HDFS.internal_static_AssignBlockResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return HDFS.internal_static_AssignBlockResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              HDFS.AssignBlockResponse.class, HDFS.AssignBlockResponse.Builder.class);
    }

    public static com.google.protobuf.Parser<AssignBlockResponse> PARSER =
        new com.google.protobuf.AbstractParser<AssignBlockResponse>() {
      public AssignBlockResponse parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new AssignBlockResponse(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<AssignBlockResponse> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int STATUS_FIELD_NUMBER = 1;
    private int status_;
    /**
     * <code>optional int32 status = 1;</code>
     */
    public boolean hasStatus() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional int32 status = 1;</code>
     */
    public int getStatus() {
      return status_;
    }

    public static final int NEWBLOCK_FIELD_NUMBER = 2;
    private HDFS.BlockLocations newBlock_;
    /**
     * <code>optional .BlockLocations newBlock = 2;</code>
     */
    public boolean hasNewBlock() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional .BlockLocations newBlock = 2;</code>
     */
    public HDFS.BlockLocations getNewBlock() {
      return newBlock_;
    }
    /**
     * <code>optional .BlockLocations newBlock = 2;</code>
     */
    public HDFS.BlockLocationsOrBuilder getNewBlockOrBuilder() {
      return newBlock_;
    }

    private void initFields() {
      status_ = 0;
      newBlock_ = HDFS.BlockLocations.getDefaultInstance();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt32(1, status_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeMessage(2, newBlock_);
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, status_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, newBlock_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static HDFS.AssignBlockResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static HDFS.AssignBlockResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static HDFS.AssignBlockResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static HDFS.AssignBlockResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static HDFS.AssignBlockResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static HDFS.AssignBlockResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static HDFS.AssignBlockResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static HDFS.AssignBlockResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static HDFS.AssignBlockResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static HDFS.AssignBlockResponse parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(HDFS.AssignBlockResponse prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code AssignBlockResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:AssignBlockResponse)
        HDFS.AssignBlockResponseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return HDFS.internal_static_AssignBlockResponse_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return HDFS.internal_static_AssignBlockResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                HDFS.AssignBlockResponse.class, HDFS.AssignBlockResponse.Builder.class);
      }

      // Construct using HDFS.AssignBlockResponse.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getNewBlockFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        status_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        if (newBlockBuilder_ == null) {
          newBlock_ = HDFS.BlockLocations.getDefaultInstance();
        } else {
          newBlockBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return HDFS.internal_static_AssignBlockResponse_descriptor;
      }

      public HDFS.AssignBlockResponse getDefaultInstanceForType() {
        return HDFS.AssignBlockResponse.getDefaultInstance();
      }

      public HDFS.AssignBlockResponse build() {
        HDFS.AssignBlockResponse result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public HDFS.AssignBlockResponse buildPartial() {
        HDFS.AssignBlockResponse result = new HDFS.AssignBlockResponse(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.status_ = status_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        if (newBlockBuilder_ == null) {
          result.newBlock_ = newBlock_;
        } else {
          result.newBlock_ = newBlockBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof HDFS.AssignBlockResponse) {
          return mergeFrom((HDFS.AssignBlockResponse)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(HDFS.AssignBlockResponse other) {
        if (other == HDFS.AssignBlockResponse.getDefaultInstance()) return this;
        if (other.hasStatus()) {
          setStatus(other.getStatus());
        }
        if (other.hasNewBlock()) {
          mergeNewBlock(other.getNewBlock());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        HDFS.AssignBlockResponse parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (HDFS.AssignBlockResponse) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int status_ ;
      /**
       * <code>optional int32 status = 1;</code>
       */
      public boolean hasStatus() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional int32 status = 1;</code>
       */
      public int getStatus() {
        return status_;
      }
      /**
       * <code>optional int32 status = 1;</code>
       */
      public Builder setStatus(int value) {
        bitField0_ |= 0x00000001;
        status_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 status = 1;</code>
       */
      public Builder clearStatus() {
        bitField0_ = (bitField0_ & ~0x00000001);
        status_ = 0;
        onChanged();
        return this;
      }

      private HDFS.BlockLocations newBlock_ = HDFS.BlockLocations.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          HDFS.BlockLocations, HDFS.BlockLocations.Builder, HDFS.BlockLocationsOrBuilder> newBlockBuilder_;
      /**
       * <code>optional .BlockLocations newBlock = 2;</code>
       */
      public boolean hasNewBlock() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional .BlockLocations newBlock = 2;</code>
       */
      public HDFS.BlockLocations getNewBlock() {
        if (newBlockBuilder_ == null) {
          return newBlock_;
        } else {
          return newBlockBuilder_.getMessage();
        }
      }
      /**
       * <code>optional .BlockLocations newBlock = 2;</code>
       */
      public Builder setNewBlock(HDFS.BlockLocations value) {
        if (newBlockBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          newBlock_ = value;
          onChanged();
        } else {
          newBlockBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <code>optional .BlockLocations newBlock = 2;</code>
       */
      public Builder setNewBlock(
          HDFS.BlockLocations.Builder builderForValue) {
        if (newBlockBuilder_ == null) {
          newBlock_ = builderForValue.build();
          onChanged();
        } else {
          newBlockBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <code>optional .BlockLocations newBlock = 2;</code>
       */
      public Builder mergeNewBlock(HDFS.BlockLocations value) {
        if (newBlockBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002) &&
              newBlock_ != HDFS.BlockLocations.getDefaultInstance()) {
            newBlock_ =
              HDFS.BlockLocations.newBuilder(newBlock_).mergeFrom(value).buildPartial();
          } else {
            newBlock_ = value;
          }
          onChanged();
        } else {
          newBlockBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <code>optional .BlockLocations newBlock = 2;</code>
       */
      public Builder clearNewBlock() {
        if (newBlockBuilder_ == null) {
          newBlock_ = HDFS.BlockLocations.getDefaultInstance();
          onChanged();
        } else {
          newBlockBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      /**
       * <code>optional .BlockLocations newBlock = 2;</code>
       */
      public HDFS.BlockLocations.Builder getNewBlockBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getNewBlockFieldBuilder().getBuilder();
      }
      /**
       * <code>optional .BlockLocations newBlock = 2;</code>
       */
      public HDFS.BlockLocationsOrBuilder getNewBlockOrBuilder() {
        if (newBlockBuilder_ != null) {
          return newBlockBuilder_.getMessageOrBuilder();
        } else {
          return newBlock_;
        }
      }
      /**
       * <code>optional .BlockLocations newBlock = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilder<
          HDFS.BlockLocations, HDFS.BlockLocations.Builder, HDFS.BlockLocationsOrBuilder> 
          getNewBlockFieldBuilder() {
        if (newBlockBuilder_ == null) {
          newBlockBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              HDFS.BlockLocations, HDFS.BlockLocations.Builder, HDFS.BlockLocationsOrBuilder>(
                  getNewBlock(),
                  getParentForChildren(),
                  isClean());
          newBlock_ = null;
        }
        return newBlockBuilder_;
      }

      // @@protoc_insertion_point(builder_scope:AssignBlockResponse)
    }

    static {
      defaultInstance = new AssignBlockResponse(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:AssignBlockResponse)
  }

  public interface ListFilesRequestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ListFilesRequest)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional string dirName = 1;</code>
     *
     * <pre>
     * unused, place holder to support mkdir, etc
     * </pre>
     */
    boolean hasDirName();
    /**
     * <code>optional string dirName = 1;</code>
     *
     * <pre>
     * unused, place holder to support mkdir, etc
     * </pre>
     */
    java.lang.String getDirName();
    /**
     * <code>optional string dirName = 1;</code>
     *
     * <pre>
     * unused, place holder to support mkdir, etc
     * </pre>
     */
    com.google.protobuf.ByteString
        getDirNameBytes();
  }
  /**
   * Protobuf type {@code ListFilesRequest}
   */
  public static final class ListFilesRequest extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:ListFilesRequest)
      ListFilesRequestOrBuilder {
    // Use ListFilesRequest.newBuilder() to construct.
    private ListFilesRequest(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private ListFilesRequest(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final ListFilesRequest defaultInstance;
    public static ListFilesRequest getDefaultInstance() {
      return defaultInstance;
    }

    public ListFilesRequest getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private ListFilesRequest(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
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
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000001;
              dirName_ = bs;
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return HDFS.internal_static_ListFilesRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return HDFS.internal_static_ListFilesRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              HDFS.ListFilesRequest.class, HDFS.ListFilesRequest.Builder.class);
    }

    public static com.google.protobuf.Parser<ListFilesRequest> PARSER =
        new com.google.protobuf.AbstractParser<ListFilesRequest>() {
      public ListFilesRequest parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ListFilesRequest(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<ListFilesRequest> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int DIRNAME_FIELD_NUMBER = 1;
    private java.lang.Object dirName_;
    /**
     * <code>optional string dirName = 1;</code>
     *
     * <pre>
     * unused, place holder to support mkdir, etc
     * </pre>
     */
    public boolean hasDirName() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional string dirName = 1;</code>
     *
     * <pre>
     * unused, place holder to support mkdir, etc
     * </pre>
     */
    public java.lang.String getDirName() {
      java.lang.Object ref = dirName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          dirName_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string dirName = 1;</code>
     *
     * <pre>
     * unused, place holder to support mkdir, etc
     * </pre>
     */
    public com.google.protobuf.ByteString
        getDirNameBytes() {
      java.lang.Object ref = dirName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        dirName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private void initFields() {
      dirName_ = "";
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, getDirNameBytes());
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, getDirNameBytes());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static HDFS.ListFilesRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static HDFS.ListFilesRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static HDFS.ListFilesRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static HDFS.ListFilesRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static HDFS.ListFilesRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static HDFS.ListFilesRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static HDFS.ListFilesRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static HDFS.ListFilesRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static HDFS.ListFilesRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static HDFS.ListFilesRequest parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(HDFS.ListFilesRequest prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code ListFilesRequest}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ListFilesRequest)
        HDFS.ListFilesRequestOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return HDFS.internal_static_ListFilesRequest_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return HDFS.internal_static_ListFilesRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                HDFS.ListFilesRequest.class, HDFS.ListFilesRequest.Builder.class);
      }

      // Construct using HDFS.ListFilesRequest.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        dirName_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return HDFS.internal_static_ListFilesRequest_descriptor;
      }

      public HDFS.ListFilesRequest getDefaultInstanceForType() {
        return HDFS.ListFilesRequest.getDefaultInstance();
      }

      public HDFS.ListFilesRequest build() {
        HDFS.ListFilesRequest result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public HDFS.ListFilesRequest buildPartial() {
        HDFS.ListFilesRequest result = new HDFS.ListFilesRequest(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.dirName_ = dirName_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof HDFS.ListFilesRequest) {
          return mergeFrom((HDFS.ListFilesRequest)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(HDFS.ListFilesRequest other) {
        if (other == HDFS.ListFilesRequest.getDefaultInstance()) return this;
        if (other.hasDirName()) {
          bitField0_ |= 0x00000001;
          dirName_ = other.dirName_;
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        HDFS.ListFilesRequest parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (HDFS.ListFilesRequest) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.lang.Object dirName_ = "";
      /**
       * <code>optional string dirName = 1;</code>
       *
       * <pre>
       * unused, place holder to support mkdir, etc
       * </pre>
       */
      public boolean hasDirName() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional string dirName = 1;</code>
       *
       * <pre>
       * unused, place holder to support mkdir, etc
       * </pre>
       */
      public java.lang.String getDirName() {
        java.lang.Object ref = dirName_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            dirName_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string dirName = 1;</code>
       *
       * <pre>
       * unused, place holder to support mkdir, etc
       * </pre>
       */
      public com.google.protobuf.ByteString
          getDirNameBytes() {
        java.lang.Object ref = dirName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          dirName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string dirName = 1;</code>
       *
       * <pre>
       * unused, place holder to support mkdir, etc
       * </pre>
       */
      public Builder setDirName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        dirName_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string dirName = 1;</code>
       *
       * <pre>
       * unused, place holder to support mkdir, etc
       * </pre>
       */
      public Builder clearDirName() {
        bitField0_ = (bitField0_ & ~0x00000001);
        dirName_ = getDefaultInstance().getDirName();
        onChanged();
        return this;
      }
      /**
       * <code>optional string dirName = 1;</code>
       *
       * <pre>
       * unused, place holder to support mkdir, etc
       * </pre>
       */
      public Builder setDirNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        dirName_ = value;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:ListFilesRequest)
    }

    static {
      defaultInstance = new ListFilesRequest(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:ListFilesRequest)
  }

  public interface ListFilesResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ListFilesResponse)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional int32 status = 1;</code>
     */
    boolean hasStatus();
    /**
     * <code>optional int32 status = 1;</code>
     */
    int getStatus();

    /**
     * <code>repeated string fileNames = 2;</code>
     */
    com.google.protobuf.ProtocolStringList
        getFileNamesList();
    /**
     * <code>repeated string fileNames = 2;</code>
     */
    int getFileNamesCount();
    /**
     * <code>repeated string fileNames = 2;</code>
     */
    java.lang.String getFileNames(int index);
    /**
     * <code>repeated string fileNames = 2;</code>
     */
    com.google.protobuf.ByteString
        getFileNamesBytes(int index);
  }
  /**
   * Protobuf type {@code ListFilesResponse}
   */
  public static final class ListFilesResponse extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:ListFilesResponse)
      ListFilesResponseOrBuilder {
    // Use ListFilesResponse.newBuilder() to construct.
    private ListFilesResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private ListFilesResponse(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final ListFilesResponse defaultInstance;
    public static ListFilesResponse getDefaultInstance() {
      return defaultInstance;
    }

    public ListFilesResponse getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private ListFilesResponse(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
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
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              status_ = input.readInt32();
              break;
            }
            case 18: {
              com.google.protobuf.ByteString bs = input.readBytes();
              if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                fileNames_ = new com.google.protobuf.LazyStringArrayList();
                mutable_bitField0_ |= 0x00000002;
              }
              fileNames_.add(bs);
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
          fileNames_ = fileNames_.getUnmodifiableView();
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return HDFS.internal_static_ListFilesResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return HDFS.internal_static_ListFilesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              HDFS.ListFilesResponse.class, HDFS.ListFilesResponse.Builder.class);
    }

    public static com.google.protobuf.Parser<ListFilesResponse> PARSER =
        new com.google.protobuf.AbstractParser<ListFilesResponse>() {
      public ListFilesResponse parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ListFilesResponse(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<ListFilesResponse> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int STATUS_FIELD_NUMBER = 1;
    private int status_;
    /**
     * <code>optional int32 status = 1;</code>
     */
    public boolean hasStatus() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional int32 status = 1;</code>
     */
    public int getStatus() {
      return status_;
    }

    public static final int FILENAMES_FIELD_NUMBER = 2;
    private com.google.protobuf.LazyStringList fileNames_;
    /**
     * <code>repeated string fileNames = 2;</code>
     */
    public com.google.protobuf.ProtocolStringList
        getFileNamesList() {
      return fileNames_;
    }
    /**
     * <code>repeated string fileNames = 2;</code>
     */
    public int getFileNamesCount() {
      return fileNames_.size();
    }
    /**
     * <code>repeated string fileNames = 2;</code>
     */
    public java.lang.String getFileNames(int index) {
      return fileNames_.get(index);
    }
    /**
     * <code>repeated string fileNames = 2;</code>
     */
    public com.google.protobuf.ByteString
        getFileNamesBytes(int index) {
      return fileNames_.getByteString(index);
    }

    private void initFields() {
      status_ = 0;
      fileNames_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt32(1, status_);
      }
      for (int i = 0; i < fileNames_.size(); i++) {
        output.writeBytes(2, fileNames_.getByteString(i));
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, status_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < fileNames_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeBytesSizeNoTag(fileNames_.getByteString(i));
        }
        size += dataSize;
        size += 1 * getFileNamesList().size();
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static HDFS.ListFilesResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static HDFS.ListFilesResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static HDFS.ListFilesResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static HDFS.ListFilesResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static HDFS.ListFilesResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static HDFS.ListFilesResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static HDFS.ListFilesResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static HDFS.ListFilesResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static HDFS.ListFilesResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static HDFS.ListFilesResponse parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(HDFS.ListFilesResponse prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code ListFilesResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ListFilesResponse)
        HDFS.ListFilesResponseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return HDFS.internal_static_ListFilesResponse_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return HDFS.internal_static_ListFilesResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                HDFS.ListFilesResponse.class, HDFS.ListFilesResponse.Builder.class);
      }

      // Construct using HDFS.ListFilesResponse.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        status_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        fileNames_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return HDFS.internal_static_ListFilesResponse_descriptor;
      }

      public HDFS.ListFilesResponse getDefaultInstanceForType() {
        return HDFS.ListFilesResponse.getDefaultInstance();
      }

      public HDFS.ListFilesResponse build() {
        HDFS.ListFilesResponse result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public HDFS.ListFilesResponse buildPartial() {
        HDFS.ListFilesResponse result = new HDFS.ListFilesResponse(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.status_ = status_;
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          fileNames_ = fileNames_.getUnmodifiableView();
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.fileNames_ = fileNames_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof HDFS.ListFilesResponse) {
          return mergeFrom((HDFS.ListFilesResponse)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(HDFS.ListFilesResponse other) {
        if (other == HDFS.ListFilesResponse.getDefaultInstance()) return this;
        if (other.hasStatus()) {
          setStatus(other.getStatus());
        }
        if (!other.fileNames_.isEmpty()) {
          if (fileNames_.isEmpty()) {
            fileNames_ = other.fileNames_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureFileNamesIsMutable();
            fileNames_.addAll(other.fileNames_);
          }
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        HDFS.ListFilesResponse parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (HDFS.ListFilesResponse) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int status_ ;
      /**
       * <code>optional int32 status = 1;</code>
       */
      public boolean hasStatus() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional int32 status = 1;</code>
       */
      public int getStatus() {
        return status_;
      }
      /**
       * <code>optional int32 status = 1;</code>
       */
      public Builder setStatus(int value) {
        bitField0_ |= 0x00000001;
        status_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 status = 1;</code>
       */
      public Builder clearStatus() {
        bitField0_ = (bitField0_ & ~0x00000001);
        status_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.LazyStringList fileNames_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      private void ensureFileNamesIsMutable() {
        if (!((bitField0_ & 0x00000002) == 0x00000002)) {
          fileNames_ = new com.google.protobuf.LazyStringArrayList(fileNames_);
          bitField0_ |= 0x00000002;
         }
      }
      /**
       * <code>repeated string fileNames = 2;</code>
       */
      public com.google.protobuf.ProtocolStringList
          getFileNamesList() {
        return fileNames_.getUnmodifiableView();
      }
      /**
       * <code>repeated string fileNames = 2;</code>
       */
      public int getFileNamesCount() {
        return fileNames_.size();
      }
      /**
       * <code>repeated string fileNames = 2;</code>
       */
      public java.lang.String getFileNames(int index) {
        return fileNames_.get(index);
      }
      /**
       * <code>repeated string fileNames = 2;</code>
       */
      public com.google.protobuf.ByteString
          getFileNamesBytes(int index) {
        return fileNames_.getByteString(index);
      }
      /**
       * <code>repeated string fileNames = 2;</code>
       */
      public Builder setFileNames(
          int index, java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureFileNamesIsMutable();
        fileNames_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string fileNames = 2;</code>
       */
      public Builder addFileNames(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureFileNamesIsMutable();
        fileNames_.add(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string fileNames = 2;</code>
       */
      public Builder addAllFileNames(
          java.lang.Iterable<java.lang.String> values) {
        ensureFileNamesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, fileNames_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string fileNames = 2;</code>
       */
      public Builder clearFileNames() {
        fileNames_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string fileNames = 2;</code>
       */
      public Builder addFileNamesBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureFileNamesIsMutable();
        fileNames_.add(value);
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:ListFilesResponse)
    }

    static {
      defaultInstance = new ListFilesResponse(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:ListFilesResponse)
  }

  public interface OpenFileRequestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:OpenFileRequest)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional string fileName = 1;</code>
     *
     * <pre>
     * fileName
     * </pre>
     */
    boolean hasFileName();
    /**
     * <code>optional string fileName = 1;</code>
     *
     * <pre>
     * fileName
     * </pre>
     */
    java.lang.String getFileName();
    /**
     * <code>optional string fileName = 1;</code>
     *
     * <pre>
     * fileName
     * </pre>
     */
    com.google.protobuf.ByteString
        getFileNameBytes();

    /**
     * <code>optional bool forRead = 2;</code>
     *
     * <pre>
     * true, for read; false for write
     * </pre>
     */
    boolean hasForRead();
    /**
     * <code>optional bool forRead = 2;</code>
     *
     * <pre>
     * true, for read; false for write
     * </pre>
     */
    boolean getForRead();
  }
  /**
   * Protobuf type {@code OpenFileRequest}
   */
  public static final class OpenFileRequest extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:OpenFileRequest)
      OpenFileRequestOrBuilder {
    // Use OpenFileRequest.newBuilder() to construct.
    private OpenFileRequest(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private OpenFileRequest(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final OpenFileRequest defaultInstance;
    public static OpenFileRequest getDefaultInstance() {
      return defaultInstance;
    }

    public OpenFileRequest getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private OpenFileRequest(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
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
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000001;
              fileName_ = bs;
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              forRead_ = input.readBool();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return HDFS.internal_static_OpenFileRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return HDFS.internal_static_OpenFileRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              HDFS.OpenFileRequest.class, HDFS.OpenFileRequest.Builder.class);
    }

    public static com.google.protobuf.Parser<OpenFileRequest> PARSER =
        new com.google.protobuf.AbstractParser<OpenFileRequest>() {
      public OpenFileRequest parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new OpenFileRequest(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<OpenFileRequest> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int FILENAME_FIELD_NUMBER = 1;
    private java.lang.Object fileName_;
    /**
     * <code>optional string fileName = 1;</code>
     *
     * <pre>
     * fileName
     * </pre>
     */
    public boolean hasFileName() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional string fileName = 1;</code>
     *
     * <pre>
     * fileName
     * </pre>
     */
    public java.lang.String getFileName() {
      java.lang.Object ref = fileName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          fileName_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string fileName = 1;</code>
     *
     * <pre>
     * fileName
     * </pre>
     */
    public com.google.protobuf.ByteString
        getFileNameBytes() {
      java.lang.Object ref = fileName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        fileName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int FORREAD_FIELD_NUMBER = 2;
    private boolean forRead_;
    /**
     * <code>optional bool forRead = 2;</code>
     *
     * <pre>
     * true, for read; false for write
     * </pre>
     */
    public boolean hasForRead() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional bool forRead = 2;</code>
     *
     * <pre>
     * true, for read; false for write
     * </pre>
     */
    public boolean getForRead() {
      return forRead_;
    }

    private void initFields() {
      fileName_ = "";
      forRead_ = false;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, getFileNameBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBool(2, forRead_);
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, getFileNameBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(2, forRead_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static HDFS.OpenFileRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static HDFS.OpenFileRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static HDFS.OpenFileRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static HDFS.OpenFileRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static HDFS.OpenFileRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static HDFS.OpenFileRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static HDFS.OpenFileRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static HDFS.OpenFileRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static HDFS.OpenFileRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static HDFS.OpenFileRequest parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(HDFS.OpenFileRequest prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code OpenFileRequest}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:OpenFileRequest)
        HDFS.OpenFileRequestOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return HDFS.internal_static_OpenFileRequest_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return HDFS.internal_static_OpenFileRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                HDFS.OpenFileRequest.class, HDFS.OpenFileRequest.Builder.class);
      }

      // Construct using HDFS.OpenFileRequest.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        fileName_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        forRead_ = false;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return HDFS.internal_static_OpenFileRequest_descriptor;
      }

      public HDFS.OpenFileRequest getDefaultInstanceForType() {
        return HDFS.OpenFileRequest.getDefaultInstance();
      }

      public HDFS.OpenFileRequest build() {
        HDFS.OpenFileRequest result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public HDFS.OpenFileRequest buildPartial() {
        HDFS.OpenFileRequest result = new HDFS.OpenFileRequest(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.fileName_ = fileName_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.forRead_ = forRead_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof HDFS.OpenFileRequest) {
          return mergeFrom((HDFS.OpenFileRequest)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(HDFS.OpenFileRequest other) {
        if (other == HDFS.OpenFileRequest.getDefaultInstance()) return this;
        if (other.hasFileName()) {
          bitField0_ |= 0x00000001;
          fileName_ = other.fileName_;
          onChanged();
        }
        if (other.hasForRead()) {
          setForRead(other.getForRead());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        HDFS.OpenFileRequest parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (HDFS.OpenFileRequest) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.lang.Object fileName_ = "";
      /**
       * <code>optional string fileName = 1;</code>
       *
       * <pre>
       * fileName
       * </pre>
       */
      public boolean hasFileName() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional string fileName = 1;</code>
       *
       * <pre>
       * fileName
       * </pre>
       */
      public java.lang.String getFileName() {
        java.lang.Object ref = fileName_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            fileName_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string fileName = 1;</code>
       *
       * <pre>
       * fileName
       * </pre>
       */
      public com.google.protobuf.ByteString
          getFileNameBytes() {
        java.lang.Object ref = fileName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          fileName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string fileName = 1;</code>
       *
       * <pre>
       * fileName
       * </pre>
       */
      public Builder setFileName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        fileName_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string fileName = 1;</code>
       *
       * <pre>
       * fileName
       * </pre>
       */
      public Builder clearFileName() {
        bitField0_ = (bitField0_ & ~0x00000001);
        fileName_ = getDefaultInstance().getFileName();
        onChanged();
        return this;
      }
      /**
       * <code>optional string fileName = 1;</code>
       *
       * <pre>
       * fileName
       * </pre>
       */
      public Builder setFileNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        fileName_ = value;
        onChanged();
        return this;
      }

      private boolean forRead_ ;
      /**
       * <code>optional bool forRead = 2;</code>
       *
       * <pre>
       * true, for read; false for write
       * </pre>
       */
      public boolean hasForRead() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional bool forRead = 2;</code>
       *
       * <pre>
       * true, for read; false for write
       * </pre>
       */
      public boolean getForRead() {
        return forRead_;
      }
      /**
       * <code>optional bool forRead = 2;</code>
       *
       * <pre>
       * true, for read; false for write
       * </pre>
       */
      public Builder setForRead(boolean value) {
        bitField0_ |= 0x00000002;
        forRead_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bool forRead = 2;</code>
       *
       * <pre>
       * true, for read; false for write
       * </pre>
       */
      public Builder clearForRead() {
        bitField0_ = (bitField0_ & ~0x00000002);
        forRead_ = false;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:OpenFileRequest)
    }

    static {
      defaultInstance = new OpenFileRequest(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:OpenFileRequest)
  }

  public interface OpenFileResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:OpenFileResponse)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional int32 status = 1;</code>
     *
     * <pre>
     * result of the call
     * </pre>
     */
    boolean hasStatus();
    /**
     * <code>optional int32 status = 1;</code>
     *
     * <pre>
     * result of the call
     * </pre>
     */
    int getStatus();

    /**
     * <code>optional int32 handle = 2;</code>
     *
     * <pre>
     * file handle. Use this to close file on write
     * </pre>
     */
    boolean hasHandle();
    /**
     * <code>optional int32 handle = 2;</code>
     *
     * <pre>
     * file handle. Use this to close file on write
     * </pre>
     */
    int getHandle();

    /**
     * <code>repeated int32 blockNums = 3;</code>
     *
     * <pre>
     * for read, the numbers for the various blocks. Not populated in write mode
     * </pre>
     */
    java.util.List<java.lang.Integer> getBlockNumsList();
    /**
     * <code>repeated int32 blockNums = 3;</code>
     *
     * <pre>
     * for read, the numbers for the various blocks. Not populated in write mode
     * </pre>
     */
    int getBlockNumsCount();
    /**
     * <code>repeated int32 blockNums = 3;</code>
     *
     * <pre>
     * for read, the numbers for the various blocks. Not populated in write mode
     * </pre>
     */
    int getBlockNums(int index);
  }
  /**
   * Protobuf type {@code OpenFileResponse}
   */
  public static final class OpenFileResponse extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:OpenFileResponse)
      OpenFileResponseOrBuilder {
    // Use OpenFileResponse.newBuilder() to construct.
    private OpenFileResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private OpenFileResponse(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final OpenFileResponse defaultInstance;
    public static OpenFileResponse getDefaultInstance() {
      return defaultInstance;
    }

    public OpenFileResponse getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private OpenFileResponse(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
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
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              status_ = input.readInt32();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              handle_ = input.readInt32();
              break;
            }
            case 24: {
              if (!((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
                blockNums_ = new java.util.ArrayList<java.lang.Integer>();
                mutable_bitField0_ |= 0x00000004;
              }
              blockNums_.add(input.readInt32());
              break;
            }
            case 26: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000004) == 0x00000004) && input.getBytesUntilLimit() > 0) {
                blockNums_ = new java.util.ArrayList<java.lang.Integer>();
                mutable_bitField0_ |= 0x00000004;
              }
              while (input.getBytesUntilLimit() > 0) {
                blockNums_.add(input.readInt32());
              }
              input.popLimit(limit);
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
          blockNums_ = java.util.Collections.unmodifiableList(blockNums_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return HDFS.internal_static_OpenFileResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return HDFS.internal_static_OpenFileResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              HDFS.OpenFileResponse.class, HDFS.OpenFileResponse.Builder.class);
    }

    public static com.google.protobuf.Parser<OpenFileResponse> PARSER =
        new com.google.protobuf.AbstractParser<OpenFileResponse>() {
      public OpenFileResponse parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new OpenFileResponse(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<OpenFileResponse> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int STATUS_FIELD_NUMBER = 1;
    private int status_;
    /**
     * <code>optional int32 status = 1;</code>
     *
     * <pre>
     * result of the call
     * </pre>
     */
    public boolean hasStatus() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional int32 status = 1;</code>
     *
     * <pre>
     * result of the call
     * </pre>
     */
    public int getStatus() {
      return status_;
    }

    public static final int HANDLE_FIELD_NUMBER = 2;
    private int handle_;
    /**
     * <code>optional int32 handle = 2;</code>
     *
     * <pre>
     * file handle. Use this to close file on write
     * </pre>
     */
    public boolean hasHandle() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional int32 handle = 2;</code>
     *
     * <pre>
     * file handle. Use this to close file on write
     * </pre>
     */
    public int getHandle() {
      return handle_;
    }

    public static final int BLOCKNUMS_FIELD_NUMBER = 3;
    private java.util.List<java.lang.Integer> blockNums_;
    /**
     * <code>repeated int32 blockNums = 3;</code>
     *
     * <pre>
     * for read, the numbers for the various blocks. Not populated in write mode
     * </pre>
     */
    public java.util.List<java.lang.Integer>
        getBlockNumsList() {
      return blockNums_;
    }
    /**
     * <code>repeated int32 blockNums = 3;</code>
     *
     * <pre>
     * for read, the numbers for the various blocks. Not populated in write mode
     * </pre>
     */
    public int getBlockNumsCount() {
      return blockNums_.size();
    }
    /**
     * <code>repeated int32 blockNums = 3;</code>
     *
     * <pre>
     * for read, the numbers for the various blocks. Not populated in write mode
     * </pre>
     */
    public int getBlockNums(int index) {
      return blockNums_.get(index);
    }

    private void initFields() {
      status_ = 0;
      handle_ = 0;
      blockNums_ = java.util.Collections.emptyList();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt32(1, status_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, handle_);
      }
      for (int i = 0; i < blockNums_.size(); i++) {
        output.writeInt32(3, blockNums_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, status_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, handle_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < blockNums_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(blockNums_.get(i));
        }
        size += dataSize;
        size += 1 * getBlockNumsList().size();
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static HDFS.OpenFileResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static HDFS.OpenFileResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static HDFS.OpenFileResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static HDFS.OpenFileResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static HDFS.OpenFileResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static HDFS.OpenFileResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static HDFS.OpenFileResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static HDFS.OpenFileResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static HDFS.OpenFileResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static HDFS.OpenFileResponse parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(HDFS.OpenFileResponse prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code OpenFileResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:OpenFileResponse)
        HDFS.OpenFileResponseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return HDFS.internal_static_OpenFileResponse_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return HDFS.internal_static_OpenFileResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                HDFS.OpenFileResponse.class, HDFS.OpenFileResponse.Builder.class);
      }

      // Construct using HDFS.OpenFileResponse.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        status_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        handle_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        blockNums_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return HDFS.internal_static_OpenFileResponse_descriptor;
      }

      public HDFS.OpenFileResponse getDefaultInstanceForType() {
        return HDFS.OpenFileResponse.getDefaultInstance();
      }

      public HDFS.OpenFileResponse build() {
        HDFS.OpenFileResponse result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public HDFS.OpenFileResponse buildPartial() {
        HDFS.OpenFileResponse result = new HDFS.OpenFileResponse(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.status_ = status_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.handle_ = handle_;
        if (((bitField0_ & 0x00000004) == 0x00000004)) {
          blockNums_ = java.util.Collections.unmodifiableList(blockNums_);
          bitField0_ = (bitField0_ & ~0x00000004);
        }
        result.blockNums_ = blockNums_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof HDFS.OpenFileResponse) {
          return mergeFrom((HDFS.OpenFileResponse)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(HDFS.OpenFileResponse other) {
        if (other == HDFS.OpenFileResponse.getDefaultInstance()) return this;
        if (other.hasStatus()) {
          setStatus(other.getStatus());
        }
        if (other.hasHandle()) {
          setHandle(other.getHandle());
        }
        if (!other.blockNums_.isEmpty()) {
          if (blockNums_.isEmpty()) {
            blockNums_ = other.blockNums_;
            bitField0_ = (bitField0_ & ~0x00000004);
          } else {
            ensureBlockNumsIsMutable();
            blockNums_.addAll(other.blockNums_);
          }
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        HDFS.OpenFileResponse parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (HDFS.OpenFileResponse) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int status_ ;
      /**
       * <code>optional int32 status = 1;</code>
       *
       * <pre>
       * result of the call
       * </pre>
       */
      public boolean hasStatus() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional int32 status = 1;</code>
       *
       * <pre>
       * result of the call
       * </pre>
       */
      public int getStatus() {
        return status_;
      }
      /**
       * <code>optional int32 status = 1;</code>
       *
       * <pre>
       * result of the call
       * </pre>
       */
      public Builder setStatus(int value) {
        bitField0_ |= 0x00000001;
        status_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 status = 1;</code>
       *
       * <pre>
       * result of the call
       * </pre>
       */
      public Builder clearStatus() {
        bitField0_ = (bitField0_ & ~0x00000001);
        status_ = 0;
        onChanged();
        return this;
      }

      private int handle_ ;
      /**
       * <code>optional int32 handle = 2;</code>
       *
       * <pre>
       * file handle. Use this to close file on write
       * </pre>
       */
      public boolean hasHandle() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional int32 handle = 2;</code>
       *
       * <pre>
       * file handle. Use this to close file on write
       * </pre>
       */
      public int getHandle() {
        return handle_;
      }
      /**
       * <code>optional int32 handle = 2;</code>
       *
       * <pre>
       * file handle. Use this to close file on write
       * </pre>
       */
      public Builder setHandle(int value) {
        bitField0_ |= 0x00000002;
        handle_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 handle = 2;</code>
       *
       * <pre>
       * file handle. Use this to close file on write
       * </pre>
       */
      public Builder clearHandle() {
        bitField0_ = (bitField0_ & ~0x00000002);
        handle_ = 0;
        onChanged();
        return this;
      }

      private java.util.List<java.lang.Integer> blockNums_ = java.util.Collections.emptyList();
      private void ensureBlockNumsIsMutable() {
        if (!((bitField0_ & 0x00000004) == 0x00000004)) {
          blockNums_ = new java.util.ArrayList<java.lang.Integer>(blockNums_);
          bitField0_ |= 0x00000004;
         }
      }
      /**
       * <code>repeated int32 blockNums = 3;</code>
       *
       * <pre>
       * for read, the numbers for the various blocks. Not populated in write mode
       * </pre>
       */
      public java.util.List<java.lang.Integer>
          getBlockNumsList() {
        return java.util.Collections.unmodifiableList(blockNums_);
      }
      /**
       * <code>repeated int32 blockNums = 3;</code>
       *
       * <pre>
       * for read, the numbers for the various blocks. Not populated in write mode
       * </pre>
       */
      public int getBlockNumsCount() {
        return blockNums_.size();
      }
      /**
       * <code>repeated int32 blockNums = 3;</code>
       *
       * <pre>
       * for read, the numbers for the various blocks. Not populated in write mode
       * </pre>
       */
      public int getBlockNums(int index) {
        return blockNums_.get(index);
      }
      /**
       * <code>repeated int32 blockNums = 3;</code>
       *
       * <pre>
       * for read, the numbers for the various blocks. Not populated in write mode
       * </pre>
       */
      public Builder setBlockNums(
          int index, int value) {
        ensureBlockNumsIsMutable();
        blockNums_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated int32 blockNums = 3;</code>
       *
       * <pre>
       * for read, the numbers for the various blocks. Not populated in write mode
       * </pre>
       */
      public Builder addBlockNums(int value) {
        ensureBlockNumsIsMutable();
        blockNums_.add(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated int32 blockNums = 3;</code>
       *
       * <pre>
       * for read, the numbers for the various blocks. Not populated in write mode
       * </pre>
       */
      public Builder addAllBlockNums(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureBlockNumsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, blockNums_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated int32 blockNums = 3;</code>
       *
       * <pre>
       * for read, the numbers for the various blocks. Not populated in write mode
       * </pre>
       */
      public Builder clearBlockNums() {
        blockNums_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:OpenFileResponse)
    }

    static {
      defaultInstance = new OpenFileResponse(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:OpenFileResponse)
  }

  public interface ReadBlockRequestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ReadBlockRequest)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional int32 blockNumber = 1;</code>
     */
    boolean hasBlockNumber();
    /**
     * <code>optional int32 blockNumber = 1;</code>
     */
    int getBlockNumber();
  }
  /**
   * Protobuf type {@code ReadBlockRequest}
   */
  public static final class ReadBlockRequest extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:ReadBlockRequest)
      ReadBlockRequestOrBuilder {
    // Use ReadBlockRequest.newBuilder() to construct.
    private ReadBlockRequest(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private ReadBlockRequest(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final ReadBlockRequest defaultInstance;
    public static ReadBlockRequest getDefaultInstance() {
      return defaultInstance;
    }

    public ReadBlockRequest getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private ReadBlockRequest(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
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
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              blockNumber_ = input.readInt32();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return HDFS.internal_static_ReadBlockRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return HDFS.internal_static_ReadBlockRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              HDFS.ReadBlockRequest.class, HDFS.ReadBlockRequest.Builder.class);
    }

    public static com.google.protobuf.Parser<ReadBlockRequest> PARSER =
        new com.google.protobuf.AbstractParser<ReadBlockRequest>() {
      public ReadBlockRequest parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ReadBlockRequest(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<ReadBlockRequest> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int BLOCKNUMBER_FIELD_NUMBER = 1;
    private int blockNumber_;
    /**
     * <code>optional int32 blockNumber = 1;</code>
     */
    public boolean hasBlockNumber() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional int32 blockNumber = 1;</code>
     */
    public int getBlockNumber() {
      return blockNumber_;
    }

    private void initFields() {
      blockNumber_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt32(1, blockNumber_);
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, blockNumber_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static HDFS.ReadBlockRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static HDFS.ReadBlockRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static HDFS.ReadBlockRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static HDFS.ReadBlockRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static HDFS.ReadBlockRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static HDFS.ReadBlockRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static HDFS.ReadBlockRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static HDFS.ReadBlockRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static HDFS.ReadBlockRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static HDFS.ReadBlockRequest parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(HDFS.ReadBlockRequest prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code ReadBlockRequest}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ReadBlockRequest)
        HDFS.ReadBlockRequestOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return HDFS.internal_static_ReadBlockRequest_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return HDFS.internal_static_ReadBlockRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                HDFS.ReadBlockRequest.class, HDFS.ReadBlockRequest.Builder.class);
      }

      // Construct using HDFS.ReadBlockRequest.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        blockNumber_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return HDFS.internal_static_ReadBlockRequest_descriptor;
      }

      public HDFS.ReadBlockRequest getDefaultInstanceForType() {
        return HDFS.ReadBlockRequest.getDefaultInstance();
      }

      public HDFS.ReadBlockRequest build() {
        HDFS.ReadBlockRequest result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public HDFS.ReadBlockRequest buildPartial() {
        HDFS.ReadBlockRequest result = new HDFS.ReadBlockRequest(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.blockNumber_ = blockNumber_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof HDFS.ReadBlockRequest) {
          return mergeFrom((HDFS.ReadBlockRequest)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(HDFS.ReadBlockRequest other) {
        if (other == HDFS.ReadBlockRequest.getDefaultInstance()) return this;
        if (other.hasBlockNumber()) {
          setBlockNumber(other.getBlockNumber());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        HDFS.ReadBlockRequest parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (HDFS.ReadBlockRequest) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int blockNumber_ ;
      /**
       * <code>optional int32 blockNumber = 1;</code>
       */
      public boolean hasBlockNumber() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional int32 blockNumber = 1;</code>
       */
      public int getBlockNumber() {
        return blockNumber_;
      }
      /**
       * <code>optional int32 blockNumber = 1;</code>
       */
      public Builder setBlockNumber(int value) {
        bitField0_ |= 0x00000001;
        blockNumber_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 blockNumber = 1;</code>
       */
      public Builder clearBlockNumber() {
        bitField0_ = (bitField0_ & ~0x00000001);
        blockNumber_ = 0;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:ReadBlockRequest)
    }

    static {
      defaultInstance = new ReadBlockRequest(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:ReadBlockRequest)
  }

  public interface ReadBlockResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ReadBlockResponse)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional int32 status = 1;</code>
     */
    boolean hasStatus();
    /**
     * <code>optional int32 status = 1;</code>
     */
    int getStatus();

    /**
     * <code>repeated bytes data = 2;</code>
     */
    java.util.List<com.google.protobuf.ByteString> getDataList();
    /**
     * <code>repeated bytes data = 2;</code>
     */
    int getDataCount();
    /**
     * <code>repeated bytes data = 2;</code>
     */
    com.google.protobuf.ByteString getData(int index);
  }
  /**
   * Protobuf type {@code ReadBlockResponse}
   */
  public static final class ReadBlockResponse extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:ReadBlockResponse)
      ReadBlockResponseOrBuilder {
    // Use ReadBlockResponse.newBuilder() to construct.
    private ReadBlockResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private ReadBlockResponse(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final ReadBlockResponse defaultInstance;
    public static ReadBlockResponse getDefaultInstance() {
      return defaultInstance;
    }

    public ReadBlockResponse getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private ReadBlockResponse(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
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
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              status_ = input.readInt32();
              break;
            }
            case 18: {
              if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                data_ = new java.util.ArrayList<com.google.protobuf.ByteString>();
                mutable_bitField0_ |= 0x00000002;
              }
              data_.add(input.readBytes());
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
          data_ = java.util.Collections.unmodifiableList(data_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return HDFS.internal_static_ReadBlockResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return HDFS.internal_static_ReadBlockResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              HDFS.ReadBlockResponse.class, HDFS.ReadBlockResponse.Builder.class);
    }

    public static com.google.protobuf.Parser<ReadBlockResponse> PARSER =
        new com.google.protobuf.AbstractParser<ReadBlockResponse>() {
      public ReadBlockResponse parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ReadBlockResponse(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<ReadBlockResponse> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int STATUS_FIELD_NUMBER = 1;
    private int status_;
    /**
     * <code>optional int32 status = 1;</code>
     */
    public boolean hasStatus() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional int32 status = 1;</code>
     */
    public int getStatus() {
      return status_;
    }

    public static final int DATA_FIELD_NUMBER = 2;
    private java.util.List<com.google.protobuf.ByteString> data_;
    /**
     * <code>repeated bytes data = 2;</code>
     */
    public java.util.List<com.google.protobuf.ByteString>
        getDataList() {
      return data_;
    }
    /**
     * <code>repeated bytes data = 2;</code>
     */
    public int getDataCount() {
      return data_.size();
    }
    /**
     * <code>repeated bytes data = 2;</code>
     */
    public com.google.protobuf.ByteString getData(int index) {
      return data_.get(index);
    }

    private void initFields() {
      status_ = 0;
      data_ = java.util.Collections.emptyList();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt32(1, status_);
      }
      for (int i = 0; i < data_.size(); i++) {
        output.writeBytes(2, data_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, status_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < data_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeBytesSizeNoTag(data_.get(i));
        }
        size += dataSize;
        size += 1 * getDataList().size();
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static HDFS.ReadBlockResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static HDFS.ReadBlockResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static HDFS.ReadBlockResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static HDFS.ReadBlockResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static HDFS.ReadBlockResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static HDFS.ReadBlockResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static HDFS.ReadBlockResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static HDFS.ReadBlockResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static HDFS.ReadBlockResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static HDFS.ReadBlockResponse parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(HDFS.ReadBlockResponse prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code ReadBlockResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ReadBlockResponse)
        HDFS.ReadBlockResponseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return HDFS.internal_static_ReadBlockResponse_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return HDFS.internal_static_ReadBlockResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                HDFS.ReadBlockResponse.class, HDFS.ReadBlockResponse.Builder.class);
      }

      // Construct using HDFS.ReadBlockResponse.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        status_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        data_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return HDFS.internal_static_ReadBlockResponse_descriptor;
      }

      public HDFS.ReadBlockResponse getDefaultInstanceForType() {
        return HDFS.ReadBlockResponse.getDefaultInstance();
      }

      public HDFS.ReadBlockResponse build() {
        HDFS.ReadBlockResponse result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public HDFS.ReadBlockResponse buildPartial() {
        HDFS.ReadBlockResponse result = new HDFS.ReadBlockResponse(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.status_ = status_;
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          data_ = java.util.Collections.unmodifiableList(data_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.data_ = data_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof HDFS.ReadBlockResponse) {
          return mergeFrom((HDFS.ReadBlockResponse)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(HDFS.ReadBlockResponse other) {
        if (other == HDFS.ReadBlockResponse.getDefaultInstance()) return this;
        if (other.hasStatus()) {
          setStatus(other.getStatus());
        }
        if (!other.data_.isEmpty()) {
          if (data_.isEmpty()) {
            data_ = other.data_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureDataIsMutable();
            data_.addAll(other.data_);
          }
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        HDFS.ReadBlockResponse parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (HDFS.ReadBlockResponse) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int status_ ;
      /**
       * <code>optional int32 status = 1;</code>
       */
      public boolean hasStatus() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional int32 status = 1;</code>
       */
      public int getStatus() {
        return status_;
      }
      /**
       * <code>optional int32 status = 1;</code>
       */
      public Builder setStatus(int value) {
        bitField0_ |= 0x00000001;
        status_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 status = 1;</code>
       */
      public Builder clearStatus() {
        bitField0_ = (bitField0_ & ~0x00000001);
        status_ = 0;
        onChanged();
        return this;
      }

      private java.util.List<com.google.protobuf.ByteString> data_ = java.util.Collections.emptyList();
      private void ensureDataIsMutable() {
        if (!((bitField0_ & 0x00000002) == 0x00000002)) {
          data_ = new java.util.ArrayList<com.google.protobuf.ByteString>(data_);
          bitField0_ |= 0x00000002;
         }
      }
      /**
       * <code>repeated bytes data = 2;</code>
       */
      public java.util.List<com.google.protobuf.ByteString>
          getDataList() {
        return java.util.Collections.unmodifiableList(data_);
      }
      /**
       * <code>repeated bytes data = 2;</code>
       */
      public int getDataCount() {
        return data_.size();
      }
      /**
       * <code>repeated bytes data = 2;</code>
       */
      public com.google.protobuf.ByteString getData(int index) {
        return data_.get(index);
      }
      /**
       * <code>repeated bytes data = 2;</code>
       */
      public Builder setData(
          int index, com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureDataIsMutable();
        data_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated bytes data = 2;</code>
       */
      public Builder addData(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureDataIsMutable();
        data_.add(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated bytes data = 2;</code>
       */
      public Builder addAllData(
          java.lang.Iterable<? extends com.google.protobuf.ByteString> values) {
        ensureDataIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, data_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated bytes data = 2;</code>
       */
      public Builder clearData() {
        data_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:ReadBlockResponse)
    }

    static {
      defaultInstance = new ReadBlockResponse(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:ReadBlockResponse)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_BlockReportRequest_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_BlockReportRequest_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_BlockReportResponse_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_BlockReportResponse_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HeartBeatRequest_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_HeartBeatRequest_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HeartBeatResponse_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_HeartBeatResponse_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_WriteBlockRequest_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_WriteBlockRequest_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_WriteBlockResponse_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_WriteBlockResponse_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CloseFileRequest_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_CloseFileRequest_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CloseFileResponse_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_CloseFileResponse_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DataNodeLocation_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_DataNodeLocation_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_BlockLocations_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_BlockLocations_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_BlockLocationRequest_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_BlockLocationRequest_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_BlockLocationResponse_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_BlockLocationResponse_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AssignBlockRequest_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_AssignBlockRequest_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AssignBlockResponse_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_AssignBlockResponse_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ListFilesRequest_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_ListFilesRequest_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ListFilesResponse_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_ListFilesResponse_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_OpenFileRequest_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_OpenFileRequest_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_OpenFileResponse_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_OpenFileResponse_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ReadBlockRequest_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_ReadBlockRequest_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ReadBlockResponse_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_ReadBlockResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\nHDFS.proto\"[\n\022BlockReportRequest\022\n\n\002id" +
      "\030\001 \001(\005\022#\n\010location\030\002 \001(\0132\021.DataNodeLocat" +
      "ion\022\024\n\014blockNumbers\030\003 \003(\005\"%\n\023BlockReport" +
      "Response\022\016\n\006status\030\001 \003(\005\"\036\n\020HeartBeatReq" +
      "uest\022\n\n\002id\030\001 \001(\005\"#\n\021HeartBeatResponse\022\016\n" +
      "\006status\030\001 \001(\005\"E\n\021WriteBlockRequest\022\"\n\tbl" +
      "ockInfo\030\001 \001(\0132\017.BlockLocations\022\014\n\004data\030\002" +
      " \003(\014\"$\n\022WriteBlockResponse\022\016\n\006status\030\001 \001" +
      "(\005\"\"\n\020CloseFileRequest\022\016\n\006handle\030\001 \001(\005\"#" +
      "\n\021CloseFileResponse\022\016\n\006status\030\001 \001(\005\",\n\020D",
      "ataNodeLocation\022\n\n\002ip\030\001 \001(\005\022\014\n\004port\030\002 \001(" +
      "\005\"K\n\016BlockLocations\022\023\n\013blockNumber\030\001 \001(\005" +
      "\022$\n\tlocations\030\002 \003(\0132\021.DataNodeLocation\")" +
      "\n\024BlockLocationRequest\022\021\n\tblockNums\030\001 \003(" +
      "\005\"P\n\025BlockLocationResponse\022\016\n\006status\030\001 \001" +
      "(\005\022\'\n\016blockLocations\030\002 \003(\0132\017.BlockLocati" +
      "ons\"$\n\022AssignBlockRequest\022\016\n\006handle\030\001 \001(" +
      "\005\"H\n\023AssignBlockResponse\022\016\n\006status\030\001 \001(\005" +
      "\022!\n\010newBlock\030\002 \001(\0132\017.BlockLocations\"#\n\020L" +
      "istFilesRequest\022\017\n\007dirName\030\001 \001(\t\"6\n\021List",
      "FilesResponse\022\016\n\006status\030\001 \001(\005\022\021\n\tfileNam" +
      "es\030\002 \003(\t\"4\n\017OpenFileRequest\022\020\n\010fileName\030" +
      "\001 \001(\t\022\017\n\007forRead\030\002 \001(\010\"E\n\020OpenFileRespon" +
      "se\022\016\n\006status\030\001 \001(\005\022\016\n\006handle\030\002 \001(\005\022\021\n\tbl" +
      "ockNums\030\003 \003(\005\"\'\n\020ReadBlockRequest\022\023\n\013blo" +
      "ckNumber\030\001 \001(\005\"1\n\021ReadBlockResponse\022\016\n\006s" +
      "tatus\030\001 \001(\005\022\014\n\004data\030\002 \003(\014"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_BlockReportRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_BlockReportRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_BlockReportRequest_descriptor,
        new java.lang.String[] { "Id", "Location", "BlockNumbers", });
    internal_static_BlockReportResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_BlockReportResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_BlockReportResponse_descriptor,
        new java.lang.String[] { "Status", });
    internal_static_HeartBeatRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_HeartBeatRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_HeartBeatRequest_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_HeartBeatResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_HeartBeatResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_HeartBeatResponse_descriptor,
        new java.lang.String[] { "Status", });
    internal_static_WriteBlockRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_WriteBlockRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_WriteBlockRequest_descriptor,
        new java.lang.String[] { "BlockInfo", "Data", });
    internal_static_WriteBlockResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_WriteBlockResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_WriteBlockResponse_descriptor,
        new java.lang.String[] { "Status", });
    internal_static_CloseFileRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_CloseFileRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_CloseFileRequest_descriptor,
        new java.lang.String[] { "Handle", });
    internal_static_CloseFileResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_CloseFileResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_CloseFileResponse_descriptor,
        new java.lang.String[] { "Status", });
    internal_static_DataNodeLocation_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_DataNodeLocation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_DataNodeLocation_descriptor,
        new java.lang.String[] { "Ip", "Port", });
    internal_static_BlockLocations_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_BlockLocations_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_BlockLocations_descriptor,
        new java.lang.String[] { "BlockNumber", "Locations", });
    internal_static_BlockLocationRequest_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_BlockLocationRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_BlockLocationRequest_descriptor,
        new java.lang.String[] { "BlockNums", });
    internal_static_BlockLocationResponse_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_BlockLocationResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_BlockLocationResponse_descriptor,
        new java.lang.String[] { "Status", "BlockLocations", });
    internal_static_AssignBlockRequest_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_AssignBlockRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_AssignBlockRequest_descriptor,
        new java.lang.String[] { "Handle", });
    internal_static_AssignBlockResponse_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_AssignBlockResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_AssignBlockResponse_descriptor,
        new java.lang.String[] { "Status", "NewBlock", });
    internal_static_ListFilesRequest_descriptor =
      getDescriptor().getMessageTypes().get(14);
    internal_static_ListFilesRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_ListFilesRequest_descriptor,
        new java.lang.String[] { "DirName", });
    internal_static_ListFilesResponse_descriptor =
      getDescriptor().getMessageTypes().get(15);
    internal_static_ListFilesResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_ListFilesResponse_descriptor,
        new java.lang.String[] { "Status", "FileNames", });
    internal_static_OpenFileRequest_descriptor =
      getDescriptor().getMessageTypes().get(16);
    internal_static_OpenFileRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_OpenFileRequest_descriptor,
        new java.lang.String[] { "FileName", "ForRead", });
    internal_static_OpenFileResponse_descriptor =
      getDescriptor().getMessageTypes().get(17);
    internal_static_OpenFileResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_OpenFileResponse_descriptor,
        new java.lang.String[] { "Status", "Handle", "BlockNums", });
    internal_static_ReadBlockRequest_descriptor =
      getDescriptor().getMessageTypes().get(18);
    internal_static_ReadBlockRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_ReadBlockRequest_descriptor,
        new java.lang.String[] { "BlockNumber", });
    internal_static_ReadBlockResponse_descriptor =
      getDescriptor().getMessageTypes().get(19);
    internal_static_ReadBlockResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_ReadBlockResponse_descriptor,
        new java.lang.String[] { "Status", "Data", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
