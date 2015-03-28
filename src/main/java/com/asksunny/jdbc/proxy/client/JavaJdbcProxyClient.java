package com.asksunny.jdbc.proxy.client;

import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TFramedTransport;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;

import com.asksunny.jdbc.proxy.JdbcProxy;

public class JavaJdbcProxyClient {

	public JavaJdbcProxyClient() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		try {
			TTransport transport  =  new TFramedTransport(new TSocket("localhost", 9090));
			transport.open();
			TProtocol protocol = new TBinaryProtocol(transport);
			JdbcProxy.Client client = new JdbcProxy.Client(protocol);
			System.out.println(client.ping());
			transport.close();
		} catch (TException x) {
			x.printStackTrace();
		}

	}

}
