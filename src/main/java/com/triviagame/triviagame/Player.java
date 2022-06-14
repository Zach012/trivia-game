package com.triviagame.triviagame;

import javax.persistence.Entity;

@Entity
public class Player {

	private long id;
	private String name;
	private int score;

	public Player(long id, String name, int score) {
		this.id = id;
		this.name = name;
		this.score = score;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}

}
