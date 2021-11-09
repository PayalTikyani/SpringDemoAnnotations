package com.springdemo.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("myCoach")
public class TennisCoach implements Coach {
	
	private FortuneService fortuneService;
	
	//Constructor dependency injection using java annotations.
	@Autowired
	public TennisCoach(FortuneService fortuneService) {
		System.out.println("TennisCoach : inside constructor.");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}	

}
