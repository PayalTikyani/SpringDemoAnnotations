package com.springdemo.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.springdemo.annotations")
public class PracticeActivityJavaConfig {
	
	@Bean
	public FortuneService practiceActivityFortuneService() {
		return new PracticeActivityFortuneService();
	}
	
	@Bean 
	public Coach practiceActivityFootballCoach() {
		return new PracticeActivityFootballCoach(practiceActivityFortuneService());
	}

}
