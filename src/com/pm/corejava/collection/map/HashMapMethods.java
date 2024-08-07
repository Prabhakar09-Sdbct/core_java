package com.pm.corejava.collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapMethods {

	public static void main(String[] args) {

		Map map = new HashMap();
		map.put(1, "p1");
		map.put(2, "p2");
		map.put(3, "p3");
		map.put(4, "p4");

		// containsKey method checks key
		System.out.println(map.containsKey(1));

		// containsKey method checks value
		System.out.println(map.containsValue("p1"));

		// get method return value by key
		System.out.println(map.get(1));

		// keySet method return set of keys in array
		System.out.println(map.keySet());

		// size method returns the size of map
		System.out.println(map.size());

		// values method returns all the values in array
		System.out.println(map.values());
		
		// remove method removes value by key
		map.remove(1);

		// creates set of key value pair
		Set s = map.entrySet();

		Iterator it = s.iterator();

		while (it.hasNext()) {
			Map.Entry entry = (Map.Entry) it.next();
			System.out.println("Key is :" + entry.getKey() + " value is :" + entry.getValue());

		}

		// clear method makes map empty
		map.clear();

		map.isEmpty();

		// isEmpty method returns boolean
		System.out.println(map.isEmpty());
	}

}
