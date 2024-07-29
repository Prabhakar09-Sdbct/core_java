package com.pm.corejava.Interface;

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
