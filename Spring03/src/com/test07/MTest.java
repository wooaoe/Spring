package com.test07;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {

	public static void main(String[] args) {
		
		ApplicationContext beans = 
				new ClassPathXmlApplicationContext("com/test07/beans.xml");
		
		Bar bar = beans.getBean("bar", Bar.class);
		bar.prn();
		
		Poo p = beans.getBean("poo", Poo.class);
		
		
	}
	
}
