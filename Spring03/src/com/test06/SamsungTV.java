package com.test06;

public class SamsungTV implements TV{

	public SamsungTV() {
		System.out.println("SamSungTV 생성");
	}
	
	@Override
	public void powerOn() {
		System.out.println("SamsungTV power on");
	}

	@Override
	public void powerOff() {
		System.out.println("SamsungTV power off");
		
	}

	@Override
	public void volumeUp() {
		System.out.println("SamsungTV volumeUp");
		
	}

	@Override
	public void volumeDown() {
		System.out.println("SamsungTV volumeDown");
		
	}

}
