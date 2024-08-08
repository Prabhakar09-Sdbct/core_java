package com.pm.corejava.collectionsclass.sort;

import java.util.Comparator;

public class ComparatorByAll implements Comparator<ComparatorExample>{

	@Override
	public int compare(ComparatorExample o1, ComparatorExample o2) {
		
		if(o1.getId() == o2.getId()) {
			return o1.getName().compareTo(o2.getName());
		} if (o1.getName() == o2.getName()) {
			return o1.getRollNo() - (o2.getRollNo());
		} else {
			return o1.getId() - o2.getId();
		}
		
	}
	
}
