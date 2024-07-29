package com.pm.corejava.polymorphism;

public class Main {

	public static void main(String[] args) {
		
		Shape c = new Circle(5);
		System.out.println(c.area());
		
		Shape r = new Rectangle(5,6);
		
		System.out.println(r.area());
		
		Shape t = new Triangle(5,5);
		
		System.out.println(t.area());
		
		
		Shape[] s = new Shape[3];
		
		s[0] = new Circle(5);
		s[1] = new Rectangle(5,6);
		s[2] = new Triangle(5,5);
		
		for (int i = 0; i < s.length; i++) {
			System.out.println("area "+ s[i].area());
		}
		
	}
}
