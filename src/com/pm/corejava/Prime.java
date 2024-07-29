package com.pm.corejava;

public class Prime{
	
	public static void main(String[] args){
		
		int num = 7;
		boolean check = true;
		for(int i=2; i<num; i++){
			if(num % i == 0){
				check = false;
			 
	    	} 
		}
		
		if(check){
			 System.out.println("This is Prime number"+num);
		} else {
			System.out.println("This is not Prime number"+num);
		}
		
		
	}

}