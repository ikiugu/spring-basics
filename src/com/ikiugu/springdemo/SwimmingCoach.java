package com.ikiugu.springdemo;

public class SwimmingCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Swim 10 laps";
	}

	@Override
	public String getDailyFortune() {
		return null;
	}

}
