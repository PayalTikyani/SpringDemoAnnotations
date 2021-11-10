package com.springdemo.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class CricketCoach implements Coach {

	//Field injection using Java Annotation - autowired.
	@Autowired
	@Qualifier("happyFortuneService")
	private FortuneService fortuneService;
	
	public CricketCoach() {
		System.out.println("CricketCoach : inside default constructor.");
	}
	
	@Override
	public String getDailyWorkout() {
		return "Daily workout by CricketCoach";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune() + "- CricketCoach";
	}

}
