package com.test05;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mtest {

	public static void main(String[] args) {

		ApplicationContext factory = 
				new ClassPathXmlApplicationContext("com/test05/beans.xml");
		
		Engineer eng = factory.getBean("kang", Engineer.class);
		System.out.println(eng);
		
		Developer dev = factory.getBean("you", Developer.class);
		System.out.println(dev);
		
	}

}
