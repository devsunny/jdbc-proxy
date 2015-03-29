package com.asksunny.jdbc.wrapper;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.Reader;
import java.io.StringReader;
import java.math.BigDecimal;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.sql.Array;
import java.sql.Blob;
import java.sql.Clob;
import java.sql.Date;
import java.sql.NClob;
import java.sql.Ref;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.RowId;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.SQLXML;
import java.sql.Statement;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Map;

import jline.internal.InputStreamReader;

public class SqlResultSet implements ResultSet {

	/**
	 * 
	 * This method need to make remote called to getData
	 * 
	 * 
	 * 
	 */
	public Object getObject(int intArg0) throws SQLException {
		return getObject(intArg0);
	}

	public boolean next() throws SQLException {
		return false;
	}

	public void close() throws SQLException {
	}

	public int getType() throws SQLException {
		return ResultSet.TYPE_FORWARD_ONLY;
	}

	public boolean previous() throws SQLException {
		return false;
	}

	public void cancelRowUpdates() throws SQLException {
	}

	public void clearWarnings() throws SQLException {
	}

	public boolean absolute(int intArg0) throws SQLException {
		return false;
	}

	public int findColumn(String columnLabel) {
		return -1;
	}

	public boolean first() throws SQLException {
		return false;
	}

	public int getConcurrency() throws SQLException {
		return 0;
	}

	public String getCursorName() throws SQLException {
		return null;
	}

	public int getFetchDirection() throws SQLException {
		return ResultSet.FETCH_FORWARD;
	}

	public int getHoldability() throws SQLException {
		return ResultSet.HOLD_CURSORS_OVER_COMMIT;
	}

	public boolean isBeforeFirst() throws SQLException {
		return false;
	}

	public void moveToCurrentRow() throws SQLException {
	}

	public void moveToInsertRow() throws SQLException {
	}

	public void setFetchDirection(int intArg0) throws SQLException {
	}

	public SQLWarning getWarnings() throws SQLException {
		return null;
	}

	public void insertRow() throws SQLException {
	}

	public boolean isAfterLast() throws SQLException {
		return false;
	}

	public boolean isClosed() throws SQLException {
		return false;
	}

	public boolean isFirst() throws SQLException {
		return false;
	}

	public boolean isLast() throws SQLException {
		return false;
	}

	public boolean last() throws SQLException {
		return false;
	}

	public void refreshRow() throws SQLException {

	}

	public boolean relative(int intArg0) throws SQLException {
		return false;
	}

	public boolean rowDeleted() throws SQLException {
		return false;
	}

	public boolean rowInserted() throws SQLException {
		return false;
	}

	public boolean rowUpdated() throws SQLException {
		return false;
	}

	public void setFetchSize(int intArg0) throws SQLException {
	}

	public Statement getStatement() throws SQLException {

		return null;
	}

	public int getFetchSize() throws SQLException {
		return 0;
	}

	public ResultSetMetaData getMetaData() throws SQLException {
		return null;
	}

	public int getRow() throws SQLException {
		return 0;
	}

	public RowId getRowId(int intArg0) throws SQLException {
		return null;
	}

	/**
	 * above are all must implemented methods
	 */

	public Object getObject(String stringArg0) throws SQLException {
		int columnIndex = findColumn(stringArg0);
		return getObject(columnIndex);
	}

	public Object getObject(String stringArg0,
			java.util.Map<String, Class<?>> map) throws SQLException {
		int columnIndex = findColumn(stringArg0);
		return getObject(columnIndex);
	}

	public <T> T getObject(String stringArg0, Class<T> type)
			throws SQLException {
		int columnIndex = findColumn(stringArg0);
		Object obj = getObject(columnIndex);
		if (obj == null)
			return null;
		return type.cast(obj);
	}

	public <T> T getObject(int intArg0, Class<T> type) throws SQLException {
		Object obj = getObject(intArg0);
		if (obj == null)
			return null;
		return type.cast(obj);
	}

