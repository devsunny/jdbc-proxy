package com.asksunny.jdbc.wrapper;

import java.sql.Array;
import java.sql.Blob;
import java.sql.CallableStatement;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.NClob;
import java.sql.PreparedStatement;
import java.sql.SQLClientInfoException;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.SQLXML;
import java.sql.Savepoint;
import java.sql.Statement;
import java.sql.Struct;
import java.util.Properties;
import java.util.concurrent.Executor;

public class SqlSession implements Connection {

	private final Connection wrappedConnection;

	public SqlSession(Connection wrappedConnection) {
		super();
		this.wrappedConnection = wrappedConnection;
	}

	public void setReadOnly(boolean booleanArg0) throws SQLException {
		wrappedConnection.setReadOnly(booleanArg0);
	}

	public void close() throws SQLException {
		wrappedConnection.close();
	}

	public boolean isValid(int intArg0) throws SQLException {
		return wrappedConnection.isValid(intArg0);
	}

	public boolean isReadOnly() throws SQLException {
		return wrappedConnection.isReadOnly();
	}

	public void abort(Executor executorArg0) throws SQLException {
		wrappedConnection.abort(executorArg0);
	}

	public void clearWarnings() throws SQLException {
		wrappedConnection.clearWarnings();
	}

	public Array createArrayOf(String stringArg0, Object[] objectsArg1)
			throws SQLException {
		return wrappedConnection.createArrayOf(stringArg0, objectsArg1);
	}

	public Statement createStatement() throws SQLException {
		return wrappedConnection.createStatement();
	}

	public Statement createStatement(int intArg0, int intArg1)
			throws SQLException {
		return wrappedConnection.createStatement(intArg0, intArg1);
	}

	public Statement createStatement(int intArg0, int intArg1, int intArg2)
			throws SQLException {
		return wrappedConnection.createStatement(intArg0, intArg1, intArg2);
	}

	public boolean getAutoCommit() throws SQLException {
		return wrappedConnection.getAutoCommit();
	}

	public String getClientInfo(String stringArg0) throws SQLException {
		return wrappedConnection.getClientInfo(stringArg0);
	}

	public Properties getClientInfo() throws SQLException {
		return wrappedConnection.getClientInfo();
	}

	public int getHoldability() throws SQLException {
		return wrappedConnection.getHoldability();
	}

	public int getNetworkTimeout() throws SQLException {
		return wrappedConnection.getNetworkTimeout();
	}

	public int getTransactionIsolation() throws SQLException {
		return wrappedConnection.getTransactionIsolation();
	}

	public PreparedStatement prepareStatement(String stringArg0, int[] intsArg1)
			throws SQLException {
		return wrappedConnection.prepareStatement(stringArg0, intsArg1);
	}

	public PreparedStatement prepareStatement(String stringArg0, int intArg1,
			int intArg2) throws SQLException {
		return wrappedConnection.prepareStatement(stringArg0, intArg1, intArg2);
	}

	public PreparedStatement prepareStatement(String stringArg0,
			String[] stringsArg1) throws SQLException {
		return wrappedConnection.prepareStatement(stringArg0, stringsArg1);
	}

	public PreparedStatement prepareStatement(String stringArg0, int intArg1)
			throws SQLException {
		return wrappedConnection.prepareStatement(stringArg0, intArg1);
	}

	public PreparedStatement prepareStatement(String stringArg0, int intArg1,
			int intArg2, int intArg3) throws SQLException {
		return wrappedConnection.prepareStatement(stringArg0, intArg1, intArg2,
				intArg3);
	}

	public PreparedStatement prepareStatement(String stringArg0)
			throws SQLException {
		return wrappedConnection.prepareStatement(stringArg0);
	}

	public void releaseSavepoint(Savepoint savepointArg0) throws SQLException {
		wrappedConnection.releaseSavepoint(savepointArg0);
	}

	public void setAutoCommit(boolean booleanArg0) throws SQLException {
		wrappedConnection.setAutoCommit(booleanArg0);
	}

