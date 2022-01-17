package com.java.basics.exception;

public class UserDefinedException {
	
	public static void main(String[] args) {
		try {
			int z = 5;
			throw new CustomException("Exception from", "main method");
			
		} catch(CustomException cs) {
			System.out.println(cs.getMessage());
		}
	}

}

class CustomException extends Exception{
	
	String message;
	String methodName;
	
	public CustomException(String message, String methodName) {
		this.message = message;
		this.methodName = methodName;
	}
	
	public String getMessage() {
		return message + methodName;
	}
	
}