	public Object getObject(int intArg0, java.util.Map<String, Class<?>> mapArg1)
			throws SQLException {
		Object obj = getObject(intArg0);
		return obj;
	}

	public boolean getBoolean(String stringArg0) throws SQLException {
		int columnIndex = findColumn(stringArg0);
		return getBoolean(columnIndex);
	}

	public boolean getBoolean(int intArg0) throws SQLException {
		Object obj = getObject(intArg0);
		if (obj == null)
			return false;
		if (obj instanceof Integer) {
			return ((Integer) obj).intValue() > 0;
		} else if (obj instanceof Long) {
			return ((Long) obj).longValue() > 0;
		} else if (obj instanceof Byte) {
			return ((Byte) obj).byteValue() > 0;
		} else if (obj instanceof Boolean) {
			return ((Boolean) obj).booleanValue();
		} else {
			return Boolean.FALSE;
		}
	}

	public byte getByte(int intArg0) throws SQLException {
		Object obj = getObject(intArg0);
		if (obj == null)
			return 0;
		if (obj instanceof Integer) {
			return ((Integer) obj).byteValue();
		} else if (obj instanceof Long) {
			return ((Long) obj).byteValue();
		} else if (obj instanceof Byte) {
			return ((Byte) obj).byteValue();
		} else if (obj instanceof Short) {
			return ((Short) obj).byteValue();
		} else if (obj instanceof Double) {
			return ((Double) obj).byteValue();
		} else if (obj instanceof Float) {
			return ((Float) obj).byteValue();
		} else if (obj instanceof BigDecimal) {
			return ((BigDecimal) obj).byteValue();
		} else {
			throw new SQLException("Type cast exception");
		}

	}

	public byte getByte(String stringArg0) throws SQLException {
		int columnIndex = findColumn(stringArg0);
		return getByte(columnIndex);
	}

	public short getShort(String stringArg0) throws SQLException {
		int columnIndex = findColumn(stringArg0);
		return getShort(columnIndex);
	}

	public short getShort(int intArg0) throws SQLException {
		Object obj = getObject(intArg0);
		if (obj == null)
			return 0;
		if (obj instanceof Integer) {
			return ((Integer) obj).shortValue();
		} else if (obj instanceof Long) {
			return ((Long) obj).shortValue();
		} else if (obj instanceof Byte) {
			return ((Byte) obj).shortValue();
		} else if (obj instanceof Short) {
			return ((Short) obj).shortValue();
		} else if (obj instanceof Double) {
			return ((Double) obj).shortValue();
		} else if (obj instanceof Float) {
			return ((Float) obj).shortValue();
		} else if (obj instanceof BigDecimal) {
			return ((BigDecimal) obj).shortValue();
		} else {
			throw new SQLException("Type cast exception");
		}
	}

	public int getInt(String stringArg0) throws SQLException {
		int columnIndex = findColumn(stringArg0);
		return getInt(columnIndex);
	}

	public int getInt(int intArg0) throws SQLException {
		Object obj = getObject(intArg0);
		if (obj == null)
			return 0;
		if (obj instanceof Integer) {
			return ((Integer) obj).intValue();
		} else if (obj instanceof Long) {
			return ((Long) obj).intValue();
		} else if (obj instanceof Byte) {
			return ((Byte) obj).intValue();
		} else if (obj instanceof Short) {
			return ((Short) obj).intValue();
		} else if (obj instanceof Double) {
			return ((Double) obj).intValue();
		} else if (obj instanceof Float) {
			return ((Float) obj).intValue();
		} else if (obj instanceof BigDecimal) {
			return ((BigDecimal) obj).intValue();
		} else {
			throw new SQLException("Type cast exception");
		}
	}

	public long getLong(String stringArg0) throws SQLException {
		int columnIndex = findColumn(stringArg0);
		if (columnIndex < 1) {
			throw new SQLException(String.format("Column %s does not exist",
					stringArg0));
		}
		return getLong(columnIndex);
	}

