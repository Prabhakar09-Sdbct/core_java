package com.pm.corejava.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReadAndWriteValidEmail {

	private static final String EMAIL_REGEX = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
	private static final Pattern EMAIL_PATTERN = Pattern.compile(EMAIL_REGEX);

	public static void main(String[] args) throws IOException {
		FileReader reader = new FileReader("D://EmailIds.txt");

		BufferedReader br = new BufferedReader(reader);
		
		String value;
		
		StringBuilder validEmails = new StringBuilder();

        while ((value = br.readLine()) != null) {
            String validEmail = findValidEmails(value);
            if (!validEmail.isEmpty()) {
                validEmails.append(validEmail).append("\n");
            }
        }
        br.close();

        FileWriter w = new FileWriter("D://ValidEmails.txt");
		w.write(validEmails.toString());
		w.close();
        System.out.println("Success !");
	}

	private static String findValidEmails(String line) {
		Matcher matcher = EMAIL_PATTERN.matcher(line);
		while (matcher.find()) {
			return matcher.group();
		}
		return "";
	}

}
