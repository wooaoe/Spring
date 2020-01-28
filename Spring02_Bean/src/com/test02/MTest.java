package com.test02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {

	public static void main(String[] args) {

		ApplicationContext app = new ClassPathXmlApplicationContext("com/test02/applicationContext.xml");

		Address myaddr01 = (Address) app.getBean("myAddr01");
		System.out.println(myaddr01);
		
		Address myaddr02 = app.getBean("myaddr02", Address.class); //dd 이렇게 해주면 형변환 해주지 않아도 됨 
		System.out.println(myaddr02);
		
		Address myaddr03 = app.getBean("myaddr03", Address.class);
		System.out.println(myaddr03);
		
		JobAddress lee = app.getBean("lee", JobAddress.class);
		System.out.println(lee);
		
		JobAddress lee2 = app.getBean("lee2", JobAddress.class);
		System.out.println(lee2);

	}

}
