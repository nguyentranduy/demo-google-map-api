package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/index")
	public String doGetIndex() {
		return "user/index";
	}
	
	@GetMapping("")
	public String doGetRedirectIndex() {
		return "redirect:/index";
	}
}
