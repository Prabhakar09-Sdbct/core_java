package com.pm.corejava.collection.set;

import java.util.SortedSet;
import java.util.TreeSet;

public class TestTreeSet {

	public static void main(String[] args) {
		
		// not except null value 
		// arrange list in sorted manner
		// should be define type i.e generic
		// Remove duplicate value
		SortedSet<Integer> s = new TreeSet<Integer>();
		s.add(11);
		s.add(33);
		s.add(22);
		s.add(44);
		s.add(55);
		s.add(66);
		System.out.println(s);

	}

}
