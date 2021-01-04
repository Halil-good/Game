package com.halil.game;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

class Key {
	boolean isPressed = false;
	boolean isReleased = false;
}

public class KeyInput extends KeyAdapter {

	public static Key[] keys = new Key[100];
	
	public KeyInput() {
		for (int i = 0; i < keys.length; i++) {
			keys[i] = new Key();
		}
	}

	public static boolean isKeyPressed(int keycode) {
		return keys[keycode].isPressed;
	}
	
	public static boolean isKeyReleased(int keycode) {
		return keys[keycode].isReleased;
	}

	public void keyPressed(KeyEvent e) {
		keys[e.getKeyCode()].isPressed = true;
		keys[e.getKeyCode()].isReleased = false;
	}

	public void keyReleased(KeyEvent e) {
		keys[e.getKeyCode()].isPressed = false;
		keys[e.getKeyCode()].isReleased = true;
	}

}
