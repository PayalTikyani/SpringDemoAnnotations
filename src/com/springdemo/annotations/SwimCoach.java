package com.springdemo.annotations;

public class SwimCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public SwimCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice swimming - SwimCoach";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune() + " - SwimCoach";
	}

}
