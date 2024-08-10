package com.pm.corejava.oop.cloning;

public class DeepCloningTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		 Student s1 = new Student("The Sun", new Address("Pune"));
		 
		 Student s2 = (Student) s1.clone();
		 
		 s2.name = "Prabhakar";
		 s2.city = new Address("Indore");
		 
         System.out.println("s1 is : "+s1);
         System.out.println("s2 is : "+s2);
		 
	}

}
