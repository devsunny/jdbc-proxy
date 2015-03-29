package com.asksunny.jdbc.wrapper;

import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.net.URL;
import java.sql.Array;
import java.sql.Blob;
import java.sql.CallableStatement;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.Date;
import java.sql.NClob;
import java.sql.ParameterMetaData;
import java.sql.PreparedStatement;
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

public class SqlStatement implements CallableStatement {

	private final Statement wrappedStatement;
	private final String uuid;
	

	public SqlStatement(String uuid, Statement wrappedStatement) {
		super();
		this.uuid = uuid;
		this.wrappedStatement = wrappedStatement;
	}

	public Statement getWrappedStatement() {
		return wrappedStatement;
	}

	public String getUuid() {
		return uuid;
	}

	public Object getObject(String stringArg0,
			java.util.Map<String, Class<?>> mapArg1) throws SQLException {
		return ((CallableStatement) wrappedStatement).getObject(stringArg0,
				mapArg1);
	}

	public Object getObject(String stringArg0) throws SQLException {
		return ((CallableStatement) wrappedStatement).getObject(stringArg0);
	}

	public Object getObject(int intArg0) throws SQLException {
		return ((CallableStatement) wrappedStatement).getObject(intArg0);
	}

	public Object getObject(int intArg0, java.util.Map<String, Class<?>> mapArg1)
			throws SQLException {
		return ((CallableStatement) wrappedStatement).getObject(intArg0,
				mapArg1);
	}

	public <T> T getObject(int intArg0, Class<T> classArg1) throws SQLException {
		return ((CallableStatement) wrappedStatement).getObject(intArg0,
				classArg1);
	}

	public <T> T getObject(String stringArg0, Class<T> classArg1)
			throws SQLException {
		return ((CallableStatement) wrappedStatement).getObject(stringArg0,
				classArg1);
	}

	public boolean getBoolean(String stringArg0) throws SQLException {
		return ((CallableStatement) wrappedStatement).getBoolean(stringArg0);
	}

	public boolean getBoolean(int intArg0) throws SQLException {
		return ((CallableStatement) wrappedStatement).getBoolean(intArg0);
	}

	public byte getByte(String stringArg0) throws SQLException {
		return ((CallableStatement) wrappedStatement).getByte(stringArg0);
	}

	public byte getByte(int intArg0) throws SQLException {
		return ((CallableStatement) wrappedStatement).getByte(intArg0);
	}

	public short getShort(int intArg0) throws SQLException {
		return ((CallableStatement) wrappedStatement).getShort(intArg0);
	}

	public short getShort(String stringArg0) throws SQLException {
		return ((CallableStatement) wrappedStatement).getShort(stringArg0);
	}

	public int getInt(String stringArg0) throws SQLException {
		return ((CallableStatement) wrappedStatement).getInt(stringArg0);
	}

	public int getInt(int intArg0) throws SQLException {
		return ((CallableStatement) wrappedStatement).getInt(intArg0);
	}

	public long getLong(String stringArg0) throws SQLException {
		return ((CallableStatement) wrappedStatement).getLong(stringArg0);
	}

	public long getLong(int intArg0) throws SQLException {
		return ((CallableStatement) wrappedStatement).getLong(intArg0);
	}

	public float getFloat(int intArg0) throws SQLException {
		return ((CallableStatement) wrappedStatement).getFloat(intArg0);
	}

	public float getFloat(String stringArg0) throws SQLException {
		return ((CallableStatement) wrappedStatement).getFloat(stringArg0);
	}

	public double getDouble(int intArg0) throws SQLException {
		return ((CallableStatement) wrappedStatement).getDouble(intArg0);
	}

	public double getDouble(String stringArg0) throws SQLException {
		return ((CallableStatement) wrappedStatement).getDouble(stringArg0);
	}

	public Array getArray(int intArg0) throws SQLException {
		return ((CallableStatement) wrappedStatement).getArray(intArg0);
	}

	public Array getArray(String stringArg0) throws SQLException {
		return ((CallableStatement) wrappedStatement).getArray(stringArg0);
	}

	public URL getURL(int intArg0) throws SQLException {
		return ((CallableStatement) wrappedStatement).getURL(intArg0);
	}

	public URL getURL(String stringArg0) throws SQLException {
		return ((CallableStatement) wrappedStatement).getURL(stringArg0);
	}

	public void setBoolean(String stringArg0, boolean booleanArg1)
			throws SQLException {
		((CallableStatement) wrappedStatement).setBoolean(stringArg0,
				booleanArg1);
	}

