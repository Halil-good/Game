package com.halil.game;

import java.awt.Graphics;

public abstract class Entity {

	public static final int SCALE = 32;
	
	protected boolean draw = true;
	
	protected int x, y;
	protected int velX, velY;

	public Entity(int x, int y) {
		this.x = x;
		this.y = y;
		Handler.addObject(this);
	}

	public abstract void update();

	public abstract void render(Graphics g);
	
	public void delete() {
		Handler.removeObject(null);
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public boolean getDraw() {
		return draw;
	}

}
