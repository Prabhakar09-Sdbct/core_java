package com.pm.corejava.encapsulation;

public class Main {

	public static void main(String[] args) {

		Account a1 = new Account("510000091156", "saving", 123.501);

		System.out.println(a1.getnumber());
		System.out.println(a1.getType());
		System.out.println(a1.getBalance());

		System.out.println("withdraw= " + a1.withdraw(5.0));

		System.out.println("total balance after deposit = " + a1.deposit(15));

		System.out.println("total transfer = " + a1.fundTransfer(a1.getNumber(), 23.501));

	}

}
