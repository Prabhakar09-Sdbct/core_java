package com.pm.corejava.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DuplicateByLoop {
	
	public static void main(String[] args) {
		
		List l = new ArrayList();
		l.add(11);
		l.add(12);
		l.add(13);
		l.add(14);
		l.add(15);
		l.add(15);
		l.add(16);
		
		System.out.println("list before duplicate :"+l);
		
		for (int i = 0; i < l.size(); i++) {
			for (int j = i+1; j < l.size(); j++) {
				if(l.get(i) == l.get(j)) {
					l.remove(j);
				}
			}
		}
		
		Iterator it = l.iterator();
		
		while (it.hasNext()) {
			Object object = (Object) it.next();
		}
		
		System.out.println("list after  duplicate :"+l);
	}

}
