package com.test01.anno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {

	public static void main(String[] args) {

		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test01/anno/beans.xml");

		// 빈의 이름은 해당 클래스의 이름과 동일(단, 첫 글자는 무조건 소문자)
		NickNamePrn my = factory.getBean("nickNamePrn", NickNamePrn.class);
		System.out.println(my);

	}

}