	public void setClientInfo(String stringArg0, String stringArg1)
			throws SQLClientInfoException {
		wrappedConnection.setClientInfo(stringArg0, stringArg1);
	}

	public void setClientInfo(Properties propertiesArg0)
			throws SQLClientInfoException {
		wrappedConnection.setClientInfo(propertiesArg0);
	}

	public void setHoldability(int intArg0) throws SQLException {
		wrappedConnection.setHoldability(intArg0);
	}

	public void setNetworkTimeout(Executor executorArg0, int intArg1)
			throws SQLException {
		wrappedConnection.setNetworkTimeout(executorArg0, intArg1);
	}

	public void setTransactionIsolation(int intArg0) throws SQLException {
		wrappedConnection.setTransactionIsolation(intArg0);
	}

	public Blob createBlob() throws SQLException {
		return wrappedConnection.createBlob();
	}

	public void commit() throws SQLException {
		wrappedConnection.commit();
	}

	public Clob createClob() throws SQLException {
		return wrappedConnection.createClob();
	}

	public NClob createNClob() throws SQLException {
		return wrappedConnection.createNClob();
	}

	public SQLXML createSQLXML() throws SQLException {
		return wrappedConnection.createSQLXML();
	}

	public Struct createStruct(String stringArg0, Object[] objectsArg1)
			throws SQLException {
		return wrappedConnection.createStruct(stringArg0, objectsArg1);
	}

	public String getCatalog() throws SQLException {
		return wrappedConnection.getCatalog();
	}

	public DatabaseMetaData getMetaData() throws SQLException {
		return wrappedConnection.getMetaData();
	}

	public String getSchema() throws SQLException {
		return wrappedConnection.getSchema();
	}

	public java.util.Map<String, Class<?>> getTypeMap() throws SQLException {
		return wrappedConnection.getTypeMap();
	}

	public SQLWarning getWarnings() throws SQLException {
		return wrappedConnection.getWarnings();
	}

	public boolean isClosed() throws SQLException {
		return wrappedConnection.isClosed();
	}

	public String nativeSQL(String stringArg0) throws SQLException {
		return wrappedConnection.nativeSQL(stringArg0);
	}

	public CallableStatement prepareCall(String stringArg0, int intArg1,
			int intArg2, int intArg3) throws SQLException {
		return wrappedConnection.prepareCall(stringArg0, intArg1, intArg2,
				intArg3);
	}

	public CallableStatement prepareCall(String stringArg0) throws SQLException {
		return wrappedConnection.prepareCall(stringArg0);
	}

	public CallableStatement prepareCall(String stringArg0, int intArg1,
			int intArg2) throws SQLException {
		return wrappedConnection.prepareCall(stringArg0, intArg1, intArg2);
	}

	public void rollback() throws SQLException {
		wrappedConnection.rollback();
	}

	public void rollback(Savepoint savepointArg0) throws SQLException {
		wrappedConnection.rollback(savepointArg0);
	}

	public void setCatalog(String stringArg0) throws SQLException {
		wrappedConnection.setCatalog(stringArg0);
	}

	public Savepoint setSavepoint(String stringArg0) throws SQLException {
		return wrappedConnection.setSavepoint(stringArg0);
	}

	public Savepoint setSavepoint() throws SQLException {
		return wrappedConnection.setSavepoint();
	}

	public void setSchema(String stringArg0) throws SQLException {
		wrappedConnection.setSchema(stringArg0);
	}

	public void setTypeMap(java.util.Map<String, Class<?>> mapArg0)
			throws SQLException {
		wrappedConnection.setTypeMap(mapArg0);
	}

	public <T> T unwrap(Class<T> classArg0) throws SQLException {
		return wrappedConnection.unwrap(classArg0);
	}

	@Override
	public boolean isWrapperFor(Class<?> classArg0) throws SQLException {
		return wrappedConnection.isWrapperFor(classArg0);
	}

}
