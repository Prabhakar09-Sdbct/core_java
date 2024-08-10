package com.pm.corejava.oop.inheritanceByConstructor;

public class Triangle extends Shape{

	private int base;

	private int height;

	public int getBase() {
		return base;
	}
	
	public int getHeight() {
		return height;
	}
	
	public Triangle(int base, int height) {
		// TODO Auto-generated constructor stub
		this.base = base;
		this.height = height;
	}

	public double area() {
		double area = 0.5 * base * height;

		return area;
	}

}
