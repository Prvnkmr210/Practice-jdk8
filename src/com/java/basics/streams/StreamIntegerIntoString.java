package com.java.basics.streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamIntegerIntoString {
	
	public static void main(String[] args) {
		int[] intArray = new int[] {5,10,25,8,36,58,16};
		System.out.println();
		Arrays.stream(intArray).sorted().toArray();
		
		
		
		List<Integer> intList = new LinkedList<>();
		Collections.addAll(intList, 5,10,25,8,36,58,16);
		
		System.out.println(intList.stream()
				.sorted()
				.map(num -> String.valueOf(num))
				.collect(Collectors.joining(",")));
	}

}
