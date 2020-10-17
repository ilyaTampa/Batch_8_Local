package com.syntax.class04;

public class Task2 {
	/*
	 * Write a program to store a boolean value of whether user has diploma or not.
	 * If user has a diploma, you should say congratulations, otherwise program
	 * should suggest to get a degree. Then if user has a degree program should
	 * check a gpa score. If gpa score is higher or equals to 3.5 output should say
	 * “You are eligible for scholarship”, otherwise “You should have studied
	 * harder” .
	 */

	public static void main(String[] args) {

		boolean hasDiploma = true;
		double gpa = 3.6;

		if (hasDiploma) {
			System.out.println("Congratulations!");
			if (gpa >= 3.5) {
				System.out.println("You are eligible for a scholarship");
			} else {
				System.out.println("You should have studied harder");
			}
		} else {
			System.out.println("You should get a degree");
		}
		System.out.println("---------------------TASK 2-----------------");

		// Create a Java program and store values of mortgage rate and mortgage price.
		// First, program should check if rate is higher than 4.5 user will not buy a
		// house, otherwise user will consider buying.
		// Once user decides to buy a house, if price of the house is larger than 200000
		// than user will take a loan, otherwise user will pay cash.

		double rate = 3;
		int price = 150000;

		if (rate < 4.5) {
			System.out.println("I am thinking of byuing a house");
			if (price > 20000) {
				System.out.println("I need to take a loan");
			} else {
				System.out.println("I am thinking of buying a house");
			}

		} else {
			System.out.println("I am rich I can pay cash");
		}
	}
}
