package com.alan.cubic.server.balancers;

import java.io.InputStream;

public interface LoadBalancer {
	
	public int createConnection(String request);
	
	public InputStream getConnection(String request);
	
	public void dropConnection(String request);

}
