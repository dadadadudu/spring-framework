package com.zhouyu;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
		applicationContext.register(MyConfig.class);
		applicationContext.refresh();

		UserService userService = applicationContext.getBean(UserService.class);
		userService.test();
	}
}
