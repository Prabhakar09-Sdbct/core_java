package com.pm.corejava;

public class MethodCallingScndLargArray {

	public static void main(String[] args) {
		int[] array = { 12, 33, 22, 55, 34, 88, 56, 89 };

		MethodCallingScndLargArray m = new MethodCallingScndLargArray();
		m.secondLargest(array);
	}

	public void secondLargest(int[] array) {

		int max = array[0];

		for (int i = 1; i < array.length - 1; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}

		System.out.println("max = " + max);
	}
}
