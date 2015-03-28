package com.asksunny.jdbc.proxy;

import org.apache.thrift.server.TThreadedSelectorServer;
import org.apache.thrift.transport.TNonblockingServerSocket;
import org.apache.thrift.transport.TNonblockingServerTransport;

public class JdbcProxyServer {

	public JdbcProxyServer() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			TNonblockingServerTransport nioServerTransport = new TNonblockingServerSocket(
					9090);
			TThreadedSelectorServer server = new TThreadedSelectorServer(
					new TThreadedSelectorServer.Args(nioServerTransport)
							.processor(new JdbcProxy.Processor<JdbcProxyProcessor>(
									new JdbcProxyProcessor())));
			System.out.println("Starting the simple server...");
			server.serve();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
