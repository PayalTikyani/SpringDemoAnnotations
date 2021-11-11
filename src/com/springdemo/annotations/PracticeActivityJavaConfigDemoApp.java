package com.springdemo.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PracticeActivityJavaConfigDemoApp {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PracticeActivityJavaConfig.class);
		
		Coach theCoach = context.getBean("practiceActivityFootballCoach", Coach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		context.close();

	}

}
