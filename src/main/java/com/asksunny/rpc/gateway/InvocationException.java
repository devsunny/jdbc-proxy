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
public class InvocationException extends TException implements org.apache.thrift.TBase<InvocationException, InvocationException._Fields>, java.io.Serializable, Cloneable, Comparable<InvocationException> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("InvocationException");

  private static final org.apache.thrift.protocol.TField ERROR_CODE_FIELD_DESC = new org.apache.thrift.protocol.TField("errorCode", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField SQLSTATE_FIELD_DESC = new org.apache.thrift.protocol.TField("sqlstate", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField MESSAGE_FIELD_DESC = new org.apache.thrift.protocol.TField("message", org.apache.thrift.protocol.TType.STRING, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new InvocationExceptionStandardSchemeFactory());
    schemes.put(TupleScheme.class, new InvocationExceptionTupleSchemeFactory());
  }

  public int errorCode; // required
  public String sqlstate; // required
  public String message; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ERROR_CODE((short)1, "errorCode"),
    SQLSTATE((short)2, "sqlstate"),
    MESSAGE((short)3, "message");

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
        case 1: // ERROR_CODE
          return ERROR_CODE;
        case 2: // SQLSTATE
          return SQLSTATE;
        case 3: // MESSAGE
          return MESSAGE;
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
  private static final int __ERRORCODE_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.MESSAGE};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ERROR_CODE, new org.apache.thrift.meta_data.FieldMetaData("errorCode", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.SQLSTATE, new org.apache.thrift.meta_data.FieldMetaData("sqlstate", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.MESSAGE, new org.apache.thrift.meta_data.FieldMetaData("message", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(InvocationException.class, metaDataMap);
  }

  public InvocationException() {
  }

  public InvocationException(
    int errorCode,
    String sqlstate)
  {
    this();
    this.errorCode = errorCode;
    setErrorCodeIsSet(true);
    this.sqlstate = sqlstate;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public InvocationException(InvocationException other) {
    __isset_bitfield = other.__isset_bitfield;
    this.errorCode = other.errorCode;
    if (other.isSetSqlstate()) {
      this.sqlstate = other.sqlstate;
    }
    if (other.isSetMessage()) {
      this.message = other.message;
    }
  }

  public InvocationException deepCopy() {
    return new InvocationException(this);
  }

  @Override
  public void clear() {
    setErrorCodeIsSet(false);
    this.errorCode = 0;
    this.sqlstate = null;
    this.message = null;
  }

  public int getErrorCode() {
    return this.errorCode;
  }

  public InvocationException setErrorCode(int errorCode) {
    this.errorCode = errorCode;
    setErrorCodeIsSet(true);
    return this;
  }

  public void unsetErrorCode() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ERRORCODE_ISSET_ID);
  }

  /** Returns true if field errorCode is set (has been assigned a value) and false otherwise */
  public boolean isSetErrorCode() {
    return EncodingUtils.testBit(__isset_bitfield, __ERRORCODE_ISSET_ID);
  }

  public void setErrorCodeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ERRORCODE_ISSET_ID, value);
  }

  public String getSqlstate() {
    return this.sqlstate;
  }

  public InvocationException setSqlstate(String sqlstate) {
    this.sqlstate = sqlstate;
    return this;
  }

  public void unsetSqlstate() {
    this.sqlstate = null;
  }

  /** Returns true if field sqlstate is set (has been assigned a value) and false otherwise */
  public boolean isSetSqlstate() {
    return this.sqlstate != null;
  }

  public void setSqlstateIsSet(boolean value) {
    if (!value) {
      this.sqlstate = null;
    }
  }

  public String getMessage() {
    return this.message;
  }

  public InvocationException setMessage(String message) {
    this.message = message;
    return this;
  }

  public void unsetMessage() {
    this.message = null;
  }

  /** Returns true if field message is set (has been assigned a value) and false otherwise */
  public boolean isSetMessage() {
    return this.message != null;
  }

  public void setMessageIsSet(boolean value) {
    if (!value) {
      this.message = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ERROR_CODE:
      if (value == null) {
        unsetErrorCode();
      } else {
        setErrorCode((Integer)value);
      }
      break;

    case SQLSTATE:
      if (value == null) {
        unsetSqlstate();
      } else {
        setSqlstate((String)value);
      }
      break;

    case MESSAGE:
      if (value == null) {
        unsetMessage();
      } else {
        setMessage((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ERROR_CODE:
      return Integer.valueOf(getErrorCode());

    case SQLSTATE:
      return getSqlstate();

    case MESSAGE:
      return getMessage();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ERROR_CODE:
      return isSetErrorCode();
    case SQLSTATE:
      return isSetSqlstate();
    case MESSAGE:
      return isSetMessage();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof InvocationException)
      return this.equals((InvocationException)that);
    return false;
  }

  public boolean equals(InvocationException that) {
    if (that == null)
      return false;

    boolean this_present_errorCode = true;
    boolean that_present_errorCode = true;
    if (this_present_errorCode || that_present_errorCode) {
      if (!(this_present_errorCode && that_present_errorCode))
        return false;
      if (this.errorCode != that.errorCode)
        return false;
    }

    boolean this_present_sqlstate = true && this.isSetSqlstate();
    boolean that_present_sqlstate = true && that.isSetSqlstate();
    if (this_present_sqlstate || that_present_sqlstate) {
      if (!(this_present_sqlstate && that_present_sqlstate))
        return false;
      if (!this.sqlstate.equals(that.sqlstate))
        return false;
    }

    boolean this_present_message = true && this.isSetMessage();
    boolean that_present_message = true && that.isSetMessage();
    if (this_present_message || that_present_message) {
      if (!(this_present_message && that_present_message))
        return false;
      if (!this.message.equals(that.message))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_errorCode = true;
    list.add(present_errorCode);
    if (present_errorCode)
      list.add(errorCode);

    boolean present_sqlstate = true && (isSetSqlstate());
    list.add(present_sqlstate);
    if (present_sqlstate)
      list.add(sqlstate);

    boolean present_message = true && (isSetMessage());
    list.add(present_message);
    if (present_message)
      list.add(message);

    return list.hashCode();
  }

  @Override
  public int compareTo(InvocationException other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetErrorCode()).compareTo(other.isSetErrorCode());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetErrorCode()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.errorCode, other.errorCode);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSqlstate()).compareTo(other.isSetSqlstate());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSqlstate()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.sqlstate, other.sqlstate);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMessage()).compareTo(other.isSetMessage());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMessage()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.message, other.message);
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
    StringBuilder sb = new StringBuilder("InvocationException(");
    boolean first = true;

    sb.append("errorCode:");
    sb.append(this.errorCode);
    first = false;
    if (!first) sb.append(", ");
    sb.append("sqlstate:");
    if (this.sqlstate == null) {
      sb.append("null");
    } else {
      sb.append(this.sqlstate);
    }
    first = false;
    if (isSetMessage()) {
      if (!first) sb.append(", ");
      sb.append("message:");
      if (this.message == null) {
        sb.append("null");
      } else {
        sb.append(this.message);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'errorCode' because it's a primitive and you chose the non-beans generator.
    if (sqlstate == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'sqlstate' was not present! Struct: " + toString());
    }
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

  private static class InvocationExceptionStandardSchemeFactory implements SchemeFactory {
    public InvocationExceptionStandardScheme getScheme() {
      return new InvocationExceptionStandardScheme();
    }
  }

  private static class InvocationExceptionStandardScheme extends StandardScheme<InvocationException> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, InvocationException struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ERROR_CODE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.errorCode = iprot.readI32();
              struct.setErrorCodeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // SQLSTATE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.sqlstate = iprot.readString();
              struct.setSqlstateIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // MESSAGE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.message = iprot.readString();
              struct.setMessageIsSet(true);
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
      if (!struct.isSetErrorCode()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'errorCode' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, InvocationException struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(ERROR_CODE_FIELD_DESC);
      oprot.writeI32(struct.errorCode);
      oprot.writeFieldEnd();
      if (struct.sqlstate != null) {
        oprot.writeFieldBegin(SQLSTATE_FIELD_DESC);
        oprot.writeString(struct.sqlstate);
        oprot.writeFieldEnd();
      }
      if (struct.message != null) {
        if (struct.isSetMessage()) {
          oprot.writeFieldBegin(MESSAGE_FIELD_DESC);
          oprot.writeString(struct.message);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class InvocationExceptionTupleSchemeFactory implements SchemeFactory {
    public InvocationExceptionTupleScheme getScheme() {
      return new InvocationExceptionTupleScheme();
    }
  }

  private static class InvocationExceptionTupleScheme extends TupleScheme<InvocationException> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, InvocationException struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI32(struct.errorCode);
      oprot.writeString(struct.sqlstate);
      BitSet optionals = new BitSet();
      if (struct.isSetMessage()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetMessage()) {
        oprot.writeString(struct.message);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, InvocationException struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.errorCode = iprot.readI32();
      struct.setErrorCodeIsSet(true);
      struct.sqlstate = iprot.readString();
      struct.setSqlstateIsSet(true);
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.message = iprot.readString();
        struct.setMessageIsSet(true);
      }
    }
  }

}

