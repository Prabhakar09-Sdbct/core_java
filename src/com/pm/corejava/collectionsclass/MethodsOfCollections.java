package com.pm.corejava.collectionsclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MethodsOfCollections {

	public static void main(String[] args) throws Exception {

		// copy method
		List<String> l1 = new ArrayList<String>();
		List<String> l2 = new ArrayList<String>();

		l1.add("11");
		l1.add("12");
		l1.add("13");

		l2.add("22");
		l2.add("33");
		l2.add("44");

		Collections.copy(l1, l2);

		System.out.print(" l1 is : " + l1);
		System.out.println();
		System.out.print(" l2 is : " + l2);
		System.out.println();
		// binarysearch method
		int num = Collections.binarySearch(l2, "33");
		System.out.println("index after search is :" + num);

	}

}
