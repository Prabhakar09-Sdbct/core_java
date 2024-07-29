package com.pm.corejava;

public class Fibonacci{
 
 public static void main(String[] args){
 
  int a = 0;
  int b = 1;
  int sum = 0;

  int num = 10;  
  
  System.out.print(a + " " + b );
  
  for(int i = 2; i< num; i++){
     
	  sum = a + b;
	  
	  System.out.print(" "+ sum);
	  
	  a = b;
	  b = sum;
  }
  
  
 
 }


}