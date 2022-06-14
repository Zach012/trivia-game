package com.triviagame.triviagame;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class PlayerTest {

	Player underTest = new Player(1L, "name", 100);
	
	@Test
	public void shouldReturnId() {
		long check = underTest.getId();
		assertEquals(check, 1L);
	}
	
	@Test
	public void shouldReturnName() {
		String check = underTest.getName();
		assertEquals(check, "name");
	}
	
	@Test
	public void shouldReturnScore() {
		int check = underTest.getScore();
		assertEquals(check, 100);
	}
}
