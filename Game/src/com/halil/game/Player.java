package com.halil.game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;

public class Player extends Entity {

	public Player(int x, int y) {
		super(x, y);

		velX = 2;
		velY = 2;
	}

	public void update() {
		if (KeyInput.isKeyPressed(KeyEvent.VK_D)) {
			x += velX;
		}
		if (KeyInput.isKeyPressed(KeyEvent.VK_A)) {
			x -= velX;
		}
		if (KeyInput.isKeyPressed(KeyEvent.VK_W)) {
			y -= velY;
		}
		if (KeyInput.isKeyPressed(KeyEvent.VK_S)) {
			y += velY;
		}
	}

	public void render(Graphics g) {
		g.setColor(Color.blue);
		g.fillRect(x, y, 32, 32);
	}

}
