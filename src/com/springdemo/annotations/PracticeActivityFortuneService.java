package com.springdemo.annotations;

import org.springframework.stereotype.Component;

@Component
public class PracticeActivityFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Fortunes by - PracticeActivityFortuneService";
	}

}
