package com.alan.cubic.client.player;

import java.io.InputStream;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

public class TestPlayer implements BasePlayer {

	private Player player;
	
	public void play(InputStream input) {
		try {
			player = new Player(input);
			player.play();
		} catch (JavaLayerException e) {
			e.printStackTrace();
		}
	}
}
