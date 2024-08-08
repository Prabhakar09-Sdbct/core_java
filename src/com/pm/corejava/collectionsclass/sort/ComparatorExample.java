package com.pm.corejava.collectionsclass.sort;

public class ComparatorExample {

	private int id;
	private String name;
	private int rollNo;
	
	public ComparatorExample() {
		// TODO Auto-generated constructor stub
	}
	
	public ComparatorExample(int id, String name, int rollNo) {
		this.id = id;
		this.name = name;
		this.rollNo = rollNo;
	}
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getRollNo() {
		return rollNo;
	}

	@Override
	public String toString() {
		return "ComparatorExample [id=" + id + ", name=" + name + ", rollNo=" + rollNo + "]";
	}
}
