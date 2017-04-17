package com.alan.cubic.server.handlers;

import java.io.InputStream;

public interface RequestHandler {

	public int createConnection();
	
	public InputStream getConnection(String request);

}
