package com.alan.cubic.client;

import com.alan.cubic.client.player.BasePlayer;
import com.alan.cubic.server.ServerModule;
import com.alan.cubic.server.handlers.RequestHandler;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class App {
	
	private static RequestHandler requestHandler;
	private static BasePlayer player;
	
    public static void main( String[] args ) {
    	Injector injector = Guice.createInjector(new ClientModule(), new ServerModule());
    	requestHandler = injector.getInstance(RequestHandler.class);
    	player = injector.getInstance(BasePlayer.class);
        player.play(requestHandler.getConnection(""));
    }
}
