package com.pm.corejava;

public class MissingElementOfTwoArray {

	public static void main(String[] args) {

		int[] a = { 11, 22, 33, 44, 55, 66, 77, 88};
		int[] b = { 22, 33, 44, 55, 11, 66, 77 };

		MissingElementOfTwoArray m = new MissingElementOfTwoArray();
		m.missingOfTwoArray(a, b);
	}

	public void missingOfTwoArray(int[] a, int[] b) {
	
        for(int i = 0; i< a.length; i++){
        	boolean found = false;
        	for(int j = 0; j< b.length; j++) {
        		 if(a[i] == b[j]) {
        			 found = true;
        			 break;
        		 }
        	}
        	
        	if(!found) {
        		System.out.println(" missing number is"+ a[i]);
        	}
        }
	}
}
