package com.halil.game;

import java.awt.Graphics;

public abstract class Entity {

	protected int x, y;
	protected int velX, velY;

	public Entity(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public abstract void update();

	public abstract void render(Graphics g);

}