	public long getLong(int intArg0) throws SQLException {
		Object obj = getObject(intArg0);
		if (obj == null)
			return 0;
		if (obj instanceof Integer) {
			return ((Integer) obj).intValue();
		} else if (obj instanceof Long) {
			return ((Long) obj).longValue();
		} else if (obj instanceof Byte) {
			return ((Byte) obj).longValue();
		} else if (obj instanceof Short) {
			return ((Short) obj).longValue();
		} else if (obj instanceof Double) {
			return ((Double) obj).longValue();
		} else if (obj instanceof Float) {
			return ((Float) obj).longValue();
		} else if (obj instanceof BigDecimal) {
			return ((BigDecimal) obj).longValue();
		} else {
			throw new SQLException("Type cast exception");
		}
	}

	public float getFloat(int intArg0) throws SQLException {
		Object obj = getObject(intArg0);
		if (obj == null)
			return 0;
		if (obj instanceof Integer) {
			return ((Integer) obj).floatValue();
		} else if (obj instanceof Long) {
			return ((Long) obj).floatValue();
		} else if (obj instanceof Byte) {
			return ((Byte) obj).floatValue();
		} else if (obj instanceof Short) {
			return ((Short) obj).floatValue();
		} else if (obj instanceof Double) {
			return ((Double) obj).floatValue();
		} else if (obj instanceof Float) {
			return ((Float) obj).floatValue();
		} else if (obj instanceof BigDecimal) {
			return ((BigDecimal) obj).floatValue();
		} else {
			throw new SQLException("Type cast exception");
		}
	}

	public float getFloat(String stringArg0) throws SQLException {
		int columnIndex = findColumn(stringArg0);
		return getFloat(columnIndex);
	}

	public double getDouble(int intArg0) throws SQLException {
		Object obj = getObject(intArg0);
		if (obj == null)
			return 0;
		if (obj instanceof Integer) {
			return ((Integer) obj).doubleValue();
		} else if (obj instanceof Long) {
			return ((Long) obj).doubleValue();
		} else if (obj instanceof Byte) {
			return ((Byte) obj).doubleValue();
		} else if (obj instanceof Short) {
			return ((Short) obj).doubleValue();
		} else if (obj instanceof Double) {
			return ((Double) obj).doubleValue();
		} else if (obj instanceof Float) {
			return ((Float) obj).doubleValue();
		} else if (obj instanceof BigDecimal) {
			return ((BigDecimal) obj).doubleValue();
		} else {
			throw new SQLException("Type cast exception");
		}
	}

	public double getDouble(String stringArg0) throws SQLException {
		int columnIndex = findColumn(stringArg0);
		return getDouble(columnIndex);
	}

	public Array getArray(String stringArg0) throws SQLException {
		int columnIndex = findColumn(stringArg0);
		return getArray(columnIndex);
	}

	public Array getArray(int intArg0) throws SQLException {
		Object obj = getObject(intArg0);
		if (obj == null)
			return null;
		if (obj instanceof Array) {
			return (Array) obj;
		} else {
			throw new SQLException("Type cast exception");
		}
	}

	public URL getURL(String stringArg0) throws SQLException {
		int columnIndex = findColumn(stringArg0);
		return getURL(columnIndex);
	}

	public URL getURL(int intArg0) throws SQLException {
		Object obj = getObject(intArg0);
		if (obj == null)
			return null;
		if (obj instanceof URL) {
			return (URL) obj;
		} else if (obj instanceof String) {
			try {
				URL url = new URL(obj.toString());
				return url;
			} catch (Exception ex) {
				throw new SQLException(String.format("Invalid URL format %s",
						obj.toString()));
			}
		} else {
			throw new SQLException("Type cast exception");
		}
	}

	public byte[] getBytes(String stringArg0) throws SQLException {
		int columnIndex = findColumn(stringArg0);
		return getBytes(columnIndex);
	}

