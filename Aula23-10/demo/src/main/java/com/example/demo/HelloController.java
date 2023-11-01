package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/abc")
	public String index() {
		return "Greetings from Spring Boot! abc";
	}

}