package com.pm.corejava.inheritanceByConstructor;

public class Main {

	public static void main(String[] args) {
		
		Circle c = new Circle(5);
		System.out.println(c.area());
		
		Rectangle r = new Rectangle(5,5);
		
		System.out.println(r.area());
		
		Triangle t = new Triangle(5,5);
		
		System.out.println(t.area());
	}
}
