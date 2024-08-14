package com.pm.corejava.java8features;

public class TestInterfaceByLambda {

	public static void main(String[] args) {

		FuntionalInterfaceExpl  f = (a, b)  -> {
			return a+b;
		};

		int sum = f.sum(5, 15);
		System.out.println("sum is :"+sum);
		
		FuntionalInterfaceExpl.test1();
		
		f.test2();
	}

}
