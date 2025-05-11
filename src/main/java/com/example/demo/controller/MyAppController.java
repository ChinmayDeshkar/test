package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyAppController {

	@GetMapping("/home")
	public String homePage() {
		return "Hello";
	}
}
