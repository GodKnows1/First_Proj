package com.example.Practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class PracticeApplication {

	public static void main(String[] args) {
		ApplicationContext context =  SpringApplication.run(PracticeApplication.class, args);
		UserService userService = context.getBean(UserService.class);
		UserService userService1 = context.getBean(UserService.class);
		System.out.println(userService==userService1);
		System.out.println(userService.get());
		userService.save();
	}

}


