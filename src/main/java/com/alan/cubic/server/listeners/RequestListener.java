package com.alan.cubic.server.listeners;

import java.io.InputStream;

public interface RequestListener {

	public int createConnection(String request);
	
	public InputStream getConnection(String request);
	
	public void dropConnection(String request);
	
}
