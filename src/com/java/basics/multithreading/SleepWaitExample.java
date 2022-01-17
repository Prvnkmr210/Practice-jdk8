package com.java.basics.multithreading;

public class SleepWaitExample {
	
	private static Object LOCK = new Object();
	
	public static void main(String[] args) throws Exception {
		sleepWaitExamples();
	}

	private static void sleepWaitExamples() 
	  throws InterruptedException {
	 
	    //Thread.sleep(2000);
	    System.out.println(
	      "Thread '" + Thread.currentThread().getName() +
	      "' is woken after sleeping for 1 second");
	    
//	    LOCK.wait();// IllegalMonitorStateException
	    synchronized (LOCK) {
	        LOCK.wait(2000);// synchronized block ensure that the current thread has lock over the object present inside
	        System.out.println("Object '" + LOCK + "' is woken after" +
	          " waiting for 1 second");
	    }
	}

}
