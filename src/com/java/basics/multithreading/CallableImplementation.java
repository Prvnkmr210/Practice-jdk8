package com.java.basics.multithreading;

import java.util.Random;
import java.util.concurrent.Callable;

public class CallableImplementation implements Callable<Object>{

	@Override
	public Object call() throws Exception  
	{  
		// Creating an object of the  Random class   
		Random randObj = new Random();  

		// generating a random number between 0 to 9  
		Integer randNo = randObj.nextInt(10);  

		// the thread is delayed for some random time  
		Thread.sleep(randNo * 1000);  

		return randNo;  
	}  



}
