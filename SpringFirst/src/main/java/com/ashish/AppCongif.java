package com.ashish;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppCongif {
	@Bean
	public HelloWorld helloWorld() {

		HelloWorld hello = new HelloWorld();
		return hello;

	}
}