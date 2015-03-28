package com.asksunny.rpc.gateway;

import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.server.TThreadedSelectorServer;
import org.apache.thrift.transport.TFramedTransport;
import org.apache.thrift.transport.TNonblockingServerSocket;
import org.apache.thrift.transport.TNonblockingServerTransport;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Service;

@SpringBootApplication
@Service
public class RpcGatewayServer {

	private static Logger logger = LoggerFactory.getLogger(RpcGateway.class);
	public static final int DEFAULT_RPC_SERVER_PORT = 22443;
	private int serverPort = DEFAULT_RPC_SERVER_PORT;

	public RpcGatewayServer() {
		this(DEFAULT_RPC_SERVER_PORT);
	}

	public RpcGatewayServer(int port) {
		this.serverPort = port;
	}

	public void start() {
		try {
			TNonblockingServerTransport transport = new TNonblockingServerSocket(
					this.serverPort);
			TThreadedSelectorServer.Args args1 = new TThreadedSelectorServer.Args(
					transport);
			args1.transportFactory(new TFramedTransport.Factory());
			args1.protocolFactory(new TBinaryProtocol.Factory());
			args1.processor(new RpcGateway.Processor<RpcGatewayHandler>(
					new RpcGatewayHandler()));
			args1.selectorThreads(4);
			args1.workerThreads(32);
			TThreadedSelectorServer server = new TThreadedSelectorServer(args1);
			logger.info("Starting the RpcGatewayServer server at port {}",
					this.serverPort);
			server.serve();
		} catch (Exception e) {
			logger.error(String.format("Unrecoverable Error:%s\n%s",
					e.toString(), e.getMessage()));
			System.exit(1);
		}
	}

	public int getServerPort() {
		return serverPort;
	}

	public void setServerPort(int serverPort) {
		this.serverPort = serverPort;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		SpringApplication app = new SpringApplication(RpcGatewayServer.class);
		app.setShowBanner(false);
		ConfigurableApplicationContext contxt = app.run(args);
		RpcGatewayServer server = contxt.getBean(RpcGatewayServer.class);
		server.start();
	}

}
