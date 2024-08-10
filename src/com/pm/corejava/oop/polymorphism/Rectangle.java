package com.pm.corejava.oop.polymorphism;

public class Rectangle extends Shape{

	private int length;
	
	private int width;

	public int getLength() {
		return length;
	}

	public int getWidth() {
		return width;
	}
	
	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}
	
	@Override
	public double area() {
		
		double area = length * width;
		return  area;
	}
}
