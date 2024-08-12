package com.pm.corejava.io;

import java.io.File;
import java.util.Date;

public class FileMethods {

	public static void main(String[] args) {

		File file = new File("D:\\MyFile.txt");

		if (file.exists()) {
			System.out.println("file is available");
			// get File name 
			System.out.println("file name is "+file.getName());
			// file Path
			System.out.println("file path is :"+ file.getAbsolutePath());
			// can read or write
			System.out.println("can read or write file " + file.canRead() + " "+ file.canWrite());
			// check it is file or directory
			System.out.println("file or directory " + file.isFile() + " " +file.isDirectory());
			// check last modified date
			System.out.println(" date id "+ new Date(file.lastModified()));
			// check length
			System.out.println("length of file is "+file.length());
			
		} else {
			System.out.println("File is not available");
		}
	}

}
