package com.pm.corejava.io;

import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

	public static void main(String[] args) throws IOException {
		
		FileReader reader = new FileReader("D://MyFile.txt");
		
		 int ch = reader.read();
		 
		 char chr;
		 
		 while(ch != -1) {
			 chr  = (char) ch;
			 System.out.print(chr);
			 ch = reader.read();
		 }
		 reader.close();
	}

}
