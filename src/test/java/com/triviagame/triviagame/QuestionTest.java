package com.triviagame.triviagame;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class QuestionTest {

	triviaQuestion underTest = new triviaQuestion(1L, "text", "answer", 100);
	
	@Test
	public void shouldReturnId() {
		long check = underTest.getId();
		assertEquals(check, 1L);
	}
	
	@Test
	public void shouldReturnText() {
		String check = underTest.getText();
		assertEquals(check, "text");
	}
	
	@Test
	public void shouldReturnAnswer() {
		String check = underTest.getAnswer();
		assertEquals(check, "answer");
	}
	
	@Test
	public void shouldReturnPointValue() {
		int check = underTest.getPointValue();
		assertEquals(check, 100);
	}
}