	public void setByte(String stringArg0, byte byteArg1) throws SQLException {
		((CallableStatement) wrappedStatement).setByte(stringArg0, byteArg1);
	}

	public void setDouble(String stringArg0, double doubleArg1)
			throws SQLException {
		((CallableStatement) wrappedStatement)
				.setDouble(stringArg0, doubleArg1);
	}

	public void setFloat(String stringArg0, float floatArg1)
			throws SQLException {
		((CallableStatement) wrappedStatement).setFloat(stringArg0, floatArg1);
	}

	public void setInt(String stringArg0, int intArg1) throws SQLException {
		((CallableStatement) wrappedStatement).setInt(stringArg0, intArg1);
	}

	public void setLong(String stringArg0, long longArg1) throws SQLException {
		((CallableStatement) wrappedStatement).setLong(stringArg0, longArg1);
	}

	public void setShort(String stringArg0, short shortArg1)
			throws SQLException {
		((CallableStatement) wrappedStatement).setShort(stringArg0, shortArg1);
	}

	public byte[] getBytes(int intArg0) throws SQLException {
		return ((CallableStatement) wrappedStatement).getBytes(intArg0);
	}

	public byte[] getBytes(String stringArg0) throws SQLException {
		return ((CallableStatement) wrappedStatement).getBytes(stringArg0);
	}

	public void setTimestamp(String stringArg0, Timestamp timestampArg1,
			Calendar calendarArg2) throws SQLException {
		((CallableStatement) wrappedStatement).setTimestamp(stringArg0,
				timestampArg1, calendarArg2);
	}

	public void setTimestamp(String stringArg0, Timestamp timestampArg1)
			throws SQLException {
		((CallableStatement) wrappedStatement).setTimestamp(stringArg0,
				timestampArg1);
	}

	public String getString(String stringArg0) throws SQLException {
		return ((CallableStatement) wrappedStatement).getString(stringArg0);
	}

	public String getString(int intArg0) throws SQLException {
		return ((CallableStatement) wrappedStatement).getString(intArg0);
	}

	public Ref getRef(String stringArg0) throws SQLException {
		return ((CallableStatement) wrappedStatement).getRef(stringArg0);
	}

	public Ref getRef(int intArg0) throws SQLException {
		return ((CallableStatement) wrappedStatement).getRef(intArg0);
	}

	public void setURL(String stringArg0, URL urlArg1) throws SQLException {
		((CallableStatement) wrappedStatement).setURL(stringArg0, urlArg1);
	}

	public Date getDate(String stringArg0) throws SQLException {
		return ((CallableStatement) wrappedStatement).getDate(stringArg0);
	}

	public Date getDate(int intArg0, Calendar calendarArg1) throws SQLException {
		return ((CallableStatement) wrappedStatement).getDate(intArg0,
				calendarArg1);
	}

	public Date getDate(int intArg0) throws SQLException {
		return ((CallableStatement) wrappedStatement).getDate(intArg0);
	}

	public Date getDate(String stringArg0, Calendar calendarArg1)
			throws SQLException {
		return ((CallableStatement) wrappedStatement).getDate(stringArg0,
				calendarArg1);
	}

	public BigDecimal getBigDecimal(int intArg0) throws SQLException {
		return ((CallableStatement) wrappedStatement).getBigDecimal(intArg0);
	}

	@Deprecated
	public BigDecimal getBigDecimal(int intArg0, int intArg1)
			throws SQLException {
		return ((CallableStatement) wrappedStatement).getBigDecimal(intArg0,
				intArg1);
	}

	public BigDecimal getBigDecimal(String stringArg0) throws SQLException {
		return ((CallableStatement) wrappedStatement).getBigDecimal(stringArg0);
	}

	public Reader getCharacterStream(int intArg0) throws SQLException {
		return ((CallableStatement) wrappedStatement)
				.getCharacterStream(intArg0);
	}

	public Reader getCharacterStream(String stringArg0) throws SQLException {
		return ((CallableStatement) wrappedStatement)
				.getCharacterStream(stringArg0);
	}

	public Reader getNCharacterStream(int intArg0) throws SQLException {
		return ((CallableStatement) wrappedStatement)
				.getNCharacterStream(intArg0);
	}

	public Reader getNCharacterStream(String stringArg0) throws SQLException {
		return ((CallableStatement) wrappedStatement)
				.getNCharacterStream(stringArg0);
	}

	public void setAsciiStream(String stringArg0, InputStream inputstreamArg1)
			throws SQLException {
		((CallableStatement) wrappedStatement).setAsciiStream(stringArg0,
				inputstreamArg1);
	}

