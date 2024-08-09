package com.pm.corejava.collection.streamapi;

import java.util.ArrayList;
import java.util.List;

public class OddEvenNumber {

	public static void main(String[] args) {
 
		List<Integer> li = new ArrayList<Integer>();
		li.add(11);
		li.add(12);
		li.add(13);
		li.add(14);
		li.add(15);
		li.add(16);
		
		li.stream().filter(e -> e % 2 == 0).forEach(e -> System.out.println("Even number is :" +e));
		
		System.out.println("=======================");
		
		li.stream().filter(e -> e % 2 != 0).forEach(e -> System.out.println("Odd number is :" +e));
		
		 

	}

}
