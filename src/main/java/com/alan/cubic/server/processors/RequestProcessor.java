package com.alan.cubic.server.processors;

import java.io.InputStream;

public interface RequestProcessor {
	
	public InputStream processRequest(String request);

}
