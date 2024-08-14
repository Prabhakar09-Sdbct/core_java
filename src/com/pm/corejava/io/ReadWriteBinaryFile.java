package com.pm.corejava.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadWriteBinaryFile {

	public static void main(String[] args) throws IOException {

		String source = "D://elonMuskBaba.jpeg";
		
		String target = "D://elonMusk.jpeg";
		
		FileInputStream in =new FileInputStream(source);
		FileOutputStream out = new FileOutputStream(target);
		
		int ch = in.read();
		while(ch != -1) {
			out.write(ch);
			ch = in.read();
		}
		out.close();
		in.close();
	}

}
