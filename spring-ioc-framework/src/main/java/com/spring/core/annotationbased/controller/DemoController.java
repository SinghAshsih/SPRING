package com.spring.core.annotationbased.controller;

import org.springframework.stereotype.Controller;

@Controller
public class DemoController {
	public String hello() {
		return "Hello I am from controller";
	}
}
