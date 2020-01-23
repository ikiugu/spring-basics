package com.ikiugu.springdemo;

public class DarkFortuneService implements FortuneService {

	private String[] fortunes = 
		{
				"You will die", 
				"You will get hit my a bus", 
				"You will choke on food", 
				"You will end in tears"
				};
	
	@Override
	public String getFortune() {
		
		int num = (int) Math.floor((Math.random() * fortunes.length));
		
		
		return fortunes[num];
	}

}
