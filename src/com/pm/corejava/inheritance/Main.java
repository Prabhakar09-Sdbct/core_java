package com.pm.corejava.inheritance;

public class Main {

	public static void main(String[] args) {
		
		Circle c = new Circle();
		c.setR(5);
		System.out.println(c.area());
		
		Rectangle r = new Rectangle();
		r.setLength(5);
		r.setWidth(5);
		
		System.out.println(r.area());
		
		Triangle t = new Triangle();
		t.setBase(5);
		t.setHeight(5);
		
		System.out.println(t.area());
	}
}
