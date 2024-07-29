package com.pm.corejava;

import java.util.Random;

public class RandomNumber{

 public static void main(String[] args){
    
	 int num = 5;
	 
	 Random r = new Random();
	 
	 for(int i=0; i<num; i++){
	    int number = r.nextInt(100);
		
		System.out.println(" Random number is :"+ number);
	 }
 }

}