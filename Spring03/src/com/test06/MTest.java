package com.test06;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {

	public static void main(String[] args) {

		ApplicationContext beans = 
				new ClassPathXmlApplicationContext("com/test06/beans.xml");
		
		TV tv = beans.getBean("samsung", TV.class);
		tv.powerOn();
		tv.powerOff();
		
		TV tv2 = beans.getBean("Lg", TV.class);
		tv2.powerOn();
		tv2.powerOff();
		
		
	}

}
