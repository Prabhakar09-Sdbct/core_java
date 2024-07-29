package com.pm.corejava;

public class AverageOfOddNum {

	public static void main(String[] args) {

		int n = 10;

		int oddCount = 0, evenCount = 0;
	    int oddNum = 0, evenNum = 0;

		while (n > 0) {
			
			if (n % 2 == 0) {
				evenCount++;
				evenNum = evenNum + n;
			} else {
				oddCount++;
				oddNum = oddNum + n;
			}
			n--;
		}
		System.out.println("Average of odd number:"+oddNum/oddCount);
		
		System.out.println("Average of even number"+evenNum/evenCount);
	}
}