	public byte[] getBytes(int intArg0) throws SQLException {
		Object obj = getObject(intArg0);
		if (obj == null)
			return null;
		if (obj instanceof byte[]) {
			return (byte[]) obj;
		} else if (obj instanceof String) {
			return ((String) obj).getBytes(Charset.defaultCharset());
		} else {
			throw new SQLException("Type cast exception");
		}
	}

	public String getString(int intArg0) throws SQLException {
		Object obj = getObject(intArg0);
		if (obj == null)
			return null;
		if (obj instanceof byte[]) {
			return new String((byte[]) obj);
		} else if (obj instanceof String) {
			return (String) obj;
		} else {
			return obj.toString();
		}
	}

	public String getString(String stringArg0) throws SQLException {
		int columnIndex = findColumn(stringArg0);
		return getString(columnIndex);
	}

	public Ref getRef(String stringArg0) throws SQLException {
		int columnIndex = findColumn(stringArg0);
		return getRef(columnIndex);
	}

	public Ref getRef(int intArg0) throws SQLException {
		return null;
	}

	public InputStream getAsciiStream(int intArg0) throws SQLException {
		Object obj = getObject(intArg0);
		if (obj == null)
			return null;
		if (obj instanceof byte[]) {
			return new ByteArrayInputStream((byte[]) obj);
		} else if (obj instanceof String) {
			return new ByteArrayInputStream(
					((String) obj).getBytes(StandardCharsets.US_ASCII));
		} else {
			throw new SQLException("Type cast exception");
		}
	}

	public InputStream getAsciiStream(String stringArg0) throws SQLException {
		int columnIndex = findColumn(stringArg0);
		return getAsciiStream(columnIndex);
	}

	public BigDecimal getBigDecimal(String stringArg0) throws SQLException {
		int columnIndex = findColumn(stringArg0);
		return getBigDecimal(columnIndex);
	}

	public BigDecimal getBigDecimal(int intArg0) throws SQLException {
		Object obj = getObject(intArg0);
		if (obj == null)
			return null;
		if (obj instanceof Integer) {
			return new BigDecimal(((Integer) obj));
		} else if (obj instanceof Long) {
			return new BigDecimal(((Long) obj));
		} else if (obj instanceof Byte) {
			return new BigDecimal(((Byte) obj));
		} else if (obj instanceof Short) {
			return new BigDecimal(((Short) obj));
		} else if (obj instanceof Double) {
			return new BigDecimal(((Double) obj));
		} else if (obj instanceof Float) {
			return new BigDecimal(((Float) obj));
		} else if (obj instanceof BigDecimal) {
			return ((BigDecimal) obj);
		} else {
			throw new SQLException("Type cast exception");
		}
	}

	@Deprecated
	public BigDecimal getBigDecimal(int intArg0, int scale) throws SQLException {

		BigDecimal bd = getBigDecimal(intArg0);
		if (bd == null)
			return bd;
		bd.setScale(scale);
		return bd;
	}

	@Deprecated
	public BigDecimal getBigDecimal(String stringArg0, int scale)
			throws SQLException {
		int columnIndex = findColumn(stringArg0);
		BigDecimal bd = getBigDecimal(columnIndex);
		if (bd == null)
			return bd;
		bd.setScale(scale);
		return bd;
	}

	public InputStream getBinaryStream(int intArg0) throws SQLException {
		return getAsciiStream(intArg0);
	}

	public InputStream getBinaryStream(String stringArg0) throws SQLException {
		int columnIndex = findColumn(stringArg0);
		return getBinaryStream(columnIndex);
	}

	public Reader getCharacterStream(String stringArg0) throws SQLException {
		int columnIndex = findColumn(stringArg0);
		return getCharacterStream(columnIndex);
	}

	public Reader getCharacterStream(int intArg0) throws SQLException {
		Object obj = getObject(intArg0);
		if (obj == null)
			return null;
		if (obj instanceof byte[]) {
			return new InputStreamReader(new ByteArrayInputStream((byte[]) obj));
		} else if (obj instanceof String) {
			return new StringReader((String) obj);
		} else if (obj instanceof Clob) {
			return ((Clob) obj).getCharacterStream();
		} else {
			return new StringReader(obj.toString());
		}
	}

