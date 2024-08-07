package com.pm.corejava.equalsAndHashcode;

public class TestClass {

	public static void main(String[] args) {

		EqualsAndHashcode e1 = new EqualsAndHashcode(1, "prabhakar");
		EqualsAndHashcode e2 = new EqualsAndHashcode(1, "prabhakar");
		
		
		System.out.println(e1.equals(e2));
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
	}

}
