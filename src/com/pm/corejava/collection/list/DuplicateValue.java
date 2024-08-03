package com.pm.corejava.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DuplicateValue {

	public static void main(String[] args) {
		
		List l = new ArrayList();
		l.add(11);
		l.add(12);
		l.add(13);
		l.add(14);
		l.add(15);
		l.add(15);
		l.add(16);
		
		Iterator it = l.iterator();
		
		List<Object> l2 = new ArrayList();
		
		while (it.hasNext()) {
			Object object = (Object) it.next();
			if(!l2.contains(object)) {
				l2.add(object);
			}
		}
		
		System.out.println("l2 "+l2);
	}

}
