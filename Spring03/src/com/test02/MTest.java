package com.test02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {

	public static void main(String[] args) {
		
		ApplicationContext beans = 
				new ClassPathXmlApplicationContext("com/test02/beans.xml");
		
		BirthVo vo = beans.getBean("friendBirth", BirthVo.class);
		System.out.println(vo);
		
		vo = beans.getBean("lee", BirthVo.class);
		System.out.println(vo);
		
	}

}
