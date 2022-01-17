package com.java.basics.exception;

public class UncheckedExceptionExample {

	public static void main(String args[])  
	{  
		int positive = 35;  
		int zero = 0;  
		int result = positive/zero;  
		//Give Unchecked Exception here.   
		System.out.println(result);  
	}  

}
