package com.justinmarotta.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.justinmarotta.game.MarioBros;

public class DesktopLauncher {
	public static void main (String[] arg) {

		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		new LwjglApplication(new MarioBros(), config);
		config.width = 1200;
		config.height = 624;
	}
}
