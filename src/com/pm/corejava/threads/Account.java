package com.pm.corejava.threads;

public class Account {

	public int balance;

	public int getBalance() {
		return balance;
	}

	public Account() {
		// TODO Auto-generated constructor stub
	}

	public synchronized void deposit(String name, int amount) {

		this.balance = getBalance() + amount;
		

		System.out.println(name +" " + "amount :" + this.balance);
	}

}
