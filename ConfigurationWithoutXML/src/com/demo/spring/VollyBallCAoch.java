package com.demo.spring;

import org.springframework.stereotype.Component;

@Component
public class VollyBallCAoch implements Coach {

	@Override
	public String dailyWorkout() {
		
		
		return "Set  a ball..";
	}

}
