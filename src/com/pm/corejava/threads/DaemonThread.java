package com.pm.corejava.threads;

public class DaemonThread extends Thread {

	public String name;

	public DaemonThread(String name) {
		super();
		this.name = name;
	}
	
	@Override
	public void run() {
		
		while (true) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Thread is executing");
		}
		
	}

}
