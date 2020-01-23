package com.ikiugu.springdemo;

public class CricketCoach implements Coach {

	//private field
	private FortuneService fortuneService;
	
	//setter for injection
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Inside cricket coach setter method"); 
		this.fortuneService = fortuneService;
	}

	
	 public CricketCoach() {
		 System.out.println("Inside cricket coach constructor"); 
	 }
	
	
	@Override
	public String getDailyWorkout() {
		return "Practice first bowling for 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
