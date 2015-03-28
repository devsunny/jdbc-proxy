/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.asksunny.rpc.gateway;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-3-28")
public class JPParameterMetaData implements org.apache.thrift.TBase<JPParameterMetaData, JPParameterMetaData._Fields>, java.io.Serializable, Cloneable, Comparable<JPParameterMetaData> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("JPParameterMetaData");

  private static final org.apache.thrift.protocol.TField STATEMENT_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("statementId", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField PARAM_COUNT_FIELD_DESC = new org.apache.thrift.protocol.TField("paramCount", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField PARAMS_FIELD_DESC = new org.apache.thrift.protocol.TField("params", org.apache.thrift.protocol.TType.LIST, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new JPParameterMetaDataStandardSchemeFactory());
    schemes.put(TupleScheme.class, new JPParameterMetaDataTupleSchemeFactory());
  }

  public String statementId; // required
  public int paramCount; // required
  public List<JPQueryParamMetaData> params; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    STATEMENT_ID((short)1, "statementId"),
    PARAM_COUNT((short)2, "paramCount"),
    PARAMS((short)3, "params");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // STATEMENT_ID
          return STATEMENT_ID;
        case 2: // PARAM_COUNT
          return PARAM_COUNT;
        case 3: // PARAMS
          return PARAMS;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __PARAMCOUNT_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.PARAMS};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.STATEMENT_ID, new org.apache.thrift.meta_data.FieldMetaData("statementId", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PARAM_COUNT, new org.apache.thrift.meta_data.FieldMetaData("paramCount", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.PARAMS, new org.apache.thrift.meta_data.FieldMetaData("params", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.LIST        , "JPQueryParamMetaDataList")));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(JPParameterMetaData.class, metaDataMap);
  }

  public JPParameterMetaData() {
  }

  public JPParameterMetaData(
    String statementId,
    int paramCount)
  {
    this();
    this.statementId = statementId;
    this.paramCount = paramCount;
    setParamCountIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public JPParameterMetaData(JPParameterMetaData other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetStatementId()) {
      this.statementId = other.statementId;
    }
    this.paramCount = other.paramCount;
    if (other.isSetParams()) {
      this.params = other.params;
    }
  }

  public JPParameterMetaData deepCopy() {
    return new JPParameterMetaData(this);
  }

  @Override
  public void clear() {
    this.statementId = null;
    setParamCountIsSet(false);
    this.paramCount = 0;
    this.params = null;
  }

  public String getStatementId() {
    return this.statementId;
  }

  public JPParameterMetaData setStatementId(String statementId) {
    this.statementId = statementId;
    return this;
  }

  public void unsetStatementId() {
    this.statementId = null;
  }

  /** Returns true if field statementId is set (has been assigned a value) and false otherwise */
  public boolean isSetStatementId() {
    return this.statementId != null;
  }

  public void setStatementIdIsSet(boolean value) {
    if (!value) {
      this.statementId = null;
    }
  }

  public int getParamCount() {
    return this.paramCount;
  }

  public JPParameterMetaData setParamCount(int paramCount) {
    this.paramCount = paramCount;
    setParamCountIsSet(true);
    return this;
  }

  public void unsetParamCount() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __PARAMCOUNT_ISSET_ID);
  }

  /** Returns true if field paramCount is set (has been assigned a value) and false otherwise */
  public boolean isSetParamCount() {
    return EncodingUtils.testBit(__isset_bitfield, __PARAMCOUNT_ISSET_ID);
  }

  public void setParamCountIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __PARAMCOUNT_ISSET_ID, value);
  }

  public int getParamsSize() {
    return (this.params == null) ? 0 : this.params.size();
  }

  public java.util.Iterator<JPQueryParamMetaData> getParamsIterator() {
    return (this.params == null) ? null : this.params.iterator();
  }

  public void addToParams(JPQueryParamMetaData elem) {
    if (this.params == null) {
      this.params = new ArrayList<JPQueryParamMetaData>();
    }
    this.params.add(elem);
  }

  public List<JPQueryParamMetaData> getParams() {
    return this.params;
  }

  public JPParameterMetaData setParams(List<JPQueryParamMetaData> params) {
    this.params = params;
    return this;
  }

  public void unsetParams() {
    this.params = null;
  }

  /** Returns true if field params is set (has been assigned a value) and false otherwise */
  public boolean isSetParams() {
    return this.params != null;
  }

  public void setParamsIsSet(boolean value) {
    if (!value) {
      this.params = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case STATEMENT_ID:
      if (value == null) {
        unsetStatementId();
      } else {
        setStatementId((String)value);
      }
      break;

    case PARAM_COUNT:
      if (value == null) {
        unsetParamCount();
      } else {
        setParamCount((Integer)value);
      }
      break;

    case PARAMS:
      if (value == null) {
        unsetParams();
      } else {
        setParams((List<JPQueryParamMetaData>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case STATEMENT_ID:
      return getStatementId();

    case PARAM_COUNT:
      return Integer.valueOf(getParamCount());

    case PARAMS:
      return getParams();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case STATEMENT_ID:
      return isSetStatementId();
    case PARAM_COUNT:
      return isSetParamCount();
    case PARAMS:
      return isSetParams();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof JPParameterMetaData)
      return this.equals((JPParameterMetaData)that);
    return false;
  }

  public boolean equals(JPParameterMetaData that) {
    if (that == null)
      return false;

    boolean this_present_statementId = true && this.isSetStatementId();
    boolean that_present_statementId = true && that.isSetStatementId();
    if (this_present_statementId || that_present_statementId) {
      if (!(this_present_statementId && that_present_statementId))
        return false;
      if (!this.statementId.equals(that.statementId))
        return false;
    }

    boolean this_present_paramCount = true;
    boolean that_present_paramCount = true;
    if (this_present_paramCount || that_present_paramCount) {
      if (!(this_present_paramCount && that_present_paramCount))
        return false;
      if (this.paramCount != that.paramCount)
        return false;
    }

    boolean this_present_params = true && this.isSetParams();
    boolean that_present_params = true && that.isSetParams();
    if (this_present_params || that_present_params) {
      if (!(this_present_params && that_present_params))
        return false;
      if (!this.params.equals(that.params))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_statementId = true && (isSetStatementId());
    list.add(present_statementId);
    if (present_statementId)
      list.add(statementId);

    boolean present_paramCount = true;
    list.add(present_paramCount);
    if (present_paramCount)
      list.add(paramCount);

    boolean present_params = true && (isSetParams());
    list.add(present_params);
    if (present_params)
      list.add(params);

    return list.hashCode();
  }

  @Override
  public int compareTo(JPParameterMetaData other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetStatementId()).compareTo(other.isSetStatementId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStatementId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.statementId, other.statementId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetParamCount()).compareTo(other.isSetParamCount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetParamCount()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.paramCount, other.paramCount);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetParams()).compareTo(other.isSetParams());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetParams()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.params, other.params);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("JPParameterMetaData(");
    boolean first = true;

    sb.append("statementId:");
    if (this.statementId == null) {
      sb.append("null");
    } else {
      sb.append(this.statementId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("paramCount:");
    sb.append(this.paramCount);
    first = false;
    if (isSetParams()) {
      if (!first) sb.append(", ");
      sb.append("params:");
      if (this.params == null) {
        sb.append("null");
      } else {
        sb.append(this.params);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (statementId == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'statementId' was not present! Struct: " + toString());
    }
    // alas, we cannot check 'paramCount' because it's a primitive and you chose the non-beans generator.
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class JPParameterMetaDataStandardSchemeFactory implements SchemeFactory {
    public JPParameterMetaDataStandardScheme getScheme() {
      return new JPParameterMetaDataStandardScheme();
    }
  }

  private static class JPParameterMetaDataStandardScheme extends StandardScheme<JPParameterMetaData> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, JPParameterMetaData struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // STATEMENT_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.statementId = iprot.readString();
              struct.setStatementIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // PARAM_COUNT
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.paramCount = iprot.readI32();
              struct.setParamCountIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // PARAMS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
                struct.params = new ArrayList<JPQueryParamMetaData>(_list0.size);
                JPQueryParamMetaData _elem1;
                for (int _i2 = 0; _i2 < _list0.size; ++_i2)
                {
                  _elem1 = new JPQueryParamMetaData();
                  _elem1.read(iprot);
                  struct.params.add(_elem1);
                }
                iprot.readListEnd();
              }
              struct.setParamsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      if (!struct.isSetParamCount()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'paramCount' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, JPParameterMetaData struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.statementId != null) {
        oprot.writeFieldBegin(STATEMENT_ID_FIELD_DESC);
        oprot.writeString(struct.statementId);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(PARAM_COUNT_FIELD_DESC);
      oprot.writeI32(struct.paramCount);
      oprot.writeFieldEnd();
      if (struct.params != null) {
        if (struct.isSetParams()) {
          oprot.writeFieldBegin(PARAMS_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.params.size()));
            for (JPQueryParamMetaData _iter3 : struct.params)
            {
              _iter3.write(oprot);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class JPParameterMetaDataTupleSchemeFactory implements SchemeFactory {
    public JPParameterMetaDataTupleScheme getScheme() {
      return new JPParameterMetaDataTupleScheme();
    }
  }

  private static class JPParameterMetaDataTupleScheme extends TupleScheme<JPParameterMetaData> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, JPParameterMetaData struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.statementId);
      oprot.writeI32(struct.paramCount);
      BitSet optionals = new BitSet();
      if (struct.isSetParams()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetParams()) {
        {
          oprot.writeI32(struct.params.size());
          for (JPQueryParamMetaData _iter4 : struct.params)
          {
            _iter4.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, JPParameterMetaData struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.statementId = iprot.readString();
      struct.setStatementIdIsSet(true);
      struct.paramCount = iprot.readI32();
      struct.setParamCountIsSet(true);
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list5 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.params = new ArrayList<JPQueryParamMetaData>(_list5.size);
          JPQueryParamMetaData _elem6;
          for (int _i7 = 0; _i7 < _list5.size; ++_i7)
          {
            _elem6 = new JPQueryParamMetaData();
            _elem6.read(iprot);
            struct.params.add(_elem6);
          }
        }
        struct.setParamsIsSet(true);
      }
    }
  }

}
