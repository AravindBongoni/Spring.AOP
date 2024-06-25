package com.AOP;

public class Voter {
	public void validation() {
		System.out.println("This is Aravind");
		
	}
	public void  validation(int age) throws Exception{
		if(age<18) {
			throw new Exception("invalid age");
		}
		else {
			System.out.println("Vote Conform");
		}
		
	}
}
