package com.pm.corejava.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class FileScanner {

	public static void main(String[] args) throws FileNotFoundException {


		FileReader r = new FileReader("D://MyFile.txt");
		
		Scanner sc = new Scanner(r);
		
		while(sc.hasNext()) {
			String line = sc.nextLine();
			System.out.println(line);
		}

	}

}
