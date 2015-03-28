package com.asksunny.rpc.gateway;

import java.io.IOException;
import java.io.InputStream;
import java.lang.ProcessBuilder.Redirect;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.apache.commons.io.IOUtils;
import org.apache.thrift.TException;

import com.asksunny.rpc.gateway.RpcGateway.Iface;
import com.google.common.base.Function;
import com.google.common.collect.Collections2;

public class RpcGatewayHandler implements Iface {

	public RpcGatewayHandler() {
	}

	@Override
	public long ping() throws TException {
		return System.currentTimeMillis();
	}

	/**
	 * parameters - datasource name, sqlQuery;
	 */
	@Override
	public JPResultSetMetaData executeQuery(List<JPValueObject> parameters)
			throws InvocationException, TException {
		
		return null;
	}

	@Override
	public JPSimpleQueryResultSet executeSimpleQuery(String datasource,
			String query) throws InvocationException, TException 
	{
		
		return null;
	}

	@Override
	public int executeUpdate(String datasource, String query)
			throws InvocationException, TException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public JPParameterMetaData prepareQuery(List<JPValueObject> parameters)
			throws InvocationException, TException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public JPResultSetMetaData executePreparedQuery(
			List<JPValueObject> parameters,
			List<JPQueryParameter> queryParameters) throws InvocationException,
			TException 
	{
		
		return null;
	}

	@Override
	public int executePreparedUpdate(List<JPValueObject> parameters,
			List<JPQueryParameter> queryParameters) throws InvocationException,
			TException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public JPParameterMetaData prepareCallableQuery(
			List<JPValueObject> parameters) throws InvocationException,
			TException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public JPResultSetMetaData executeCallableQuery(
			List<JPValueObject> parameters,
			List<JPQueryParameter> queryParameters) throws InvocationException,
			TException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int executeCallableUpdate(List<JPValueObject> parameters,
			List<JPQueryParameter> queryParameters) throws InvocationException,
			TException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<List<String>> fetchResult(List<JPValueObject> parameters)
			throws InvocationException, TException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<List<String>> executeComplexCommand(
			List<JPValueObject> parameters) throws InvocationException,
			TException {

		return null;
	}

	@Override
	public JPValueObject executeCommand(List<JPValueObject> parameters)
			throws InvocationException, TException {

		return null;
	}
	
	

	@Override
	public String executeSimpleCommand(List<JPValueObject> parameters)
			throws InvocationException, TException {
		Collection<String> commands = Collections2.transform(parameters,
				new Function<JPValueObject, String>() {
					public String apply(JPValueObject input) {
						return input.getValue();
					}
				});

		InputStream stdout = null;
		String ret = null;
		try {
			ProcessBuilder builder = new ProcessBuilder(new ArrayList<>(
					commands));
			builder.environment().putAll(System.getenv());
			builder.redirectError();
			Process p = builder.start();
			stdout = p.getInputStream();
			ret = IOUtils.toString(stdout);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (stdout != null)
				try {
					stdout.close();
				} catch (IOException e) {
					;
				}
		}
		return ret;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	}

}
