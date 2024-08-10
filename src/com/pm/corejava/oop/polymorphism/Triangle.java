package com.pm.corejava.oop.polymorphism;

public class Triangle extends Shape{

	private int base;

	private int height;

	public int getBase() {
		return base;
	}
	
	public Triangle(int base, int height) {
		this.base = base;
		this.height = height;
	}

	public int getHeight() {
		return height;
	}

	@Override
	public double area() {
		double area = 0.5 * base * height;

		return area;
	}

}
