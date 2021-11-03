package com.springdemo.annotations;

import org.springframework.stereotype.Component;

@Component
public class PracticeActivityCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Perform Inversion of Control with Java Annotations";
	}

}
