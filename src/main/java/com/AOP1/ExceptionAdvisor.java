package com.AOP1;

import org.springframework.aop.ThrowsAdvice;

public class ExceptionAdvisor implements ThrowsAdvice {
		public void afterThrowing(Exception ex) {
			System.out.println("Exception Raise");
		}

}
