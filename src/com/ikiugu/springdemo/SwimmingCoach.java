package com.ikiugu.springdemo;

public class SwimmingCoach implements Coach {
	
	private DarkFortuneService darkFortuneService;
	
	public SwimmingCoach(DarkFortuneService darkFortuneService) {
		this.darkFortuneService = darkFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Swim 10 laps";
	}

	@Override
	public String getDailyFortune() {
		return darkFortuneService.getFortune();
	}

}