	public void setAsciiStream(String stringArg0, InputStream inputstreamArg1,
			long longArg2) throws SQLException {
		((CallableStatement) wrappedStatement).setAsciiStream(stringArg0,
				inputstreamArg1, longArg2);
	}

	public void setAsciiStream(String stringArg0, InputStream inputstreamArg1,
			int intArg2) throws SQLException {
		((CallableStatement) wrappedStatement).setAsciiStream(stringArg0,
				inputstreamArg1, intArg2);
	}

	public void setBigDecimal(String stringArg0, BigDecimal bigdecimalArg1)
			throws SQLException {
		((CallableStatement) wrappedStatement).setBigDecimal(stringArg0,
				bigdecimalArg1);
	}

	public void setBinaryStream(String stringArg0, InputStream inputstreamArg1)
			throws SQLException {
		((CallableStatement) wrappedStatement).setBinaryStream(stringArg0,
				inputstreamArg1);
	}

	public void setBinaryStream(String stringArg0, InputStream inputstreamArg1,
			long longArg2) throws SQLException {
		((CallableStatement) wrappedStatement).setBinaryStream(stringArg0,
				inputstreamArg1, longArg2);
	}

	public void setBinaryStream(String stringArg0, InputStream inputstreamArg1,
			int intArg2) throws SQLException {
		((CallableStatement) wrappedStatement).setBinaryStream(stringArg0,
				inputstreamArg1, intArg2);
	}

	public void setCharacterStream(String stringArg0, Reader readerArg1,
			int intArg2) throws SQLException {
		((CallableStatement) wrappedStatement).setCharacterStream(stringArg0,
				readerArg1, intArg2);
	}

	public void setCharacterStream(String stringArg0, Reader readerArg1)
			throws SQLException {
		((CallableStatement) wrappedStatement).setCharacterStream(stringArg0,
				readerArg1);
	}

	public void setCharacterStream(String stringArg0, Reader readerArg1,
			long longArg2) throws SQLException {
		((CallableStatement) wrappedStatement).setCharacterStream(stringArg0,
				readerArg1, longArg2);
	}

	public void setNCharacterStream(String stringArg0, Reader readerArg1)
			throws SQLException {
		((CallableStatement) wrappedStatement).setNCharacterStream(stringArg0,
				readerArg1);
	}

	public void setNCharacterStream(String stringArg0, Reader readerArg1,
			long longArg2) throws SQLException {
		((CallableStatement) wrappedStatement).setNCharacterStream(stringArg0,
				readerArg1, longArg2);
	}

	public Blob getBlob(String stringArg0) throws SQLException {
		return ((CallableStatement) wrappedStatement).getBlob(stringArg0);
	}

	public Blob getBlob(int intArg0) throws SQLException {
		return ((CallableStatement) wrappedStatement).getBlob(intArg0);
	}

	public Clob getClob(String stringArg0) throws SQLException {
		return ((CallableStatement) wrappedStatement).getClob(stringArg0);
	}

	public Clob getClob(int intArg0) throws SQLException {
		return ((CallableStatement) wrappedStatement).getClob(intArg0);
	}

	public NClob getNClob(int intArg0) throws SQLException {
		return ((CallableStatement) wrappedStatement).getNClob(intArg0);
	}

	public NClob getNClob(String stringArg0) throws SQLException {
		return ((CallableStatement) wrappedStatement).getNClob(stringArg0);
	}

	public String getNString(String stringArg0) throws SQLException {
		return ((CallableStatement) wrappedStatement).getNString(stringArg0);
	}

	public String getNString(int intArg0) throws SQLException {
		return ((CallableStatement) wrappedStatement).getNString(intArg0);
	}

	public RowId getRowId(int intArg0) throws SQLException {
		return ((CallableStatement) wrappedStatement).getRowId(intArg0);
	}

	public RowId getRowId(String stringArg0) throws SQLException {
		return ((CallableStatement) wrappedStatement).getRowId(stringArg0);
	}

	public SQLXML getSQLXML(int intArg0) throws SQLException {
		return ((CallableStatement) wrappedStatement).getSQLXML(intArg0);
	}

	public SQLXML getSQLXML(String stringArg0) throws SQLException {
		return ((CallableStatement) wrappedStatement).getSQLXML(stringArg0);
	}

	public Time getTime(String stringArg0, Calendar calendarArg1)
			throws SQLException {
		return ((CallableStatement) wrappedStatement).getTime(stringArg0,
				calendarArg1);
	}

