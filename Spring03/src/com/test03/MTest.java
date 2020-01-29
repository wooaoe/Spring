package com.test03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {

	public static void main(String[] args) {
		
		ApplicationContext beans = 
				new ClassPathXmlApplicationContext("com/test03/beans.xml");
		
		Engineer eng = beans.getBean("kang", Engineer.class);
		Developer del = beans.getBean("you", Developer.class);
		System.out.println(eng);
		System.out.println(del);
		
		
		
		
	}

}
