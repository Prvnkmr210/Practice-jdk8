package com.java.basics.exception;

public class FinalizeExample {
	
	void display() {
		System.out.println("Method from FinalizeExample class");
	}
	
	public static void main(String[] args) {
		FinalizeExample fz = new FinalizeExample();
		fz.display();
		
		fz=null;
		
		System.gc();
		
//		System.out.println("End of garbage collection");
	}
	
	@Override
	protected void finalize() {
		System.out.println("Finalize method called");
	}

}
