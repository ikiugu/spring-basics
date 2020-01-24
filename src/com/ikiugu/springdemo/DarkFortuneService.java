package com.ikiugu.springdemo;

import java.util.Random;

public class DarkFortuneService implements FortuneService {

	private String[] fortunes = 
		{
				"You will die", 
				"You will get hit my a bus", 
				"You will choke on food", 
				"You will end in tears"
				};
	
	private Random randomNumber = new Random();
	
	@Override
	public String getFortune() {
		
		int num = randomNumber.nextInt(fortunes.length);
		
		
		return fortunes[num];
	}

}
