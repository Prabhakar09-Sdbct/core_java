package com.pm.corejava.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorAndListIterator {

	public static void main(String[] args) {
		
		List li = new ArrayList();
		li.add(11);
		li.add(12);
		li.add(13);
		li.add(14);
		li.add(15);
		li.add(16);
		
		// Example of listIterator method
		
		ListIterator lt = li.listIterator();
		
		 while (lt.hasNext())
	          System.out.print(lt.next() + " ");
		
		while (lt.hasPrevious()) {
		// Object object = (Object) lt.previous();
			System.out.println("List with iterator is "+lt.previous());	
		}
	
		
		//Example of iterator method
		 
		Iterator it1 = li.iterator();
		
		while(it1.hasNext()) {
			Object ob = it1.next();
			System.out.print("ob "+ob);
		}

	}

}
