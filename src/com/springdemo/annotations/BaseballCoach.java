package com.springdemo.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach {
	
	private FortuneService fortuneService;

	public BaseballCoach() {}

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
