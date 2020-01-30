package com.test03;

import org.springframework.stereotype.Component;

@Component(value="lg")
public class LgTV implements TV {

	
	public LgTV() {
		System.out.println("LgTV 생성");
	}

	@Override
	public void powerOn() {
		System.out.println("LgTV powerOn");
	}

	@Override
	public void powerOff() {
		System.out.println("LgTV powerOff");
	}

	@Override
	public void volUp() {
		System.out.println("LgTV volUp");
	}

	@Override
	public void volDown() {
		System.out.println("LgTV volDown");
	}
	
	
	
	
}
