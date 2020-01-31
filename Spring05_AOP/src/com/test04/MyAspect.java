package com.test04;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

public class MyAspect {
	
	public void before(JoinPoint join) {
		System.out.println("출석카드 찍는다.");
	}
	
	public void after(JoinPoint join) {
		System.out.println("강의장을 나간다.");
	}
	
	
}
