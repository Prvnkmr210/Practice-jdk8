package com.java.basics.collections;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LearnHashTable {

	public static void main(String[] args) {
		Hashtable<String, Integer> ht = new Hashtable<>();
		ht.put("key1", 10);
		ht.put("key2", 20);
		ht.put("key3", 30);
		ht.put("key4", 40);
		
		System.out.println(ht);
		
		ht.put("key1", 60);
		System.out.println(ht);
		
//		ht.put(null, null);// null pointer Exception
		// Enumeration Example
		// Enumeration comes from Dictionary class
		Enumeration<String> e = ht.keys();
		while(e.hasMoreElements()) {
			String key = e.nextElement();			
			System.out.println(key + "=" + ht.get(key));
			if(key.equals("key2"))// HAshTable are fail-safe
				ht.put("key5", 50);
		}
		
		// Iterator implementation example
		// Collection implements Iterator interface.
        // Set is backed by Map and Set implements Collection interface.
		Set<Entry<String, Integer>> entrySet = ht.entrySet();
		Iterator<Entry<String, Integer>> it = entrySet.iterator();
		while(it.hasNext())
			System.out.println(it.next());
	}

}
