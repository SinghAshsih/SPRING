package com.spring.core.annotationbased.repositiory;

import org.springframework.stereotype.Repository;

@Repository
public class DemoRepository {
	public String hello() {
		return "I am from repo";
	}
}
