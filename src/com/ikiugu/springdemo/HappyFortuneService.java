package com.ikiugu.springdemo;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Yeah!!!Some good fortune";
	}

}
