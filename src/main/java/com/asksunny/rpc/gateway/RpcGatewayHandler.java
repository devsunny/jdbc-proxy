package com.asksunny.rpc.gateway;

import java.util.List;

import org.apache.thrift.TException;

import com.asksunny.rpc.gateway.RpcGateway.Iface;

public class RpcGatewayHandler implements Iface {

	public RpcGatewayHandler() {		
	}

	@Override
	public long ping() throws TException {
		return System.currentTimeMillis();
	}

	@Override
	public JPResultSetMetaData executeQuery(List<JPValueObject> parameters)
			throws InvocationException, TException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public JPSimpleQueryResultSet executeSimpleQuery(String datasource,
			String query) throws InvocationException, TException {
		// TODO Auto-generated method stub
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
			TException {
		// TODO Auto-generated method stub
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

		return null;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	}

}
