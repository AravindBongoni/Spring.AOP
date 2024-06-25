package com.AOP1;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class BothAdvice implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		System.out.println("Before Method");
		invocation.proceed();
		System.out.println("After Method");
		return null;
	}

}
