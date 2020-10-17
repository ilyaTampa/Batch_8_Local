package com.syntax.class06;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		/*
		 * lets ask a tester on which browser they would like to use
		 * 
		 */
		Scanner userIn;
		String browser;
		String message;

		userIn = new Scanner(System.in);
		System.out.println("Please enter a browser");
		browser = userIn.nextLine();

		switch (browser.toLowerCase()) {
		case "safari":
			message = "Your code will be executed on Safari browser";
			break;
		case "chrome":
			message = "Your code will be executed on Chrome browser";
			break;
		case "firefox":
			message = "Your code will be executed on FireFox browser";
			break;
		default:
			message = "Entered browser is not supported!";

		}
		System.out.println(message);
		
		//switch case cannot use relational or logical operators
		//switch cannot work with double, float, long

	}

}
