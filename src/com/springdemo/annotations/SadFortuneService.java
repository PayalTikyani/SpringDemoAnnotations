package com.springdemo.annotations;

public class SadFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Sad Fortune Service.";
	}

}
