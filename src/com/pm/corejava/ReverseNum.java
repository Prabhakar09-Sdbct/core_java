package com.pm.corejava;

public class ReverseNum{
	
	public static void main(String[] args){
		
		int num = 4568;
		
		int temp = 0;
		int r = 0;
		
		while (num > 0){
			r = num % 10;   // it will provide remainde i.e 8
			temp = temp * 10 + r;
			num = num / 10; // it will provide value i.e 456
			
		}
		
		System.out.println("Reverse "+temp);
	}

}