	public Reader getNCharacterStream(int intArg0) throws SQLException {
		Object obj = getObject(intArg0);
		if (obj == null)
			return null;
		if (obj instanceof byte[]) {
			return new InputStreamReader(new ByteArrayInputStream((byte[]) obj));
		} else if (obj instanceof String) {
			return new StringReader((String) obj);
		} else if (obj instanceof Clob) {
			return ((Clob) obj).getCharacterStream();
		} else {
			return new StringReader(obj.toString());
		}
	}

	public Reader getNCharacterStream(String stringArg0) throws SQLException {
		int columnIndex = findColumn(stringArg0);
		return getNCharacterStream(columnIndex);
	}

	public InputStream getUnicodeStream(String stringArg0) throws SQLException {
		int columnIndex = findColumn(stringArg0);
		return getUnicodeStream(columnIndex);
	}

	public InputStream getUnicodeStream(int intArg0) throws SQLException {
		Object obj = getObject(intArg0);
		if (obj == null)
			return null;
		if (obj instanceof byte[]) {
			return new ByteArrayInputStream((byte[]) obj);
		} else if (obj instanceof String) {
			return new ByteArrayInputStream(
					((String) obj).getBytes(StandardCharsets.UTF_8));
		} else {
			throw new SQLException("Type cast exception");
		}
	}

	public void updateAsciiStream(int intArg0, InputStream inputstreamArg1,
			int intArg2) throws SQLException {
	}

	public void updateAsciiStream(String stringArg0,
			InputStream inputstreamArg1, int intArg2) throws SQLException {
	}

	public void updateAsciiStream(int intArg0, InputStream inputstreamArg1,
			long longArg2) throws SQLException {
	}

	public void updateAsciiStream(int intArg0, InputStream inputstreamArg1)
			throws SQLException {
	}

	public void updateAsciiStream(String stringArg0, InputStream inputstreamArg1)
			throws SQLException {
	}

	public void updateAsciiStream(String stringArg0,
			InputStream inputstreamArg1, long longArg2) throws SQLException {
	}

	public void updateBigDecimal(int intArg0, BigDecimal bigdecimalArg1)
			throws SQLException {
	}

	public void updateBigDecimal(String stringArg0, BigDecimal bigdecimalArg1)
			throws SQLException {
	}

	public void updateBinaryStream(String stringArg0,
			InputStream inputstreamArg1, int intArg2) throws SQLException {
	}

	public void updateBinaryStream(String stringArg0,
			InputStream inputstreamArg1) throws SQLException {
	}

	public void updateBinaryStream(int intArg0, InputStream inputstreamArg1,
			int intArg2) throws SQLException {
	}

	public void updateBinaryStream(int intArg0, InputStream inputstreamArg1)
			throws SQLException {
	}

	public void updateBinaryStream(int intArg0, InputStream inputstreamArg1,
			long longArg2) throws SQLException {
	}

	public void updateBinaryStream(String stringArg0,
			InputStream inputstreamArg1, long longArg2) throws SQLException {
	}

	public void updateBoolean(String stringArg0, boolean booleanArg1)
			throws SQLException {
	}

	public void updateBoolean(int intArg0, boolean booleanArg1)
			throws SQLException {
	}

	public void updateCharacterStream(String stringArg0, Reader readerArg1)
			throws SQLException {
	}

	public void updateCharacterStream(String stringArg0, Reader readerArg1,
			long longArg2) throws SQLException {
	}

	public void updateCharacterStream(int intArg0, Reader readerArg1,
			long longArg2) throws SQLException {
	}

	public void updateCharacterStream(int intArg0, Reader readerArg1)
			throws SQLException {
	}

	public void updateCharacterStream(String stringArg0, Reader readerArg1,
			int intArg2) throws SQLException {
	}