	public Time getTime(int intArg0) throws SQLException {
		return ((CallableStatement) wrappedStatement).getTime(intArg0);
	}

	public Time getTime(String stringArg0) throws SQLException {
		return ((CallableStatement) wrappedStatement).getTime(stringArg0);
	}

	public Time getTime(int intArg0, Calendar calendarArg1) throws SQLException {
		return ((CallableStatement) wrappedStatement).getTime(intArg0,
				calendarArg1);
	}

	public Timestamp getTimestamp(int intArg0) throws SQLException {
		return ((CallableStatement) wrappedStatement).getTimestamp(intArg0);
	}

	public Timestamp getTimestamp(String stringArg0) throws SQLException {
		return ((CallableStatement) wrappedStatement).getTimestamp(stringArg0);
	}

	public Timestamp getTimestamp(int intArg0, Calendar calendarArg1)
			throws SQLException {
		return ((CallableStatement) wrappedStatement).getTimestamp(intArg0,
				calendarArg1);
	}

	public Timestamp getTimestamp(String stringArg0, Calendar calendarArg1)
			throws SQLException {
		return ((CallableStatement) wrappedStatement).getTimestamp(stringArg0,
				calendarArg1);
	}

	public boolean wasNull() throws SQLException {
		return ((CallableStatement) wrappedStatement).wasNull();
	}

	public void setBlob(String stringArg0, Blob blobArg1) throws SQLException {
		((CallableStatement) wrappedStatement).setBlob(stringArg0, blobArg1);
	}

	public void setBlob(String stringArg0, InputStream inputstreamArg1)
			throws SQLException {
		((CallableStatement) wrappedStatement).setBlob(stringArg0,
				inputstreamArg1);
	}

	public void setBlob(String stringArg0, InputStream inputstreamArg1,
			long longArg2) throws SQLException {
		((CallableStatement) wrappedStatement).setBlob(stringArg0,
				inputstreamArg1, longArg2);
	}

	public void setBytes(String stringArg0, byte[] bytesArg1)
			throws SQLException {
		((CallableStatement) wrappedStatement).setBytes(stringArg0, bytesArg1);
	}

	public void setClob(String stringArg0, Reader readerArg1, long longArg2)
			throws SQLException {
		((CallableStatement) wrappedStatement).setClob(stringArg0, readerArg1,
				longArg2);
	}

	public void setClob(String stringArg0, Clob clobArg1) throws SQLException {
		((CallableStatement) wrappedStatement).setClob(stringArg0, clobArg1);
	}

	public void setClob(String stringArg0, Reader readerArg1)
			throws SQLException {
		((CallableStatement) wrappedStatement).setClob(stringArg0, readerArg1);
	}

	public void setDate(String stringArg0, Date dateArg1, Calendar calendarArg2)
			throws SQLException {
		((CallableStatement) wrappedStatement).setDate(stringArg0, dateArg1,
				calendarArg2);
	}

	public void setDate(String stringArg0, Date dateArg1) throws SQLException {
		((CallableStatement) wrappedStatement).setDate(stringArg0, dateArg1);
	}

	public void setNClob(String stringArg0, Reader readerArg1)
			throws SQLException {
		((CallableStatement) wrappedStatement).setNClob(stringArg0, readerArg1);
	}

	public void setNClob(String stringArg0, Reader readerArg1, long longArg2)
			throws SQLException {
		((CallableStatement) wrappedStatement).setNClob(stringArg0, readerArg1,
				longArg2);
	}

	public void setNClob(String stringArg0, NClob nclobArg1)
			throws SQLException {
		((CallableStatement) wrappedStatement).setNClob(stringArg0, nclobArg1);
	}

	public void setNString(String stringArg0, String stringArg1)
			throws SQLException {
		((CallableStatement) wrappedStatement).setNString(stringArg0,
				stringArg1);
	}

	public void setNull(String stringArg0, int intArg1) throws SQLException {
		((CallableStatement) wrappedStatement).setNull(stringArg0, intArg1);
	}

	public void setNull(String stringArg0, int intArg1, String stringArg2)
			throws SQLException {
		((CallableStatement) wrappedStatement).setNull(stringArg0, intArg1,
				stringArg2);
	}

	public void setObject(String stringArg0, Object objectArg1)
			throws SQLException {
		((CallableStatement) wrappedStatement)
				.setObject(stringArg0, objectArg1);
	}

	public void setObject(String stringArg0, Object objectArg1, int intArg2)
			throws SQLException {
		((CallableStatement) wrappedStatement).setObject(stringArg0,
				objectArg1, intArg2);
	}

