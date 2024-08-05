package com.pm.corejava.collection.set;

import java.util.LinkedHashSet;

public class TestLinkedHashSet {

	public static void main(String[] args) {

		// only except one null value
		// Remove duplicate value
        // Maintain insertion order
		LinkedHashSet s = new LinkedHashSet();
		s.add(11);
		s.add("JAVA");
		s.add("JAVA");
		s.add(14);
		s.add(null);
		s.add(null);
		System.out.println(s);

	}

}
