package com.pm.corejava.java8features;


@FunctionalInterface
public interface FuntionalInterfaceExpl {

	public int sum(int a, int b);
	
	public static void test1(){
		System.out.println("This is static method");
	}
	
	public default void test2(){
		System.out.println("This is default method");
	}
}