	public void setObject(String stringArg0, Object objectArg1, int intArg2,
			int intArg3) throws SQLException {
		((CallableStatement) wrappedStatement).setObject(stringArg0,
				objectArg1, intArg2, intArg3);
	}

	public void setRowId(String stringArg0, RowId rowidArg1)
			throws SQLException {
		((CallableStatement) wrappedStatement).setRowId(stringArg0, rowidArg1);
	}

	public void setSQLXML(String stringArg0, SQLXML sqlxmlArg1)
			throws SQLException {
		((CallableStatement) wrappedStatement)
				.setSQLXML(stringArg0, sqlxmlArg1);
	}

	public void setString(String stringArg0, String stringArg1)
			throws SQLException {
		((CallableStatement) wrappedStatement)
				.setString(stringArg0, stringArg1);
	}

	public void setTime(String stringArg0, Time timeArg1, Calendar calendarArg2)
			throws SQLException {
		((CallableStatement) wrappedStatement).setTime(stringArg0, timeArg1,
				calendarArg2);
	}

	public void setTime(String stringArg0, Time timeArg1) throws SQLException {
		((CallableStatement) wrappedStatement).setTime(stringArg0, timeArg1);
	}

	public void registerOutParameter(int intArg0, int intArg1)
			throws SQLException {
		((CallableStatement) wrappedStatement).registerOutParameter(intArg0,
				intArg1);
	}

	public void registerOutParameter(int intArg0, int intArg1, int intArg2)
			throws SQLException {
		((CallableStatement) wrappedStatement).registerOutParameter(intArg0,
				intArg1, intArg2);
	}

	public void registerOutParameter(String stringArg0, int intArg1,
			String stringArg2) throws SQLException {
		((CallableStatement) wrappedStatement).registerOutParameter(stringArg0,
				intArg1, stringArg2);
	}

	public void registerOutParameter(String stringArg0, int intArg1, int intArg2)
			throws SQLException {
		((CallableStatement) wrappedStatement).registerOutParameter(stringArg0,
				intArg1, intArg2);
	}

	public void registerOutParameter(int intArg0, int intArg1, String stringArg2)
			throws SQLException {
		((CallableStatement) wrappedStatement).registerOutParameter(intArg0,
				intArg1, stringArg2);
	}

	public void registerOutParameter(String stringArg0, int intArg1)
			throws SQLException {
		((CallableStatement) wrappedStatement).registerOutParameter(stringArg0,
				intArg1);
	}

	public void setBoolean(int intArg0, boolean booleanArg1)
			throws SQLException {
		((PreparedStatement) wrappedStatement).setBoolean(intArg0, booleanArg1);
	}

	public void setByte(int intArg0, byte byteArg1) throws SQLException {
		((PreparedStatement) wrappedStatement).setByte(intArg0, byteArg1);
	}

	public void setDouble(int intArg0, double doubleArg1) throws SQLException {
		((PreparedStatement) wrappedStatement).setDouble(intArg0, doubleArg1);
	}

	public void setFloat(int intArg0, float floatArg1) throws SQLException {
		((PreparedStatement) wrappedStatement).setFloat(intArg0, floatArg1);
	}

	public void setInt(int intArg0, int intArg1) throws SQLException {
		((PreparedStatement) wrappedStatement).setInt(intArg0, intArg1);
	}

	public void setLong(int intArg0, long longArg1) throws SQLException {
		((PreparedStatement) wrappedStatement).setLong(intArg0, longArg1);
	}

	public void setShort(int intArg0, short shortArg1) throws SQLException {
		((PreparedStatement) wrappedStatement).setShort(intArg0, shortArg1);
	}

	public void setTimestamp(int intArg0, Timestamp timestampArg1)
			throws SQLException {
		((PreparedStatement) wrappedStatement).setTimestamp(intArg0,
				timestampArg1);
	}

	public void setTimestamp(int intArg0, Timestamp timestampArg1,
			Calendar calendarArg2) throws SQLException {
		((PreparedStatement) wrappedStatement).setTimestamp(intArg0,
				timestampArg1, calendarArg2);
	}

	public void setURL(int intArg0, URL urlArg1) throws SQLException {
		((PreparedStatement) wrappedStatement).setURL(intArg0, urlArg1);
	}

	public int executeUpdate() throws SQLException {
		return ((PreparedStatement) wrappedStatement).executeUpdate();
	}

	public boolean execute() throws SQLException {
		return ((PreparedStatement) wrappedStatement).execute();
	}

