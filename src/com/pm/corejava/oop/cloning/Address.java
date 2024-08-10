package com.pm.corejava.oop.cloning;

public class Address implements Cloneable {
	
	private String address;
	
	
	public Address( String address) {
		super();
		this.address = address;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}


	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}
	
	

}
