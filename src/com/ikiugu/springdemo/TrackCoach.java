package com.ikiugu.springdemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	
	public TrackCoach() {
		
	}

	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return "Just do it " + fortuneService.getFortune();
	}

	// init method
	public void doMyStartupStuff() {
		System.out.println("inside init method");
	}
	
	// destroy method
	public void doMyCleanUpStartupStuff() {
		System.out.println("inside destroy method");
	}
}
