package com.syntax.class04;

public class IfElseIf {

	public static void main(String[] args) {
		/*
		 * we need to compare 2 numbers bigger, smaller or equal
		 */
		int num1 = 69;
		int num2 = 96;
		if (num1 > num2) {// what is this condition is true
			System.out.println(num1 + " is bigger than " + num2);
		} else if (num1 < num2) {// or what if this is true
			System.out.println(num1 + " is smaller than " + num2);
		} else {
			System.out.println(num1 + " is iqual to " + num2);
		}

		System.out.println("---------------------------------------------");

		/*
		 * Based on the day of the week we will print calss schedule
		 * 
		 */
		int day = 55;

		if (day == 1) {
			System.out.println("Today is Monday we have no class");
		} else if (day == 2) {
			System.out.println("Today is Tuesday we have Manual class");
		} else if (day == 3) {
			System.out.println("Today is Wednesday and we have Manual class again");
		} else if (day == 4) {
			System.out.println("Today is Thursaday and we have Review class");
		} else if (day == 5) {
			System.out.println("Today is Friday, but I have a class tomorrow and I will prepare");
		} else if (day == 6) {
			System.out.println("Today is Saturday, I miss Java classes");
		} else if (day == 7) {
			System.out.println("Today is Sunday, I did a lot of coding");
		} else {
			System.out.println("This is invalid entry, please prrovide valid day from 1 to 7");

		}
	}
}
