package com.test03;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect //해당하는 bean이 생성될 때 Aspect로 만들어짐 
public class MyAspect {
	
	@Before("execution(public void com.test03.*.*(..))") //03안에 어떤 클래스와 메소드이던 실행 
	public void before(JoinPoint join) {
		System.out.println("출석카드 찍는다.");
	}
	
	@After("execution(public void com.test03.*.*(..))")
	public void after(JoinPoint join) {
		System.out.println("강의장을 나간다.");
	}
	
	@AfterThrowing(pointcut="execution(public void com.test03.*.*(..))", throwing = "e")
	public void throwing(JoinPoint join) {
		System.out.println("쉬는 날");
	}
	
}
