package com.pm.corejava.io;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

	public static void main(String[] args) throws IOException {
		
		FileWriter w = new FileWriter("D:\\text.txt");
		
		char[] cArray = {'H', 'i'};
		
		w.write(cArray);
		w.write(',');
		w.write("Prabhakar");
		
		System.out.println("Success !");
		w.close();

	}

}
