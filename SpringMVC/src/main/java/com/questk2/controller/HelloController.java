package com.questk2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
	@GetMapping("/")
	public String display(Model model) {
		model.addAttribute("message", "My first Program...");
		return "index";
	}
}
