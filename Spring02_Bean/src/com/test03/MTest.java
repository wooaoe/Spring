package com.test03;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {
	
	public static void main(String[] args) {
		
		ApplicationContext app = 
				new ClassPathXmlApplicationContext(
						"com/test03/applicationContext.xml");
		
		System.out.println(app.getBean("now", Date.class));
		//bean 자체에서 객체 생성 가능 
		
		System.out.println(app.getBean("myDate", Date.class));
		
		UserVo vo = app.getBean("myvo", UserVo.class);
		System.out.println(vo.getUserName());
		System.out.println(vo.getPer());
		System.out.println(vo.getMyDate());
		
		//userService 객체(빈) 생성
		//위에서 가져온 userVo 객체를 addUser() 매개변수로 사용 
		
		UserServiceImpl user = app.getBean("user", UserServiceImpl.class);
		user.addUser(vo);
		
		
		
	}
	
}
