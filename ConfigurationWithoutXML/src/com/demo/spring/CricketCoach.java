package com.demo.spring;

import org.springframework.stereotype.Component;
import org.springframework.test.annotation.Commit;

@Component
public class CricketCoach implements Coach {

	@Override
	public String dailyWorkout() {
		return "Hit a six......";
	}

}
