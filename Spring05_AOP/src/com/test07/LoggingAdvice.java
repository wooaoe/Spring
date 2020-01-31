package com.test07;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.util.StopWatch;

public class LoggingAdvice implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {

		String methodName = invocation.getMethod().getName();
		StopWatch sw = new StopWatch(); //스프링에서 제공하는 클래스 
		sw.start(methodName);
		
		System.out.println("[LOG]METHOD: " + methodName + " is Calling");
		
		Object obj = invocation.proceed();
		sw.stop();
		System.out.println("[LOG]METHOD: " + methodName + " is Called");
		System.out.println("[LOG]처리 시간 : " + sw.getTotalTimeMillis()/1000 + "초");
		
		return obj;
	}
	
}
