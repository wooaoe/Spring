package com.test01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {

	public static void main(String[] args) {

		ApplicationContext factory = 
				new ClassPathXmlApplicationContext("com/test01/beans.xml");
		
		MessageBean strawberry =(MessageBean)factory.getBean("strawberry");
		strawberry.sayHello();
		
		MessageBean orange = (MessageBean)factory.getBean("orange");
		orange.sayHello();
		
		MessageBean banana = (MessageBean)factory.getBean("banana");
		banana.sayHello();
	}

}
