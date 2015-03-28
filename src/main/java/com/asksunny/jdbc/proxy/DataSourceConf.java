package com.asksunny.jdbc.proxy;

import java.util.Properties;

public class DataSourceConf {

	private String dataSourceName = null;
	private String driverClassName = null;
	private String jdbcUrl = null;
	private String user = null;
	private String password = null;
	private Properties jdbcProperties = null;

	public DataSourceConf() {
	}
	
	public DataSourceConf(String driverClassName, String jdbcUrl,
			String user, String password) {
		super();
		this.driverClassName = driverClassName;
		this.jdbcUrl = jdbcUrl;
		this.user = user;
		this.password = password;
	}
	

	public String getDataSourceName() {
		return dataSourceName;
	}

	public void setDataSourceName(String dataSourceName) {
		this.dataSourceName = dataSourceName;
	}

	public String getDriverClassName() {
		return driverClassName;
	}

	public void setDriverClassName(String driverClassName) {
		this.driverClassName = driverClassName;
	}

	public String getJdbcUrl() {
		return jdbcUrl;
	}

	public void setJdbcUrl(String jdbcUrl) {
		this.jdbcUrl = jdbcUrl;
	}

	

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Properties getJdbcProperties() {
		return jdbcProperties;
	}

	public void setJdbcProperties(Properties jdbcProperties) {
		this.jdbcProperties = jdbcProperties;
	}

}
