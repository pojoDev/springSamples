package com.pojodev.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerHello {

	@RequestMapping("/hello")
	public String hello(Model model) {
		
		model.addAttribute("name","Pojo Developer!!!");
		return "welcome";		
	}
}
