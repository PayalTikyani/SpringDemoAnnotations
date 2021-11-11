package com.springdemo.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PracticeActivityFootballCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public PracticeActivityFootballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice football - FootballCoach";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
