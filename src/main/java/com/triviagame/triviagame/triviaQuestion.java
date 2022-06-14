package com.triviagame.triviagame;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class triviaQuestion {

	@Id
	@GeneratedValue
	private long id;
	private String text;
	private String answer;
	private int pointValue;

	public triviaQuestion(long id, String text, String answer, int pointValue) {
		this.id = id;
		this.text = text;
		this.answer = answer;
		this.pointValue = pointValue;
	}

	public long getId() {
		return id;
	}

	public String getText() {
		return text;
	}

	public String getAnswer() {
		return answer;
	}

	public int getPointValue() {
		return pointValue;
	}

}
