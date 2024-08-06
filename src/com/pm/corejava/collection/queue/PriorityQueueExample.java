package com.pm.corejava.collection.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {

	public static void main(String[] args) {

		// it follows priority of the element
		// type sensitive define type
		// can not take null value
		// can take duplicate value
		PriorityQueue qe = new PriorityQueue();

		qe.offer(11);
		qe.offer(33);
		qe.offer(44);
		qe.offer(22);
		qe.offer(22);

		System.out.println(qe);

		// it will only print first inserted value
	    System.out.println("after peek is "+ qe.peek());
		
        // it will remove and print first inserted value
		while (!qe.isEmpty()) {

			System.out.println("after poll is " +qe.poll());
		}

		// queue becomes empty after poll
		System.out.println(" after "+qe);

	}

}
