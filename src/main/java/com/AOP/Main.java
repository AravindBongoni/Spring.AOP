package com.AOP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext c = new ClassPathXmlApplicationContext("Aop.xml");
		Voter v = (Voter)c.getBean("proxy");
		v.validation();
		try {
			v.validation(18);
		} catch (Exception e) {
			
			e.printStackTrace();
		}

	}

}
