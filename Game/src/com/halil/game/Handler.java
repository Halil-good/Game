package com.halil.game;

import java.awt.Graphics;
import java.util.LinkedList;

public class Handler {

	static LinkedList<Entity> objects = new LinkedList<Entity>();

	public static void update() {
		for (Entity object : objects) {
			if (object.getDraw())
				object.update();
		}
	}

	public static void render(Graphics g) {
		for (Entity object : objects) {
			if (object.getDraw())
				object.render(g);
		}
	}
	
	public static void move(int x, int y) {
		for (Entity object : objects) {
			if (object.getDraw()) {
				object.setX(object.getX() + x);
				object.setY(object.getY() + y);				
			}
		}
	}

	public static void moveWithSkipping(int x, int y, Entity entity) {
		for (Entity object : objects) {
			if(object == entity)
				continue;
			
			if (object.getDraw()) {
				object.setX(object.getX() + x);
				object.setY(object.getY() + y);				
			}
		}
	}

	public static void addObject(Entity object) {
		objects.add(object);
	}

	public static void removeObject(Entity object) {
		objects.remove(object);
	}

}
