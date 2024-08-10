package com.pm.corejava.oop.constructorCalling;

public class Main extends ConstructorCalling{
	
	public Main(String name, String address, String phoneNo) {
		super(name, address, phoneNo);
	}

	public static void main(String[] args) {
	 
		new Main("Prabhakar", "Indore", "7400570639");
	
	}

}
