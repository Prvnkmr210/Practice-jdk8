package com.java.basics;

import java.util.Hashtable;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		Map<String, Integer> map = new Hashtable<>();
		String key1 = "abc";
		Integer value = 123;
		map.put(key1, value);
		map.putIfAbsent(key1, 456);
		
		System.out.println(map);
		
	}

}
