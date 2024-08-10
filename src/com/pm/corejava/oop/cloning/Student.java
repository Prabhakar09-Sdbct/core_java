package com.pm.corejava.oop.cloning;

public class Student implements Cloneable{
	
	public String name;
	public Address city;
	
	public Student(String name, Address address2) {
		super();
		this.name = name;
		this.city = address2;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", address=" + city + "]";
	}
	
	

}
