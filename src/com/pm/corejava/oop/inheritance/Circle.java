package com.pm.corejava.oop.inheritance;

public class Circle extends Shape{

	private int r;

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	public double area() {
		double area = (r * r * 3.14);
		return area;
	}
}
