package com.syntax.class08;

import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {

		// Write a program that reads a range of integers (start and end point),
		// provided by a user and then from that range prints the sum of the even and
		// odd integers.

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter beginning value");
		int start = scan.nextInt();
		System.out.println("Please enter ending value");
		int end = scan.nextInt();

		int sum1 = 0;
		int sum2 = 0;

		for (int i = start; i <= end; i++) {
			if (i % 2 == 0) {
				sum1 += i;
			} else {
				sum2 += i;
			}
		}
		System.out.println("The sum of even number from start to end that you entered is " + sum1);
		System.out.println("The sum of odd number from start to end that you entered is " + sum2);
	}

}
