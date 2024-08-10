package com.pm.corejava.oop.inheritanceByConstructor;

public class Circle extends Shape{

	private int r;

	public int getR() {
		return r;
	}
	
	public Circle(int r) {
		this.r = r;
	}

	public double area() {
		double area = (r * r * 3.14);
		return area;
	}
}
