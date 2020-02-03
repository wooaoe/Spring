package com.test02;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MyAspect implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {

		Object returnVal = null;
		System.out.println("출석카드 찍는다.");
		
		try {
			returnVal = invocation.proceed();
			//가로챈걸 proceed()에서 실체 클래스 실행 
		}catch(Exception e) {
			System.out.println("쉬는 날이다.");
		}finally {
			System.out.println("강의장을 나간다.");
		}
		
		return returnVal;
	}
	
}
