package com.spring.core.annotationbased;

import org.springframework.stereotype.Component;

@Component("cycle")
//@Primary        use in place of qualifier annotation 
public class Cycle implements Vechile {

	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Cycle is moving ....");
	}

}
