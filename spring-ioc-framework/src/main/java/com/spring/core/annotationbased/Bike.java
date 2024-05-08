package com.spring.core.annotationbased;

import org.springframework.stereotype.Component;

@Component("bike")
public class Bike implements Vechile {

	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Bike is moving...");
	}

}
