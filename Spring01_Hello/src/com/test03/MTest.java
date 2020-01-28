package com.test03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {

	public static void main(String[] args) {
		
		//컨테이너 생성 
		ApplicationContext factory = 
				new ClassPathXmlApplicationContext("com/test03/bean.xml"); //bean파일의 경로 설정 
		
		MessageBean bean = (MessageBean)factory.getBean("bean01"); //xml파일에서 설정해둔 bean id를 가져옴 
		bean.sayHello("Spring");
		
		bean = (MessageBean)factory.getBean("bean02");
		bean.sayHello("스프링");
		
	}

}
