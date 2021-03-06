package com.ikiugu.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		// initialize app context
		ClassPathXmlApplicationContext appContext = 
				new ClassPathXmlApplicationContext("applicationContext.xml");

		// retrieve bean from spring container
		CricketCoach theCoach = appContext.getBean("myCricketCoach", CricketCoach.class);
		
		// call methods on the bean
		 System.out.println(theCoach.getDailyFortune());
		 
		 // test for literal injection
		 System.out.println(theCoach.getTeam());
		 System.out.println(theCoach.getEmailAddress());
		
		// close context
		appContext.close();
	}

}
