package com.ikiugu.springdemo;

public class CricketCoach implements Coach {

	//private field for reference injection
	private FortuneService fortuneService;
	
	//private fields for value injection
	private String emailAddress;
	private String team;
	
	//setter for injection
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Inside cricket coach setter method"); 
		this.fortuneService = fortuneService;
	}

	
	 public CricketCoach() {
		 System.out.println("Inside cricket coach constructor"); 
	 }
	 
	 
	public String getEmailAddress() {
		return emailAddress;
	}


	public void setEmailAddress(String emailAddress) {
		System.out.println("Setter for email being set"); 
		this.emailAddress = emailAddress;
	}


	public String getTeam() {
		return team;
	}


	public void setTeam(String team) {
		System.out.println("Setter for team being set"); 
		this.team = team;
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
