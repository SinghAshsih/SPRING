package com.spring.core.annotationbased;

import org.springframework.stereotype.Component;

@Component("car")
public class Car implements Vechile {

	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Car is moving ....");
	}

}
