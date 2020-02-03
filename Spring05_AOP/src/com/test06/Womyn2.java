package com.test06;

import org.springframework.stereotype.Component;

@Component
public class Womyn2 implements Person{

	@Override
	public void classWork() {
		
		System.out.println("스프링 강의를 듣는다.");
	}
	
}
