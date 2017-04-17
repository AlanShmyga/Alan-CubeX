package com.alan.cubic.client;

import com.alan.cubic.client.player.BasePlayer;
import com.alan.cubic.client.player.TestPlayer;
import com.alan.cubic.server.handlers.ConstructionRequestHandler;
import com.alan.cubic.server.handlers.RequestHandler;
import com.google.inject.AbstractModule;

public class ClientModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(RequestHandler.class).to(ConstructionRequestHandler.class);	
		bind(BasePlayer.class).to(TestPlayer.class);
	}
}
