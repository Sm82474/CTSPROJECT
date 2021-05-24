package com.cts.junitlearn;

public class Game {

	private Player player;
	public String attack() {
		return "player attack with "+player.getWeapon();
	}
}
