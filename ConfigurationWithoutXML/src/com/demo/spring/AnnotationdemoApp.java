package com.demo.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationdemoApp {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(SportConfig.class);
		
		Coach thCoach=context.getBean("vollyBallCAoch",Coach.class);
		System.out.println(thCoach.dailyWorkout());
		context.close();
	}

	
	
	
	
	
}
