package com.niit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	@RequestMapping("/main")
	public String mainPage(Model model) {

		return "main";
	}
	
	@RequestMapping("/login")
	public String loginPage(Model model) {

		return "login";
	}
	
	@RequestMapping("/signup")
	public String signupPage(Model model) {

		return "signup";
	}
	
	@RequestMapping("/cart")
	public String cartPage(Model model) {

		return "cart";
	}

}