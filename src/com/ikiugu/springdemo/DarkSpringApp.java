package com.ikiugu.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DarkSpringApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext appContext = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach theCoach = appContext.getBean("mySwimmingCoach", Coach.class);
		
		System.out.println("Todays dark fortune is " + theCoach.getDailyFortune());
		
		appContext.close();

	}

}
