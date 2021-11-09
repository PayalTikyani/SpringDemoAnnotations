package com.springdemo.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDIAnnotationApp {

	public static void main(String[] args) {
		//read spring config file 
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach theCoach = context.getBean("baseballCoach", Coach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		context.close();

	}

}
