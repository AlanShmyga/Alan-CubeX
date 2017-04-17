package com.alan.cubic.server.balancers;

import java.io.InputStream;
import com.alan.cubic.server.handlers.RequestHandler;
import com.google.inject.Inject;
import com.google.inject.Singleton;

@Singleton
public class ConstructionLoadBalancer implements LoadBalancer {
	
	@Inject
	private RequestHandler requestHandler;
	
	public int createConnection(String request) {
		return requestHandler.createConnection();
	}

	public void dropConnection(String request) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public InputStream getConnection(String request) {
		return requestHandler.getConnection(request);
	}

}
