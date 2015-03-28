package com.asksunny.jdbc.proxy;

import java.util.ArrayList;
import java.util.List;

import org.apache.thrift.TException;

import com.asksunny.jdbc.proxy.JdbcProxy.Iface;

public class JdbcProxyProcessor implements Iface {

	public JdbcProxyProcessor() {
	}

	@Override
	public long ping() throws TException {
		
		return System.currentTimeMillis();
	}

	@Override
	public JPResultSetMetaData executeQuery(List<JPMethodParameter> parameters)
			throws SQLInvocationException, TException {

		return null;
	}

	@Override
	public JPSimpleQueryResultSet executeSimpleQuery(String datasource,
			String query) throws SQLInvocationException, TException {

		return null;
	}

	@Override
	public int executeUpdate(String datasource, String query)
			throws SQLInvocationException, TException {

		return 0;
	}

	@Override
	public JPParameterMetaData prepareQuery(List<JPMethodParameter> parameters)
			throws SQLInvocationException, TException {

		return null;
	}

	@Override
	public JPResultSetMetaData executePreparedQuery(
			List<JPMethodParameter> parameters,
			List<JPQueryParameter> queryParameters)
			throws SQLInvocationException, TException {

		return null;
	}

	@Override
	public int executePreparedUpdate(List<JPMethodParameter> parameters,
			List<JPQueryParameter> queryParameters)
			throws SQLInvocationException, TException {

		return 0;
	}

	@Override
	public JPParameterMetaData prepareCallableQuery(
			List<JPMethodParameter> parameters) throws SQLInvocationException,
			TException {

		return null;
	}

	@Override
	public JPResultSetMetaData executeCallableQuery(
			List<JPMethodParameter> parameters,
			List<JPQueryParameter> queryParameters)
			throws SQLInvocationException, TException {

		return null;
	}

	@Override
	public int executeCallableUpdate(List<JPMethodParameter> parameters,
			List<JPQueryParameter> queryParameters)
			throws SQLInvocationException, TException {

		return 0;
	}

	@Override
	public List<List<String>> fetchResult(List<JPMethodParameter> parameters)
			throws SQLInvocationException, TException {

		return null;
	}

	@Override
	public List<List<String>> executeOsCommand(
			List<JPMethodParameter> parameters) throws SQLInvocationException,
			TException {
		for (JPMethodParameter jpMethodParameter : parameters) {
			System.out.println(jpMethodParameter.getValue());
		}
		List<String> arrays = new ArrayList<>();
		arrays.add("Test1");
		
		List<String> arrays2 = new ArrayList<>();
		arrays2.add("Test2-1");
		arrays2.add("Test2-2");
		
		List<List<String>> reresults = new ArrayList<>();
		reresults.add(arrays);
		reresults.add(arrays2);
		return  reresults;
	}

}
