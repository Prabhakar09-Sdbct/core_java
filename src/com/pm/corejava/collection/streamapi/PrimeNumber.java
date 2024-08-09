package com.pm.corejava.collection.streamapi;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumber {

	public static void main(String[] args) {


		List<Integer> li = new ArrayList<Integer>();
		li.add(11);
		li.add(12);
		li.add(13);
		li.add(14);
		li.add(15);
		li.add(16);
		
		li.stream().filter(e -> primeNumber(e)).forEach(e -> System.out.println("Prime number is :" +e));
		
	}
	
	public static boolean primeNumber(int num) {
		  for(int i=2; i<num; i++){
				if(num % i == 0){
					return false;
		    	} 
			}
		  return true;
    }

}
