package com.syntax.class06;

import java.util.Scanner;

public class SwitchCaseIntro {

	public static void main(String[] args) {

		Scanner userIn = new Scanner(System.in);
		System.out.println("Please enter a day number");

		int day = userIn.nextInt();
		String myDay;

		if (day == 1) {
			myDay = "Monday";
		} else if (day == 2) {
			myDay = "Tuesday";
		} else if (day == 3) {
			myDay = "Wednesday";
		} else if (day == 4) {
			myDay = "Thursday";
		} else if (day == 5) {
			myDay = "Friday";
		} else if (day == 6) {
			myDay = "Saturday";
		} else if (day == 7) {
			myDay = "Sunday";
		} else {
			myDay = "Invalid Day";
		}
		System.out.println("Today is " + myDay);

		System.out.println("---------------SAME EXAMPLE USING SWITCH CASE-------------------------------------");

		String today;

		switch (day) {// data type of variable must match with datatype of cases

		case 1:
			today = "Monday";
			break;
		case 2:
			today = "Tuesday";
			break;
		case 3:
			today = "Wednesday";
			break;
		case 4:
			today = "Thursday";
			break;
		case 5:
			today = "Friday";
			break;
		case 6:
			today = "Saturday";
			break;
		case 7:
			today = "Sunday";
			break;
			
		default:
			today = "Invalid Day";
			break;
			// break --> is optional since it is a last statement in the switch block
		}
		System.out.println("Today is " + today);
		
		boolean x = true;
		boolean y = false;
		if (x || y) {
		System.out.println(true);
		} else {
		System.out.println(false);
		}
	}

}
