package com.asksunny.jdbc.wrapper;

import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SqlResultSetMetadata implements ResultSetMetaData {

	private List<ColumnMetaData> columnMetaDatas = null;

	public SqlResultSetMetadata() {
		this.columnMetaDatas = new ArrayList<>();
	}

	public SqlResultSetMetadata(List<ColumnMetaData> columnMetaDatas) {
		this();
		this.columnMetaDatas.addAll(columnMetaDatas);
	}

	public void addColumnMetaData(ColumnMetaData columnMeta) {
		this.columnMetaDatas.add(columnMeta);
	}

	@Override
	public <T> T unwrap(Class<T> iface) throws SQLException {
		return iface.cast(this);
	}

	@Override
	public boolean isWrapperFor(Class<?> iface) throws SQLException {
		return iface.isInstance(this);
	}

	@Override
	public int getColumnCount() throws SQLException {
		return columnMetaDatas.size();
	}

	@Override
	public boolean isAutoIncrement(int column) throws SQLException {

		return columnMetaDatas.get(column).isAutoIncrement();
	}

	@Override
	public boolean isCaseSensitive(int column) throws SQLException {

		return columnMetaDatas.get(column).isCaseSensitive();
	}

	@Override
	public boolean isSearchable(int column) throws SQLException {
		return columnMetaDatas.get(column).isSearchable();
	}

	@Override
	public boolean isCurrency(int column) throws SQLException {
		return columnMetaDatas.get(column).isCurrency();
	}

	@Override
	public int isNullable(int column) throws SQLException {
		return columnMetaDatas.get(column).isNullable();
	}

	@Override
	public boolean isSigned(int column) throws SQLException {
		return columnMetaDatas.get(column).isSigned();
	}

	@Override
	public int getColumnDisplaySize(int column) throws SQLException {

		return columnMetaDatas.get(column).getColumnDisplaySize();
	}

	@Override
	public String getColumnLabel(int column) throws SQLException {

		return columnMetaDatas.get(column).getColumnLabel();
	}

	@Override
	public String getColumnName(int column) throws SQLException {

		return columnMetaDatas.get(column).getColumnName();
	}

	@Override
	public String getSchemaName(int column) throws SQLException {

		return columnMetaDatas.get(column).getSchemaName();
	}

	@Override
	public int getPrecision(int column) throws SQLException {

		return columnMetaDatas.get(column).getPrecision();
	}

	@Override
	public int getScale(int column) throws SQLException {

		return columnMetaDatas.get(column).getScale();
	}

	@Override
	public String getTableName(int column) throws SQLException {

		return columnMetaDatas.get(column).getTableName();
	}

	@Override
	public String getCatalogName(int column) throws SQLException {

		return columnMetaDatas.get(column).getCatalogName();
	}

	@Override
	public int getColumnType(int column) throws SQLException {
		return columnMetaDatas.get(column).getColumnType();
	}

	@Override
	public String getColumnTypeName(int column) throws SQLException {
		return columnMetaDatas.get(column).getColumnTypeName();
	}

	@Override
	public boolean isReadOnly(int column) throws SQLException {

		return columnMetaDatas.get(column).isReadOnly();
	}

	@Override
	public boolean isWritable(int column) throws SQLException {

		return columnMetaDatas.get(column).isWritable();
	}

	@Override
	public boolean isDefinitelyWritable(int column) throws SQLException {

		return columnMetaDatas.get(column).isDefinitelyWritable();
	}

	@Override
	public String getColumnClassName(int column) throws SQLException {

		return columnMetaDatas.get(column).getColumnClassName();
	}

}