	public void updateCharacterStream(int intArg0, Reader readerArg1,
			int intArg2) throws SQLException {
	}

	public void updateNCharacterStream(int intArg0, Reader readerArg1,
			long longArg2) throws SQLException {
	}

	public void updateNCharacterStream(String stringArg0, Reader readerArg1)
			throws SQLException {
	}

	public void updateNCharacterStream(String stringArg0, Reader readerArg1,
			long longArg2) throws SQLException {
	}

	public void updateNCharacterStream(int intArg0, Reader readerArg1)
			throws SQLException {
	}

	public void updateNString(String stringArg0, String stringArg1)
			throws SQLException {
	}

	public void updateNString(int intArg0, String stringArg1)
			throws SQLException {
	}

	public void updateTimestamp(String stringArg0, Timestamp timestampArg1)
			throws SQLException {
	}

	public void updateTimestamp(int intArg0, Timestamp timestampArg1)
			throws SQLException {
	}

	public Date getDate(String stringArg0) throws SQLException {
		int columnIndex = findColumn(stringArg0);
		return getDate(columnIndex);
	}

	public Date getDate(int intArg0) throws SQLException {
		Object obj = getObject(intArg0);
		if (obj == null)
			return null;
		if (obj instanceof Date) {
			return (Date) obj;
		} else if (obj instanceof Time) {
			return new Date(((Time) obj).getTime());
		} else if (obj instanceof Timestamp) {
			return new Date(((Timestamp) obj).getTime());
		} else {
			throw new SQLException("Type cast exception");
		}
	}

	public Date getDate(String stringArg0, Calendar calendarArg1)
			throws SQLException {
		int columnIndex = findColumn(stringArg0);
		return getDate(columnIndex);
	}

	public Date getDate(int intArg0, Calendar calendarArg1) throws SQLException {

		Object obj = getObject(intArg0);
		if (obj == null)
			return null;
		Date ret = null;
		if (obj instanceof Date) {
			ret = (Date) obj;
		} else if (obj instanceof Time) {
			ret = new Date(((Time) obj).getTime());
		} else if (obj instanceof Timestamp) {
			ret = new Date(((Timestamp) obj).getTime());
		} else {
			throw new SQLException("Type cast exception");
		}
		if (calendarArg1 == null)
			return ret;
		Calendar cal = Calendar.getInstance();
		cal.setTime(ret);
		cal.setTimeZone(calendarArg1.getTimeZone());
		return new Date(cal.getTimeInMillis());
	}

	public void afterLast() throws SQLException {
	}

	public void beforeFirst() throws SQLException {
	}

	public void deleteRow() throws SQLException {
	}

	public Blob getBlob(int intArg0) throws SQLException {
		return new SqlBlob();
	}

	public Blob getBlob(String stringArg0) throws SQLException {
		int columnIndex = findColumn(stringArg0);
		return getBlob(columnIndex);
	}

	public Clob getClob(int intArg0) throws SQLException {
		return new SqlClob();
	}

	public Clob getClob(String stringArg0) throws SQLException {
		int columnIndex = findColumn(stringArg0);
		return getClob(columnIndex);
	}

	public NClob getNClob(int intArg0) throws SQLException {
		return new SqlNClob();
	}

	public NClob getNClob(String stringArg0) throws SQLException {
		int columnIndex = findColumn(stringArg0);
		return getNClob(columnIndex);
	}

	public String getNString(int intArg0) throws SQLException {
		Object obj = getObject(intArg0);
		if (obj == null)
			return null;
		if (obj instanceof byte[]) {
			return new String((byte[]) obj, StandardCharsets.UTF_8);
		} else if (obj instanceof String) {
			return (String) obj;
		} else {
			return obj.toString();
		}
	}

	public String getNString(String stringArg0) throws SQLException {
		int columnIndex = findColumn(stringArg0);
		return getNString(columnIndex);
	}

	public RowId getRowId(String stringArg0) throws SQLException {
		int columnIndex = findColumn(stringArg0);
		return getRowId(columnIndex);
	}

