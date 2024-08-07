package com.pm.corejava.sort;

public class ComparableExample implements Comparable<ComparableExample> {

	private int id;
	private String name;
	
	public ComparableExample() {
	}

	public ComparableExample(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	@Override
	public int compareTo(ComparableExample o) {
		return this.id - o.id;
	}

	@Override
	public String toString() {
		return "[id=" + id + ", name=" + name + "]";
	}

}
