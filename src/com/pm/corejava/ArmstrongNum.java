package com.pm.corejava;

public class ArmstrongNum{
	
	public static void main(String[] args){
		
		int num = 153;
		
		int temp = 0;
		int r = 0;
		
		int temp2 = num;
		int temp3 = num;
		int count = 0;
		
		while(temp3 > 0) {
			temp3 = temp3 / 10;
			count ++;
		}
		
		while (num > 0){
			r = num % 10;   // it will provide remainder i.e 8
			temp = (int) (temp + Math.pow(r, count));
			num = num / 10; // it will provide value i.e 456
			
		}
		
		if(temp == temp2){
		 System.out.println("This is Armstrong Number :"+temp);
		} else {
		System.out.println("This is not Armstrong Number :"+temp);
		}
	}

}