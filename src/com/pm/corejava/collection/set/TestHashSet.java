package com.pm.corejava.collection.set;

import java.util.HashSet;
import java.util.Set;

public class TestHashSet {

	public static void main(String[] args) {

		// only except one null value
		// Remove duplicate value
		// Not Maintain insertion order
		Set s = new HashSet();
		s.add(11);
		s.add("JAVA");
		s.add("JAVA");
		s.add(14);
		s.add(null);
		s.add(null);
		System.out.println(s);
	}

}
