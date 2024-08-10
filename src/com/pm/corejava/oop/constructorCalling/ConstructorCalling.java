package com.pm.corejava.oop.constructorCalling;

public class ConstructorCalling {
	
	String name;
	String address;
	String phoneNo;
	
	public ConstructorCalling() {
		System.out.println("This is default constructor");
	}

	public ConstructorCalling(String name, String address) {
		this();
		this.name = name;
		this.address = address;
		System.out.println("name ="+this.name);
		System.out.println("address ="+this.address);
	}
	
	public ConstructorCalling(String name, String address, String phoneNo) {
		this(name, address);
		this.phoneNo = phoneNo;
		System.out.println("phoneNo ="+this.phoneNo);
	}
	
}
