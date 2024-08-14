package com.pm.corejava.java8features;

public class TestInterfaceByAnonymous {

	public static void main(String[] args) {

		FuntionalInterfaceExpl f = new FuntionalInterfaceExpl() {

			@Override
			public int sum(int a, int b) {
				return a + b;
			}
		};
		int sum = f.sum(5, 10);
		System.out.println(" sum is :" + sum);
		
		FuntionalInterfaceExpl.test1();
		
		f.test2();
	}

}
