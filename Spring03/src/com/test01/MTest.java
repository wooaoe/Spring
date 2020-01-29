package com.test01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {

	public static void main(String[] args) {
		
		ApplicationContext factory = 
				new ClassPathXmlApplicationContext("com/test01/beans.xml");
		
		AbstractTest bean = factory.getBean("singleton", AbstractTest.class);
		System.out.println("오늘은 " + bean.dayinfo() + " 입니다.");
	}
	
	
}
