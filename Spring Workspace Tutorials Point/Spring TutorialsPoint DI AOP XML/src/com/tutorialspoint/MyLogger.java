package com.tutorialspoint;

public class MyLogger {
	
	public void beforeAdvice() {
		System.out.println("Going to Add / setup profile");
	}
	public void afterAdvice() {
		System.out.println("Successfully Add / setup ed ! profile");
	}
	public void afterReturningAdvice(Object retVal) {
		System.out.println("Now returning"+retVal.toString());
	}
	public void afterThrowingAdvice(IllegalArgumentException ex) {
		System.out.println("Unsuccessful :("+ex);
	}
}
