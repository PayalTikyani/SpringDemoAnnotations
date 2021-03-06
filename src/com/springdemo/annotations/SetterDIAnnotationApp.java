package com.springdemo.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDIAnnotationApp {

	public static void main(String[] args) {
		//read spring config file 
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//get bean from container
		Coach theCoach = context.getBean("baseballCoach", Coach.class);
		
		//call method using bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		//close the context
		context.close();

	}

}
