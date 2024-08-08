package com.pm.corejava.collectionsclass.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestComparable {

	public static void main(String[] args) {
		
		List<ComparableExample> list = new ArrayList<ComparableExample>();
		
		list.add(new ComparableExample(4, "Sun"));
		list.add(new ComparableExample(3, "moon"));
		list.add(new ComparableExample(2, "saturn"));
		list.add(new ComparableExample(1, "jupitor"));

		Collections.sort(list);
		
		list.forEach(System.out :: println);
	}

}
