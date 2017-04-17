package com.alan.cubic.server;

import com.alan.cubic.server.balancers.ConstructionLoadBalancer;
import com.alan.cubic.server.balancers.LoadBalancer;
import com.alan.cubic.server.handlers.ConstructionResourceHandler;
import com.alan.cubic.server.handlers.ResourceHandler;
import com.alan.cubic.server.listeners.ConstructionRequestListener;
import com.alan.cubic.server.listeners.RequestListener;
import com.alan.cubic.server.processors.ConstructionRequestProcessor;
import com.alan.cubic.server.processors.RequestProcessor;
import com.google.inject.AbstractModule;

public class ServerModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(RequestListener.class).to(ConstructionRequestListener.class);
		bind(LoadBalancer.class).to(ConstructionLoadBalancer.class);
		bind(ResourceHandler.class).to(ConstructionResourceHandler.class);
		bind(RequestProcessor.class).to(ConstructionRequestProcessor.class);
	}

}
