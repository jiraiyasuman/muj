package com.muj_unity_fest_2025.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class HomeController {

	@GetMapping("home")
	public String home() {
		log.info("redirecting to the home page");
		return "redirect:/index.html";
	}
}
