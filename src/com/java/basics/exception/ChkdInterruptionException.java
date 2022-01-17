package com.java.basics.exception;

public class ChkdInterruptionException extends Thread{
	
	public void run() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String args[]){  
		ChkdInterruptionException t1=new ChkdInterruptionException();  
		t1.start();  
		try{  
		t1.interrupt();  
		}catch(Exception e){System.out.println("Exception handled "+e);} 
	}
}
