package com.luv2code.springdemo;

import org.springframework.stereotype.Controller;

@Controller
public class BasketballCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Practice free throws for 30 minutes";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}

}
