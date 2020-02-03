package com.test05;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test05.Person;

public class MTest {

	public static void main(String[] args) {
		
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("com/test05/applicationContext.xml");
		
		Person w = context.getBean("womyn", Person.class);
		Person w2 = context.getBean("womyn2", Person.class);
		
		System.out.println("학생 입장");
		w.classWork();
		
		System.out.println("----------");
		
		System.out.println("학생2 입장");
		w2.classWork();
		
	}

}
