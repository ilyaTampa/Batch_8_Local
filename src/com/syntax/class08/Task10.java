package com.syntax.class08;

import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		
		// Create a program that will keep asking user to apply for a credit card. 
		//As soon you get “yes” from a user program should stop asking.


		Scanner scan = new Scanner(System.in);
		String response;

		do {
			System.out.println("Do you want to apply for a credit card ");
			response = scan.nextLine();

		} while (!response.equalsIgnoreCase("yes"));
		System.out.println("You are selected");
	}

}
