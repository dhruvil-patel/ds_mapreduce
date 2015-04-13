package MapReducePackage;

public final class MapReduce {
  private MapReduce() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface JobSubmitRequestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:JobSubmitRequest)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional string mapName = 1;</code>
     *
     * <pre>
     * Java class, or name of C .so
     * </pre>
     */
    boolean hasMapName();
    /**
     * <code>optional string mapName = 1;</code>
     *
     * <pre>
     * Java class, or name of C .so
     * </pre>
     */
    java.lang.String getMapName();
    /**
     * <code>optional string mapName = 1;</code>
     *
     * <pre>
     * Java class, or name of C .so
     * </pre>
     */
    com.google.protobuf.ByteString
        getMapNameBytes();

    /**
     * <code>optional string reducerName = 2;</code>
     *
     * <pre>
     * Java class, or name of C .so
     * </pre>
     */
    boolean hasReducerName();
    /**
     * <code>optional string reducerName = 2;</code>
     *
     * <pre>
     * Java class, or name of C .so
     * </pre>
     */
    java.lang.String getReducerName();
    /**
     * <code>optional string reducerName = 2;</code>
     *
     * <pre>
     * Java class, or name of C .so
     * </pre>
     */
    com.google.protobuf.ByteString
        getReducerNameBytes();

    /**
     * <code>optional string inputFile = 3;</code>
     */
    boolean hasInputFile();
    /**
     * <code>optional string inputFile = 3;</code>
     */
    java.lang.String getInputFile();
    /**
     * <code>optional string inputFile = 3;</code>
     */
    com.google.protobuf.ByteString
        getInputFileBytes();

    /**
     * <code>optional string outputFile = 4;</code>
     */
    boolean hasOutputFile();
    /**
     * <code>optional string outputFile = 4;</code>
     */
    java.lang.String getOutputFile();
    /**
     * <code>optional string outputFile = 4;</code>
     */
    com.google.protobuf.ByteString
        getOutputFileBytes();

    /**
     * <code>optional int32 numReduceTasks = 5;</code>
     */
    boolean hasNumReduceTasks();
    /**
     * <code>optional int32 numReduceTasks = 5;</code>
     */
    int getNumReduceTasks();
  }
  /**
   * Protobuf type {@code JobSubmitRequest}
   */
  public static final class JobSubmitRequest extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:JobSubmitRequest)
      JobSubmitRequestOrBuilder {
    // Use JobSubmitRequest.newBuilder() to construct.
    private JobSubmitRequest(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private JobSubmitRequest(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final JobSubmitRequest defaultInstance;
    public static JobSubmitRequest getDefaultInstance() {
      return defaultInstance;
    }

    public JobSubmitRequest getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private JobSubmitRequest(
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
              mapName_ = bs;
              break;
            }
            case 18: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000002;
              reducerName_ = bs;
              break;
            }
            case 26: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000004;
              inputFile_ = bs;
              break;
            }
            case 34: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000008;
              outputFile_ = bs;
              break;
            }
            case 40: {
              bitField0_ |= 0x00000010;
              numReduceTasks_ = input.readInt32();
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
      return MapReduce.internal_static_JobSubmitRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return MapReduce.internal_static_JobSubmitRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              MapReduce.JobSubmitRequest.class, MapReduce.JobSubmitRequest.Builder.class);
    }

    public static com.google.protobuf.Parser<JobSubmitRequest> PARSER =
        new com.google.protobuf.AbstractParser<JobSubmitRequest>() {
      public JobSubmitRequest parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new JobSubmitRequest(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<JobSubmitRequest> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int MAPNAME_FIELD_NUMBER = 1;
    private java.lang.Object mapName_;
    /**
     * <code>optional string mapName = 1;</code>
     *
     * <pre>
     * Java class, or name of C .so
     * </pre>
     */
    public boolean hasMapName() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional string mapName = 1;</code>
     *
     * <pre>
     * Java class, or name of C .so
     * </pre>
     */
    public java.lang.String getMapName() {
      java.lang.Object ref = mapName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          mapName_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string mapName = 1;</code>
     *
     * <pre>
     * Java class, or name of C .so
     * </pre>
     */
    public com.google.protobuf.ByteString
        getMapNameBytes() {
      java.lang.Object ref = mapName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        mapName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int REDUCERNAME_FIELD_NUMBER = 2;
    private java.lang.Object reducerName_;
    /**
     * <code>optional string reducerName = 2;</code>
     *
     * <pre>
     * Java class, or name of C .so
     * </pre>
     */
    public boolean hasReducerName() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional string reducerName = 2;</code>
     *
     * <pre>
     * Java class, or name of C .so
     * </pre>
     */
    public java.lang.String getReducerName() {
      java.lang.Object ref = reducerName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          reducerName_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string reducerName = 2;</code>
     *
     * <pre>
     * Java class, or name of C .so
     * </pre>
     */
    public com.google.protobuf.ByteString
        getReducerNameBytes() {
      java.lang.Object ref = reducerName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        reducerName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int INPUTFILE_FIELD_NUMBER = 3;
    private java.lang.Object inputFile_;
    /**
     * <code>optional string inputFile = 3;</code>
     */
    public boolean hasInputFile() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional string inputFile = 3;</code>
     */
    public java.lang.String getInputFile() {
      java.lang.Object ref = inputFile_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          inputFile_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string inputFile = 3;</code>
     */
    public com.google.protobuf.ByteString
        getInputFileBytes() {
      java.lang.Object ref = inputFile_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        inputFile_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int OUTPUTFILE_FIELD_NUMBER = 4;
    private java.lang.Object outputFile_;
    /**
     * <code>optional string outputFile = 4;</code>
     */
    public boolean hasOutputFile() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>optional string outputFile = 4;</code>
     */
    public java.lang.String getOutputFile() {
      java.lang.Object ref = outputFile_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          outputFile_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string outputFile = 4;</code>
     */
    public com.google.protobuf.ByteString
        getOutputFileBytes() {
      java.lang.Object ref = outputFile_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        outputFile_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int NUMREDUCETASKS_FIELD_NUMBER = 5;
    private int numReduceTasks_;
    /**
     * <code>optional int32 numReduceTasks = 5;</code>
     */
    public boolean hasNumReduceTasks() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     * <code>optional int32 numReduceTasks = 5;</code>
     */
    public int getNumReduceTasks() {
      return numReduceTasks_;
    }

    private void initFields() {
      mapName_ = "";
      reducerName_ = "";
      inputFile_ = "";
      outputFile_ = "";
      numReduceTasks_ = 0;
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
        output.writeBytes(1, getMapNameBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, getReducerNameBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeBytes(3, getInputFileBytes());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeBytes(4, getOutputFileBytes());
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeInt32(5, numReduceTasks_);
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
          .computeBytesSize(1, getMapNameBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getReducerNameBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(3, getInputFileBytes());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(4, getOutputFileBytes());
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(5, numReduceTasks_);
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

    public static MapReduce.JobSubmitRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static MapReduce.JobSubmitRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static MapReduce.JobSubmitRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static MapReduce.JobSubmitRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static MapReduce.JobSubmitRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static MapReduce.JobSubmitRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static MapReduce.JobSubmitRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static MapReduce.JobSubmitRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static MapReduce.JobSubmitRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static MapReduce.JobSubmitRequest parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(MapReduce.JobSubmitRequest prototype) {
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
     * Protobuf type {@code JobSubmitRequest}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:JobSubmitRequest)
        MapReduce.JobSubmitRequestOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return MapReduce.internal_static_JobSubmitRequest_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return MapReduce.internal_static_JobSubmitRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                MapReduce.JobSubmitRequest.class, MapReduce.JobSubmitRequest.Builder.class);
      }

      // Construct using MapReduce.JobSubmitRequest.newBuilder()
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
        mapName_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        reducerName_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        inputFile_ = "";
        bitField0_ = (bitField0_ & ~0x00000004);
        outputFile_ = "";
        bitField0_ = (bitField0_ & ~0x00000008);
        numReduceTasks_ = 0;
        bitField0_ = (bitField0_ & ~0x00000010);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return MapReduce.internal_static_JobSubmitRequest_descriptor;
      }

      public MapReduce.JobSubmitRequest getDefaultInstanceForType() {
        return MapReduce.JobSubmitRequest.getDefaultInstance();
      }

      public MapReduce.JobSubmitRequest build() {
        MapReduce.JobSubmitRequest result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public MapReduce.JobSubmitRequest buildPartial() {
        MapReduce.JobSubmitRequest result = new MapReduce.JobSubmitRequest(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.mapName_ = mapName_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.reducerName_ = reducerName_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.inputFile_ = inputFile_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.outputFile_ = outputFile_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.numReduceTasks_ = numReduceTasks_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof MapReduce.JobSubmitRequest) {
          return mergeFrom((MapReduce.JobSubmitRequest)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(MapReduce.JobSubmitRequest other) {
        if (other == MapReduce.JobSubmitRequest.getDefaultInstance()) return this;
        if (other.hasMapName()) {
          bitField0_ |= 0x00000001;
          mapName_ = other.mapName_;
          onChanged();
        }
        if (other.hasReducerName()) {
          bitField0_ |= 0x00000002;
          reducerName_ = other.reducerName_;
          onChanged();
        }
        if (other.hasInputFile()) {
          bitField0_ |= 0x00000004;
          inputFile_ = other.inputFile_;
          onChanged();
        }
        if (other.hasOutputFile()) {
          bitField0_ |= 0x00000008;
          outputFile_ = other.outputFile_;
          onChanged();
        }
        if (other.hasNumReduceTasks()) {
          setNumReduceTasks(other.getNumReduceTasks());
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
        MapReduce.JobSubmitRequest parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (MapReduce.JobSubmitRequest) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.lang.Object mapName_ = "";
      /**
       * <code>optional string mapName = 1;</code>
       *
       * <pre>
       * Java class, or name of C .so
       * </pre>
       */
      public boolean hasMapName() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional string mapName = 1;</code>
       *
       * <pre>
       * Java class, or name of C .so
       * </pre>
       */
      public java.lang.String getMapName() {
        java.lang.Object ref = mapName_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            mapName_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string mapName = 1;</code>
       *
       * <pre>
       * Java class, or name of C .so
       * </pre>
       */
      public com.google.protobuf.ByteString
          getMapNameBytes() {
        java.lang.Object ref = mapName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          mapName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string mapName = 1;</code>
       *
       * <pre>
       * Java class, or name of C .so
       * </pre>
       */
      public Builder setMapName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        mapName_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string mapName = 1;</code>
       *
       * <pre>
       * Java class, or name of C .so
       * </pre>
       */
      public Builder clearMapName() {
        bitField0_ = (bitField0_ & ~0x00000001);
        mapName_ = getDefaultInstance().getMapName();
        onChanged();
        return this;
      }
      /**
       * <code>optional string mapName = 1;</code>
       *
       * <pre>
       * Java class, or name of C .so
       * </pre>
       */
      public Builder setMapNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        mapName_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object reducerName_ = "";
      /**
       * <code>optional string reducerName = 2;</code>
       *
       * <pre>
       * Java class, or name of C .so
       * </pre>
       */
      public boolean hasReducerName() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional string reducerName = 2;</code>
       *
       * <pre>
       * Java class, or name of C .so
       * </pre>
       */
      public java.lang.String getReducerName() {
        java.lang.Object ref = reducerName_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            reducerName_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string reducerName = 2;</code>
       *
       * <pre>
       * Java class, or name of C .so
       * </pre>
       */
      public com.google.protobuf.ByteString
          getReducerNameBytes() {
        java.lang.Object ref = reducerName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          reducerName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string reducerName = 2;</code>
       *
       * <pre>
       * Java class, or name of C .so
       * </pre>
       */
      public Builder setReducerName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        reducerName_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string reducerName = 2;</code>
       *
       * <pre>
       * Java class, or name of C .so
       * </pre>
       */
      public Builder clearReducerName() {
        bitField0_ = (bitField0_ & ~0x00000002);
        reducerName_ = getDefaultInstance().getReducerName();
        onChanged();
        return this;
      }
      /**
       * <code>optional string reducerName = 2;</code>
       *
       * <pre>
       * Java class, or name of C .so
       * </pre>
       */
      public Builder setReducerNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        reducerName_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object inputFile_ = "";
      /**
       * <code>optional string inputFile = 3;</code>
       */
      public boolean hasInputFile() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional string inputFile = 3;</code>
       */
      public java.lang.String getInputFile() {
        java.lang.Object ref = inputFile_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            inputFile_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string inputFile = 3;</code>
       */
      public com.google.protobuf.ByteString
          getInputFileBytes() {
        java.lang.Object ref = inputFile_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          inputFile_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string inputFile = 3;</code>
       */
      public Builder setInputFile(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        inputFile_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string inputFile = 3;</code>
       */
      public Builder clearInputFile() {
        bitField0_ = (bitField0_ & ~0x00000004);
        inputFile_ = getDefaultInstance().getInputFile();
        onChanged();
        return this;
      }
      /**
       * <code>optional string inputFile = 3;</code>
       */
      public Builder setInputFileBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        inputFile_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object outputFile_ = "";
      /**
       * <code>optional string outputFile = 4;</code>
       */
      public boolean hasOutputFile() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>optional string outputFile = 4;</code>
       */
      public java.lang.String getOutputFile() {
        java.lang.Object ref = outputFile_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            outputFile_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string outputFile = 4;</code>
       */
      public com.google.protobuf.ByteString
          getOutputFileBytes() {
        java.lang.Object ref = outputFile_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          outputFile_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string outputFile = 4;</code>
       */
      public Builder setOutputFile(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        outputFile_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string outputFile = 4;</code>
       */
      public Builder clearOutputFile() {
        bitField0_ = (bitField0_ & ~0x00000008);
        outputFile_ = getDefaultInstance().getOutputFile();
        onChanged();
        return this;
      }
      /**
       * <code>optional string outputFile = 4;</code>
       */
      public Builder setOutputFileBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        outputFile_ = value;
        onChanged();
        return this;
      }

      private int numReduceTasks_ ;
      /**
       * <code>optional int32 numReduceTasks = 5;</code>
       */
      public boolean hasNumReduceTasks() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      /**
       * <code>optional int32 numReduceTasks = 5;</code>
       */
      public int getNumReduceTasks() {
        return numReduceTasks_;
      }
      /**
       * <code>optional int32 numReduceTasks = 5;</code>
       */
      public Builder setNumReduceTasks(int value) {
        bitField0_ |= 0x00000010;
        numReduceTasks_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 numReduceTasks = 5;</code>
       */
      public Builder clearNumReduceTasks() {
        bitField0_ = (bitField0_ & ~0x00000010);
        numReduceTasks_ = 0;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:JobSubmitRequest)
    }

    static {
      defaultInstance = new JobSubmitRequest(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:JobSubmitRequest)
  }

  public interface JobSubmitResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:JobSubmitResponse)
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
     * <code>optional int32 jobId = 2;</code>
     */
    boolean hasJobId();
    /**
     * <code>optional int32 jobId = 2;</code>
     */
    int getJobId();
  }
  /**
   * Protobuf type {@code JobSubmitResponse}
   */
  public static final class JobSubmitResponse extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:JobSubmitResponse)
      JobSubmitResponseOrBuilder {
    // Use JobSubmitResponse.newBuilder() to construct.
    private JobSubmitResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private JobSubmitResponse(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final JobSubmitResponse defaultInstance;
    public static JobSubmitResponse getDefaultInstance() {
      return defaultInstance;
    }

    public JobSubmitResponse getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private JobSubmitResponse(
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
              jobId_ = input.readInt32();
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
      return MapReduce.internal_static_JobSubmitResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return MapReduce.internal_static_JobSubmitResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              MapReduce.JobSubmitResponse.class, MapReduce.JobSubmitResponse.Builder.class);
    }

    public static com.google.protobuf.Parser<JobSubmitResponse> PARSER =
        new com.google.protobuf.AbstractParser<JobSubmitResponse>() {
      public JobSubmitResponse parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new JobSubmitResponse(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<JobSubmitResponse> getParserForType() {
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

    public static final int JOBID_FIELD_NUMBER = 2;
    private int jobId_;
    /**
     * <code>optional int32 jobId = 2;</code>
     */
    public boolean hasJobId() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional int32 jobId = 2;</code>
     */
    public int getJobId() {
      return jobId_;
    }

    private void initFields() {
      status_ = 0;
      jobId_ = 0;
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
        output.writeInt32(2, jobId_);
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
          .computeInt32Size(2, jobId_);
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

    public static MapReduce.JobSubmitResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static MapReduce.JobSubmitResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static MapReduce.JobSubmitResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static MapReduce.JobSubmitResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static MapReduce.JobSubmitResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static MapReduce.JobSubmitResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static MapReduce.JobSubmitResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static MapReduce.JobSubmitResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static MapReduce.JobSubmitResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static MapReduce.JobSubmitResponse parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(MapReduce.JobSubmitResponse prototype) {
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
     * Protobuf type {@code JobSubmitResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:JobSubmitResponse)
        MapReduce.JobSubmitResponseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return MapReduce.internal_static_JobSubmitResponse_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return MapReduce.internal_static_JobSubmitResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                MapReduce.JobSubmitResponse.class, MapReduce.JobSubmitResponse.Builder.class);
      }

      // Construct using MapReduce.JobSubmitResponse.newBuilder()
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
        jobId_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return MapReduce.internal_static_JobSubmitResponse_descriptor;
      }

      public MapReduce.JobSubmitResponse getDefaultInstanceForType() {
        return MapReduce.JobSubmitResponse.getDefaultInstance();
      }

      public MapReduce.JobSubmitResponse build() {
        MapReduce.JobSubmitResponse result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public MapReduce.JobSubmitResponse buildPartial() {
        MapReduce.JobSubmitResponse result = new MapReduce.JobSubmitResponse(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.status_ = status_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.jobId_ = jobId_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof MapReduce.JobSubmitResponse) {
          return mergeFrom((MapReduce.JobSubmitResponse)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(MapReduce.JobSubmitResponse other) {
        if (other == MapReduce.JobSubmitResponse.getDefaultInstance()) return this;
        if (other.hasStatus()) {
          setStatus(other.getStatus());
        }
        if (other.hasJobId()) {
          setJobId(other.getJobId());
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
        MapReduce.JobSubmitResponse parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (MapReduce.JobSubmitResponse) e.getUnfinishedMessage();
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

      private int jobId_ ;
      /**
       * <code>optional int32 jobId = 2;</code>
       */
      public boolean hasJobId() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional int32 jobId = 2;</code>
       */
      public int getJobId() {
        return jobId_;
      }
      /**
       * <code>optional int32 jobId = 2;</code>
       */
      public Builder setJobId(int value) {
        bitField0_ |= 0x00000002;
        jobId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 jobId = 2;</code>
       */
      public Builder clearJobId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        jobId_ = 0;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:JobSubmitResponse)
    }

    static {
      defaultInstance = new JobSubmitResponse(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:JobSubmitResponse)
  }

  public interface JobStatusRequestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:JobStatusRequest)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional int32 jobId = 1;</code>
     */
    boolean hasJobId();
    /**
     * <code>optional int32 jobId = 1;</code>
     */
    int getJobId();
  }
  /**
   * Protobuf type {@code JobStatusRequest}
   */
  public static final class JobStatusRequest extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:JobStatusRequest)
      JobStatusRequestOrBuilder {
    // Use JobStatusRequest.newBuilder() to construct.
    private JobStatusRequest(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private JobStatusRequest(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final JobStatusRequest defaultInstance;
    public static JobStatusRequest getDefaultInstance() {
      return defaultInstance;
    }

    public JobStatusRequest getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private JobStatusRequest(
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
              jobId_ = input.readInt32();
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
      return MapReduce.internal_static_JobStatusRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return MapReduce.internal_static_JobStatusRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              MapReduce.JobStatusRequest.class, MapReduce.JobStatusRequest.Builder.class);
    }

    public static com.google.protobuf.Parser<JobStatusRequest> PARSER =
        new com.google.protobuf.AbstractParser<JobStatusRequest>() {
      public JobStatusRequest parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new JobStatusRequest(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<JobStatusRequest> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int JOBID_FIELD_NUMBER = 1;
    private int jobId_;
    /**
     * <code>optional int32 jobId = 1;</code>
     */
    public boolean hasJobId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional int32 jobId = 1;</code>
     */
    public int getJobId() {
      return jobId_;
    }

    private void initFields() {
      jobId_ = 0;
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
        output.writeInt32(1, jobId_);
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
          .computeInt32Size(1, jobId_);
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

    public static MapReduce.JobStatusRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static MapReduce.JobStatusRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static MapReduce.JobStatusRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static MapReduce.JobStatusRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static MapReduce.JobStatusRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static MapReduce.JobStatusRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static MapReduce.JobStatusRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static MapReduce.JobStatusRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static MapReduce.JobStatusRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static MapReduce.JobStatusRequest parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(MapReduce.JobStatusRequest prototype) {
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
     * Protobuf type {@code JobStatusRequest}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:JobStatusRequest)
        MapReduce.JobStatusRequestOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return MapReduce.internal_static_JobStatusRequest_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return MapReduce.internal_static_JobStatusRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                MapReduce.JobStatusRequest.class, MapReduce.JobStatusRequest.Builder.class);
      }

      // Construct using MapReduce.JobStatusRequest.newBuilder()
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
        jobId_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return MapReduce.internal_static_JobStatusRequest_descriptor;
      }

      public MapReduce.JobStatusRequest getDefaultInstanceForType() {
        return MapReduce.JobStatusRequest.getDefaultInstance();
      }

      public MapReduce.JobStatusRequest build() {
        MapReduce.JobStatusRequest result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public MapReduce.JobStatusRequest buildPartial() {
        MapReduce.JobStatusRequest result = new MapReduce.JobStatusRequest(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.jobId_ = jobId_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof MapReduce.JobStatusRequest) {
          return mergeFrom((MapReduce.JobStatusRequest)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(MapReduce.JobStatusRequest other) {
        if (other == MapReduce.JobStatusRequest.getDefaultInstance()) return this;
        if (other.hasJobId()) {
          setJobId(other.getJobId());
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
        MapReduce.JobStatusRequest parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (MapReduce.JobStatusRequest) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int jobId_ ;
      /**
       * <code>optional int32 jobId = 1;</code>
       */
      public boolean hasJobId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional int32 jobId = 1;</code>
       */
      public int getJobId() {
        return jobId_;
      }
      /**
       * <code>optional int32 jobId = 1;</code>
       */
      public Builder setJobId(int value) {
        bitField0_ |= 0x00000001;
        jobId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 jobId = 1;</code>
       */
      public Builder clearJobId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        jobId_ = 0;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:JobStatusRequest)
    }

    static {
      defaultInstance = new JobStatusRequest(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:JobStatusRequest)
  }

  public interface JobStatusResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:JobStatusResponse)
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
     * <code>optional bool jobDone = 2;</code>
     */
    boolean hasJobDone();
    /**
     * <code>optional bool jobDone = 2;</code>
     */
    boolean getJobDone();

    /**
     * <code>optional int32 totalMapTasks = 3;</code>
     */
    boolean hasTotalMapTasks();
    /**
     * <code>optional int32 totalMapTasks = 3;</code>
     */
    int getTotalMapTasks();

    /**
     * <code>optional int32 numMapTasksStarted = 4;</code>
     */
    boolean hasNumMapTasksStarted();
    /**
     * <code>optional int32 numMapTasksStarted = 4;</code>
     */
    int getNumMapTasksStarted();

    /**
     * <code>optional int32 totalReduceTasks = 5;</code>
     */
    boolean hasTotalReduceTasks();
    /**
     * <code>optional int32 totalReduceTasks = 5;</code>
     */
    int getTotalReduceTasks();

    /**
     * <code>optional int32 numReduceTasksStarted = 6;</code>
     */
    boolean hasNumReduceTasksStarted();
    /**
     * <code>optional int32 numReduceTasksStarted = 6;</code>
     */
    int getNumReduceTasksStarted();
  }
  /**
   * Protobuf type {@code JobStatusResponse}
   */
  public static final class JobStatusResponse extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:JobStatusResponse)
      JobStatusResponseOrBuilder {
    // Use JobStatusResponse.newBuilder() to construct.
    private JobStatusResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private JobStatusResponse(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final JobStatusResponse defaultInstance;
    public static JobStatusResponse getDefaultInstance() {
      return defaultInstance;
    }

    public JobStatusResponse getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private JobStatusResponse(
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
              jobDone_ = input.readBool();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              totalMapTasks_ = input.readInt32();
              break;
            }
            case 32: {
              bitField0_ |= 0x00000008;
              numMapTasksStarted_ = input.readInt32();
              break;
            }
            case 40: {
              bitField0_ |= 0x00000010;
              totalReduceTasks_ = input.readInt32();
              break;
            }
            case 48: {
              bitField0_ |= 0x00000020;
              numReduceTasksStarted_ = input.readInt32();
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
      return MapReduce.internal_static_JobStatusResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return MapReduce.internal_static_JobStatusResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              MapReduce.JobStatusResponse.class, MapReduce.JobStatusResponse.Builder.class);
    }

    public static com.google.protobuf.Parser<JobStatusResponse> PARSER =
        new com.google.protobuf.AbstractParser<JobStatusResponse>() {
      public JobStatusResponse parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new JobStatusResponse(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<JobStatusResponse> getParserForType() {
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

    public static final int JOBDONE_FIELD_NUMBER = 2;
    private boolean jobDone_;
    /**
     * <code>optional bool jobDone = 2;</code>
     */
    public boolean hasJobDone() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional bool jobDone = 2;</code>
     */
    public boolean getJobDone() {
      return jobDone_;
    }

    public static final int TOTALMAPTASKS_FIELD_NUMBER = 3;
    private int totalMapTasks_;
    /**
     * <code>optional int32 totalMapTasks = 3;</code>
     */
    public boolean hasTotalMapTasks() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional int32 totalMapTasks = 3;</code>
     */
    public int getTotalMapTasks() {
      return totalMapTasks_;
    }

    public static final int NUMMAPTASKSSTARTED_FIELD_NUMBER = 4;
    private int numMapTasksStarted_;
    /**
     * <code>optional int32 numMapTasksStarted = 4;</code>
     */
    public boolean hasNumMapTasksStarted() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>optional int32 numMapTasksStarted = 4;</code>
     */
    public int getNumMapTasksStarted() {
      return numMapTasksStarted_;
    }

    public static final int TOTALREDUCETASKS_FIELD_NUMBER = 5;
    private int totalReduceTasks_;
    /**
     * <code>optional int32 totalReduceTasks = 5;</code>
     */
    public boolean hasTotalReduceTasks() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     * <code>optional int32 totalReduceTasks = 5;</code>
     */
    public int getTotalReduceTasks() {
      return totalReduceTasks_;
    }

    public static final int NUMREDUCETASKSSTARTED_FIELD_NUMBER = 6;
    private int numReduceTasksStarted_;
    /**
     * <code>optional int32 numReduceTasksStarted = 6;</code>
     */
    public boolean hasNumReduceTasksStarted() {
      return ((bitField0_ & 0x00000020) == 0x00000020);
    }
    /**
     * <code>optional int32 numReduceTasksStarted = 6;</code>
     */
    public int getNumReduceTasksStarted() {
      return numReduceTasksStarted_;
    }

    private void initFields() {
      status_ = 0;
      jobDone_ = false;
      totalMapTasks_ = 0;
      numMapTasksStarted_ = 0;
      totalReduceTasks_ = 0;
      numReduceTasksStarted_ = 0;
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
        output.writeBool(2, jobDone_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt32(3, totalMapTasks_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeInt32(4, numMapTasksStarted_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeInt32(5, totalReduceTasks_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        output.writeInt32(6, numReduceTasksStarted_);
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
          .computeBoolSize(2, jobDone_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, totalMapTasks_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(4, numMapTasksStarted_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(5, totalReduceTasks_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(6, numReduceTasksStarted_);
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

    public static MapReduce.JobStatusResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static MapReduce.JobStatusResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static MapReduce.JobStatusResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static MapReduce.JobStatusResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static MapReduce.JobStatusResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static MapReduce.JobStatusResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static MapReduce.JobStatusResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static MapReduce.JobStatusResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static MapReduce.JobStatusResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static MapReduce.JobStatusResponse parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(MapReduce.JobStatusResponse prototype) {
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
     * Protobuf type {@code JobStatusResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:JobStatusResponse)
        MapReduce.JobStatusResponseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return MapReduce.internal_static_JobStatusResponse_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return MapReduce.internal_static_JobStatusResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                MapReduce.JobStatusResponse.class, MapReduce.JobStatusResponse.Builder.class);
      }

      // Construct using MapReduce.JobStatusResponse.newBuilder()
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
        jobDone_ = false;
        bitField0_ = (bitField0_ & ~0x00000002);
        totalMapTasks_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        numMapTasksStarted_ = 0;
        bitField0_ = (bitField0_ & ~0x00000008);
        totalReduceTasks_ = 0;
        bitField0_ = (bitField0_ & ~0x00000010);
        numReduceTasksStarted_ = 0;
        bitField0_ = (bitField0_ & ~0x00000020);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return MapReduce.internal_static_JobStatusResponse_descriptor;
      }

      public MapReduce.JobStatusResponse getDefaultInstanceForType() {
        return MapReduce.JobStatusResponse.getDefaultInstance();
      }

      public MapReduce.JobStatusResponse build() {
        MapReduce.JobStatusResponse result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public MapReduce.JobStatusResponse buildPartial() {
        MapReduce.JobStatusResponse result = new MapReduce.JobStatusResponse(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.status_ = status_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.jobDone_ = jobDone_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.totalMapTasks_ = totalMapTasks_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.numMapTasksStarted_ = numMapTasksStarted_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.totalReduceTasks_ = totalReduceTasks_;
        if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
          to_bitField0_ |= 0x00000020;
        }
        result.numReduceTasksStarted_ = numReduceTasksStarted_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof MapReduce.JobStatusResponse) {
          return mergeFrom((MapReduce.JobStatusResponse)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(MapReduce.JobStatusResponse other) {
        if (other == MapReduce.JobStatusResponse.getDefaultInstance()) return this;
        if (other.hasStatus()) {
          setStatus(other.getStatus());
        }
        if (other.hasJobDone()) {
          setJobDone(other.getJobDone());
        }
        if (other.hasTotalMapTasks()) {
          setTotalMapTasks(other.getTotalMapTasks());
        }
        if (other.hasNumMapTasksStarted()) {
          setNumMapTasksStarted(other.getNumMapTasksStarted());
        }
        if (other.hasTotalReduceTasks()) {
          setTotalReduceTasks(other.getTotalReduceTasks());
        }
        if (other.hasNumReduceTasksStarted()) {
          setNumReduceTasksStarted(other.getNumReduceTasksStarted());
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
        MapReduce.JobStatusResponse parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (MapReduce.JobStatusResponse) e.getUnfinishedMessage();
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

      private boolean jobDone_ ;
      /**
       * <code>optional bool jobDone = 2;</code>
       */
      public boolean hasJobDone() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional bool jobDone = 2;</code>
       */
      public boolean getJobDone() {
        return jobDone_;
      }
      /**
       * <code>optional bool jobDone = 2;</code>
       */
      public Builder setJobDone(boolean value) {
        bitField0_ |= 0x00000002;
        jobDone_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bool jobDone = 2;</code>
       */
      public Builder clearJobDone() {
        bitField0_ = (bitField0_ & ~0x00000002);
        jobDone_ = false;
        onChanged();
        return this;
      }

      private int totalMapTasks_ ;
      /**
       * <code>optional int32 totalMapTasks = 3;</code>
       */
      public boolean hasTotalMapTasks() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional int32 totalMapTasks = 3;</code>
       */
      public int getTotalMapTasks() {
        return totalMapTasks_;
      }
      /**
       * <code>optional int32 totalMapTasks = 3;</code>
       */
      public Builder setTotalMapTasks(int value) {
        bitField0_ |= 0x00000004;
        totalMapTasks_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 totalMapTasks = 3;</code>
       */
      public Builder clearTotalMapTasks() {
        bitField0_ = (bitField0_ & ~0x00000004);
        totalMapTasks_ = 0;
        onChanged();
        return this;
      }

      private int numMapTasksStarted_ ;
      /**
       * <code>optional int32 numMapTasksStarted = 4;</code>
       */
      public boolean hasNumMapTasksStarted() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>optional int32 numMapTasksStarted = 4;</code>
       */
      public int getNumMapTasksStarted() {
        return numMapTasksStarted_;
      }
      /**
       * <code>optional int32 numMapTasksStarted = 4;</code>
       */
      public Builder setNumMapTasksStarted(int value) {
        bitField0_ |= 0x00000008;
        numMapTasksStarted_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 numMapTasksStarted = 4;</code>
       */
      public Builder clearNumMapTasksStarted() {
        bitField0_ = (bitField0_ & ~0x00000008);
        numMapTasksStarted_ = 0;
        onChanged();
        return this;
      }

      private int totalReduceTasks_ ;
      /**
       * <code>optional int32 totalReduceTasks = 5;</code>
       */
      public boolean hasTotalReduceTasks() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      /**
       * <code>optional int32 totalReduceTasks = 5;</code>
       */
      public int getTotalReduceTasks() {
        return totalReduceTasks_;
      }
      /**
       * <code>optional int32 totalReduceTasks = 5;</code>
       */
      public Builder setTotalReduceTasks(int value) {
        bitField0_ |= 0x00000010;
        totalReduceTasks_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 totalReduceTasks = 5;</code>
       */
      public Builder clearTotalReduceTasks() {
        bitField0_ = (bitField0_ & ~0x00000010);
        totalReduceTasks_ = 0;
        onChanged();
        return this;
      }

      private int numReduceTasksStarted_ ;
      /**
       * <code>optional int32 numReduceTasksStarted = 6;</code>
       */
      public boolean hasNumReduceTasksStarted() {
        return ((bitField0_ & 0x00000020) == 0x00000020);
      }
      /**
       * <code>optional int32 numReduceTasksStarted = 6;</code>
       */
      public int getNumReduceTasksStarted() {
        return numReduceTasksStarted_;
      }
      /**
       * <code>optional int32 numReduceTasksStarted = 6;</code>
       */
      public Builder setNumReduceTasksStarted(int value) {
        bitField0_ |= 0x00000020;
        numReduceTasksStarted_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 numReduceTasksStarted = 6;</code>
       */
      public Builder clearNumReduceTasksStarted() {
        bitField0_ = (bitField0_ & ~0x00000020);
        numReduceTasksStarted_ = 0;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:JobStatusResponse)
    }

    static {
      defaultInstance = new JobStatusResponse(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:JobStatusResponse)
  }

  public interface MapTaskStatusOrBuilder extends
      // @@protoc_insertion_point(interface_extends:MapTaskStatus)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional int32 jobId = 1;</code>
     */
    boolean hasJobId();
    /**
     * <code>optional int32 jobId = 1;</code>
     */
    int getJobId();

    /**
     * <code>optional int32 taskId = 2;</code>
     */
    boolean hasTaskId();
    /**
     * <code>optional int32 taskId = 2;</code>
     */
    int getTaskId();

    /**
     * <code>optional bool taskCompleted = 3;</code>
     */
    boolean hasTaskCompleted();
    /**
     * <code>optional bool taskCompleted = 3;</code>
     */
    boolean getTaskCompleted();

    /**
     * <code>optional string mapOutputFile = 4;</code>
     */
    boolean hasMapOutputFile();
    /**
     * <code>optional string mapOutputFile = 4;</code>
     */
    java.lang.String getMapOutputFile();
    /**
     * <code>optional string mapOutputFile = 4;</code>
     */
    com.google.protobuf.ByteString
        getMapOutputFileBytes();
  }
  /**
   * Protobuf type {@code MapTaskStatus}
   */
  public static final class MapTaskStatus extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:MapTaskStatus)
      MapTaskStatusOrBuilder {
    // Use MapTaskStatus.newBuilder() to construct.
    private MapTaskStatus(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private MapTaskStatus(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final MapTaskStatus defaultInstance;
    public static MapTaskStatus getDefaultInstance() {
      return defaultInstance;
    }

    public MapTaskStatus getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private MapTaskStatus(
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
              jobId_ = input.readInt32();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              taskId_ = input.readInt32();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              taskCompleted_ = input.readBool();
              break;
            }
            case 34: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000008;
              mapOutputFile_ = bs;
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
      return MapReduce.internal_static_MapTaskStatus_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return MapReduce.internal_static_MapTaskStatus_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              MapReduce.MapTaskStatus.class, MapReduce.MapTaskStatus.Builder.class);
    }

    public static com.google.protobuf.Parser<MapTaskStatus> PARSER =
        new com.google.protobuf.AbstractParser<MapTaskStatus>() {
      public MapTaskStatus parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new MapTaskStatus(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<MapTaskStatus> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int JOBID_FIELD_NUMBER = 1;
    private int jobId_;
    /**
     * <code>optional int32 jobId = 1;</code>
     */
    public boolean hasJobId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional int32 jobId = 1;</code>
     */
    public int getJobId() {
      return jobId_;
    }

    public static final int TASKID_FIELD_NUMBER = 2;
    private int taskId_;
    /**
     * <code>optional int32 taskId = 2;</code>
     */
    public boolean hasTaskId() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional int32 taskId = 2;</code>
     */
    public int getTaskId() {
      return taskId_;
    }

    public static final int TASKCOMPLETED_FIELD_NUMBER = 3;
    private boolean taskCompleted_;
    /**
     * <code>optional bool taskCompleted = 3;</code>
     */
    public boolean hasTaskCompleted() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional bool taskCompleted = 3;</code>
     */
    public boolean getTaskCompleted() {
      return taskCompleted_;
    }

    public static final int MAPOUTPUTFILE_FIELD_NUMBER = 4;
    private java.lang.Object mapOutputFile_;
    /**
     * <code>optional string mapOutputFile = 4;</code>
     */
    public boolean hasMapOutputFile() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>optional string mapOutputFile = 4;</code>
     */
    public java.lang.String getMapOutputFile() {
      java.lang.Object ref = mapOutputFile_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          mapOutputFile_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string mapOutputFile = 4;</code>
     */
    public com.google.protobuf.ByteString
        getMapOutputFileBytes() {
      java.lang.Object ref = mapOutputFile_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        mapOutputFile_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private void initFields() {
      jobId_ = 0;
      taskId_ = 0;
      taskCompleted_ = false;
      mapOutputFile_ = "";
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
        output.writeInt32(1, jobId_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, taskId_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeBool(3, taskCompleted_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeBytes(4, getMapOutputFileBytes());
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
          .computeInt32Size(1, jobId_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, taskId_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(3, taskCompleted_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(4, getMapOutputFileBytes());
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

    public static MapReduce.MapTaskStatus parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static MapReduce.MapTaskStatus parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static MapReduce.MapTaskStatus parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static MapReduce.MapTaskStatus parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static MapReduce.MapTaskStatus parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static MapReduce.MapTaskStatus parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static MapReduce.MapTaskStatus parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static MapReduce.MapTaskStatus parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static MapReduce.MapTaskStatus parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static MapReduce.MapTaskStatus parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(MapReduce.MapTaskStatus prototype) {
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
     * Protobuf type {@code MapTaskStatus}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:MapTaskStatus)
        MapReduce.MapTaskStatusOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return MapReduce.internal_static_MapTaskStatus_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return MapReduce.internal_static_MapTaskStatus_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                MapReduce.MapTaskStatus.class, MapReduce.MapTaskStatus.Builder.class);
      }

      // Construct using MapReduce.MapTaskStatus.newBuilder()
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
        jobId_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        taskId_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        taskCompleted_ = false;
        bitField0_ = (bitField0_ & ~0x00000004);
        mapOutputFile_ = "";
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return MapReduce.internal_static_MapTaskStatus_descriptor;
      }

      public MapReduce.MapTaskStatus getDefaultInstanceForType() {
        return MapReduce.MapTaskStatus.getDefaultInstance();
      }

      public MapReduce.MapTaskStatus build() {
        MapReduce.MapTaskStatus result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public MapReduce.MapTaskStatus buildPartial() {
        MapReduce.MapTaskStatus result = new MapReduce.MapTaskStatus(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.jobId_ = jobId_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.taskId_ = taskId_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.taskCompleted_ = taskCompleted_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.mapOutputFile_ = mapOutputFile_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof MapReduce.MapTaskStatus) {
          return mergeFrom((MapReduce.MapTaskStatus)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(MapReduce.MapTaskStatus other) {
        if (other == MapReduce.MapTaskStatus.getDefaultInstance()) return this;
        if (other.hasJobId()) {
          setJobId(other.getJobId());
        }
        if (other.hasTaskId()) {
          setTaskId(other.getTaskId());
        }
        if (other.hasTaskCompleted()) {
          setTaskCompleted(other.getTaskCompleted());
        }
        if (other.hasMapOutputFile()) {
          bitField0_ |= 0x00000008;
          mapOutputFile_ = other.mapOutputFile_;
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
        MapReduce.MapTaskStatus parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (MapReduce.MapTaskStatus) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int jobId_ ;
      /**
       * <code>optional int32 jobId = 1;</code>
       */
      public boolean hasJobId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional int32 jobId = 1;</code>
       */
      public int getJobId() {
        return jobId_;
      }
      /**
       * <code>optional int32 jobId = 1;</code>
       */
      public Builder setJobId(int value) {
        bitField0_ |= 0x00000001;
        jobId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 jobId = 1;</code>
       */
      public Builder clearJobId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        jobId_ = 0;
        onChanged();
        return this;
      }

      private int taskId_ ;
      /**
       * <code>optional int32 taskId = 2;</code>
       */
      public boolean hasTaskId() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional int32 taskId = 2;</code>
       */
      public int getTaskId() {
        return taskId_;
      }
      /**
       * <code>optional int32 taskId = 2;</code>
       */
      public Builder setTaskId(int value) {
        bitField0_ |= 0x00000002;
        taskId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 taskId = 2;</code>
       */
      public Builder clearTaskId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        taskId_ = 0;
        onChanged();
        return this;
      }

      private boolean taskCompleted_ ;
      /**
       * <code>optional bool taskCompleted = 3;</code>
       */
      public boolean hasTaskCompleted() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional bool taskCompleted = 3;</code>
       */
      public boolean getTaskCompleted() {
        return taskCompleted_;
      }
      /**
       * <code>optional bool taskCompleted = 3;</code>
       */
      public Builder setTaskCompleted(boolean value) {
        bitField0_ |= 0x00000004;
        taskCompleted_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bool taskCompleted = 3;</code>
       */
      public Builder clearTaskCompleted() {
        bitField0_ = (bitField0_ & ~0x00000004);
        taskCompleted_ = false;
        onChanged();
        return this;
      }

      private java.lang.Object mapOutputFile_ = "";
      /**
       * <code>optional string mapOutputFile = 4;</code>
       */
      public boolean hasMapOutputFile() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>optional string mapOutputFile = 4;</code>
       */
      public java.lang.String getMapOutputFile() {
        java.lang.Object ref = mapOutputFile_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            mapOutputFile_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string mapOutputFile = 4;</code>
       */
      public com.google.protobuf.ByteString
          getMapOutputFileBytes() {
        java.lang.Object ref = mapOutputFile_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          mapOutputFile_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string mapOutputFile = 4;</code>
       */
      public Builder setMapOutputFile(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        mapOutputFile_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string mapOutputFile = 4;</code>
       */
      public Builder clearMapOutputFile() {
        bitField0_ = (bitField0_ & ~0x00000008);
        mapOutputFile_ = getDefaultInstance().getMapOutputFile();
        onChanged();
        return this;
      }
      /**
       * <code>optional string mapOutputFile = 4;</code>
       */
      public Builder setMapOutputFileBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        mapOutputFile_ = value;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:MapTaskStatus)
    }

    static {
      defaultInstance = new MapTaskStatus(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:MapTaskStatus)
  }

  public interface ReduceTaskStatusOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ReduceTaskStatus)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional int32 jobId = 1;</code>
     */
    boolean hasJobId();
    /**
     * <code>optional int32 jobId = 1;</code>
     */
    int getJobId();

    /**
     * <code>optional int32 taskId = 2;</code>
     */
    boolean hasTaskId();
    /**
     * <code>optional int32 taskId = 2;</code>
     */
    int getTaskId();

    /**
     * <code>optional bool taskCompleted = 3;</code>
     */
    boolean hasTaskCompleted();
    /**
     * <code>optional bool taskCompleted = 3;</code>
     */
    boolean getTaskCompleted();
  }
  /**
   * Protobuf type {@code ReduceTaskStatus}
   */
  public static final class ReduceTaskStatus extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:ReduceTaskStatus)
      ReduceTaskStatusOrBuilder {
    // Use ReduceTaskStatus.newBuilder() to construct.
    private ReduceTaskStatus(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private ReduceTaskStatus(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final ReduceTaskStatus defaultInstance;
    public static ReduceTaskStatus getDefaultInstance() {
      return defaultInstance;
    }

    public ReduceTaskStatus getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private ReduceTaskStatus(
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
              jobId_ = input.readInt32();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              taskId_ = input.readInt32();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              taskCompleted_ = input.readBool();
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
      return MapReduce.internal_static_ReduceTaskStatus_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return MapReduce.internal_static_ReduceTaskStatus_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              MapReduce.ReduceTaskStatus.class, MapReduce.ReduceTaskStatus.Builder.class);
    }

    public static com.google.protobuf.Parser<ReduceTaskStatus> PARSER =
        new com.google.protobuf.AbstractParser<ReduceTaskStatus>() {
      public ReduceTaskStatus parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ReduceTaskStatus(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<ReduceTaskStatus> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int JOBID_FIELD_NUMBER = 1;
    private int jobId_;
    /**
     * <code>optional int32 jobId = 1;</code>
     */
    public boolean hasJobId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional int32 jobId = 1;</code>
     */
    public int getJobId() {
      return jobId_;
    }

    public static final int TASKID_FIELD_NUMBER = 2;
    private int taskId_;
    /**
     * <code>optional int32 taskId = 2;</code>
     */
    public boolean hasTaskId() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional int32 taskId = 2;</code>
     */
    public int getTaskId() {
      return taskId_;
    }

    public static final int TASKCOMPLETED_FIELD_NUMBER = 3;
    private boolean taskCompleted_;
    /**
     * <code>optional bool taskCompleted = 3;</code>
     */
    public boolean hasTaskCompleted() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional bool taskCompleted = 3;</code>
     */
    public boolean getTaskCompleted() {
      return taskCompleted_;
    }

    private void initFields() {
      jobId_ = 0;
      taskId_ = 0;
      taskCompleted_ = false;
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
        output.writeInt32(1, jobId_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, taskId_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeBool(3, taskCompleted_);
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
          .computeInt32Size(1, jobId_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, taskId_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(3, taskCompleted_);
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

    public static MapReduce.ReduceTaskStatus parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static MapReduce.ReduceTaskStatus parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static MapReduce.ReduceTaskStatus parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static MapReduce.ReduceTaskStatus parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static MapReduce.ReduceTaskStatus parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static MapReduce.ReduceTaskStatus parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static MapReduce.ReduceTaskStatus parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static MapReduce.ReduceTaskStatus parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static MapReduce.ReduceTaskStatus parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static MapReduce.ReduceTaskStatus parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(MapReduce.ReduceTaskStatus prototype) {
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
     * Protobuf type {@code ReduceTaskStatus}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ReduceTaskStatus)
        MapReduce.ReduceTaskStatusOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return MapReduce.internal_static_ReduceTaskStatus_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return MapReduce.internal_static_ReduceTaskStatus_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                MapReduce.ReduceTaskStatus.class, MapReduce.ReduceTaskStatus.Builder.class);
      }

      // Construct using MapReduce.ReduceTaskStatus.newBuilder()
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
        jobId_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        taskId_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        taskCompleted_ = false;
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return MapReduce.internal_static_ReduceTaskStatus_descriptor;
      }

      public MapReduce.ReduceTaskStatus getDefaultInstanceForType() {
        return MapReduce.ReduceTaskStatus.getDefaultInstance();
      }

      public MapReduce.ReduceTaskStatus build() {
        MapReduce.ReduceTaskStatus result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public MapReduce.ReduceTaskStatus buildPartial() {
        MapReduce.ReduceTaskStatus result = new MapReduce.ReduceTaskStatus(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.jobId_ = jobId_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.taskId_ = taskId_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.taskCompleted_ = taskCompleted_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof MapReduce.ReduceTaskStatus) {
          return mergeFrom((MapReduce.ReduceTaskStatus)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(MapReduce.ReduceTaskStatus other) {
        if (other == MapReduce.ReduceTaskStatus.getDefaultInstance()) return this;
        if (other.hasJobId()) {
          setJobId(other.getJobId());
        }
        if (other.hasTaskId()) {
          setTaskId(other.getTaskId());
        }
        if (other.hasTaskCompleted()) {
          setTaskCompleted(other.getTaskCompleted());
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
        MapReduce.ReduceTaskStatus parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (MapReduce.ReduceTaskStatus) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int jobId_ ;
      /**
       * <code>optional int32 jobId = 1;</code>
       */
      public boolean hasJobId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional int32 jobId = 1;</code>
       */
      public int getJobId() {
        return jobId_;
      }
      /**
       * <code>optional int32 jobId = 1;</code>
       */
      public Builder setJobId(int value) {
        bitField0_ |= 0x00000001;
        jobId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 jobId = 1;</code>
       */
      public Builder clearJobId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        jobId_ = 0;
        onChanged();
        return this;
      }

      private int taskId_ ;
      /**
       * <code>optional int32 taskId = 2;</code>
       */
      public boolean hasTaskId() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional int32 taskId = 2;</code>
       */
      public int getTaskId() {
        return taskId_;
      }
      /**
       * <code>optional int32 taskId = 2;</code>
       */
      public Builder setTaskId(int value) {
        bitField0_ |= 0x00000002;
        taskId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 taskId = 2;</code>
       */
      public Builder clearTaskId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        taskId_ = 0;
        onChanged();
        return this;
      }

      private boolean taskCompleted_ ;
      /**
       * <code>optional bool taskCompleted = 3;</code>
       */
      public boolean hasTaskCompleted() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional bool taskCompleted = 3;</code>
       */
      public boolean getTaskCompleted() {
        return taskCompleted_;
      }
      /**
       * <code>optional bool taskCompleted = 3;</code>
       */
      public Builder setTaskCompleted(boolean value) {
        bitField0_ |= 0x00000004;
        taskCompleted_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bool taskCompleted = 3;</code>
       */
      public Builder clearTaskCompleted() {
        bitField0_ = (bitField0_ & ~0x00000004);
        taskCompleted_ = false;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:ReduceTaskStatus)
    }

    static {
      defaultInstance = new ReduceTaskStatus(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:ReduceTaskStatus)
  }

  public interface HeartBeatRequestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:HeartBeatRequest)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional int32 taskTrackerId = 1;</code>
     */
    boolean hasTaskTrackerId();
    /**
     * <code>optional int32 taskTrackerId = 1;</code>
     */
    int getTaskTrackerId();

    /**
     * <code>optional int32 numMapSlotsFree = 2;</code>
     */
    boolean hasNumMapSlotsFree();
    /**
     * <code>optional int32 numMapSlotsFree = 2;</code>
     */
    int getNumMapSlotsFree();

    /**
     * <code>optional int32 numReduceSlotsFree = 3;</code>
     */
    boolean hasNumReduceSlotsFree();
    /**
     * <code>optional int32 numReduceSlotsFree = 3;</code>
     */
    int getNumReduceSlotsFree();

    /**
     * <code>repeated .MapTaskStatus mapStatus = 4;</code>
     */
    java.util.List<MapReduce.MapTaskStatus> 
        getMapStatusList();
    /**
     * <code>repeated .MapTaskStatus mapStatus = 4;</code>
     */
    MapReduce.MapTaskStatus getMapStatus(int index);
    /**
     * <code>repeated .MapTaskStatus mapStatus = 4;</code>
     */
    int getMapStatusCount();
    /**
     * <code>repeated .MapTaskStatus mapStatus = 4;</code>
     */
    java.util.List<? extends MapReduce.MapTaskStatusOrBuilder> 
        getMapStatusOrBuilderList();
    /**
     * <code>repeated .MapTaskStatus mapStatus = 4;</code>
     */
    MapReduce.MapTaskStatusOrBuilder getMapStatusOrBuilder(
        int index);

    /**
     * <code>repeated .ReduceTaskStatus reduceStatus = 5;</code>
     */
    java.util.List<MapReduce.ReduceTaskStatus> 
        getReduceStatusList();
    /**
     * <code>repeated .ReduceTaskStatus reduceStatus = 5;</code>
     */
    MapReduce.ReduceTaskStatus getReduceStatus(int index);
    /**
     * <code>repeated .ReduceTaskStatus reduceStatus = 5;</code>
     */
    int getReduceStatusCount();
    /**
     * <code>repeated .ReduceTaskStatus reduceStatus = 5;</code>
     */
    java.util.List<? extends MapReduce.ReduceTaskStatusOrBuilder> 
        getReduceStatusOrBuilderList();
    /**
     * <code>repeated .ReduceTaskStatus reduceStatus = 5;</code>
     */
    MapReduce.ReduceTaskStatusOrBuilder getReduceStatusOrBuilder(
        int index);
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
              taskTrackerId_ = input.readInt32();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              numMapSlotsFree_ = input.readInt32();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              numReduceSlotsFree_ = input.readInt32();
              break;
            }
            case 34: {
              if (!((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
                mapStatus_ = new java.util.ArrayList<MapReduce.MapTaskStatus>();
                mutable_bitField0_ |= 0x00000008;
              }
              mapStatus_.add(input.readMessage(MapReduce.MapTaskStatus.PARSER, extensionRegistry));
              break;
            }
            case 42: {
              if (!((mutable_bitField0_ & 0x00000010) == 0x00000010)) {
                reduceStatus_ = new java.util.ArrayList<MapReduce.ReduceTaskStatus>();
                mutable_bitField0_ |= 0x00000010;
              }
              reduceStatus_.add(input.readMessage(MapReduce.ReduceTaskStatus.PARSER, extensionRegistry));
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
        if (((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
          mapStatus_ = java.util.Collections.unmodifiableList(mapStatus_);
        }
        if (((mutable_bitField0_ & 0x00000010) == 0x00000010)) {
          reduceStatus_ = java.util.Collections.unmodifiableList(reduceStatus_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return MapReduce.internal_static_HeartBeatRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return MapReduce.internal_static_HeartBeatRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              MapReduce.HeartBeatRequest.class, MapReduce.HeartBeatRequest.Builder.class);
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
    public static final int TASKTRACKERID_FIELD_NUMBER = 1;
    private int taskTrackerId_;
    /**
     * <code>optional int32 taskTrackerId = 1;</code>
     */
    public boolean hasTaskTrackerId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional int32 taskTrackerId = 1;</code>
     */
    public int getTaskTrackerId() {
      return taskTrackerId_;
    }

    public static final int NUMMAPSLOTSFREE_FIELD_NUMBER = 2;
    private int numMapSlotsFree_;
    /**
     * <code>optional int32 numMapSlotsFree = 2;</code>
     */
    public boolean hasNumMapSlotsFree() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional int32 numMapSlotsFree = 2;</code>
     */
    public int getNumMapSlotsFree() {
      return numMapSlotsFree_;
    }

    public static final int NUMREDUCESLOTSFREE_FIELD_NUMBER = 3;
    private int numReduceSlotsFree_;
    /**
     * <code>optional int32 numReduceSlotsFree = 3;</code>
     */
    public boolean hasNumReduceSlotsFree() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional int32 numReduceSlotsFree = 3;</code>
     */
    public int getNumReduceSlotsFree() {
      return numReduceSlotsFree_;
    }

    public static final int MAPSTATUS_FIELD_NUMBER = 4;
    private java.util.List<MapReduce.MapTaskStatus> mapStatus_;
    /**
     * <code>repeated .MapTaskStatus mapStatus = 4;</code>
     */
    public java.util.List<MapReduce.MapTaskStatus> getMapStatusList() {
      return mapStatus_;
    }
    /**
     * <code>repeated .MapTaskStatus mapStatus = 4;</code>
     */
    public java.util.List<? extends MapReduce.MapTaskStatusOrBuilder> 
        getMapStatusOrBuilderList() {
      return mapStatus_;
    }
    /**
     * <code>repeated .MapTaskStatus mapStatus = 4;</code>
     */
    public int getMapStatusCount() {
      return mapStatus_.size();
    }
    /**
     * <code>repeated .MapTaskStatus mapStatus = 4;</code>
     */
    public MapReduce.MapTaskStatus getMapStatus(int index) {
      return mapStatus_.get(index);
    }
    /**
     * <code>repeated .MapTaskStatus mapStatus = 4;</code>
     */
    public MapReduce.MapTaskStatusOrBuilder getMapStatusOrBuilder(
        int index) {
      return mapStatus_.get(index);
    }

    public static final int REDUCESTATUS_FIELD_NUMBER = 5;
    private java.util.List<MapReduce.ReduceTaskStatus> reduceStatus_;
    /**
     * <code>repeated .ReduceTaskStatus reduceStatus = 5;</code>
     */
    public java.util.List<MapReduce.ReduceTaskStatus> getReduceStatusList() {
      return reduceStatus_;
    }
    /**
     * <code>repeated .ReduceTaskStatus reduceStatus = 5;</code>
     */
    public java.util.List<? extends MapReduce.ReduceTaskStatusOrBuilder> 
        getReduceStatusOrBuilderList() {
      return reduceStatus_;
    }
    /**
     * <code>repeated .ReduceTaskStatus reduceStatus = 5;</code>
     */
    public int getReduceStatusCount() {
      return reduceStatus_.size();
    }
    /**
     * <code>repeated .ReduceTaskStatus reduceStatus = 5;</code>
     */
    public MapReduce.ReduceTaskStatus getReduceStatus(int index) {
      return reduceStatus_.get(index);
    }
    /**
     * <code>repeated .ReduceTaskStatus reduceStatus = 5;</code>
     */
    public MapReduce.ReduceTaskStatusOrBuilder getReduceStatusOrBuilder(
        int index) {
      return reduceStatus_.get(index);
    }

    private void initFields() {
      taskTrackerId_ = 0;
      numMapSlotsFree_ = 0;
      numReduceSlotsFree_ = 0;
      mapStatus_ = java.util.Collections.emptyList();
      reduceStatus_ = java.util.Collections.emptyList();
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
        output.writeInt32(1, taskTrackerId_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, numMapSlotsFree_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt32(3, numReduceSlotsFree_);
      }
      for (int i = 0; i < mapStatus_.size(); i++) {
        output.writeMessage(4, mapStatus_.get(i));
      }
      for (int i = 0; i < reduceStatus_.size(); i++) {
        output.writeMessage(5, reduceStatus_.get(i));
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
          .computeInt32Size(1, taskTrackerId_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, numMapSlotsFree_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, numReduceSlotsFree_);
      }
      for (int i = 0; i < mapStatus_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(4, mapStatus_.get(i));
      }
      for (int i = 0; i < reduceStatus_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(5, reduceStatus_.get(i));
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

    public static MapReduce.HeartBeatRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static MapReduce.HeartBeatRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static MapReduce.HeartBeatRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static MapReduce.HeartBeatRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static MapReduce.HeartBeatRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static MapReduce.HeartBeatRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static MapReduce.HeartBeatRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static MapReduce.HeartBeatRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static MapReduce.HeartBeatRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static MapReduce.HeartBeatRequest parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(MapReduce.HeartBeatRequest prototype) {
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
        MapReduce.HeartBeatRequestOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return MapReduce.internal_static_HeartBeatRequest_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return MapReduce.internal_static_HeartBeatRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                MapReduce.HeartBeatRequest.class, MapReduce.HeartBeatRequest.Builder.class);
      }

      // Construct using MapReduce.HeartBeatRequest.newBuilder()
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
          getMapStatusFieldBuilder();
          getReduceStatusFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        taskTrackerId_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        numMapSlotsFree_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        numReduceSlotsFree_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        if (mapStatusBuilder_ == null) {
          mapStatus_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000008);
        } else {
          mapStatusBuilder_.clear();
        }
        if (reduceStatusBuilder_ == null) {
          reduceStatus_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000010);
        } else {
          reduceStatusBuilder_.clear();
        }
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return MapReduce.internal_static_HeartBeatRequest_descriptor;
      }

      public MapReduce.HeartBeatRequest getDefaultInstanceForType() {
        return MapReduce.HeartBeatRequest.getDefaultInstance();
      }

      public MapReduce.HeartBeatRequest build() {
        MapReduce.HeartBeatRequest result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public MapReduce.HeartBeatRequest buildPartial() {
        MapReduce.HeartBeatRequest result = new MapReduce.HeartBeatRequest(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.taskTrackerId_ = taskTrackerId_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.numMapSlotsFree_ = numMapSlotsFree_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.numReduceSlotsFree_ = numReduceSlotsFree_;
        if (mapStatusBuilder_ == null) {
          if (((bitField0_ & 0x00000008) == 0x00000008)) {
            mapStatus_ = java.util.Collections.unmodifiableList(mapStatus_);
            bitField0_ = (bitField0_ & ~0x00000008);
          }
          result.mapStatus_ = mapStatus_;
        } else {
          result.mapStatus_ = mapStatusBuilder_.build();
        }
        if (reduceStatusBuilder_ == null) {
          if (((bitField0_ & 0x00000010) == 0x00000010)) {
            reduceStatus_ = java.util.Collections.unmodifiableList(reduceStatus_);
            bitField0_ = (bitField0_ & ~0x00000010);
          }
          result.reduceStatus_ = reduceStatus_;
        } else {
          result.reduceStatus_ = reduceStatusBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof MapReduce.HeartBeatRequest) {
          return mergeFrom((MapReduce.HeartBeatRequest)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(MapReduce.HeartBeatRequest other) {
        if (other == MapReduce.HeartBeatRequest.getDefaultInstance()) return this;
        if (other.hasTaskTrackerId()) {
          setTaskTrackerId(other.getTaskTrackerId());
        }
        if (other.hasNumMapSlotsFree()) {
          setNumMapSlotsFree(other.getNumMapSlotsFree());
        }
        if (other.hasNumReduceSlotsFree()) {
          setNumReduceSlotsFree(other.getNumReduceSlotsFree());
        }
        if (mapStatusBuilder_ == null) {
          if (!other.mapStatus_.isEmpty()) {
            if (mapStatus_.isEmpty()) {
              mapStatus_ = other.mapStatus_;
              bitField0_ = (bitField0_ & ~0x00000008);
            } else {
              ensureMapStatusIsMutable();
              mapStatus_.addAll(other.mapStatus_);
            }
            onChanged();
          }
        } else {
          if (!other.mapStatus_.isEmpty()) {
            if (mapStatusBuilder_.isEmpty()) {
              mapStatusBuilder_.dispose();
              mapStatusBuilder_ = null;
              mapStatus_ = other.mapStatus_;
              bitField0_ = (bitField0_ & ~0x00000008);
              mapStatusBuilder_ = 
                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                   getMapStatusFieldBuilder() : null;
            } else {
              mapStatusBuilder_.addAllMessages(other.mapStatus_);
            }
          }
        }
        if (reduceStatusBuilder_ == null) {
          if (!other.reduceStatus_.isEmpty()) {
            if (reduceStatus_.isEmpty()) {
              reduceStatus_ = other.reduceStatus_;
              bitField0_ = (bitField0_ & ~0x00000010);
            } else {
              ensureReduceStatusIsMutable();
              reduceStatus_.addAll(other.reduceStatus_);
            }
            onChanged();
          }
        } else {
          if (!other.reduceStatus_.isEmpty()) {
            if (reduceStatusBuilder_.isEmpty()) {
              reduceStatusBuilder_.dispose();
              reduceStatusBuilder_ = null;
              reduceStatus_ = other.reduceStatus_;
              bitField0_ = (bitField0_ & ~0x00000010);
              reduceStatusBuilder_ = 
                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                   getReduceStatusFieldBuilder() : null;
            } else {
              reduceStatusBuilder_.addAllMessages(other.reduceStatus_);
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
        MapReduce.HeartBeatRequest parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (MapReduce.HeartBeatRequest) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int taskTrackerId_ ;
      /**
       * <code>optional int32 taskTrackerId = 1;</code>
       */
      public boolean hasTaskTrackerId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional int32 taskTrackerId = 1;</code>
       */
      public int getTaskTrackerId() {
        return taskTrackerId_;
      }
      /**
       * <code>optional int32 taskTrackerId = 1;</code>
       */
      public Builder setTaskTrackerId(int value) {
        bitField0_ |= 0x00000001;
        taskTrackerId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 taskTrackerId = 1;</code>
       */
      public Builder clearTaskTrackerId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        taskTrackerId_ = 0;
        onChanged();
        return this;
      }

      private int numMapSlotsFree_ ;
      /**
       * <code>optional int32 numMapSlotsFree = 2;</code>
       */
      public boolean hasNumMapSlotsFree() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional int32 numMapSlotsFree = 2;</code>
       */
      public int getNumMapSlotsFree() {
        return numMapSlotsFree_;
      }
      /**
       * <code>optional int32 numMapSlotsFree = 2;</code>
       */
      public Builder setNumMapSlotsFree(int value) {
        bitField0_ |= 0x00000002;
        numMapSlotsFree_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 numMapSlotsFree = 2;</code>
       */
      public Builder clearNumMapSlotsFree() {
        bitField0_ = (bitField0_ & ~0x00000002);
        numMapSlotsFree_ = 0;
        onChanged();
        return this;
      }

      private int numReduceSlotsFree_ ;
      /**
       * <code>optional int32 numReduceSlotsFree = 3;</code>
       */
      public boolean hasNumReduceSlotsFree() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional int32 numReduceSlotsFree = 3;</code>
       */
      public int getNumReduceSlotsFree() {
        return numReduceSlotsFree_;
      }
      /**
       * <code>optional int32 numReduceSlotsFree = 3;</code>
       */
      public Builder setNumReduceSlotsFree(int value) {
        bitField0_ |= 0x00000004;
        numReduceSlotsFree_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 numReduceSlotsFree = 3;</code>
       */
      public Builder clearNumReduceSlotsFree() {
        bitField0_ = (bitField0_ & ~0x00000004);
        numReduceSlotsFree_ = 0;
        onChanged();
        return this;
      }

      private java.util.List<MapReduce.MapTaskStatus> mapStatus_ =
        java.util.Collections.emptyList();
      private void ensureMapStatusIsMutable() {
        if (!((bitField0_ & 0x00000008) == 0x00000008)) {
          mapStatus_ = new java.util.ArrayList<MapReduce.MapTaskStatus>(mapStatus_);
          bitField0_ |= 0x00000008;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilder<
          MapReduce.MapTaskStatus, MapReduce.MapTaskStatus.Builder, MapReduce.MapTaskStatusOrBuilder> mapStatusBuilder_;

      /**
       * <code>repeated .MapTaskStatus mapStatus = 4;</code>
       */
      public java.util.List<MapReduce.MapTaskStatus> getMapStatusList() {
        if (mapStatusBuilder_ == null) {
          return java.util.Collections.unmodifiableList(mapStatus_);
        } else {
          return mapStatusBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .MapTaskStatus mapStatus = 4;</code>
       */
      public int getMapStatusCount() {
        if (mapStatusBuilder_ == null) {
          return mapStatus_.size();
        } else {
          return mapStatusBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .MapTaskStatus mapStatus = 4;</code>
       */
      public MapReduce.MapTaskStatus getMapStatus(int index) {
        if (mapStatusBuilder_ == null) {
          return mapStatus_.get(index);
        } else {
          return mapStatusBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .MapTaskStatus mapStatus = 4;</code>
       */
      public Builder setMapStatus(
          int index, MapReduce.MapTaskStatus value) {
        if (mapStatusBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureMapStatusIsMutable();
          mapStatus_.set(index, value);
          onChanged();
        } else {
          mapStatusBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .MapTaskStatus mapStatus = 4;</code>
       */
      public Builder setMapStatus(
          int index, MapReduce.MapTaskStatus.Builder builderForValue) {
        if (mapStatusBuilder_ == null) {
          ensureMapStatusIsMutable();
          mapStatus_.set(index, builderForValue.build());
          onChanged();
        } else {
          mapStatusBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .MapTaskStatus mapStatus = 4;</code>
       */
      public Builder addMapStatus(MapReduce.MapTaskStatus value) {
        if (mapStatusBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureMapStatusIsMutable();
          mapStatus_.add(value);
          onChanged();
        } else {
          mapStatusBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .MapTaskStatus mapStatus = 4;</code>
       */
      public Builder addMapStatus(
          int index, MapReduce.MapTaskStatus value) {
        if (mapStatusBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureMapStatusIsMutable();
          mapStatus_.add(index, value);
          onChanged();
        } else {
          mapStatusBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .MapTaskStatus mapStatus = 4;</code>
       */
      public Builder addMapStatus(
          MapReduce.MapTaskStatus.Builder builderForValue) {
        if (mapStatusBuilder_ == null) {
          ensureMapStatusIsMutable();
          mapStatus_.add(builderForValue.build());
          onChanged();
        } else {
          mapStatusBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .MapTaskStatus mapStatus = 4;</code>
       */
      public Builder addMapStatus(
          int index, MapReduce.MapTaskStatus.Builder builderForValue) {
        if (mapStatusBuilder_ == null) {
          ensureMapStatusIsMutable();
          mapStatus_.add(index, builderForValue.build());
          onChanged();
        } else {
          mapStatusBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .MapTaskStatus mapStatus = 4;</code>
       */
      public Builder addAllMapStatus(
          java.lang.Iterable<? extends MapReduce.MapTaskStatus> values) {
        if (mapStatusBuilder_ == null) {
          ensureMapStatusIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, mapStatus_);
          onChanged();
        } else {
          mapStatusBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .MapTaskStatus mapStatus = 4;</code>
       */
      public Builder clearMapStatus() {
        if (mapStatusBuilder_ == null) {
          mapStatus_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000008);
          onChanged();
        } else {
          mapStatusBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .MapTaskStatus mapStatus = 4;</code>
       */
      public Builder removeMapStatus(int index) {
        if (mapStatusBuilder_ == null) {
          ensureMapStatusIsMutable();
          mapStatus_.remove(index);
          onChanged();
        } else {
          mapStatusBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .MapTaskStatus mapStatus = 4;</code>
       */
      public MapReduce.MapTaskStatus.Builder getMapStatusBuilder(
          int index) {
        return getMapStatusFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .MapTaskStatus mapStatus = 4;</code>
       */
      public MapReduce.MapTaskStatusOrBuilder getMapStatusOrBuilder(
          int index) {
        if (mapStatusBuilder_ == null) {
          return mapStatus_.get(index);  } else {
          return mapStatusBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .MapTaskStatus mapStatus = 4;</code>
       */
      public java.util.List<? extends MapReduce.MapTaskStatusOrBuilder> 
           getMapStatusOrBuilderList() {
        if (mapStatusBuilder_ != null) {
          return mapStatusBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(mapStatus_);
        }
      }
      /**
       * <code>repeated .MapTaskStatus mapStatus = 4;</code>
       */
      public MapReduce.MapTaskStatus.Builder addMapStatusBuilder() {
        return getMapStatusFieldBuilder().addBuilder(
            MapReduce.MapTaskStatus.getDefaultInstance());
      }
      /**
       * <code>repeated .MapTaskStatus mapStatus = 4;</code>
       */
      public MapReduce.MapTaskStatus.Builder addMapStatusBuilder(
          int index) {
        return getMapStatusFieldBuilder().addBuilder(
            index, MapReduce.MapTaskStatus.getDefaultInstance());
      }
      /**
       * <code>repeated .MapTaskStatus mapStatus = 4;</code>
       */
      public java.util.List<MapReduce.MapTaskStatus.Builder> 
           getMapStatusBuilderList() {
        return getMapStatusFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          MapReduce.MapTaskStatus, MapReduce.MapTaskStatus.Builder, MapReduce.MapTaskStatusOrBuilder> 
          getMapStatusFieldBuilder() {
        if (mapStatusBuilder_ == null) {
          mapStatusBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              MapReduce.MapTaskStatus, MapReduce.MapTaskStatus.Builder, MapReduce.MapTaskStatusOrBuilder>(
                  mapStatus_,
                  ((bitField0_ & 0x00000008) == 0x00000008),
                  getParentForChildren(),
                  isClean());
          mapStatus_ = null;
        }
        return mapStatusBuilder_;
      }

      private java.util.List<MapReduce.ReduceTaskStatus> reduceStatus_ =
        java.util.Collections.emptyList();
      private void ensureReduceStatusIsMutable() {
        if (!((bitField0_ & 0x00000010) == 0x00000010)) {
          reduceStatus_ = new java.util.ArrayList<MapReduce.ReduceTaskStatus>(reduceStatus_);
          bitField0_ |= 0x00000010;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilder<
          MapReduce.ReduceTaskStatus, MapReduce.ReduceTaskStatus.Builder, MapReduce.ReduceTaskStatusOrBuilder> reduceStatusBuilder_;

      /**
       * <code>repeated .ReduceTaskStatus reduceStatus = 5;</code>
       */
      public java.util.List<MapReduce.ReduceTaskStatus> getReduceStatusList() {
        if (reduceStatusBuilder_ == null) {
          return java.util.Collections.unmodifiableList(reduceStatus_);
        } else {
          return reduceStatusBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .ReduceTaskStatus reduceStatus = 5;</code>
       */
      public int getReduceStatusCount() {
        if (reduceStatusBuilder_ == null) {
          return reduceStatus_.size();
        } else {
          return reduceStatusBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .ReduceTaskStatus reduceStatus = 5;</code>
       */
      public MapReduce.ReduceTaskStatus getReduceStatus(int index) {
        if (reduceStatusBuilder_ == null) {
          return reduceStatus_.get(index);
        } else {
          return reduceStatusBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .ReduceTaskStatus reduceStatus = 5;</code>
       */
      public Builder setReduceStatus(
          int index, MapReduce.ReduceTaskStatus value) {
        if (reduceStatusBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureReduceStatusIsMutable();
          reduceStatus_.set(index, value);
          onChanged();
        } else {
          reduceStatusBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .ReduceTaskStatus reduceStatus = 5;</code>
       */
      public Builder setReduceStatus(
          int index, MapReduce.ReduceTaskStatus.Builder builderForValue) {
        if (reduceStatusBuilder_ == null) {
          ensureReduceStatusIsMutable();
          reduceStatus_.set(index, builderForValue.build());
          onChanged();
        } else {
          reduceStatusBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .ReduceTaskStatus reduceStatus = 5;</code>
       */
      public Builder addReduceStatus(MapReduce.ReduceTaskStatus value) {
        if (reduceStatusBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureReduceStatusIsMutable();
          reduceStatus_.add(value);
          onChanged();
        } else {
          reduceStatusBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .ReduceTaskStatus reduceStatus = 5;</code>
       */
      public Builder addReduceStatus(
          int index, MapReduce.ReduceTaskStatus value) {
        if (reduceStatusBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureReduceStatusIsMutable();
          reduceStatus_.add(index, value);
          onChanged();
        } else {
          reduceStatusBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .ReduceTaskStatus reduceStatus = 5;</code>
       */
      public Builder addReduceStatus(
          MapReduce.ReduceTaskStatus.Builder builderForValue) {
        if (reduceStatusBuilder_ == null) {
          ensureReduceStatusIsMutable();
          reduceStatus_.add(builderForValue.build());
          onChanged();
        } else {
          reduceStatusBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .ReduceTaskStatus reduceStatus = 5;</code>
       */
      public Builder addReduceStatus(
          int index, MapReduce.ReduceTaskStatus.Builder builderForValue) {
        if (reduceStatusBuilder_ == null) {
          ensureReduceStatusIsMutable();
          reduceStatus_.add(index, builderForValue.build());
          onChanged();
        } else {
          reduceStatusBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .ReduceTaskStatus reduceStatus = 5;</code>
       */
      public Builder addAllReduceStatus(
          java.lang.Iterable<? extends MapReduce.ReduceTaskStatus> values) {
        if (reduceStatusBuilder_ == null) {
          ensureReduceStatusIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, reduceStatus_);
          onChanged();
        } else {
          reduceStatusBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .ReduceTaskStatus reduceStatus = 5;</code>
       */
      public Builder clearReduceStatus() {
        if (reduceStatusBuilder_ == null) {
          reduceStatus_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000010);
          onChanged();
        } else {
          reduceStatusBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .ReduceTaskStatus reduceStatus = 5;</code>
       */
      public Builder removeReduceStatus(int index) {
        if (reduceStatusBuilder_ == null) {
          ensureReduceStatusIsMutable();
          reduceStatus_.remove(index);
          onChanged();
        } else {
          reduceStatusBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .ReduceTaskStatus reduceStatus = 5;</code>
       */
      public MapReduce.ReduceTaskStatus.Builder getReduceStatusBuilder(
          int index) {
        return getReduceStatusFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .ReduceTaskStatus reduceStatus = 5;</code>
       */
      public MapReduce.ReduceTaskStatusOrBuilder getReduceStatusOrBuilder(
          int index) {
        if (reduceStatusBuilder_ == null) {
          return reduceStatus_.get(index);  } else {
          return reduceStatusBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .ReduceTaskStatus reduceStatus = 5;</code>
       */
      public java.util.List<? extends MapReduce.ReduceTaskStatusOrBuilder> 
           getReduceStatusOrBuilderList() {
        if (reduceStatusBuilder_ != null) {
          return reduceStatusBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(reduceStatus_);
        }
      }
      /**
       * <code>repeated .ReduceTaskStatus reduceStatus = 5;</code>
       */
      public MapReduce.ReduceTaskStatus.Builder addReduceStatusBuilder() {
        return getReduceStatusFieldBuilder().addBuilder(
            MapReduce.ReduceTaskStatus.getDefaultInstance());
      }
      /**
       * <code>repeated .ReduceTaskStatus reduceStatus = 5;</code>
       */
      public MapReduce.ReduceTaskStatus.Builder addReduceStatusBuilder(
          int index) {
        return getReduceStatusFieldBuilder().addBuilder(
            index, MapReduce.ReduceTaskStatus.getDefaultInstance());
      }
      /**
       * <code>repeated .ReduceTaskStatus reduceStatus = 5;</code>
       */
      public java.util.List<MapReduce.ReduceTaskStatus.Builder> 
           getReduceStatusBuilderList() {
        return getReduceStatusFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          MapReduce.ReduceTaskStatus, MapReduce.ReduceTaskStatus.Builder, MapReduce.ReduceTaskStatusOrBuilder> 
          getReduceStatusFieldBuilder() {
        if (reduceStatusBuilder_ == null) {
          reduceStatusBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              MapReduce.ReduceTaskStatus, MapReduce.ReduceTaskStatus.Builder, MapReduce.ReduceTaskStatusOrBuilder>(
                  reduceStatus_,
                  ((bitField0_ & 0x00000010) == 0x00000010),
                  getParentForChildren(),
                  isClean());
          reduceStatus_ = null;
        }
        return reduceStatusBuilder_;
      }

      // @@protoc_insertion_point(builder_scope:HeartBeatRequest)
    }

    static {
      defaultInstance = new HeartBeatRequest(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:HeartBeatRequest)
  }

  public interface MapTaskInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:MapTaskInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional int32 jobId = 1;</code>
     */
    boolean hasJobId();
    /**
     * <code>optional int32 jobId = 1;</code>
     */
    int getJobId();

    /**
     * <code>optional int32 taskId = 2;</code>
     */
    boolean hasTaskId();
    /**
     * <code>optional int32 taskId = 2;</code>
     */
    int getTaskId();

    /**
     * <code>optional string mapName = 3;</code>
     */
    boolean hasMapName();
    /**
     * <code>optional string mapName = 3;</code>
     */
    java.lang.String getMapName();
    /**
     * <code>optional string mapName = 3;</code>
     */
    com.google.protobuf.ByteString
        getMapNameBytes();

    /**
     * <code>repeated int32 inputBlocks = 4;</code>
     */
    java.util.List<java.lang.Integer> getInputBlocksList();
    /**
     * <code>repeated int32 inputBlocks = 4;</code>
     */
    int getInputBlocksCount();
    /**
     * <code>repeated int32 inputBlocks = 4;</code>
     */
    int getInputBlocks(int index);
  }
  /**
   * Protobuf type {@code MapTaskInfo}
   */
  public static final class MapTaskInfo extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:MapTaskInfo)
      MapTaskInfoOrBuilder {
    // Use MapTaskInfo.newBuilder() to construct.
    private MapTaskInfo(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private MapTaskInfo(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final MapTaskInfo defaultInstance;
    public static MapTaskInfo getDefaultInstance() {
      return defaultInstance;
    }

    public MapTaskInfo getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private MapTaskInfo(
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
              jobId_ = input.readInt32();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              taskId_ = input.readInt32();
              break;
            }
            case 26: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000004;
              mapName_ = bs;
              break;
            }
            case 32: {
              if (!((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
                inputBlocks_ = new java.util.ArrayList<java.lang.Integer>();
                mutable_bitField0_ |= 0x00000008;
              }
              inputBlocks_.add(input.readInt32());
              break;
            }
            case 34: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000008) == 0x00000008) && input.getBytesUntilLimit() > 0) {
                inputBlocks_ = new java.util.ArrayList<java.lang.Integer>();
                mutable_bitField0_ |= 0x00000008;
              }
              while (input.getBytesUntilLimit() > 0) {
                inputBlocks_.add(input.readInt32());
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
        if (((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
          inputBlocks_ = java.util.Collections.unmodifiableList(inputBlocks_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return MapReduce.internal_static_MapTaskInfo_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return MapReduce.internal_static_MapTaskInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              MapReduce.MapTaskInfo.class, MapReduce.MapTaskInfo.Builder.class);
    }

    public static com.google.protobuf.Parser<MapTaskInfo> PARSER =
        new com.google.protobuf.AbstractParser<MapTaskInfo>() {
      public MapTaskInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new MapTaskInfo(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<MapTaskInfo> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int JOBID_FIELD_NUMBER = 1;
    private int jobId_;
    /**
     * <code>optional int32 jobId = 1;</code>
     */
    public boolean hasJobId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional int32 jobId = 1;</code>
     */
    public int getJobId() {
      return jobId_;
    }

    public static final int TASKID_FIELD_NUMBER = 2;
    private int taskId_;
    /**
     * <code>optional int32 taskId = 2;</code>
     */
    public boolean hasTaskId() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional int32 taskId = 2;</code>
     */
    public int getTaskId() {
      return taskId_;
    }

    public static final int MAPNAME_FIELD_NUMBER = 3;
    private java.lang.Object mapName_;
    /**
     * <code>optional string mapName = 3;</code>
     */
    public boolean hasMapName() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional string mapName = 3;</code>
     */
    public java.lang.String getMapName() {
      java.lang.Object ref = mapName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          mapName_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string mapName = 3;</code>
     */
    public com.google.protobuf.ByteString
        getMapNameBytes() {
      java.lang.Object ref = mapName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        mapName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int INPUTBLOCKS_FIELD_NUMBER = 4;
    private java.util.List<java.lang.Integer> inputBlocks_;
    /**
     * <code>repeated int32 inputBlocks = 4;</code>
     */
    public java.util.List<java.lang.Integer>
        getInputBlocksList() {
      return inputBlocks_;
    }
    /**
     * <code>repeated int32 inputBlocks = 4;</code>
     */
    public int getInputBlocksCount() {
      return inputBlocks_.size();
    }
    /**
     * <code>repeated int32 inputBlocks = 4;</code>
     */
    public int getInputBlocks(int index) {
      return inputBlocks_.get(index);
    }

    private void initFields() {
      jobId_ = 0;
      taskId_ = 0;
      mapName_ = "";
      inputBlocks_ = java.util.Collections.emptyList();
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
        output.writeInt32(1, jobId_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, taskId_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeBytes(3, getMapNameBytes());
      }
      for (int i = 0; i < inputBlocks_.size(); i++) {
        output.writeInt32(4, inputBlocks_.get(i));
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
          .computeInt32Size(1, jobId_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, taskId_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(3, getMapNameBytes());
      }
      {
        int dataSize = 0;
        for (int i = 0; i < inputBlocks_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(inputBlocks_.get(i));
        }
        size += dataSize;
        size += 1 * getInputBlocksList().size();
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

    public static MapReduce.MapTaskInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static MapReduce.MapTaskInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static MapReduce.MapTaskInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static MapReduce.MapTaskInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static MapReduce.MapTaskInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static MapReduce.MapTaskInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static MapReduce.MapTaskInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static MapReduce.MapTaskInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static MapReduce.MapTaskInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static MapReduce.MapTaskInfo parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(MapReduce.MapTaskInfo prototype) {
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
     * Protobuf type {@code MapTaskInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:MapTaskInfo)
        MapReduce.MapTaskInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return MapReduce.internal_static_MapTaskInfo_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return MapReduce.internal_static_MapTaskInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                MapReduce.MapTaskInfo.class, MapReduce.MapTaskInfo.Builder.class);
      }

      // Construct using MapReduce.MapTaskInfo.newBuilder()
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
        jobId_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        taskId_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        mapName_ = "";
        bitField0_ = (bitField0_ & ~0x00000004);
        inputBlocks_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return MapReduce.internal_static_MapTaskInfo_descriptor;
      }

      public MapReduce.MapTaskInfo getDefaultInstanceForType() {
        return MapReduce.MapTaskInfo.getDefaultInstance();
      }

      public MapReduce.MapTaskInfo build() {
        MapReduce.MapTaskInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public MapReduce.MapTaskInfo buildPartial() {
        MapReduce.MapTaskInfo result = new MapReduce.MapTaskInfo(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.jobId_ = jobId_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.taskId_ = taskId_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.mapName_ = mapName_;
        if (((bitField0_ & 0x00000008) == 0x00000008)) {
          inputBlocks_ = java.util.Collections.unmodifiableList(inputBlocks_);
          bitField0_ = (bitField0_ & ~0x00000008);
        }
        result.inputBlocks_ = inputBlocks_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof MapReduce.MapTaskInfo) {
          return mergeFrom((MapReduce.MapTaskInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(MapReduce.MapTaskInfo other) {
        if (other == MapReduce.MapTaskInfo.getDefaultInstance()) return this;
        if (other.hasJobId()) {
          setJobId(other.getJobId());
        }
        if (other.hasTaskId()) {
          setTaskId(other.getTaskId());
        }
        if (other.hasMapName()) {
          bitField0_ |= 0x00000004;
          mapName_ = other.mapName_;
          onChanged();
        }
        if (!other.inputBlocks_.isEmpty()) {
          if (inputBlocks_.isEmpty()) {
            inputBlocks_ = other.inputBlocks_;
            bitField0_ = (bitField0_ & ~0x00000008);
          } else {
            ensureInputBlocksIsMutable();
            inputBlocks_.addAll(other.inputBlocks_);
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
        MapReduce.MapTaskInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (MapReduce.MapTaskInfo) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int jobId_ ;
      /**
       * <code>optional int32 jobId = 1;</code>
       */
      public boolean hasJobId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional int32 jobId = 1;</code>
       */
      public int getJobId() {
        return jobId_;
      }
      /**
       * <code>optional int32 jobId = 1;</code>
       */
      public Builder setJobId(int value) {
        bitField0_ |= 0x00000001;
        jobId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 jobId = 1;</code>
       */
      public Builder clearJobId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        jobId_ = 0;
        onChanged();
        return this;
      }

      private int taskId_ ;
      /**
       * <code>optional int32 taskId = 2;</code>
       */
      public boolean hasTaskId() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional int32 taskId = 2;</code>
       */
      public int getTaskId() {
        return taskId_;
      }
      /**
       * <code>optional int32 taskId = 2;</code>
       */
      public Builder setTaskId(int value) {
        bitField0_ |= 0x00000002;
        taskId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 taskId = 2;</code>
       */
      public Builder clearTaskId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        taskId_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object mapName_ = "";
      /**
       * <code>optional string mapName = 3;</code>
       */
      public boolean hasMapName() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional string mapName = 3;</code>
       */
      public java.lang.String getMapName() {
        java.lang.Object ref = mapName_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            mapName_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string mapName = 3;</code>
       */
      public com.google.protobuf.ByteString
          getMapNameBytes() {
        java.lang.Object ref = mapName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          mapName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string mapName = 3;</code>
       */
      public Builder setMapName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        mapName_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string mapName = 3;</code>
       */
      public Builder clearMapName() {
        bitField0_ = (bitField0_ & ~0x00000004);
        mapName_ = getDefaultInstance().getMapName();
        onChanged();
        return this;
      }
      /**
       * <code>optional string mapName = 3;</code>
       */
      public Builder setMapNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        mapName_ = value;
        onChanged();
        return this;
      }

      private java.util.List<java.lang.Integer> inputBlocks_ = java.util.Collections.emptyList();
      private void ensureInputBlocksIsMutable() {
        if (!((bitField0_ & 0x00000008) == 0x00000008)) {
          inputBlocks_ = new java.util.ArrayList<java.lang.Integer>(inputBlocks_);
          bitField0_ |= 0x00000008;
         }
      }
      /**
       * <code>repeated int32 inputBlocks = 4;</code>
       */
      public java.util.List<java.lang.Integer>
          getInputBlocksList() {
        return java.util.Collections.unmodifiableList(inputBlocks_);
      }
      /**
       * <code>repeated int32 inputBlocks = 4;</code>
       */
      public int getInputBlocksCount() {
        return inputBlocks_.size();
      }
      /**
       * <code>repeated int32 inputBlocks = 4;</code>
       */
      public int getInputBlocks(int index) {
        return inputBlocks_.get(index);
      }
      /**
       * <code>repeated int32 inputBlocks = 4;</code>
       */
      public Builder setInputBlocks(
          int index, int value) {
        ensureInputBlocksIsMutable();
        inputBlocks_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated int32 inputBlocks = 4;</code>
       */
      public Builder addInputBlocks(int value) {
        ensureInputBlocksIsMutable();
        inputBlocks_.add(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated int32 inputBlocks = 4;</code>
       */
      public Builder addAllInputBlocks(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureInputBlocksIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, inputBlocks_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated int32 inputBlocks = 4;</code>
       */
      public Builder clearInputBlocks() {
        inputBlocks_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000008);
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:MapTaskInfo)
    }

    static {
      defaultInstance = new MapTaskInfo(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:MapTaskInfo)
  }

  public interface ReducerTaskInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ReducerTaskInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional int32 jobId = 1;</code>
     */
    boolean hasJobId();
    /**
     * <code>optional int32 jobId = 1;</code>
     */
    int getJobId();

    /**
     * <code>optional int32 taskId = 2;</code>
     */
    boolean hasTaskId();
    /**
     * <code>optional int32 taskId = 2;</code>
     */
    int getTaskId();

    /**
     * <code>optional string reducerName = 3;</code>
     */
    boolean hasReducerName();
    /**
     * <code>optional string reducerName = 3;</code>
     */
    java.lang.String getReducerName();
    /**
     * <code>optional string reducerName = 3;</code>
     */
    com.google.protobuf.ByteString
        getReducerNameBytes();

    /**
     * <code>repeated string mapOutputFiles = 4;</code>
     */
    com.google.protobuf.ProtocolStringList
        getMapOutputFilesList();
    /**
     * <code>repeated string mapOutputFiles = 4;</code>
     */
    int getMapOutputFilesCount();
    /**
     * <code>repeated string mapOutputFiles = 4;</code>
     */
    java.lang.String getMapOutputFiles(int index);
    /**
     * <code>repeated string mapOutputFiles = 4;</code>
     */
    com.google.protobuf.ByteString
        getMapOutputFilesBytes(int index);

    /**
     * <code>optional string outputFile = 5;</code>
     */
    boolean hasOutputFile();
    /**
     * <code>optional string outputFile = 5;</code>
     */
    java.lang.String getOutputFile();
    /**
     * <code>optional string outputFile = 5;</code>
     */
    com.google.protobuf.ByteString
        getOutputFileBytes();
  }
  /**
   * Protobuf type {@code ReducerTaskInfo}
   */
  public static final class ReducerTaskInfo extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:ReducerTaskInfo)
      ReducerTaskInfoOrBuilder {
    // Use ReducerTaskInfo.newBuilder() to construct.
    private ReducerTaskInfo(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private ReducerTaskInfo(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final ReducerTaskInfo defaultInstance;
    public static ReducerTaskInfo getDefaultInstance() {
      return defaultInstance;
    }

    public ReducerTaskInfo getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private ReducerTaskInfo(
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
              jobId_ = input.readInt32();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              taskId_ = input.readInt32();
              break;
            }
            case 26: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000004;
              reducerName_ = bs;
              break;
            }
            case 34: {
              com.google.protobuf.ByteString bs = input.readBytes();
              if (!((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
                mapOutputFiles_ = new com.google.protobuf.LazyStringArrayList();
                mutable_bitField0_ |= 0x00000008;
              }
              mapOutputFiles_.add(bs);
              break;
            }
            case 42: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000008;
              outputFile_ = bs;
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
        if (((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
          mapOutputFiles_ = mapOutputFiles_.getUnmodifiableView();
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return MapReduce.internal_static_ReducerTaskInfo_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return MapReduce.internal_static_ReducerTaskInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              MapReduce.ReducerTaskInfo.class, MapReduce.ReducerTaskInfo.Builder.class);
    }

    public static com.google.protobuf.Parser<ReducerTaskInfo> PARSER =
        new com.google.protobuf.AbstractParser<ReducerTaskInfo>() {
      public ReducerTaskInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ReducerTaskInfo(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<ReducerTaskInfo> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int JOBID_FIELD_NUMBER = 1;
    private int jobId_;
    /**
     * <code>optional int32 jobId = 1;</code>
     */
    public boolean hasJobId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional int32 jobId = 1;</code>
     */
    public int getJobId() {
      return jobId_;
    }

    public static final int TASKID_FIELD_NUMBER = 2;
    private int taskId_;
    /**
     * <code>optional int32 taskId = 2;</code>
     */
    public boolean hasTaskId() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional int32 taskId = 2;</code>
     */
    public int getTaskId() {
      return taskId_;
    }

    public static final int REDUCERNAME_FIELD_NUMBER = 3;
    private java.lang.Object reducerName_;
    /**
     * <code>optional string reducerName = 3;</code>
     */
    public boolean hasReducerName() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional string reducerName = 3;</code>
     */
    public java.lang.String getReducerName() {
      java.lang.Object ref = reducerName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          reducerName_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string reducerName = 3;</code>
     */
    public com.google.protobuf.ByteString
        getReducerNameBytes() {
      java.lang.Object ref = reducerName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        reducerName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int MAPOUTPUTFILES_FIELD_NUMBER = 4;
    private com.google.protobuf.LazyStringList mapOutputFiles_;
    /**
     * <code>repeated string mapOutputFiles = 4;</code>
     */
    public com.google.protobuf.ProtocolStringList
        getMapOutputFilesList() {
      return mapOutputFiles_;
    }
    /**
     * <code>repeated string mapOutputFiles = 4;</code>
     */
    public int getMapOutputFilesCount() {
      return mapOutputFiles_.size();
    }
    /**
     * <code>repeated string mapOutputFiles = 4;</code>
     */
    public java.lang.String getMapOutputFiles(int index) {
      return mapOutputFiles_.get(index);
    }
    /**
     * <code>repeated string mapOutputFiles = 4;</code>
     */
    public com.google.protobuf.ByteString
        getMapOutputFilesBytes(int index) {
      return mapOutputFiles_.getByteString(index);
    }

    public static final int OUTPUTFILE_FIELD_NUMBER = 5;
    private java.lang.Object outputFile_;
    /**
     * <code>optional string outputFile = 5;</code>
     */
    public boolean hasOutputFile() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>optional string outputFile = 5;</code>
     */
    public java.lang.String getOutputFile() {
      java.lang.Object ref = outputFile_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          outputFile_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string outputFile = 5;</code>
     */
    public com.google.protobuf.ByteString
        getOutputFileBytes() {
      java.lang.Object ref = outputFile_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        outputFile_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private void initFields() {
      jobId_ = 0;
      taskId_ = 0;
      reducerName_ = "";
      mapOutputFiles_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      outputFile_ = "";
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
        output.writeInt32(1, jobId_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, taskId_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeBytes(3, getReducerNameBytes());
      }
      for (int i = 0; i < mapOutputFiles_.size(); i++) {
        output.writeBytes(4, mapOutputFiles_.getByteString(i));
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeBytes(5, getOutputFileBytes());
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
          .computeInt32Size(1, jobId_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, taskId_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(3, getReducerNameBytes());
      }
      {
        int dataSize = 0;
        for (int i = 0; i < mapOutputFiles_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeBytesSizeNoTag(mapOutputFiles_.getByteString(i));
        }
        size += dataSize;
        size += 1 * getMapOutputFilesList().size();
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(5, getOutputFileBytes());
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

    public static MapReduce.ReducerTaskInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static MapReduce.ReducerTaskInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static MapReduce.ReducerTaskInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static MapReduce.ReducerTaskInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static MapReduce.ReducerTaskInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static MapReduce.ReducerTaskInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static MapReduce.ReducerTaskInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static MapReduce.ReducerTaskInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static MapReduce.ReducerTaskInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static MapReduce.ReducerTaskInfo parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(MapReduce.ReducerTaskInfo prototype) {
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
     * Protobuf type {@code ReducerTaskInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ReducerTaskInfo)
        MapReduce.ReducerTaskInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return MapReduce.internal_static_ReducerTaskInfo_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return MapReduce.internal_static_ReducerTaskInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                MapReduce.ReducerTaskInfo.class, MapReduce.ReducerTaskInfo.Builder.class);
      }

      // Construct using MapReduce.ReducerTaskInfo.newBuilder()
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
        jobId_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        taskId_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        reducerName_ = "";
        bitField0_ = (bitField0_ & ~0x00000004);
        mapOutputFiles_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000008);
        outputFile_ = "";
        bitField0_ = (bitField0_ & ~0x00000010);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return MapReduce.internal_static_ReducerTaskInfo_descriptor;
      }

      public MapReduce.ReducerTaskInfo getDefaultInstanceForType() {
        return MapReduce.ReducerTaskInfo.getDefaultInstance();
      }

      public MapReduce.ReducerTaskInfo build() {
        MapReduce.ReducerTaskInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public MapReduce.ReducerTaskInfo buildPartial() {
        MapReduce.ReducerTaskInfo result = new MapReduce.ReducerTaskInfo(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.jobId_ = jobId_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.taskId_ = taskId_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.reducerName_ = reducerName_;
        if (((bitField0_ & 0x00000008) == 0x00000008)) {
          mapOutputFiles_ = mapOutputFiles_.getUnmodifiableView();
          bitField0_ = (bitField0_ & ~0x00000008);
        }
        result.mapOutputFiles_ = mapOutputFiles_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000008;
        }
        result.outputFile_ = outputFile_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof MapReduce.ReducerTaskInfo) {
          return mergeFrom((MapReduce.ReducerTaskInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(MapReduce.ReducerTaskInfo other) {
        if (other == MapReduce.ReducerTaskInfo.getDefaultInstance()) return this;
        if (other.hasJobId()) {
          setJobId(other.getJobId());
        }
        if (other.hasTaskId()) {
          setTaskId(other.getTaskId());
        }
        if (other.hasReducerName()) {
          bitField0_ |= 0x00000004;
          reducerName_ = other.reducerName_;
          onChanged();
        }
        if (!other.mapOutputFiles_.isEmpty()) {
          if (mapOutputFiles_.isEmpty()) {
            mapOutputFiles_ = other.mapOutputFiles_;
            bitField0_ = (bitField0_ & ~0x00000008);
          } else {
            ensureMapOutputFilesIsMutable();
            mapOutputFiles_.addAll(other.mapOutputFiles_);
          }
          onChanged();
        }
        if (other.hasOutputFile()) {
          bitField0_ |= 0x00000010;
          outputFile_ = other.outputFile_;
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
        MapReduce.ReducerTaskInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (MapReduce.ReducerTaskInfo) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int jobId_ ;
      /**
       * <code>optional int32 jobId = 1;</code>
       */
      public boolean hasJobId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional int32 jobId = 1;</code>
       */
      public int getJobId() {
        return jobId_;
      }
      /**
       * <code>optional int32 jobId = 1;</code>
       */
      public Builder setJobId(int value) {
        bitField0_ |= 0x00000001;
        jobId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 jobId = 1;</code>
       */
      public Builder clearJobId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        jobId_ = 0;
        onChanged();
        return this;
      }

      private int taskId_ ;
      /**
       * <code>optional int32 taskId = 2;</code>
       */
      public boolean hasTaskId() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional int32 taskId = 2;</code>
       */
      public int getTaskId() {
        return taskId_;
      }
      /**
       * <code>optional int32 taskId = 2;</code>
       */
      public Builder setTaskId(int value) {
        bitField0_ |= 0x00000002;
        taskId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 taskId = 2;</code>
       */
      public Builder clearTaskId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        taskId_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object reducerName_ = "";
      /**
       * <code>optional string reducerName = 3;</code>
       */
      public boolean hasReducerName() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional string reducerName = 3;</code>
       */
      public java.lang.String getReducerName() {
        java.lang.Object ref = reducerName_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            reducerName_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string reducerName = 3;</code>
       */
      public com.google.protobuf.ByteString
          getReducerNameBytes() {
        java.lang.Object ref = reducerName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          reducerName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string reducerName = 3;</code>
       */
      public Builder setReducerName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        reducerName_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string reducerName = 3;</code>
       */
      public Builder clearReducerName() {
        bitField0_ = (bitField0_ & ~0x00000004);
        reducerName_ = getDefaultInstance().getReducerName();
        onChanged();
        return this;
      }
      /**
       * <code>optional string reducerName = 3;</code>
       */
      public Builder setReducerNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        reducerName_ = value;
        onChanged();
        return this;
      }

      private com.google.protobuf.LazyStringList mapOutputFiles_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      private void ensureMapOutputFilesIsMutable() {
        if (!((bitField0_ & 0x00000008) == 0x00000008)) {
          mapOutputFiles_ = new com.google.protobuf.LazyStringArrayList(mapOutputFiles_);
          bitField0_ |= 0x00000008;
         }
      }
      /**
       * <code>repeated string mapOutputFiles = 4;</code>
       */
      public com.google.protobuf.ProtocolStringList
          getMapOutputFilesList() {
        return mapOutputFiles_.getUnmodifiableView();
      }
      /**
       * <code>repeated string mapOutputFiles = 4;</code>
       */
      public int getMapOutputFilesCount() {
        return mapOutputFiles_.size();
      }
      /**
       * <code>repeated string mapOutputFiles = 4;</code>
       */
      public java.lang.String getMapOutputFiles(int index) {
        return mapOutputFiles_.get(index);
      }
      /**
       * <code>repeated string mapOutputFiles = 4;</code>
       */
      public com.google.protobuf.ByteString
          getMapOutputFilesBytes(int index) {
        return mapOutputFiles_.getByteString(index);
      }
      /**
       * <code>repeated string mapOutputFiles = 4;</code>
       */
      public Builder setMapOutputFiles(
          int index, java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureMapOutputFilesIsMutable();
        mapOutputFiles_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string mapOutputFiles = 4;</code>
       */
      public Builder addMapOutputFiles(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureMapOutputFilesIsMutable();
        mapOutputFiles_.add(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string mapOutputFiles = 4;</code>
       */
      public Builder addAllMapOutputFiles(
          java.lang.Iterable<java.lang.String> values) {
        ensureMapOutputFilesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, mapOutputFiles_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string mapOutputFiles = 4;</code>
       */
      public Builder clearMapOutputFiles() {
        mapOutputFiles_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000008);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string mapOutputFiles = 4;</code>
       */
      public Builder addMapOutputFilesBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureMapOutputFilesIsMutable();
        mapOutputFiles_.add(value);
        onChanged();
        return this;
      }

      private java.lang.Object outputFile_ = "";
      /**
       * <code>optional string outputFile = 5;</code>
       */
      public boolean hasOutputFile() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      /**
       * <code>optional string outputFile = 5;</code>
       */
      public java.lang.String getOutputFile() {
        java.lang.Object ref = outputFile_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            outputFile_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string outputFile = 5;</code>
       */
      public com.google.protobuf.ByteString
          getOutputFileBytes() {
        java.lang.Object ref = outputFile_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          outputFile_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string outputFile = 5;</code>
       */
      public Builder setOutputFile(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000010;
        outputFile_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string outputFile = 5;</code>
       */
      public Builder clearOutputFile() {
        bitField0_ = (bitField0_ & ~0x00000010);
        outputFile_ = getDefaultInstance().getOutputFile();
        onChanged();
        return this;
      }
      /**
       * <code>optional string outputFile = 5;</code>
       */
      public Builder setOutputFileBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000010;
        outputFile_ = value;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:ReducerTaskInfo)
    }

    static {
      defaultInstance = new ReducerTaskInfo(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:ReducerTaskInfo)
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

    /**
     * <code>repeated .MapTaskInfo mapTasks = 2;</code>
     */
    java.util.List<MapReduce.MapTaskInfo> 
        getMapTasksList();
    /**
     * <code>repeated .MapTaskInfo mapTasks = 2;</code>
     */
    MapReduce.MapTaskInfo getMapTasks(int index);
    /**
     * <code>repeated .MapTaskInfo mapTasks = 2;</code>
     */
    int getMapTasksCount();
    /**
     * <code>repeated .MapTaskInfo mapTasks = 2;</code>
     */
    java.util.List<? extends MapReduce.MapTaskInfoOrBuilder> 
        getMapTasksOrBuilderList();
    /**
     * <code>repeated .MapTaskInfo mapTasks = 2;</code>
     */
    MapReduce.MapTaskInfoOrBuilder getMapTasksOrBuilder(
        int index);

    /**
     * <code>repeated .ReducerTaskInfo reduceTasks = 3;</code>
     */
    java.util.List<MapReduce.ReducerTaskInfo> 
        getReduceTasksList();
    /**
     * <code>repeated .ReducerTaskInfo reduceTasks = 3;</code>
     */
    MapReduce.ReducerTaskInfo getReduceTasks(int index);
    /**
     * <code>repeated .ReducerTaskInfo reduceTasks = 3;</code>
     */
    int getReduceTasksCount();
    /**
     * <code>repeated .ReducerTaskInfo reduceTasks = 3;</code>
     */
    java.util.List<? extends MapReduce.ReducerTaskInfoOrBuilder> 
        getReduceTasksOrBuilderList();
    /**
     * <code>repeated .ReducerTaskInfo reduceTasks = 3;</code>
     */
    MapReduce.ReducerTaskInfoOrBuilder getReduceTasksOrBuilder(
        int index);
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
            case 18: {
              if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                mapTasks_ = new java.util.ArrayList<MapReduce.MapTaskInfo>();
                mutable_bitField0_ |= 0x00000002;
              }
              mapTasks_.add(input.readMessage(MapReduce.MapTaskInfo.PARSER, extensionRegistry));
              break;
            }
            case 26: {
              if (!((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
                reduceTasks_ = new java.util.ArrayList<MapReduce.ReducerTaskInfo>();
                mutable_bitField0_ |= 0x00000004;
              }
              reduceTasks_.add(input.readMessage(MapReduce.ReducerTaskInfo.PARSER, extensionRegistry));
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
          mapTasks_ = java.util.Collections.unmodifiableList(mapTasks_);
        }
        if (((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
          reduceTasks_ = java.util.Collections.unmodifiableList(reduceTasks_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return MapReduce.internal_static_HeartBeatResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return MapReduce.internal_static_HeartBeatResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              MapReduce.HeartBeatResponse.class, MapReduce.HeartBeatResponse.Builder.class);
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

    public static final int MAPTASKS_FIELD_NUMBER = 2;
    private java.util.List<MapReduce.MapTaskInfo> mapTasks_;
    /**
     * <code>repeated .MapTaskInfo mapTasks = 2;</code>
     */
    public java.util.List<MapReduce.MapTaskInfo> getMapTasksList() {
      return mapTasks_;
    }
    /**
     * <code>repeated .MapTaskInfo mapTasks = 2;</code>
     */
    public java.util.List<? extends MapReduce.MapTaskInfoOrBuilder> 
        getMapTasksOrBuilderList() {
      return mapTasks_;
    }
    /**
     * <code>repeated .MapTaskInfo mapTasks = 2;</code>
     */
    public int getMapTasksCount() {
      return mapTasks_.size();
    }
    /**
     * <code>repeated .MapTaskInfo mapTasks = 2;</code>
     */
    public MapReduce.MapTaskInfo getMapTasks(int index) {
      return mapTasks_.get(index);
    }
    /**
     * <code>repeated .MapTaskInfo mapTasks = 2;</code>
     */
    public MapReduce.MapTaskInfoOrBuilder getMapTasksOrBuilder(
        int index) {
      return mapTasks_.get(index);
    }

    public static final int REDUCETASKS_FIELD_NUMBER = 3;
    private java.util.List<MapReduce.ReducerTaskInfo> reduceTasks_;
    /**
     * <code>repeated .ReducerTaskInfo reduceTasks = 3;</code>
     */
    public java.util.List<MapReduce.ReducerTaskInfo> getReduceTasksList() {
      return reduceTasks_;
    }
    /**
     * <code>repeated .ReducerTaskInfo reduceTasks = 3;</code>
     */
    public java.util.List<? extends MapReduce.ReducerTaskInfoOrBuilder> 
        getReduceTasksOrBuilderList() {
      return reduceTasks_;
    }
    /**
     * <code>repeated .ReducerTaskInfo reduceTasks = 3;</code>
     */
    public int getReduceTasksCount() {
      return reduceTasks_.size();
    }
    /**
     * <code>repeated .ReducerTaskInfo reduceTasks = 3;</code>
     */
    public MapReduce.ReducerTaskInfo getReduceTasks(int index) {
      return reduceTasks_.get(index);
    }
    /**
     * <code>repeated .ReducerTaskInfo reduceTasks = 3;</code>
     */
    public MapReduce.ReducerTaskInfoOrBuilder getReduceTasksOrBuilder(
        int index) {
      return reduceTasks_.get(index);
    }

    private void initFields() {
      status_ = 0;
      mapTasks_ = java.util.Collections.emptyList();
      reduceTasks_ = java.util.Collections.emptyList();
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
      for (int i = 0; i < mapTasks_.size(); i++) {
        output.writeMessage(2, mapTasks_.get(i));
      }
      for (int i = 0; i < reduceTasks_.size(); i++) {
        output.writeMessage(3, reduceTasks_.get(i));
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
      for (int i = 0; i < mapTasks_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, mapTasks_.get(i));
      }
      for (int i = 0; i < reduceTasks_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, reduceTasks_.get(i));
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

    public static MapReduce.HeartBeatResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static MapReduce.HeartBeatResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static MapReduce.HeartBeatResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static MapReduce.HeartBeatResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static MapReduce.HeartBeatResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static MapReduce.HeartBeatResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static MapReduce.HeartBeatResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static MapReduce.HeartBeatResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static MapReduce.HeartBeatResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static MapReduce.HeartBeatResponse parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(MapReduce.HeartBeatResponse prototype) {
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
        MapReduce.HeartBeatResponseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return MapReduce.internal_static_HeartBeatResponse_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return MapReduce.internal_static_HeartBeatResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                MapReduce.HeartBeatResponse.class, MapReduce.HeartBeatResponse.Builder.class);
      }

      // Construct using MapReduce.HeartBeatResponse.newBuilder()
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
          getMapTasksFieldBuilder();
          getReduceTasksFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        status_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        if (mapTasksBuilder_ == null) {
          mapTasks_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          mapTasksBuilder_.clear();
        }
        if (reduceTasksBuilder_ == null) {
          reduceTasks_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000004);
        } else {
          reduceTasksBuilder_.clear();
        }
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return MapReduce.internal_static_HeartBeatResponse_descriptor;
      }

      public MapReduce.HeartBeatResponse getDefaultInstanceForType() {
        return MapReduce.HeartBeatResponse.getDefaultInstance();
      }

      public MapReduce.HeartBeatResponse build() {
        MapReduce.HeartBeatResponse result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public MapReduce.HeartBeatResponse buildPartial() {
        MapReduce.HeartBeatResponse result = new MapReduce.HeartBeatResponse(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.status_ = status_;
        if (mapTasksBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)) {
            mapTasks_ = java.util.Collections.unmodifiableList(mapTasks_);
            bitField0_ = (bitField0_ & ~0x00000002);
          }
          result.mapTasks_ = mapTasks_;
        } else {
          result.mapTasks_ = mapTasksBuilder_.build();
        }
        if (reduceTasksBuilder_ == null) {
          if (((bitField0_ & 0x00000004) == 0x00000004)) {
            reduceTasks_ = java.util.Collections.unmodifiableList(reduceTasks_);
            bitField0_ = (bitField0_ & ~0x00000004);
          }
          result.reduceTasks_ = reduceTasks_;
        } else {
          result.reduceTasks_ = reduceTasksBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof MapReduce.HeartBeatResponse) {
          return mergeFrom((MapReduce.HeartBeatResponse)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(MapReduce.HeartBeatResponse other) {
        if (other == MapReduce.HeartBeatResponse.getDefaultInstance()) return this;
        if (other.hasStatus()) {
          setStatus(other.getStatus());
        }
        if (mapTasksBuilder_ == null) {
          if (!other.mapTasks_.isEmpty()) {
            if (mapTasks_.isEmpty()) {
              mapTasks_ = other.mapTasks_;
              bitField0_ = (bitField0_ & ~0x00000002);
            } else {
              ensureMapTasksIsMutable();
              mapTasks_.addAll(other.mapTasks_);
            }
            onChanged();
          }
        } else {
          if (!other.mapTasks_.isEmpty()) {
            if (mapTasksBuilder_.isEmpty()) {
              mapTasksBuilder_.dispose();
              mapTasksBuilder_ = null;
              mapTasks_ = other.mapTasks_;
              bitField0_ = (bitField0_ & ~0x00000002);
              mapTasksBuilder_ = 
                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                   getMapTasksFieldBuilder() : null;
            } else {
              mapTasksBuilder_.addAllMessages(other.mapTasks_);
            }
          }
        }
        if (reduceTasksBuilder_ == null) {
          if (!other.reduceTasks_.isEmpty()) {
            if (reduceTasks_.isEmpty()) {
              reduceTasks_ = other.reduceTasks_;
              bitField0_ = (bitField0_ & ~0x00000004);
            } else {
              ensureReduceTasksIsMutable();
              reduceTasks_.addAll(other.reduceTasks_);
            }
            onChanged();
          }
        } else {
          if (!other.reduceTasks_.isEmpty()) {
            if (reduceTasksBuilder_.isEmpty()) {
              reduceTasksBuilder_.dispose();
              reduceTasksBuilder_ = null;
              reduceTasks_ = other.reduceTasks_;
              bitField0_ = (bitField0_ & ~0x00000004);
              reduceTasksBuilder_ = 
                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                   getReduceTasksFieldBuilder() : null;
            } else {
              reduceTasksBuilder_.addAllMessages(other.reduceTasks_);
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
        MapReduce.HeartBeatResponse parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (MapReduce.HeartBeatResponse) e.getUnfinishedMessage();
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

      private java.util.List<MapReduce.MapTaskInfo> mapTasks_ =
        java.util.Collections.emptyList();
      private void ensureMapTasksIsMutable() {
        if (!((bitField0_ & 0x00000002) == 0x00000002)) {
          mapTasks_ = new java.util.ArrayList<MapReduce.MapTaskInfo>(mapTasks_);
          bitField0_ |= 0x00000002;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilder<
          MapReduce.MapTaskInfo, MapReduce.MapTaskInfo.Builder, MapReduce.MapTaskInfoOrBuilder> mapTasksBuilder_;

      /**
       * <code>repeated .MapTaskInfo mapTasks = 2;</code>
       */
      public java.util.List<MapReduce.MapTaskInfo> getMapTasksList() {
        if (mapTasksBuilder_ == null) {
          return java.util.Collections.unmodifiableList(mapTasks_);
        } else {
          return mapTasksBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .MapTaskInfo mapTasks = 2;</code>
       */
      public int getMapTasksCount() {
        if (mapTasksBuilder_ == null) {
          return mapTasks_.size();
        } else {
          return mapTasksBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .MapTaskInfo mapTasks = 2;</code>
       */
      public MapReduce.MapTaskInfo getMapTasks(int index) {
        if (mapTasksBuilder_ == null) {
          return mapTasks_.get(index);
        } else {
          return mapTasksBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .MapTaskInfo mapTasks = 2;</code>
       */
      public Builder setMapTasks(
          int index, MapReduce.MapTaskInfo value) {
        if (mapTasksBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureMapTasksIsMutable();
          mapTasks_.set(index, value);
          onChanged();
        } else {
          mapTasksBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .MapTaskInfo mapTasks = 2;</code>
       */
      public Builder setMapTasks(
          int index, MapReduce.MapTaskInfo.Builder builderForValue) {
        if (mapTasksBuilder_ == null) {
          ensureMapTasksIsMutable();
          mapTasks_.set(index, builderForValue.build());
          onChanged();
        } else {
          mapTasksBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .MapTaskInfo mapTasks = 2;</code>
       */
      public Builder addMapTasks(MapReduce.MapTaskInfo value) {
        if (mapTasksBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureMapTasksIsMutable();
          mapTasks_.add(value);
          onChanged();
        } else {
          mapTasksBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .MapTaskInfo mapTasks = 2;</code>
       */
      public Builder addMapTasks(
          int index, MapReduce.MapTaskInfo value) {
        if (mapTasksBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureMapTasksIsMutable();
          mapTasks_.add(index, value);
          onChanged();
        } else {
          mapTasksBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .MapTaskInfo mapTasks = 2;</code>
       */
      public Builder addMapTasks(
          MapReduce.MapTaskInfo.Builder builderForValue) {
        if (mapTasksBuilder_ == null) {
          ensureMapTasksIsMutable();
          mapTasks_.add(builderForValue.build());
          onChanged();
        } else {
          mapTasksBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .MapTaskInfo mapTasks = 2;</code>
       */
      public Builder addMapTasks(
          int index, MapReduce.MapTaskInfo.Builder builderForValue) {
        if (mapTasksBuilder_ == null) {
          ensureMapTasksIsMutable();
          mapTasks_.add(index, builderForValue.build());
          onChanged();
        } else {
          mapTasksBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .MapTaskInfo mapTasks = 2;</code>
       */
      public Builder addAllMapTasks(
          java.lang.Iterable<? extends MapReduce.MapTaskInfo> values) {
        if (mapTasksBuilder_ == null) {
          ensureMapTasksIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, mapTasks_);
          onChanged();
        } else {
          mapTasksBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .MapTaskInfo mapTasks = 2;</code>
       */
      public Builder clearMapTasks() {
        if (mapTasksBuilder_ == null) {
          mapTasks_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
          onChanged();
        } else {
          mapTasksBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .MapTaskInfo mapTasks = 2;</code>
       */
      public Builder removeMapTasks(int index) {
        if (mapTasksBuilder_ == null) {
          ensureMapTasksIsMutable();
          mapTasks_.remove(index);
          onChanged();
        } else {
          mapTasksBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .MapTaskInfo mapTasks = 2;</code>
       */
      public MapReduce.MapTaskInfo.Builder getMapTasksBuilder(
          int index) {
        return getMapTasksFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .MapTaskInfo mapTasks = 2;</code>
       */
      public MapReduce.MapTaskInfoOrBuilder getMapTasksOrBuilder(
          int index) {
        if (mapTasksBuilder_ == null) {
          return mapTasks_.get(index);  } else {
          return mapTasksBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .MapTaskInfo mapTasks = 2;</code>
       */
      public java.util.List<? extends MapReduce.MapTaskInfoOrBuilder> 
           getMapTasksOrBuilderList() {
        if (mapTasksBuilder_ != null) {
          return mapTasksBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(mapTasks_);
        }
      }
      /**
       * <code>repeated .MapTaskInfo mapTasks = 2;</code>
       */
      public MapReduce.MapTaskInfo.Builder addMapTasksBuilder() {
        return getMapTasksFieldBuilder().addBuilder(
            MapReduce.MapTaskInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .MapTaskInfo mapTasks = 2;</code>
       */
      public MapReduce.MapTaskInfo.Builder addMapTasksBuilder(
          int index) {
        return getMapTasksFieldBuilder().addBuilder(
            index, MapReduce.MapTaskInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .MapTaskInfo mapTasks = 2;</code>
       */
      public java.util.List<MapReduce.MapTaskInfo.Builder> 
           getMapTasksBuilderList() {
        return getMapTasksFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          MapReduce.MapTaskInfo, MapReduce.MapTaskInfo.Builder, MapReduce.MapTaskInfoOrBuilder> 
          getMapTasksFieldBuilder() {
        if (mapTasksBuilder_ == null) {
          mapTasksBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              MapReduce.MapTaskInfo, MapReduce.MapTaskInfo.Builder, MapReduce.MapTaskInfoOrBuilder>(
                  mapTasks_,
                  ((bitField0_ & 0x00000002) == 0x00000002),
                  getParentForChildren(),
                  isClean());
          mapTasks_ = null;
        }
        return mapTasksBuilder_;
      }

      private java.util.List<MapReduce.ReducerTaskInfo> reduceTasks_ =
        java.util.Collections.emptyList();
      private void ensureReduceTasksIsMutable() {
        if (!((bitField0_ & 0x00000004) == 0x00000004)) {
          reduceTasks_ = new java.util.ArrayList<MapReduce.ReducerTaskInfo>(reduceTasks_);
          bitField0_ |= 0x00000004;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilder<
          MapReduce.ReducerTaskInfo, MapReduce.ReducerTaskInfo.Builder, MapReduce.ReducerTaskInfoOrBuilder> reduceTasksBuilder_;

      /**
       * <code>repeated .ReducerTaskInfo reduceTasks = 3;</code>
       */
      public java.util.List<MapReduce.ReducerTaskInfo> getReduceTasksList() {
        if (reduceTasksBuilder_ == null) {
          return java.util.Collections.unmodifiableList(reduceTasks_);
        } else {
          return reduceTasksBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .ReducerTaskInfo reduceTasks = 3;</code>
       */
      public int getReduceTasksCount() {
        if (reduceTasksBuilder_ == null) {
          return reduceTasks_.size();
        } else {
          return reduceTasksBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .ReducerTaskInfo reduceTasks = 3;</code>
       */
      public MapReduce.ReducerTaskInfo getReduceTasks(int index) {
        if (reduceTasksBuilder_ == null) {
          return reduceTasks_.get(index);
        } else {
          return reduceTasksBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .ReducerTaskInfo reduceTasks = 3;</code>
       */
      public Builder setReduceTasks(
          int index, MapReduce.ReducerTaskInfo value) {
        if (reduceTasksBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureReduceTasksIsMutable();
          reduceTasks_.set(index, value);
          onChanged();
        } else {
          reduceTasksBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .ReducerTaskInfo reduceTasks = 3;</code>
       */
      public Builder setReduceTasks(
          int index, MapReduce.ReducerTaskInfo.Builder builderForValue) {
        if (reduceTasksBuilder_ == null) {
          ensureReduceTasksIsMutable();
          reduceTasks_.set(index, builderForValue.build());
          onChanged();
        } else {
          reduceTasksBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .ReducerTaskInfo reduceTasks = 3;</code>
       */
      public Builder addReduceTasks(MapReduce.ReducerTaskInfo value) {
        if (reduceTasksBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureReduceTasksIsMutable();
          reduceTasks_.add(value);
          onChanged();
        } else {
          reduceTasksBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .ReducerTaskInfo reduceTasks = 3;</code>
       */
      public Builder addReduceTasks(
          int index, MapReduce.ReducerTaskInfo value) {
        if (reduceTasksBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureReduceTasksIsMutable();
          reduceTasks_.add(index, value);
          onChanged();
        } else {
          reduceTasksBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .ReducerTaskInfo reduceTasks = 3;</code>
       */
      public Builder addReduceTasks(
          MapReduce.ReducerTaskInfo.Builder builderForValue) {
        if (reduceTasksBuilder_ == null) {
          ensureReduceTasksIsMutable();
          reduceTasks_.add(builderForValue.build());
          onChanged();
        } else {
          reduceTasksBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .ReducerTaskInfo reduceTasks = 3;</code>
       */
      public Builder addReduceTasks(
          int index, MapReduce.ReducerTaskInfo.Builder builderForValue) {
        if (reduceTasksBuilder_ == null) {
          ensureReduceTasksIsMutable();
          reduceTasks_.add(index, builderForValue.build());
          onChanged();
        } else {
          reduceTasksBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .ReducerTaskInfo reduceTasks = 3;</code>
       */
      public Builder addAllReduceTasks(
          java.lang.Iterable<? extends MapReduce.ReducerTaskInfo> values) {
        if (reduceTasksBuilder_ == null) {
          ensureReduceTasksIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, reduceTasks_);
          onChanged();
        } else {
          reduceTasksBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .ReducerTaskInfo reduceTasks = 3;</code>
       */
      public Builder clearReduceTasks() {
        if (reduceTasksBuilder_ == null) {
          reduceTasks_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000004);
          onChanged();
        } else {
          reduceTasksBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .ReducerTaskInfo reduceTasks = 3;</code>
       */
      public Builder removeReduceTasks(int index) {
        if (reduceTasksBuilder_ == null) {
          ensureReduceTasksIsMutable();
          reduceTasks_.remove(index);
          onChanged();
        } else {
          reduceTasksBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .ReducerTaskInfo reduceTasks = 3;</code>
       */
      public MapReduce.ReducerTaskInfo.Builder getReduceTasksBuilder(
          int index) {
        return getReduceTasksFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .ReducerTaskInfo reduceTasks = 3;</code>
       */
      public MapReduce.ReducerTaskInfoOrBuilder getReduceTasksOrBuilder(
          int index) {
        if (reduceTasksBuilder_ == null) {
          return reduceTasks_.get(index);  } else {
          return reduceTasksBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .ReducerTaskInfo reduceTasks = 3;</code>
       */
      public java.util.List<? extends MapReduce.ReducerTaskInfoOrBuilder> 
           getReduceTasksOrBuilderList() {
        if (reduceTasksBuilder_ != null) {
          return reduceTasksBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(reduceTasks_);
        }
      }
      /**
       * <code>repeated .ReducerTaskInfo reduceTasks = 3;</code>
       */
      public MapReduce.ReducerTaskInfo.Builder addReduceTasksBuilder() {
        return getReduceTasksFieldBuilder().addBuilder(
            MapReduce.ReducerTaskInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .ReducerTaskInfo reduceTasks = 3;</code>
       */
      public MapReduce.ReducerTaskInfo.Builder addReduceTasksBuilder(
          int index) {
        return getReduceTasksFieldBuilder().addBuilder(
            index, MapReduce.ReducerTaskInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .ReducerTaskInfo reduceTasks = 3;</code>
       */
      public java.util.List<MapReduce.ReducerTaskInfo.Builder> 
           getReduceTasksBuilderList() {
        return getReduceTasksFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          MapReduce.ReducerTaskInfo, MapReduce.ReducerTaskInfo.Builder, MapReduce.ReducerTaskInfoOrBuilder> 
          getReduceTasksFieldBuilder() {
        if (reduceTasksBuilder_ == null) {
          reduceTasksBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              MapReduce.ReducerTaskInfo, MapReduce.ReducerTaskInfo.Builder, MapReduce.ReducerTaskInfoOrBuilder>(
                  reduceTasks_,
                  ((bitField0_ & 0x00000004) == 0x00000004),
                  getParentForChildren(),
                  isClean());
          reduceTasks_ = null;
        }
        return reduceTasksBuilder_;
      }

      // @@protoc_insertion_point(builder_scope:HeartBeatResponse)
    }

    static {
      defaultInstance = new HeartBeatResponse(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:HeartBeatResponse)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_JobSubmitRequest_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_JobSubmitRequest_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_JobSubmitResponse_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_JobSubmitResponse_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_JobStatusRequest_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_JobStatusRequest_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_JobStatusResponse_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_JobStatusResponse_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MapTaskStatus_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_MapTaskStatus_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ReduceTaskStatus_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_ReduceTaskStatus_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HeartBeatRequest_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_HeartBeatRequest_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MapTaskInfo_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_MapTaskInfo_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ReducerTaskInfo_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_ReducerTaskInfo_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HeartBeatResponse_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_HeartBeatResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017MapReduce.proto\"w\n\020JobSubmitRequest\022\017\n" +
      "\007mapName\030\001 \001(\t\022\023\n\013reducerName\030\002 \001(\t\022\021\n\ti" +
      "nputFile\030\003 \001(\t\022\022\n\noutputFile\030\004 \001(\t\022\026\n\016nu" +
      "mReduceTasks\030\005 \001(\005\"2\n\021JobSubmitResponse\022" +
      "\016\n\006status\030\001 \001(\005\022\r\n\005jobId\030\002 \001(\005\"!\n\020JobSta" +
      "tusRequest\022\r\n\005jobId\030\001 \001(\005\"\240\001\n\021JobStatusR" +
      "esponse\022\016\n\006status\030\001 \001(\005\022\017\n\007jobDone\030\002 \001(\010" +
      "\022\025\n\rtotalMapTasks\030\003 \001(\005\022\032\n\022numMapTasksSt" +
      "arted\030\004 \001(\005\022\030\n\020totalReduceTasks\030\005 \001(\005\022\035\n" +
      "\025numReduceTasksStarted\030\006 \001(\005\"\\\n\rMapTaskS",
      "tatus\022\r\n\005jobId\030\001 \001(\005\022\016\n\006taskId\030\002 \001(\005\022\025\n\r" +
      "taskCompleted\030\003 \001(\010\022\025\n\rmapOutputFile\030\004 \001" +
      "(\t\"H\n\020ReduceTaskStatus\022\r\n\005jobId\030\001 \001(\005\022\016\n" +
      "\006taskId\030\002 \001(\005\022\025\n\rtaskCompleted\030\003 \001(\010\"\252\001\n" +
      "\020HeartBeatRequest\022\025\n\rtaskTrackerId\030\001 \001(\005" +
      "\022\027\n\017numMapSlotsFree\030\002 \001(\005\022\032\n\022numReduceSl" +
      "otsFree\030\003 \001(\005\022!\n\tmapStatus\030\004 \003(\0132\016.MapTa" +
      "skStatus\022\'\n\014reduceStatus\030\005 \003(\0132\021.ReduceT" +
      "askStatus\"R\n\013MapTaskInfo\022\r\n\005jobId\030\001 \001(\005\022" +
      "\016\n\006taskId\030\002 \001(\005\022\017\n\007mapName\030\003 \001(\t\022\023\n\013inpu",
      "tBlocks\030\004 \003(\005\"q\n\017ReducerTaskInfo\022\r\n\005jobI" +
      "d\030\001 \001(\005\022\016\n\006taskId\030\002 \001(\005\022\023\n\013reducerName\030\003" +
      " \001(\t\022\026\n\016mapOutputFiles\030\004 \003(\t\022\022\n\noutputFi" +
      "le\030\005 \001(\t\"j\n\021HeartBeatResponse\022\016\n\006status\030" +
      "\001 \001(\005\022\036\n\010mapTasks\030\002 \003(\0132\014.MapTaskInfo\022%\n" +
      "\013reduceTasks\030\003 \003(\0132\020.ReducerTaskInfo"
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
    internal_static_JobSubmitRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_JobSubmitRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_JobSubmitRequest_descriptor,
        new java.lang.String[] { "MapName", "ReducerName", "InputFile", "OutputFile", "NumReduceTasks", });
    internal_static_JobSubmitResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_JobSubmitResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_JobSubmitResponse_descriptor,
        new java.lang.String[] { "Status", "JobId", });
    internal_static_JobStatusRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_JobStatusRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_JobStatusRequest_descriptor,
        new java.lang.String[] { "JobId", });
    internal_static_JobStatusResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_JobStatusResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_JobStatusResponse_descriptor,
        new java.lang.String[] { "Status", "JobDone", "TotalMapTasks", "NumMapTasksStarted", "TotalReduceTasks", "NumReduceTasksStarted", });
    internal_static_MapTaskStatus_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_MapTaskStatus_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_MapTaskStatus_descriptor,
        new java.lang.String[] { "JobId", "TaskId", "TaskCompleted", "MapOutputFile", });
    internal_static_ReduceTaskStatus_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_ReduceTaskStatus_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_ReduceTaskStatus_descriptor,
        new java.lang.String[] { "JobId", "TaskId", "TaskCompleted", });
    internal_static_HeartBeatRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_HeartBeatRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_HeartBeatRequest_descriptor,
        new java.lang.String[] { "TaskTrackerId", "NumMapSlotsFree", "NumReduceSlotsFree", "MapStatus", "ReduceStatus", });
    internal_static_MapTaskInfo_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_MapTaskInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_MapTaskInfo_descriptor,
        new java.lang.String[] { "JobId", "TaskId", "MapName", "InputBlocks", });
    internal_static_ReducerTaskInfo_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_ReducerTaskInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_ReducerTaskInfo_descriptor,
        new java.lang.String[] { "JobId", "TaskId", "ReducerName", "MapOutputFiles", "OutputFile", });
    internal_static_HeartBeatResponse_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_HeartBeatResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_HeartBeatResponse_descriptor,
        new java.lang.String[] { "Status", "MapTasks", "ReduceTasks", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}