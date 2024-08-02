package com.pm.corejava.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MiddleValueOfArrayList {

	public static void main(String[] args) {
		
		List c = new ArrayList();
		c.add(11);
		c.add(12);
		c.add(13);
		c.add(14);
		c.add(15);
		
		
		
		int mid = c.size()/2;
		System.out.println("Middle value of arrayList is :"+c.get(mid));
		
	}
}
