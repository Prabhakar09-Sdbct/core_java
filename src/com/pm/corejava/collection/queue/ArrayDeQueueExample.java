package com.pm.corejava.collection.queue;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class ArrayDeQueueExample {

	public static void main(String[] args) {

		// it follows insertion order i.e FIFO
		// can not take null value
		// can take duplicate value
		// it is not type sensitive
		ArrayDeque qe = new ArrayDeque();

		qe.offer(3);
		qe.offer(2);
		qe.offer(1);
		qe.offer(4);
		qe.offer("ayu");

		System.out.println(qe);

		// it will only print first inserted value
		System.out.println("after peek is " + qe.peek());

		// it will remove and print first inserted value
		while (!qe.isEmpty()) {

			System.out.println("after poll is " + qe.poll());
		}

		// queue becomes empty after poll
		System.out.println(" after " + qe);

	}

}
