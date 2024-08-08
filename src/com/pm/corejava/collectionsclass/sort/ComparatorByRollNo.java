package com.pm.corejava.collectionsclass.sort;

import java.util.Comparator;

public class ComparatorByRollNo implements Comparator<ComparatorExample>{

	@Override
	public int compare(ComparatorExample o1, ComparatorExample o2) {
		
		return o1.getRollNo() - o2.getRollNo();
	}

	

}
