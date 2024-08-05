package com.pm.corejava.collection.list;

public class StudentToString {

	private int id;
	private String name;
	private String address;
	
	public StudentToString() {
	}
	
	public StudentToString(int id, String name, String address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}

	@Override
	public String toString() {
		return "StudentToString [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

}
