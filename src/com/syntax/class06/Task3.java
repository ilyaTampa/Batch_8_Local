package com.syntax.class06;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {

		Scanner userIn;
		String grade;
		String explanation;

		userIn = new Scanner(System.in);
		System.out.println("Please enter your Grade");
		grade = userIn.nextLine();

		switch (grade.toLowerCase()) {
		case "a":
			explanation = "A - Excellent";
			break;
		case "b":
			explanation = "B - Good";
			break;
		case "c":
			explanation = "C - Average";
			break;
		case "d":
			explanation = "D - Bad";
			break;
		default:
			explanation = "Not Acceptable";
					}
		System.out.println(explanation);
	}
}