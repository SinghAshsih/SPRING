package com.spring.core.annotationbased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
	public static void main(String[] args) {
		// Creating spring IOC Container
		// Read the configuration class
		// Create and manage spring beans
		@SuppressWarnings("resource")
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

		// Retrieve spring bean from spring IOC container
		Car car = applicationContext.getBean(Car.class);
		car.move();
		Bike bike = applicationContext.getBean(Bike.class);
		bike.move();

		Traveler traveler = applicationContext.getBean(Traveler.class);
		traveler.startJourney();
		
	}
}
