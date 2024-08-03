package com.pm.corejava.collection.list;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class FailFastAndFailFast {

	public static void main(String[] args) {

		// Fail-Fast example
		List li = new ArrayList();
		li.add(11);
		li.add(12);
		li.add(13);
		li.add(14);
		li.add(15);
		li.add(16);

		Iterator it1 = li.iterator();

		//uncomment following code for test
		//li.add(17);

		while (it1.hasNext()) {
			Object ob = it1.next();
			System.out.println(ob + " ");
		}

		// Fail-Safe example
		
		Vector li2 = new Vector();
		li2.addElement(11);
		li2.addElement(12);
		li2.addElement(13);
		li2.addElement(14);
		li2.addElement(15);
		li2.addElement(16);

		Enumeration en = li2.elements();

		li2.addElement(17);
		while(en.hasMoreElements()) {
		     Object ob	= en.nextElement();
		     System.out.println("Enumeration ob "+ob);
		}
		
	}

}