	public SQLXML getSQLXML(int intArg0) throws SQLException {
		return new SqlXmlObject();
	}

	public SQLXML getSQLXML(String stringArg0) throws SQLException {
		int columnIndex = findColumn(stringArg0);
		return getSQLXML(columnIndex);
	}

	public Time getTime(String stringArg0, Calendar calendarArg1)
			throws SQLException {
		int columnIndex = findColumn(stringArg0);
		return getTime(columnIndex);
	}

	public Time getTime(String stringArg0) throws SQLException {
		int columnIndex = findColumn(stringArg0);
		return getTime(columnIndex);
	}

	public Time getTime(int intArg0) throws SQLException {
		Object obj = getObject(intArg0);
		if (obj == null)
			return null;
		if (obj instanceof Date) {
			return new Time(((Date) obj).getTime());
		} else if (obj instanceof Time) {
			return (Time) obj;
		} else if (obj instanceof Timestamp) {
			return new Time(((Timestamp) obj).getTime());
		} else {
			throw new SQLException("Type cast exception");
		}
	}

	public Time getTime(int intArg0, Calendar calendarArg1) throws SQLException {

		Time t = getTime(intArg0);
		if (t == null || calendarArg1 == null)
			return t;
		Calendar cal = Calendar.getInstance();
		cal.setTime(t);
		cal.setTimeZone(calendarArg1.getTimeZone());
		return new Time(cal.getTimeInMillis());
	}

	public Timestamp getTimestamp(String stringArg0, Calendar calendarArg1)
			throws SQLException {
		int columnIndex = findColumn(stringArg0);
		return getTimestamp(columnIndex);
	}

	public Timestamp getTimestamp(int intArg0) throws SQLException {
		Object obj = getObject(intArg0);
		if (obj == null)
			return null;
		if (obj instanceof Date) {
			return new Timestamp(((Date) obj).getTime());
		} else if (obj instanceof Timestamp) {
			return (Timestamp) obj;
		} else if (obj instanceof Time) {
			return new Timestamp(((Time) obj).getTime());
		} else {
			throw new SQLException("Type cast exception");
		}
	}

	public Timestamp getTimestamp(String stringArg0) throws SQLException {
		int columnIndex = findColumn(stringArg0);
		return getTimestamp(columnIndex);
	}

	public Timestamp getTimestamp(int intArg0, Calendar calendarArg1)
			throws SQLException {
		Timestamp t = getTimestamp(intArg0);
		if (t == null || calendarArg1 == null)
			return t;
		Calendar cal = Calendar.getInstance();
		cal.setTime(t);
		cal.setTimeZone(calendarArg1.getTimeZone());
		return new Timestamp(cal.getTimeInMillis());
	}

	
	/**
	 * 
	 */
	public void updateArray(int intArg0, Array arrayArg1) throws SQLException {
	}

	public void updateArray(String stringArg0, Array arrayArg1)
			throws SQLException {
	}

	public void updateBlob(String stringArg0, InputStream inputstreamArg1)
			throws SQLException {
	}

	public void updateBlob(String stringArg0, InputStream inputstreamArg1,
			long longArg2) throws SQLException {
	}

	public void updateBlob(int intArg0, InputStream inputstreamArg1)
			throws SQLException {
	}

	public void updateBlob(int intArg0, InputStream inputstreamArg1,
			long longArg2) throws SQLException {
	}

	public void updateBlob(int intArg0, Blob blobArg1) throws SQLException {
	}

	public void updateBlob(String stringArg0, Blob blobArg1)
			throws SQLException {
	}

	public void updateByte(int intArg0, byte byteArg1) throws SQLException {
	}

	public void updateByte(String stringArg0, byte byteArg1)
			throws SQLException {
	}

	public void updateBytes(String stringArg0, byte[] bytesArg1)
			throws SQLException {
	}

	public void updateBytes(int intArg0, byte[] bytesArg1) throws SQLException {
	}

