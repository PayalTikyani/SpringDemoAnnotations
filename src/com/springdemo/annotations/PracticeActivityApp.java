package com.springdemo.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PracticeActivityApp {

	public static void main(String[] args) {
		
		//read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//get bean from spring container
		Coach theCoach = context.getBean("practiceActivityCoach", Coach.class);
		
		//call methon on bean
		System.out.println(theCoach.getDailyWorkout());
		
		//close the context
		context.close();
		

	}

}
