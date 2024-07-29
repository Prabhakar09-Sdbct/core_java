package com.pm.corejava;

public class Palindrome{
	
	public static void main(String[] args){
		
        int num = 12321;
		
		int temp = 0;
		int r = 0;
		
		int temp2 = num;
		
		
		while (num > 0){
			r = num % 10;   // it will provide remainder i.e 8
			temp =temp * 10 + r;
			num = num / 10; // it will provide value i.e 456
			
		}
		
		if(temp == temp2){
		 System.out.println("This is Palindrome Number :"+temp);
		} else {
		System.out.println("This is not Palindrome Number :"+temp);
		}
	}

}