	public void updateClob(String stringArg0, Clob clobArg1)
			throws SQLException {
	}

	public void updateClob(int intArg0, Clob clobArg1) throws SQLException {
	}

	public void updateClob(String stringArg0, Reader readerArg1)
			throws SQLException {
	}

	public void updateClob(int intArg0, Reader readerArg1) throws SQLException {
	}

	public void updateClob(String stringArg0, Reader readerArg1, long longArg2)
			throws SQLException {
	}

	public void updateClob(int intArg0, Reader readerArg1, long longArg2)
			throws SQLException {
	}

	public void updateDate(String stringArg0, Date dateArg1)
			throws SQLException {
	}

	public void updateDate(int intArg0, Date dateArg1) throws SQLException {
	}

	public void updateDouble(int intArg0, double doubleArg1)
			throws SQLException {
	}

	public void updateDouble(String stringArg0, double doubleArg1)
			throws SQLException {
	}

	public void updateFloat(String stringArg0, float floatArg1)
			throws SQLException {
	}

	public void updateFloat(int intArg0, float floatArg1) throws SQLException {
	}

	public void updateInt(int intArg0, int intArg1) throws SQLException {
	}

	public void updateInt(String stringArg0, int intArg1) throws SQLException {
	}

	public void updateLong(String stringArg0, long longArg1)
			throws SQLException {
	}

	public void updateLong(int intArg0, long longArg1) throws SQLException {
	}

	public void updateNClob(int intArg0, Reader readerArg1, long longArg2)
			throws SQLException {
	}

	public void updateNClob(String stringArg0, Reader readerArg1, long longArg2)
			throws SQLException {
	}

	public void updateNClob(String stringArg0, NClob nclobArg1)
			throws SQLException {
	}

	public void updateNClob(int intArg0, Reader readerArg1) throws SQLException {
	}

	public void updateNClob(String stringArg0, Reader readerArg1)
			throws SQLException {
	}

	public void updateNClob(int intArg0, NClob nclobArg1) throws SQLException {
	}

	public void updateNull(String stringArg0) throws SQLException {
	}

	public void updateNull(int intArg0) throws SQLException {
	}

	public void updateObject(int intArg0, Object objectArg1, int intArg2)
			throws SQLException {
	}

	public void updateObject(int intArg0, Object objectArg1)
			throws SQLException {
	}

	public void updateObject(String stringArg0, Object objectArg1)
			throws SQLException {
	}

	public void updateObject(String stringArg0, Object objectArg1, int intArg2)
			throws SQLException {
	}

	public void updateRef(int intArg0, Ref refArg1) throws SQLException {
	}

	public void updateRef(String stringArg0, Ref refArg1) throws SQLException {
	}

	public void updateRow() throws SQLException {
	}

	public void updateRowId(int intArg0, RowId rowidArg1) throws SQLException {
	}

	public void updateRowId(String stringArg0, RowId rowidArg1)
			throws SQLException {
	}

	public void updateSQLXML(String stringArg0, SQLXML sqlxmlArg1)
			throws SQLException {
	}

	public void updateSQLXML(int intArg0, SQLXML sqlxmlArg1)
			throws SQLException {
	}

	public void updateShort(int intArg0, short shortArg1) throws SQLException {
	}

	public void updateShort(String stringArg0, short shortArg1)
			throws SQLException {
	}

	public void updateString(int intArg0, String stringArg1)
			throws SQLException {
	}

	public void updateString(String stringArg0, String stringArg1)
			throws SQLException {
	}

	public void updateTime(int intArg0, Time timeArg1) throws SQLException {
	}

	public void updateTime(String stringArg0, Time timeArg1)
			throws SQLException {
	}

	public boolean wasNull() throws SQLException {

		return false;
	}

	public <T> T unwrap(Class<T> classArg0) throws SQLException {
		return classArg0.cast(this);
	}

	public boolean isWrapperFor(Class<?> classArg0) throws SQLException {
		return classArg0.isInstance(this);
	}

}
