package com.java.basics.string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class StringExample {
	
	public static void main(String[] args) {
		String a1 = "abc";
		
		String objString = new String();
		objString.concat("obj");
		System.out.println("Object String: " + objString);
		objString = objString.concat("obj");
		System.out.println("Object String After concat: " + objString);
		
		StringBuffer strbuffer = new StringBuffer();
		strbuffer.append("abc");
		System.out.println("String Buffer: " +  strbuffer);
		
		StringBuilder strbuilder = new StringBuilder();
		strbuilder.append("builder");
		System.out.println("String Builder: " + strbuilder);
		
		Map<Character, Integer> test = new HashMap<>();
		List<String> list = new LinkedList<>();
		
	}

}
