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
public class JPSimpleQueryResultSet implements org.apache.thrift.TBase<JPSimpleQueryResultSet, JPSimpleQueryResultSet._Fields>, java.io.Serializable, Cloneable, Comparable<JPSimpleQueryResultSet> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("JPSimpleQueryResultSet");

  private static final org.apache.thrift.protocol.TField RESULT_META_DATA_FIELD_DESC = new org.apache.thrift.protocol.TField("resultMetaData", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField DATA_ROWS_FIELD_DESC = new org.apache.thrift.protocol.TField("dataRows", org.apache.thrift.protocol.TType.LIST, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new JPSimpleQueryResultSetStandardSchemeFactory());
    schemes.put(TupleScheme.class, new JPSimpleQueryResultSetTupleSchemeFactory());
  }

  public JPResultSetMetaData resultMetaData; // required
  public List<List<String>> dataRows; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    RESULT_META_DATA((short)1, "resultMetaData"),
    DATA_ROWS((short)2, "dataRows");

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
        case 1: // RESULT_META_DATA
          return RESULT_META_DATA;
        case 2: // DATA_ROWS
          return DATA_ROWS;
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
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.RESULT_META_DATA, new org.apache.thrift.meta_data.FieldMetaData("resultMetaData", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, JPResultSetMetaData.class)));
    tmpMap.put(_Fields.DATA_ROWS, new org.apache.thrift.meta_data.FieldMetaData("dataRows", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.LIST        , "JPValueListCollection")));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(JPSimpleQueryResultSet.class, metaDataMap);
  }

  public JPSimpleQueryResultSet() {
  }

  public JPSimpleQueryResultSet(
    JPResultSetMetaData resultMetaData,
    List<List<String>> dataRows)
  {
    this();
    this.resultMetaData = resultMetaData;
    this.dataRows = dataRows;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public JPSimpleQueryResultSet(JPSimpleQueryResultSet other) {
    if (other.isSetResultMetaData()) {
      this.resultMetaData = new JPResultSetMetaData(other.resultMetaData);
    }
    if (other.isSetDataRows()) {
      this.dataRows = other.dataRows;
    }
  }

  public JPSimpleQueryResultSet deepCopy() {
    return new JPSimpleQueryResultSet(this);
  }

  @Override
  public void clear() {
    this.resultMetaData = null;
    this.dataRows = null;
  }

  public JPResultSetMetaData getResultMetaData() {
    return this.resultMetaData;
  }

  public JPSimpleQueryResultSet setResultMetaData(JPResultSetMetaData resultMetaData) {
    this.resultMetaData = resultMetaData;
    return this;
  }

  public void unsetResultMetaData() {
    this.resultMetaData = null;
  }

  /** Returns true if field resultMetaData is set (has been assigned a value) and false otherwise */
  public boolean isSetResultMetaData() {
    return this.resultMetaData != null;
  }

  public void setResultMetaDataIsSet(boolean value) {
    if (!value) {
      this.resultMetaData = null;
    }
  }

  public int getDataRowsSize() {
    return (this.dataRows == null) ? 0 : this.dataRows.size();
  }

  public java.util.Iterator<List<String>> getDataRowsIterator() {
    return (this.dataRows == null) ? null : this.dataRows.iterator();
  }

  public void addToDataRows(List<String> elem) {
    if (this.dataRows == null) {
      this.dataRows = new ArrayList<List<String>>();
    }
    this.dataRows.add(elem);
  }

  public List<List<String>> getDataRows() {
    return this.dataRows;
  }

  public JPSimpleQueryResultSet setDataRows(List<List<String>> dataRows) {
    this.dataRows = dataRows;
    return this;
  }

  public void unsetDataRows() {
    this.dataRows = null;
  }

  /** Returns true if field dataRows is set (has been assigned a value) and false otherwise */
  public boolean isSetDataRows() {
    return this.dataRows != null;
  }

  public void setDataRowsIsSet(boolean value) {
    if (!value) {
      this.dataRows = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case RESULT_META_DATA:
      if (value == null) {
        unsetResultMetaData();
      } else {
        setResultMetaData((JPResultSetMetaData)value);
      }
      break;

    case DATA_ROWS:
      if (value == null) {
        unsetDataRows();
      } else {
        setDataRows((List<List<String>>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case RESULT_META_DATA:
      return getResultMetaData();

    case DATA_ROWS:
      return getDataRows();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case RESULT_META_DATA:
      return isSetResultMetaData();
    case DATA_ROWS:
      return isSetDataRows();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof JPSimpleQueryResultSet)
      return this.equals((JPSimpleQueryResultSet)that);
    return false;
  }

  public boolean equals(JPSimpleQueryResultSet that) {
    if (that == null)
      return false;

    boolean this_present_resultMetaData = true && this.isSetResultMetaData();
    boolean that_present_resultMetaData = true && that.isSetResultMetaData();
    if (this_present_resultMetaData || that_present_resultMetaData) {
      if (!(this_present_resultMetaData && that_present_resultMetaData))
        return false;
      if (!this.resultMetaData.equals(that.resultMetaData))
        return false;
    }

    boolean this_present_dataRows = true && this.isSetDataRows();
    boolean that_present_dataRows = true && that.isSetDataRows();
    if (this_present_dataRows || that_present_dataRows) {
      if (!(this_present_dataRows && that_present_dataRows))
        return false;
      if (!this.dataRows.equals(that.dataRows))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_resultMetaData = true && (isSetResultMetaData());
    list.add(present_resultMetaData);
    if (present_resultMetaData)
      list.add(resultMetaData);

    boolean present_dataRows = true && (isSetDataRows());
    list.add(present_dataRows);
    if (present_dataRows)
      list.add(dataRows);

    return list.hashCode();
  }

  @Override
  public int compareTo(JPSimpleQueryResultSet other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetResultMetaData()).compareTo(other.isSetResultMetaData());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetResultMetaData()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.resultMetaData, other.resultMetaData);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDataRows()).compareTo(other.isSetDataRows());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDataRows()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.dataRows, other.dataRows);
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
    StringBuilder sb = new StringBuilder("JPSimpleQueryResultSet(");
    boolean first = true;

    sb.append("resultMetaData:");
    if (this.resultMetaData == null) {
      sb.append("null");
    } else {
      sb.append(this.resultMetaData);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("dataRows:");
    if (this.dataRows == null) {
      sb.append("null");
    } else {
      sb.append(this.dataRows);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (resultMetaData == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'resultMetaData' was not present! Struct: " + toString());
    }
    if (dataRows == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'dataRows' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
    if (resultMetaData != null) {
      resultMetaData.validate();
    }
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class JPSimpleQueryResultSetStandardSchemeFactory implements SchemeFactory {
    public JPSimpleQueryResultSetStandardScheme getScheme() {
      return new JPSimpleQueryResultSetStandardScheme();
    }
  }

  private static class JPSimpleQueryResultSetStandardScheme extends StandardScheme<JPSimpleQueryResultSet> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, JPSimpleQueryResultSet struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // RESULT_META_DATA
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.resultMetaData = new JPResultSetMetaData();
              struct.resultMetaData.read(iprot);
              struct.setResultMetaDataIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // DATA_ROWS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list16 = iprot.readListBegin();
                struct.dataRows = new ArrayList<List<String>>(_list16.size);
                List<String> _elem17;
                for (int _i18 = 0; _i18 < _list16.size; ++_i18)
                {
                  {
                    org.apache.thrift.protocol.TList _list19 = iprot.readListBegin();
                    _elem17 = new ArrayList<String>(_list19.size);
                    String _elem20;
                    for (int _i21 = 0; _i21 < _list19.size; ++_i21)
                    {
                      _elem20 = iprot.readString();
                      _elem17.add(_elem20);
                    }
                    iprot.readListEnd();
                  }
                  struct.dataRows.add(_elem17);
                }
                iprot.readListEnd();
              }
              struct.setDataRowsIsSet(true);
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
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, JPSimpleQueryResultSet struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.resultMetaData != null) {
        oprot.writeFieldBegin(RESULT_META_DATA_FIELD_DESC);
        struct.resultMetaData.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.dataRows != null) {
        oprot.writeFieldBegin(DATA_ROWS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.LIST, struct.dataRows.size()));
          for (List<String> _iter22 : struct.dataRows)
          {
            {
              oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, _iter22.size()));
              for (String _iter23 : _iter22)
              {
                oprot.writeString(_iter23);
              }
              oprot.writeListEnd();
            }
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class JPSimpleQueryResultSetTupleSchemeFactory implements SchemeFactory {
    public JPSimpleQueryResultSetTupleScheme getScheme() {
      return new JPSimpleQueryResultSetTupleScheme();
    }
  }

  private static class JPSimpleQueryResultSetTupleScheme extends TupleScheme<JPSimpleQueryResultSet> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, JPSimpleQueryResultSet struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      struct.resultMetaData.write(oprot);
      {
        oprot.writeI32(struct.dataRows.size());
        for (List<String> _iter24 : struct.dataRows)
        {
          {
            oprot.writeI32(_iter24.size());
            for (String _iter25 : _iter24)
            {
              oprot.writeString(_iter25);
            }
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, JPSimpleQueryResultSet struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.resultMetaData = new JPResultSetMetaData();
      struct.resultMetaData.read(iprot);
      struct.setResultMetaDataIsSet(true);
      {
        org.apache.thrift.protocol.TList _list26 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.LIST, iprot.readI32());
        struct.dataRows = new ArrayList<List<String>>(_list26.size);
        List<String> _elem27;
        for (int _i28 = 0; _i28 < _list26.size; ++_i28)
        {
          {
            org.apache.thrift.protocol.TList _list29 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
            _elem27 = new ArrayList<String>(_list29.size);
            String _elem30;
            for (int _i31 = 0; _i31 < _list29.size; ++_i31)
            {
              _elem30 = iprot.readString();
              _elem27.add(_elem30);
            }
          }
          struct.dataRows.add(_elem27);
        }
      }
      struct.setDataRowsIsSet(true);
    }
  }

}

