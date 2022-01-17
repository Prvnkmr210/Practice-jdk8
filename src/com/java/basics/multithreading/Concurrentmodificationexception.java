package com.java.basics.multithreading;

import java.util.ArrayList;
import java.util.Iterator;

public class Concurrentmodificationexception { 
	
	

	public static void main(String[] args) {  
		
		Object LOCK = new Object();
		ArrayList<Integer> list = new ArrayList<>();  

		list.add(1);  
		list.add(2);  
		list.add(3);  
		list.add(4);  
		list.add(5);  

		Iterator<Integer> it = list.iterator();  
		while (it.hasNext()) { 
			Integer value = it.next(); 
			System.out.println(value);
			if (value.equals(3)) {
				list.remove(value);  // it.remove(); this will work without throwing concurrentmodificationexception
				// it modifies the mod and counter as well.
			}				
		}
		
		System.out.println(list);
	}  
}  
