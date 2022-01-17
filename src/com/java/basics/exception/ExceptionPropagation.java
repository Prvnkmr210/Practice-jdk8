package com.java.basics.exception;

import java.io.FileNotFoundException;

public class ExceptionPropagation {
	
	public static void main(String[] args) throws FileNotFoundException {// throws declaration is must
		
		ExPropagtion exp = new ExPropagtion();
		exp.readfile();
		
		exp.calculateSum();// No need to propagate unchecked Excpetion
	}

}

class ExPropagtion{
	void readfile() throws FileNotFoundException{
		System.out.println("ExPropagation");
	}
	
	void calculateSum() throws ArithmeticException {
		System.out.println("Unchecked Exception thrown");
	}
}
