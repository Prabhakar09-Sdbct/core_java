package com.pm.corejava.collection.streamapi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class TestContestant {

	public static void main(String[] args) {

		List<Contestant> list = new ArrayList<Contestant>();
		list.add(new Contestant("Kamal", "12345678900"));
		list.add(new Contestant("chaman", "2234567890"));
		list.add(new Contestant("aman", "2234567890"));
		list.add(new Contestant("naman", "4434567890"));
		list.add(new Contestant("baman", "5534567890"));
		list.add(new Contestant("Kamal", "6634567890"));
		list.add(new Contestant("Invalid Number", "1234"));

		// Get Phone Number
		list.stream().map(s -> s.phoneNo).forEach(System.out::println);

		System.out.println("======================================");

		// filter valid phone number
		list.stream().map(s -> s.phoneNo).filter(s -> s.length() == 10).forEach(System.out::println);

		System.out.println("======================================");

		// filter duplicate value
		list.stream().map(s -> s.phoneNo).filter(s -> s.length() == 10).distinct().forEach(System.out::println);

		System.out.println("======================================");

		// shuffle phone number
		list.stream().map(s -> s.phoneNo).filter(s -> s.length() == 10).distinct()
				.collect(Collectors.collectingAndThen(Collectors.toList(), e -> {
					Collections.shuffle(e);
					return e.stream();
				})).forEach(System.out::println);

		System.out.println("======================================");
		
		// get 3 winners
		list.stream().map(s -> s.phoneNo).filter(s -> s.length() == 10).distinct()
				.collect(Collectors.collectingAndThen(Collectors.toList(), e -> {
					Collections.shuffle(e);
					return e.stream();
				})).limit(3).forEach(System.out::println);
	}

}
