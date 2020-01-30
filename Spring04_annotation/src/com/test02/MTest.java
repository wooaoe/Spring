package com.test02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {

	public static void main(String[] args) {
		
		ApplicationContext factory =
				new ClassPathXmlApplicationContext("com/test02/beans.xml");
		
		School sch = factory.getBean("myschool", School.class);
		System.out.println(sch);
		
		
	}

}
