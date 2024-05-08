package com.ashish;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tony.Dog;

@RestController
@RequestMapping("/ashish")
public class Controller {

	@Autowired
	Dog dog;

	@GetMapping("hi")
	public String message() {
		System.out.println("Hello i am from controller ");
		return dog.fun();
	}
}