	public void addBatch() throws SQLException {
		((PreparedStatement) wrappedStatement).addBatch();
	}

	public ResultSet executeQuery() throws SQLException {
		return ((PreparedStatement) wrappedStatement).executeQuery();
	}

	public ResultSetMetaData getMetaData() throws SQLException {
		return ((PreparedStatement) wrappedStatement).getMetaData();
	}

	public void clearParameters() throws SQLException {
		((PreparedStatement) wrappedStatement).clearParameters();
	}

	public ParameterMetaData getParameterMetaData() throws SQLException {
		return ((PreparedStatement) wrappedStatement).getParameterMetaData();
	}

	public void setAsciiStream(int intArg0, InputStream inputstreamArg1)
			throws SQLException {
		((PreparedStatement) wrappedStatement).setAsciiStream(intArg0,
				inputstreamArg1);
	}

	public void setAsciiStream(int intArg0, InputStream inputstreamArg1,
			long longArg2) throws SQLException {
		((PreparedStatement) wrappedStatement).setAsciiStream(intArg0,
				inputstreamArg1, longArg2);
	}

	public void setAsciiStream(int intArg0, InputStream inputstreamArg1,
			int intArg2) throws SQLException {
		((PreparedStatement) wrappedStatement).setAsciiStream(intArg0,
				inputstreamArg1, intArg2);
	}

	public void setBigDecimal(int intArg0, BigDecimal bigdecimalArg1)
			throws SQLException {
		((PreparedStatement) wrappedStatement).setBigDecimal(intArg0,
				bigdecimalArg1);
	}

	public void setBinaryStream(int intArg0, InputStream inputstreamArg1,
			long longArg2) throws SQLException {
		((PreparedStatement) wrappedStatement).setBinaryStream(intArg0,
				inputstreamArg1, longArg2);
	}

	public void setBinaryStream(int intArg0, InputStream inputstreamArg1)
			throws SQLException {
		((PreparedStatement) wrappedStatement).setBinaryStream(intArg0,
				inputstreamArg1);
	}

	public void setBinaryStream(int intArg0, InputStream inputstreamArg1,
			int intArg2) throws SQLException {
		((PreparedStatement) wrappedStatement).setBinaryStream(intArg0,
				inputstreamArg1, intArg2);
	}

	public void setCharacterStream(int intArg0, Reader readerArg1, long longArg2)
			throws SQLException {
		((PreparedStatement) wrappedStatement).setCharacterStream(intArg0,
				readerArg1, longArg2);
	}

	public void setCharacterStream(int intArg0, Reader readerArg1)
			throws SQLException {
		((PreparedStatement) wrappedStatement).setCharacterStream(intArg0,
				readerArg1);
	}

	public void setCharacterStream(int intArg0, Reader readerArg1, int intArg2)
			throws SQLException {
		((PreparedStatement) wrappedStatement).setCharacterStream(intArg0,
				readerArg1, intArg2);
	}

	public void setNCharacterStream(int intArg0, Reader readerArg1)
			throws SQLException {
		((PreparedStatement) wrappedStatement).setNCharacterStream(intArg0,
				readerArg1);
	}

	public void setNCharacterStream(int intArg0, Reader readerArg1,
			long longArg2) throws SQLException {
		((PreparedStatement) wrappedStatement).setNCharacterStream(intArg0,
				readerArg1, longArg2);
	}

	@Deprecated
	public void setUnicodeStream(int intArg0, InputStream inputstreamArg1,
			int intArg2) throws SQLException {
		((PreparedStatement) wrappedStatement).setUnicodeStream(intArg0,
				inputstreamArg1, intArg2);
	}

	public void setArray(int intArg0, Array arrayArg1) throws SQLException {
		((PreparedStatement) wrappedStatement).setArray(intArg0, arrayArg1);
	}

	public void setBlob(int intArg0, InputStream inputstreamArg1)
			throws SQLException {
		((PreparedStatement) wrappedStatement)
				.setBlob(intArg0, inputstreamArg1);
	}

	public void setBlob(int intArg0, Blob blobArg1) throws SQLException {
		((PreparedStatement) wrappedStatement).setBlob(intArg0, blobArg1);
	}

	public void setBlob(int intArg0, InputStream inputstreamArg1, long longArg2)
			throws SQLException {
		((PreparedStatement) wrappedStatement).setBlob(intArg0,
				inputstreamArg1, longArg2);
	}

	public void setBytes(int intArg0, byte[] bytesArg1) throws SQLException {
		((PreparedStatement) wrappedStatement).setBytes(intArg0, bytesArg1);
	}

