package com.syntax.class05;

import java.util.Scanner;

public class ReviewClass5 {

	public static void main(String[] args) {

		int num1;
		int num2;
		char operation;
		int results;

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter two numbers");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		System.out.println("Please enter the operation + - / * ");
		operation = scan.next().charAt(0);

		if (operation == '+') {
			results = num1 + num2;
		} else if (operation == '-') {
			results = num1 - num2;
		} else if (operation == '*') {
			results = num1 * num2;
		} else if (operation == '/') {
			results = num1 / num2;
		} else {
			System.out.println("Invalid operation");
			results = 0;
		}
//----------------------------------------------------------------------------------------		
		switch (operation) {
		case '+':
			results = num1 + num2;
			break;
		case '-':
			results = num1 - num2;
			break;
		case '/':
			results = num1 / num2;
			break;
		case '*':
			results = num1 * num2;
			break;
		default:
			System.out.println("Invalid entry");

		}
		System.out.println(results);
		
	}		
	}
