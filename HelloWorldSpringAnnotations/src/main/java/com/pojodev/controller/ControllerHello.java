package com.pojodev.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.pojodev.dto.UserRegisterForm;

@Controller
public class ControllerHello {

	@RequestMapping(value="/hello")
	public String hello(Model model) {
		
		model.addAttribute("name","Pojo Developer!!!");
		return "welcome";		
	}
	
	@RequestMapping(value="/register", method=RequestMethod.GET)
	public String register(Model model) {
		
		return "register";		
	}
	
	@RequestMapping(value="/register", method=RequestMethod.POST)
	public ModelAndView register(@ModelAttribute("userRegisterForm") UserRegisterForm userRegisterForm, Model model) {
		
		model.addAttribute("msg","Your Registration was successful!!!");
		return new ModelAndView("registerSuccess", "userRegisterForm", userRegisterForm);
	}
}
