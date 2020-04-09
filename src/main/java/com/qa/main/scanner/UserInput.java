package com.qa.main.scanner;

import java.util.Scanner;

public class UserInput {

	private UserInput() {

	}

	public static String getInput() {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		return scanner.nextLine();
	}

}

/*
 * Notes
 * 
 * 
 */
