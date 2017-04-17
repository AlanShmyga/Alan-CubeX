package com.alan.cubic.server.handlers;

import java.io.InputStream;

public interface ResourceHandler {

	public InputStream getStreamFromResource(String resourceUrl);
}
