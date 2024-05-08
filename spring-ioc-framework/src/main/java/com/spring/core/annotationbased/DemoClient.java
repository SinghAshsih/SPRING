package com.spring.core.annotationbased;

import org.springframework.context.ApplicationContext;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.spring.core.annotationbased.controller.DemoController;
import com.spring.core.annotationbased.repositiory.DemoRepository;
import com.spring.core.annotationbased.service.DemoService;

public class DemoClient {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		DemoController demoController = applicationContext.getBean(DemoController.class);
		System.out.println(demoController.hello());
		demoController.hello();
		DemoRepository demoRepository = applicationContext.getBean(DemoRepository.class);
		System.out.println(demoRepository.hello());
		DemoService demoService = applicationContext.getBean(DemoService.class);
		System.out.println(demoService.hello());

	}
}
