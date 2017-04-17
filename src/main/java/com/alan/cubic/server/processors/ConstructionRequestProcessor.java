package com.alan.cubic.server.processors;

import java.io.InputStream;

import com.alan.cubic.server.handlers.ConstructionResourceHandler;
import com.alan.cubic.server.handlers.ResourceHandler;
import com.google.inject.Inject;

public class ConstructionRequestProcessor implements RequestProcessor {

	@Inject
	private ResourceHandler resourceHandler;
	
	@Override
	public InputStream processRequest(String request) {	
		resourceHandler = new ConstructionResourceHandler();
		return resourceHandler.getStreamFromResource(request);
	}

}
