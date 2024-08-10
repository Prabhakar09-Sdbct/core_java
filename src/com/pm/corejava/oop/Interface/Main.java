package com.pm.corejava.oop.Interface;

public class Main {

	public static void main(String[] args) {
		
		Richman rm = new BusinessMan();
		rm.donation();
		rm.earnMoney();
		rm.party();
		
		SocialWorker sw = new BusinessMan();
		sw.helpToOthers();
		
	}

}
