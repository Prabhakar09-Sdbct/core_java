package com.pm.corejava.collection.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class MyList {

	public static void main(String[] args) {

		// add method of list
		List c = new ArrayList();
		c.add(12);
		c.add(13);
		c.add(15);
		c.add(16);

		c.add(2, 14);
		System.out.println("list is " + c);

		// get method
		System.out.println("value at index 0 is :" + c.get(0));

		// remove method
		c.remove(1);
		System.out.println("list after remove method " + c);

		// set method
		c.set(0, 13);
		System.out.println("list after set method " + c);

		// subList method
		c.subList(0, 2);
		System.out.println("list after subList method " + c.subList(0, 2));

		// indexof method
		c.indexOf(13);
		System.out.println("list after indexOf method " + c.indexOf(13));

		// indexof method
		c.lastIndexOf(14);
		System.out.println("list after indexOf method " + c.lastIndexOf(14));

	}

}
