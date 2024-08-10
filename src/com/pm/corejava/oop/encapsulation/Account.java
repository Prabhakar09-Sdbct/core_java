package com.pm.corejava.oop.encapsulation;

public class Account {

	private String number;
	private String type;
	private double balance;

	public void setnumber(String number) {
		this.number = number;
	}

	public String getnumber() {
		return this.number;

	}

	public String getNumber() {
		return number;
	}

	public Account(String number, String type, double balance) {
		this.number = number;
		this.type = type;
		this.balance = balance;

	}

	public String getType() {
		return type;
	}

	public double getBalance() {
		return balance;
	}

	public double deposit(double amount) {
		return this.balance = balance + amount;
	}

	public double withdraw(double amount) {
		if (amount > this.balance) {
			System.out.println("insufficient balance");
		} else {
			return this.balance = balance - amount;
		}
		return this.balance;
	}
	
	public double fundTransfer(String number, double amount) {
		
		if (amount > this.balance) {
			System.out.println("insufficient balance");
		} else {
			return this.balance = balance - amount;
		}
		return this.balance;
	}

}
