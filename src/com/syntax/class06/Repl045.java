package com.syntax.class06;

import java.util.Scanner;

public class Repl045 {

	public static void main(String[] args) {

		Scanner userIn = new Scanner(System.in);

		int num;
		String day;

		System.out.println("Input a number between 1-7");

		num = userIn.nextInt();

		switch (num) {
		case 1:
			day = "Monday";
			break;
		case 2:
			day = "Tuesday";
			break;
		case 3:
			day = "Wednesday";
			break;
		case 4:
			day = "Thursday";
			break;
		case 5:
			day = "Friday";
			break;
		case 6:
			day = "Saturday";
			break;
		case 7:
			day = "Sunday";
			break;
		default:
			day = "Invalid";
		}
		System.out.println(day);

	}

}