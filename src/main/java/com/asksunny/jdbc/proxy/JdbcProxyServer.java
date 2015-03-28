package com.asksunny.jdbc.proxy;

import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TSimpleServer;
import org.apache.thrift.server.TThreadedSelectorServer;
import org.apache.thrift.transport.TFramedTransport;
import org.apache.thrift.transport.TNonblockingServerSocket;
import org.apache.thrift.transport.TNonblockingServerTransport;
import org.apache.thrift.transport.TServerSocket;
import org.apache.thrift.transport.TServerTransport;

public class JdbcProxyServer {

	public JdbcProxyServer() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			
			 TNonblockingServerTransport trans = new TNonblockingServerSocket(9090);
			  TThreadedSelectorServer.Args args1 = new TThreadedSelectorServer.Args(trans);
			  args1.transportFactory(new TFramedTransport.Factory());
			  args1.protocolFactory(new TBinaryProtocol.Factory());
			  args1.processor(new JdbcProxy.Processor<JdbcProxyProcessor>(
						 new JdbcProxyProcessor()));
			  args1.selectorThreads(4);
			  args1.workerThreads(32);
			  TThreadedSelectorServer server = new TThreadedSelectorServer(args1);	
			  System.out.println("Starting the simple server...");
			  server.serve();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
