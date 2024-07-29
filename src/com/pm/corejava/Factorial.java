package com.pm.corejava;

public class Factorial{

 public static void main(String[] args){
	 int num = 6;
	 
	 int sum = 1;
	 
	 for(int i=num; i>= 1; i--){
	
		 sum = sum * i;
		 		 
	 }
	 System.out.println("sum "+sum);
 }
}