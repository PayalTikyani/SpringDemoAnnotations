package com.springdemo.annotations;

import org.springframework.stereotype.Component;

@Component("myCoach")
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

}
