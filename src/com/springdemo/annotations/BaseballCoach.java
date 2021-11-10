package com.springdemo.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Lazy
@Component
public class BaseballCoach implements Coach {
	
	private FortuneService fortuneService;

	public BaseballCoach() {
		System.out.println("BaseballCoach : inside constructor.");
	}

	@Override
	public String getDailyWorkout() {
		return "Practice batting!";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	//Setter injection using Java Annotations 
	@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("BaseballCoach : inside setFortuneService.");
		this.fortuneService = fortuneService;
	}


}
