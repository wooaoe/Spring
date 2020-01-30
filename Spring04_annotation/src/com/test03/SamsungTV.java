package com.test03;

import org.springframework.stereotype.Component;

@Component(value="Samsung")
public class SamsungTV implements TV{

	
	public SamsungTV() {
		System.out.println("SamsungTV 생성");
	}

	@Override
	public void powerOn() {
		System.out.println("SamsungTV powerOn");
	}

	@Override
	public void powerOff() {
		System.out.println("SamsungTV powerOff");
	}

	@Override
	public void volUp() {
		System.out.println("SamsungTV volUp");
	}

	@Override
	public void volDown() {
		System.out.println("SamsungTV volDown");
	}

}
