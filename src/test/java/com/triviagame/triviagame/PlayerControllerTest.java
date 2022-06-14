package com.triviagame.triviagame;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.ui.Model;

public class PlayerControllerTest {

	@InjectMocks
	private PlayerController underTest;
	
	@Mock
	private Player player;
	
	@Mock
	private PlayerRepository playerRepo;
	
	@Mock
	private Model model;
	
	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void shouldAddSinglePlayerToTable() {
		Long playerId = 1L;
		when(playerRepo.findById(playerId)).thenReturn(Optional.of(player));
		
		underTest.findOnePlayer(playerId, model);
		verify(model).addAttribute("players", player);
	}
}
