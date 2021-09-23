package com.bridglab.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

	@GetMapping("/web")
	public String hello() {
		return "hello";
	}
}
