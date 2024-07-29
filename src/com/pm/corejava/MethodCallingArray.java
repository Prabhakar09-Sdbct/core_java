package com.pm.corejava;

public class MethodCallingArray {

	public static void main(String[] args) {

		int[] array = { 22, 33, 44, 99, 54, 66, 77, 88 };
		MethodCallingArray m = new MethodCallingArray();
		m.largetNumArray(array);

	}

	public void largetNumArray(int[] array) {

		int max = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}

		System.out.println(" max =" + max);
	}
}
