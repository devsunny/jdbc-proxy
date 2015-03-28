package com.asksunny.jdbc.proxy;

import java.sql.SQLException;
import java.util.concurrent.TimeUnit;

import javax.sql.DataSource;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.dbcp.BasicDataSource;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.google.common.cache.RemovalListener;
import com.google.common.cache.RemovalNotification;

public class DataSourceFactory {

	public static final String DEFAULT_AUTOCOMMIT = "defaultAutoCommit";
	public static final String DEFAULT_READONLY = "defaultReadOnly";
	public static final String DEFAULT_TRANSACTIONISOLATION = "defaultTransactionIsolation";
	public static final String DEFAULT_CATALOG = "defaultCatalog";
	public static final String MAX_ACTIVE = "maxActive";
	public static final String MAX_IDLE = "maxIdle";
	public static final String MIN_IDLE = "minIdle";
	public static final String INITIAL_SIZE = "initialSize";
	public static final String MAX_WAIT = "maxWait";
	public static final String POOL_PREPARED_STATEMENTS = "poolPreparedStatements";
	public static final String MAX_OPEN_PREPARED_STATEMENTS = "maxOpenPreparedStatements";
	public static final String TEST_ON_BORROW = "testOnBorrow";
	public static final String TEST_ON_RETURN = "testOnReturn";
	public static final String TIME_BETWEEN_EVICTION_RUNS_MILLIS = "timeBetweenEvictionRunsMillis";
	public static final String NUM_TESTS_PER_EVICTION_RUN = "numTestsPerEvictionRun";
	public static final String MIN_EVICTABLE_IDLE_TIME_MILLIS = "minEvictableIdleTimeMillis";
	public static final String TEST_WHILE_IDLE = "testWhileIdle";
	public static final String VALIDATION_QUERY = "validationQuery";
	public static final String VALIDATION_QUERY_TIMEOUT = "validationQueryTimeout";
	public static final String CONNECTION_INIT_SQLS = "connectionInitSqls";
	public static final String ACCESS_TO_UNDERLYING_CONNECTION_ALLOWED = "accessToUnderlyingConnectionAllowed";
	public static final String RESTART_NEEDED = "restartNeeded";
	public static final String[] DYNAMIC_PROPERTIES = new String[] {
			"defaultAutoCommit", "defaultReadOnly",
			"defaultTransactionIsolation", "defaultCatalog", "maxActive",
			"maxIdle", "minIdle", "initialSize", "maxWait",
			"poolPreparedStatements", "maxOpenPreparedStatements",
			"testOnBorrow", "testOnReturn", "timeBetweenEvictionRunsMillis",
			"numTestsPerEvictionRun", "minEvictableIdleTimeMillis",
			"validationQuery", "validationQueryTimeout", "connectionInitSqls",
			"accessToUnderlyingConnectionAllowed", "restartNeeded" };

	private Cache<String, DataSource> dataSourcePool = null;
	private DataSourceConfProvider configurationProvider = null;

	public DataSourceFactory() {
	}

	public DataSourceFactory(DataSourceConfProvider configurationProvider) {
		super();
		this.configurationProvider = configurationProvider;
	}

	public Cache<String, DataSource> getDataSourcePool() {
		return dataSourcePool;
	}

	public void setDataSourcePool(
			LoadingCache<String, DataSource> dataSourcePool) {
		this.dataSourcePool = dataSourcePool;
	}

	public DataSourceConfProvider getConfigurationProvider() {
		return configurationProvider;
	}

	public void setConfigurationProvider(
			DataSourceConfProvider configurationProvider) {
		this.configurationProvider = configurationProvider;
	}
	
	
	public DataSource getDataSource(String dataSourceName)
	{
		return this.dataSourcePool.getIfPresent(dataSourceName);
	}
	

	public void init() {

		final DataSourceConfProvider cfgProvider = this.configurationProvider;
		dataSourcePool = CacheBuilder.newBuilder().maximumSize(1000)
				.initialCapacity(10).expireAfterWrite(30, TimeUnit.MINUTES)
				.removalListener(new RemovalListener<String, DataSource>() {
					@Override
					public void onRemoval(
							RemovalNotification<String, DataSource> arg0) {
						try {
							BasicDataSource ds = (BasicDataSource) arg0
									.getValue();
							ds.close();
						} catch (SQLException e) {
							// ignoreable;
						}

					}
				}).build(new CacheLoader<String, DataSource>() {

					@Override
					public DataSource load(String arg0) throws Exception {
						DataSourceConf dsCfg = cfgProvider
								.getDataSourceConfiguration(arg0);
						BasicDataSource ds = new BasicDataSource();
						ds.setDriverClassName(dsCfg.getDriverClassName());
						ds.setUrl(dsCfg.getJdbcUrl());
						ds.setUsername(dsCfg.getUser());
						ds.setPassword(dsCfg.getPassword());
						if (dsCfg.getJdbcProperties() != null) {
							for (String propName : DYNAMIC_PROPERTIES) {
								String pval = dsCfg.getJdbcProperties()
										.getProperty(propName);
								if (pval != null) {
									BeanUtils.setProperty(ds, propName, pval);
								}
							}
						}
						return ds;
					}

				});

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	}

}