	public void setClob(int intArg0, Reader readerArg1) throws SQLException {
		((PreparedStatement) wrappedStatement).setClob(intArg0, readerArg1);
	}

	public void setClob(int intArg0, Reader readerArg1, long longArg2)
			throws SQLException {
		((PreparedStatement) wrappedStatement).setClob(intArg0, readerArg1,
				longArg2);
	}

	public void setClob(int intArg0, Clob clobArg1) throws SQLException {
		((PreparedStatement) wrappedStatement).setClob(intArg0, clobArg1);
	}

	public void setDate(int intArg0, Date dateArg1, Calendar calendarArg2)
			throws SQLException {
		((PreparedStatement) wrappedStatement).setDate(intArg0, dateArg1,
				calendarArg2);
	}

	public void setDate(int intArg0, Date dateArg1) throws SQLException {
		((PreparedStatement) wrappedStatement).setDate(intArg0, dateArg1);
	}

	public void setNClob(int intArg0, Reader readerArg1, long longArg2)
			throws SQLException {
		((PreparedStatement) wrappedStatement).setNClob(intArg0, readerArg1,
				longArg2);
	}

	public void setNClob(int intArg0, Reader readerArg1) throws SQLException {
		((PreparedStatement) wrappedStatement).setNClob(intArg0, readerArg1);
	}

	public void setNClob(int intArg0, NClob nclobArg1) throws SQLException {
		((PreparedStatement) wrappedStatement).setNClob(intArg0, nclobArg1);
	}

	public void setNString(int intArg0, String stringArg1) throws SQLException {
		((PreparedStatement) wrappedStatement).setNString(intArg0, stringArg1);
	}

	public void setNull(int intArg0, int intArg1, String stringArg2)
			throws SQLException {
		((PreparedStatement) wrappedStatement).setNull(intArg0, intArg1,
				stringArg2);
	}

	public void setNull(int intArg0, int intArg1) throws SQLException {
		((PreparedStatement) wrappedStatement).setNull(intArg0, intArg1);
	}

	public void setObject(int intArg0, Object objectArg1, int intArg2)
			throws SQLException {
		((PreparedStatement) wrappedStatement).setObject(intArg0, objectArg1,
				intArg2);
	}

	public void setObject(int intArg0, Object objectArg1) throws SQLException {
		((PreparedStatement) wrappedStatement).setObject(intArg0, objectArg1);
	}

	public void setObject(int intArg0, Object objectArg1, int intArg2,
			int intArg3) throws SQLException {
		((PreparedStatement) wrappedStatement).setObject(intArg0, objectArg1,
				intArg2, intArg3);
	}

	public void setRef(int intArg0, Ref refArg1) throws SQLException {
		((PreparedStatement) wrappedStatement).setRef(intArg0, refArg1);
	}

	public void setRowId(int intArg0, RowId rowidArg1) throws SQLException {
		((PreparedStatement) wrappedStatement).setRowId(intArg0, rowidArg1);
	}

	public void setSQLXML(int intArg0, SQLXML sqlxmlArg1) throws SQLException {
		((PreparedStatement) wrappedStatement).setSQLXML(intArg0, sqlxmlArg1);
	}

	public void setString(int intArg0, String stringArg1) throws SQLException {
		((PreparedStatement) wrappedStatement).setString(intArg0, stringArg1);
	}

	public void setTime(int intArg0, Time timeArg1, Calendar calendarArg2)
			throws SQLException {
		((PreparedStatement) wrappedStatement).setTime(intArg0, timeArg1,
				calendarArg2);
	}

	public void setTime(int intArg0, Time timeArg1) throws SQLException {
		((PreparedStatement) wrappedStatement).setTime(intArg0, timeArg1);
	}

	public void close() throws SQLException {
		wrappedStatement.close();
	}

	public void clearWarnings() throws SQLException {
		wrappedStatement.clearWarnings();
	}

	public void closeOnCompletion() throws SQLException {
		wrappedStatement.closeOnCompletion();
	}

	public int executeUpdate(String stringArg0, String[] stringsArg1)
			throws SQLException {
		return wrappedStatement.executeUpdate(stringArg0, stringsArg1);
	}

	public int executeUpdate(String stringArg0, int[] intsArg1)
			throws SQLException {
		return wrappedStatement.executeUpdate(stringArg0, intsArg1);
	}

	public int executeUpdate(String stringArg0, int intArg1)
			throws SQLException {
		return wrappedStatement.executeUpdate(stringArg0, intArg1);
	}

