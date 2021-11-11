package com.springdemo.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
		
		//read spring java config class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		
		//get bean from spring container
		Coach theCoach = context.getBean("swimCoach", Coach.class);
		
		//call method on bean
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());
		
		//get bean from spring container
		SwimCoach alphaCoach = context.getBean("swimCoach", SwimCoach.class);
		
		//Call new methods of swimCoach ...which has values injected from properties file		
		System.out.println("Email : " + alphaCoach.getEmail());
		System.out.println("Team : " + alphaCoach.getTeam());
		
		//close the context
		context.close();
	}

}
