package com.java.basics.exception;

import java.util.Date;

public class ChkdInstantiationException {
	
	public static void main(String[] args) {

	      try {
	         // date object
	         Date d = new Date();
	         Class cls = d.getClass();
	         System.out.println("Time = " + d.toString());

	         /* creates a new instance of the class represented by this 
	            Class object cls */
	         Object obj = cls.newInstance();
	         System.out.println("Time = " + obj);
	      } catch(InstantiationException e) {
	         System.out.println(e.toString());
	      } catch(IllegalAccessException e) {
	         System.out.println(e.toString());
	      }
	   }

}
