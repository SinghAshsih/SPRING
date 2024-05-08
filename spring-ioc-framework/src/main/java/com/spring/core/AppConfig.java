package com.spring.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	@Bean
	public Vechile car() {
		return new Car();
	}

	@Bean
	public Vechile bike() {
		return new Bike();
	}

	@Bean
	public Vechile cycle() {
		return new Cycle();
	}

	@Bean
	public Traveler traveler() {
		return new Traveler(car()); // DI
	}
}
