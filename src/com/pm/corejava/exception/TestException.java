package com.pm.corejava.exception;

public class TestException {

	public static void main(String[] args) {

		int i = 15;
		int j = 0;

		// Arithmetic Exception
		try {
			System.out.println(" " + i / j);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}

		String str = null;
	
		// Null Pointer Exception
		try {
			System.out.println(str.length());
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		}

		String[] array = {"22","33","44","55","66"};
		
		// Index out of bound exception
		try {
			System.out.println(array[5]);
		} catch (IndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		
	}
}
