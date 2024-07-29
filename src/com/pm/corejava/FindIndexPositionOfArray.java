package com.pm.corejava;

public class FindIndexPositionOfArray {

	public static void main(String[] args) {
		int[] array = {88,77,66,55,44,33,22,11};
		
		int value = 77;
		
		FindIndexPositionOfArray f = new FindIndexPositionOfArray();
		System.out.println("Position is :"+f.findPositionOfArray(array, value));
	}
	
	public int findPositionOfArray(int[] array, int value) {
		
		for(int i=0; i< array.length; i++) {
			if(array[i] == value) {
				return i;
			}
			
		}
		return 1;
	}
}
