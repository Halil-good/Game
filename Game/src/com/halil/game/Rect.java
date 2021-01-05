package com.halil.game;

import java.awt.Color;
import java.awt.Graphics;

public abstract class Rect extends Entity {

	protected Color color;

	public Rect(int x, int y, Color color) {
		super(x, y);
		this.color = color;
	}

	@Override
	public void render(Graphics g) {
		g.setColor(color);
		g.fillRect(x, y, SCALE, SCALE);
	}

}
