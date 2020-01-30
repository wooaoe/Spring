package com.test03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {

	public static void main(String[] args) {
		
		ApplicationContext beans = 
				new ClassPathXmlApplicationContext("com/test03/applicationContext.xml");
		
		//samsung
		TV tv = beans.getBean("Samsung", TV.class);
		tv.powerOn();
		tv.powerOff();
	
		//lg
		tv = beans.getBean("lg", TV.class);
		tv.powerOn();
		tv.powerOff();
	}

}
