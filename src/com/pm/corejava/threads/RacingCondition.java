package com.pm.corejava.threads;

public class RacingCondition extends Thread{
	
	
	public static Account a = new Account();
	
	public String name;
	
	public RacingCondition(String name) {
		super();
		this.name = name;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			a.deposit(this.name, 1000);
		}
	}
	
	public static void main(String[] args) {
		
		RacingCondition r1 = new RacingCondition("Prabhakar");
		
		RacingCondition r2 = new RacingCondition("Bansal");
		r1.start();
		r2.start();
		
		
	}

	

}
