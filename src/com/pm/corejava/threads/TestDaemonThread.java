package com.pm.corejava.threads;

public class TestDaemonThread {

	public static void main(String[] args) {

		DaemonThread dt = new DaemonThread("Prabhakar");
		
		dt.setDaemon(true);
		dt.start();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		
		System.out.println("Leaving JVM");
	}

}
