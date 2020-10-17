package com.syntax.class05;

import java.util.Scanner;

public class HomeWorkRecap {

	public static void main(String[] args) {
		
		/*
         * Create a Java program that will ask if user has a credit card or not. If you
         * user does not have a credit card then offer them. If they do have one ask
         * what is balance on the card? If balance of the card is larger than 1000, tell
         * them to pay off immediately, otherwise you can tell them that they can spend
         * more.
         */
		

		Scanner scan;
		String answer; /// that is if answer yes or no
		double balance;

		scan = new Scanner(System.in);
		System.out.println("Please enter if you have a credit card (yes/no)");

		answer = scan.next();

		if (answer.equals("yes")) {   /// that is if answer yes or no  
			// (answer.equalsIgnorecase (to ignore Yes or yes or yeS etc.)
			
			System.out.println("What is your balance on your card?");
			balance = scan.nextDouble();
			if (balance > 1000) {
				System.out.println("Please pay off your card balance");
			} else {
				System.out.println("You can spend more money");
			}

		} else {
			System.out.println("Would you like to get a credit card?");

		}

	}

}
