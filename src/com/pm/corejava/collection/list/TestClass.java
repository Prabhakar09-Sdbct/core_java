package com.pm.corejava.collection.list;

import java.util.ArrayList;
import java.util.List;

public class TestClass {

	public static void main(String[] args) {
		
		List<StudentToString> l = new ArrayList<StudentToString>();
		
		l.add(new StudentToString(1, "Prabhakar Mandloi", "Indore"));
		
		System.out.println(l);

	}

}
