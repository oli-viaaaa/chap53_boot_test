package com.javalab.board.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class BoardController {
	
	@GetMapping("/board")
	public String home(Model model) {
		
		log.info("BoardController home 메소드");
		model.addAttribute("date", new Date());
		return "home";
	}
}
