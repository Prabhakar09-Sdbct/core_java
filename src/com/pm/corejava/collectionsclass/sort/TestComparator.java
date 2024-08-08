package com.pm.corejava.collectionsclass.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestComparator {

	public static void main(String[] args) {

		List<ComparatorExample> list = new ArrayList<ComparatorExample>();

		list.add(new ComparatorExample(1, "sun", 5));
		list.add(new ComparatorExample(3, "moon", 4));
		list.add(new ComparatorExample(2, "saturn", 3));
		list.add(new ComparatorExample(1, "jupitor", 2));

		System.out.println("======ComparatorById======");

		ComparatorById c = new ComparatorById();
		Collections.sort(list, c);

		list.forEach(System.out::println);

		System.out.println("=======ComparatorByName=====");

		ComparatorByName c1 = new ComparatorByName();
		Collections.sort(list, c1);

		list.forEach(System.out::println);

		System.out.println("=======ComparatorByRollNo=====");

		ComparatorByRollNo c2 = new ComparatorByRollNo();
		Collections.sort(list, c2);

		list.forEach(System.out::println);
		
		System.out.println("=======ComparatorByAll=====");

		ComparatorByAll c3 = new ComparatorByAll();
		Collections.sort(list, c3);

		list.forEach(System.out::println);

	}

}
