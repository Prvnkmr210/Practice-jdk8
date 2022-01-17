package com.java.basics.multithreading;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentmodificationexceptionHashMap {
	 public static void main(String[] args) {  
         
//	        Map<Integer, Integer> map = new HashMap<>();  
	        Map<Integer, Integer> map = new ConcurrentHashMap<>();  // No concurrent Modification error
	        map.put(1, 1);  
	        map.put(2, 2);  
	        map.put(3,3);  
	          
	        Iterator<Integer> it = map.keySet().iterator();  
	        while(it.hasNext()) {  
	            Integer key = it.next();  
	            System.out.println("Map Value:" + map.get(key));  
	            if (key.equals(2)) {  
//	                map.put(1, 4);
	                map.put(4, 4);
	            }  
	        }    
	        
//	        Map<Integer, Integer> concurrentMap = Collections.synchronizedMap(map); // concurrent modification error, 
	        // even though thread-safe but not safe from concurrent modifications
//	        Iterator<Integer> it2 = concurrentMap.keySet().iterator();  
//	        while(it2.hasNext()) {  
//	            Integer key = it2.next();  
//	            System.out.println("Map Value:" + concurrentMap.get(key));  
//	            if (key.equals(2)) {  
//	            	concurrentMap.put(4, 4);
//	            }  
//	        }  
	    }  
}
