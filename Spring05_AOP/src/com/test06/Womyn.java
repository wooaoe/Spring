package com.test06;

import org.springframework.stereotype.Component;

@Component
public class Womyn implements Person{

	@Override
	public void classWork() {

		System.out.println("책을 펴서 복습을 한다.");
	}
	
}
