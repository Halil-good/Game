package com.halil.game;

import java.awt.Graphics;
import java.util.LinkedList;

public class Handler {

	LinkedList<Entity> objects = new LinkedList<Entity>();

	public void update() {
		for (Entity object : objects) {
			object.update();
		}
	}

	public void render(Graphics g) {
		for (Entity object : objects) {
			object.render(g);
		}
	}

	public void addObject(Entity object) {
		objects.add(object);
	}

	public void removeObject(Entity object) {
		objects.remove(object);
	}

}
