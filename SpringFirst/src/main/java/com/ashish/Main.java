package com.ashish;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(HelloWorld.class);
		HelloWorld hello = (HelloWorld) context.getBean("helloWorld");
		hello.setMessage("Spring IOC first project");
		String message = hello.getMessage();
		System.out.println(message);
		context.close();
	}
}
