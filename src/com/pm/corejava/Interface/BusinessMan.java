package com.pm.corejava.Interface;

public class BusinessMan implements Richman, SocialWorker{

	@Override
	public void helpToOthers() {
		System.out.println("Helping the needy people");
		
	}

	@Override
	public void earnMoney() {
		System.out.println("Earnig Money");
		
	}

	@Override
	public void donation() {
		System.out.println("Donating the money and things !");
		
	}

	@Override
	public void party() {
		System.out.println("Party Time !");
		
	}
	
	
}
