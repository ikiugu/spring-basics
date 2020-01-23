package com.ikiugu.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new 
				ClassPathXmlApplicationContext("beanscope-applicationContext.xml");
		
		Coach coach = context.getBean("myCoach", Coach.class);
		Coach anotherCoach = context.getBean("myCoach", Coach.class);
		
		System.out.println(coach);
		System.out.println(anotherCoach);
		
		context.close();
	}

}
