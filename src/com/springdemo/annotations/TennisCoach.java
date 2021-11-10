package com.springdemo.annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("myCoach")
@Scope("singleton")
@Lazy
public class TennisCoach implements Coach {
	
	private FortuneService fortuneService;
	
	//Constructor dependency injection using java annotations.
	@Autowired
	public TennisCoach(@Qualifier("happyFortuneService") FortuneService fortuneService) {
		System.out.println("TennisCoach : inside constructor.");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune() + "- TennisCoach";
	}	
	
	//Bean Lifecycle Method Using Annotation - init
	@PostConstruct
	public void doMyStartUpStuff() {
		System.out.println("Inside custom bean lifecycle method - doMyStartUpStuff");
	}
	
	//Bean Lifecycle Method Using Annotation - destroy
	@PreDestroy
	public void doMyCleanUpStuff() {
		System.out.println("Inside custom bean lifecycle method - doMyCleanUpStuff");
	}

}
