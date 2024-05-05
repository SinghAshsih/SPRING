package com.ashish;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ashish")
public class Controller {

	@GetMapping("hi")
	public String message() {
		System.out.println("Hello i am from controller ");
		return "hello boss";
	}
}
