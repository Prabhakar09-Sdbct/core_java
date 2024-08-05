package com.pm.corejava.collection.set;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

public class ListDuplicateBySet {

	public static void main(String[] args) {

		List l = new ArrayList();
		l.add(11);
		l.add(12);
		l.add(13);
		l.add(14);
		l.add(15);
		l.add(15);
		l.add(16);
		
		LinkedHashSet s = new LinkedHashSet(l);
		
		System.out.println("List after remove duplicate is :"+s);

	}

}