	public int executeUpdate(String stringArg0) throws SQLException {
		return wrappedStatement.executeUpdate(stringArg0);
	}

	public Connection getConnection() throws SQLException {
		return wrappedStatement.getConnection();
	}

	public int getFetchDirection() throws SQLException {
		return wrappedStatement.getFetchDirection();
	}

	public ResultSet getGeneratedKeys() throws SQLException {
		return wrappedStatement.getGeneratedKeys();
	}

	public int getMaxFieldSize() throws SQLException {
		return wrappedStatement.getMaxFieldSize();
	}

	public boolean getMoreResults() throws SQLException {
		return wrappedStatement.getMoreResults();
	}

	public boolean getMoreResults(int intArg0) throws SQLException {
		return wrappedStatement.getMoreResults(intArg0);
	}

	public int getQueryTimeout() throws SQLException {
		return wrappedStatement.getQueryTimeout();
	}

	public int getResultSetConcurrency() throws SQLException {
		return wrappedStatement.getResultSetConcurrency();
	}

	public int getResultSetHoldability() throws SQLException {
		return wrappedStatement.getResultSetHoldability();
	}

	public int getResultSetType() throws SQLException {
		return wrappedStatement.getResultSetType();
	}

	public int getUpdateCount() throws SQLException {
		return wrappedStatement.getUpdateCount();
	}

	public boolean isCloseOnCompletion() throws SQLException {
		return wrappedStatement.isCloseOnCompletion();
	}

	public void setCursorName(String stringArg0) throws SQLException {
		wrappedStatement.setCursorName(stringArg0);
	}

	public void setEscapeProcessing(boolean booleanArg0) throws SQLException {
		wrappedStatement.setEscapeProcessing(booleanArg0);
	}

	public void setFetchDirection(int intArg0) throws SQLException {
		wrappedStatement.setFetchDirection(intArg0);
	}

	public void setMaxFieldSize(int intArg0) throws SQLException {
		wrappedStatement.setMaxFieldSize(intArg0);
	}

	public void setQueryTimeout(int intArg0) throws SQLException {
		wrappedStatement.setQueryTimeout(intArg0);
	}

	public boolean execute(String stringArg0, int[] intsArg1)
			throws SQLException {
		return wrappedStatement.execute(stringArg0, intsArg1);
	}

	public boolean execute(String stringArg0, String[] stringsArg1)
			throws SQLException {
		return wrappedStatement.execute(stringArg0, stringsArg1);
	}

	public boolean execute(String stringArg0) throws SQLException {
		return wrappedStatement.execute(stringArg0);
	}

	public boolean execute(String stringArg0, int intArg1) throws SQLException {
		return wrappedStatement.execute(stringArg0, intArg1);
	}

	public void clearBatch() throws SQLException {
		wrappedStatement.clearBatch();
	}

	public void cancel() throws SQLException {
		wrappedStatement.cancel();
	}

	public void addBatch(String stringArg0) throws SQLException {
		wrappedStatement.addBatch(stringArg0);
	}

	public int[] executeBatch() throws SQLException {
		return wrappedStatement.executeBatch();
	}

	public ResultSet executeQuery(String stringArg0) throws SQLException {
		return wrappedStatement.executeQuery(stringArg0);
	}

	public int getFetchSize() throws SQLException {
		return wrappedStatement.getFetchSize();
	}

	public int getMaxRows() throws SQLException {
		return wrappedStatement.getMaxRows();
	}

	public ResultSet getResultSet() throws SQLException {
		return wrappedStatement.getResultSet();
	}

	public SQLWarning getWarnings() throws SQLException {
		return wrappedStatement.getWarnings();
	}

	public boolean isClosed() throws SQLException {
		return wrappedStatement.isClosed();
	}

	public boolean isPoolable() throws SQLException {
		return wrappedStatement.isPoolable();
	}

	public void setFetchSize(int intArg0) throws SQLException {
		wrappedStatement.setFetchSize(intArg0);
	}

	public void setMaxRows(int intArg0) throws SQLException {
		wrappedStatement.setMaxRows(intArg0);
	}

	public void setPoolable(boolean booleanArg0) throws SQLException {
		wrappedStatement.setPoolable(booleanArg0);
	}

	public <T> T unwrap(Class<T> iface) throws SQLException {
		return wrappedStatement.unwrap(iface);
	}

	public boolean isWrapperFor(java.lang.Class<?> iface) throws SQLException {
		return wrappedStatement.isWrapperFor(iface);
	}

}
