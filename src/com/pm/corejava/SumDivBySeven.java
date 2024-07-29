package com.pm.corejava;

public class SumDivBySeven{

 public static void main(String[] args){
    
	 int num = 200;
	 int sum = 0;
	 
	 for(int i=100; i<num; i++){
		 
		 if(i % 7 == 0){
			 sum = sum + i;
		 }
		
	 }
	 
	 System.out.println(" Sum divisible by seven is :"+ sum);
 }

}