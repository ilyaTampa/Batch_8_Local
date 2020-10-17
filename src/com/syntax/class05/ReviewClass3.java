package com.syntax.class05;

import java.util.Scanner;

public class ReviewClass3 {

	public static void main(String[] args) {

		String pass = "pass123";
		double accountBalance = 1000;
		Scanner scan = new Scanner(System.in);
		double transferAmount = 500;

		System.out.println("Welcome to Sntax. PLease Enter your password");
		pass = scan.nextLine();

		if ("pass123".equals(pass) || pass.equals("pass123") ) {
			System.out.println("Please enter the amount that you want to transfer");
			transferAmount = scan.nextDouble();
			if(transferAmount>accountBalance) {
				System.out.println("Not enought funds");
			}else {
				System.out.println("Transfered, your remaining balance is " + (accountBalance-transferAmount));
			}

		} else {
			System.out.println("Sorry try again Invalid credentials");
		}

	}

}
