package com.triviagame.triviagame;

import java.util.Optional;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PlayerController {
	
	@Resource
	private PlayerRepository playerRepo;

	
	public void findOnePlayer(@RequestParam(value = "id") long id, Model model) {
		Optional<Player> player = playerRepo.findById(id);
		model.addAttribute("playersModel", player.get());
		return("scoreboard");
		
	}

}
