package com.spring.core.annotationbased.service;

import org.springframework.stereotype.Service;

@Service
public class DemoService {
	public String hello() {
		return "I am from services";
	}
}
