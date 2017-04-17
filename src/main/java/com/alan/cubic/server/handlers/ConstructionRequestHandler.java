package com.alan.cubic.server.handlers;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

import com.alan.cubic.server.processors.ConstructionRequestProcessor;
import com.alan.cubic.server.processors.RequestProcessor;
import com.google.inject.Inject;

public class ConstructionRequestHandler implements RequestHandler {
	
	@Inject 
	private RequestProcessor requestProcessor;
	
	private int port;
	private String host;
	private Socket socket;
	
	public ConstructionRequestHandler() {
		port = 1717;
		host = "localhost";
		initializeSocket();
	}
	
	public int createConnection() {
		return port;
	}

	private void initializeSocket() {
		try {
			socket = new Socket(host, port);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public InputStream getConnection(String request) {
		requestProcessor = new ConstructionRequestProcessor();
		return requestProcessor.processRequest(request);
	}
}
