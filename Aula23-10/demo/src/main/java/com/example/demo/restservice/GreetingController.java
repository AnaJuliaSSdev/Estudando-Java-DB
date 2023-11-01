package com.example.demo.restservice;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/greeting")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}

    @GetMapping("/sum")
	public Calculator greeting(@RequestParam(value = "a", defaultValue = "0") int a, @RequestParam(value = "b", defaultValue = "0") int b) {
		return new Calculator(a,b, a+b);
	}
}