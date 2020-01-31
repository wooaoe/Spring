package com.test05;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class MyAspect {

	@Pointcut("execution(public * *(..))")
	public void myClass() { //pointcut으로 사용할 empty method 
		
	}
	
	@Before("myClass()")
	public void before(JoinPoint join) {
		System.out.println("출석카드 찍는다.");
	}

	@After("myClass()")
	public void after(JoinPoint join) {
		System.out.println("강의장을 나간다.");
	}

}
