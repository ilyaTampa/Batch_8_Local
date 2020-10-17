package com.syntax.class06;

import java.util.Scanner;

public class HomeWork2 {

	public static void main(String[] args) {
		/*
		 * Using scanner class create calculator. Allow user to enter 2 numbers and
		 * operator(+,-,*,/). Based on operator provide the result to user.
		 */

		Scanner userIn;
		double num1, num2, result;
		char arO;

		userIn = new Scanner(System.in);

		System.out.println("Please enter two numbers");

		num1 = userIn.nextDouble();
		num2 = userIn.nextDouble();

		System.out.println("Please enter arithmetical operator + - / * %");

		arO = userIn.next().charAt(0);
		result = 0;

		switch (arO) {
		
		case ('+'):
			result = num1 + num2;
			break;
			
		case ('-'):
			result = num1 - num2;
			break;
			
		case ('*'):
			result = num1 * num2;
			break;
			
		case ('/'):
			result = num1 / num2;
		break;
		
		case ('%'):
			result = num1 % num2;
		break;
		
		default:
			System.out.println("Please enter valid arithmetical operator");	
		}
		if (result!=0) {
			
		}
System.out.println("The answer is "+result);
	}

}
