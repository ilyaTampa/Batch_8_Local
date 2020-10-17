package com.syntax.class05;

import java.util.Scanner;

public class HomeWork2 {

	public static void main(String[] args) {
		/*
		 * Write a program to find largest of three double values using if-else..if and
		 * logical operators provided by a user (numbers must be distinct)
		 */

		Scanner userIn = new Scanner(System.in);
    	double num1, num2, num3, largest;
    	
		System.out.println("Please enter 3 distinct numbers");
		
		num1 = userIn.nextDouble();
		num2 = userIn.nextDouble();
		num3 = userIn.nextDouble();
		
		if (num1 > num2 && num1 > num3) {
			largest = num1;
		} else if (num2 > num3) {
			largest = num2;
		} else {
			largest = num3;
		}
		System.out.println("The largest number is " + largest);

	}

}
