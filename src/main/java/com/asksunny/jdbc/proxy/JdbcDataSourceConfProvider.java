package com.asksunny.jdbc.proxy;

public class JdbcDataSourceConfProvider implements DataSourceConfProvider {

	private DataSourceConf dsConfiguration = null;

	public JdbcDataSourceConfProvider() {

	}

	public JdbcDataSourceConfProvider(DataSourceConf dsConfiguration) {
		this.dsConfiguration = dsConfiguration;
	}

	public DataSourceConf getDsConfiguration() {
		return dsConfiguration;
	}

	public void setDsConfiguration(DataSourceConf dsConfiguration) {
		this.dsConfiguration = dsConfiguration;
	}
	
	public void init()
	{
		//open JDBC connection;
	}

	@Override
	public DataSourceConf getDataSourceConfiguration(String dataSourceName)
			throws ResourceNotFoundException {
		
		return null;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
