package com.pm.corejava.exception;

public class Bank {

	public static void main(String[] args) {
		Bank b = new Bank(10000, 11000);
		try {
			b.withdraw();
		} catch (BankException e) {
			System.out.println(e);
		}
	}

	public double balance;
	public double amount;

	public Bank(double balance, double amount) {
		this.balance = balance;
		this.amount = amount;
	}

	public double withdraw() throws BankException{
		if (this.amount > this.balance) {
			throw new BankException("Insufficient balance");
		} else {
			return this.balance = balance - amount;
		}
	}

}
