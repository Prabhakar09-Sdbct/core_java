package com.pm.corejava.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExpl {

	public static void main(String[] args) throws IOException {
		
		FileReader r = new FileReader("D://MyFile.txt");

		BufferedReader br =new BufferedReader(r);
		
		String ch = br.readLine();
		
		while(ch != null) {
			 System.out.print(ch);
			 ch = br.readLine(); 
		}
		
	}

}
