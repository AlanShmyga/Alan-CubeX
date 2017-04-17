package com.alan.cubic.server.listeners;

import java.io.InputStream;

import com.alan.cubic.server.balancers.LoadBalancer;
import com.google.inject.Inject;

public class ConstructionRequestListener implements RequestListener {

	@Inject
	private LoadBalancer loadBalancer;
	
	public int createConnection(String request) {
		return loadBalancer.createConnection(request);
	}

	public InputStream getConnection(String request) {
		return loadBalancer.getConnection(request);
	}

	public void dropConnection(String request) {
		// TODO Auto-generated method stub
		
	}

}
