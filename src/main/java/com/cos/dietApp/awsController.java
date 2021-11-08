package com.cos.dietApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class awsController {
	
	@GetMapping("/")
	public String home() {
		
		return "home";
	}
	
}
