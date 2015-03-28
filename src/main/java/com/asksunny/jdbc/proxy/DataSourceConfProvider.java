package com.asksunny.jdbc.proxy;

public interface DataSourceConfProvider {

	public DataSourceConf getDataSourceConfiguration(String dataSourceName) throws ResourceNotFoundException;

}
