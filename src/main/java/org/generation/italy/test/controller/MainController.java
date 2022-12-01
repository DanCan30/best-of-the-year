package org.generation.italy.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	@RequestMapping("/")
	public String goHome(Model model) {
		
		String name = "Daniele";
		model.addAttribute("name", name);
		return "home";
	}

}
