package com.test04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {
	
	public static void main(String args[]) {
		
		// UserService타입으로 생성된 변수에 
		// UserServiceImpl 객체의 addUser() 메소드 호출 
		
		ApplicationContext beans = 
				new ClassPathXmlApplicationContext("com/test04/beans.xml");
		
		UserService us = beans.getBean("userServiceImpl", UserService.class);
		us.addUser();
	}
}
