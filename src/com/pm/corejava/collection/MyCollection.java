package com.pm.corejava.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class MyCollection {

	public static void main(String[] args) {
		
		//All collection methods

		// add method
		Collection c = new ArrayList();
		c.add(1);
		c.add("Vijay dinanath chouhan");
		System.out.println("list is :" + c);

		// addAll method
		Collection c1 = new ArrayList();
		c1.add(1);
		c1.add("Prabhakar Mandloi");
		c1.add(2);

		c.addAll(c1);
		System.out.println("list after addAll " + c);

		// contains method
		Collection c2 = new ArrayList();
		c2.add(1);
		c2.add("Vijay dinanath chouhan");
		
		System.out.println("list after contains " + c2.contains(1));

		// containsAll method
		Collection c3 = new ArrayList();
		c3.add(1);
		c3.add(2);
		c3.add("Vijay dinanath chouhan");

		Collection c4 = new ArrayList();
		c4.add(1);
		c4.add(2);
		System.out.println("list after conatinsAll " + c3.containsAll(c4));

		// clear method
		c.clear();
		System.out.println("list after clear " + c);
		
		// isEmpty method
		System.out.println("isEmpty "+c.isEmpty());
		
		// Iterator method
		Iterator it = c3.iterator();
		while(it.hasNext()) {
			Object ob = it.next();
			System.out.println("elements of list is "+ob);
		}

		// remove method 
		c3.remove(1);
		System.out.println("list after remove " + c3);
		
		//removeAll method
		c3.removeAll(c4);
		System.out.println("list after removeAll "+ c3);
		
		//retainAll method
		Collection c5 = new ArrayList();
		c5.add(1);
		c5.add(2);
		c5.add("Vijay dinanath chouhan");

		Collection c6 = new ArrayList();
		c6.add(1);
		c6.add(2);
		c5.retainAll(c6);
		System.out.println("list after retainAll" +c5);
		
		//size method
		System.out.println("size is : "+c5.size());
		
	}

}
