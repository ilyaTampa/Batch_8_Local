package com.syntax.class05;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		/*
		 * Prompt the user to enter person heights in inches. Person should be
		 * classified as one of the following: short (under 60 inch) medium(between 60
		 * -72 inch) tall (over 72 inch)
		 */
		Scanner input;
		int height;

		input = new Scanner(System.in);
		System.out.println("Please enter your Height in inches");
		
		height = input.nextInt();
		
		if (height < 60) {
			System.out.println("You are short height person");
			
		} else if (height > 60 && height < 72) {
			System.out.println("You are medium height person");
			
		} else if (height > 72) {
			System.out.println("You are toll height person");

		}
		System.out.println("--------------------------------------------");
		
		/*
		 * Write a program that will print whether it is a weekend or weekday. 
		 * If any day from 1-5  output “It is a weekday”,
		 *  any day from 6-7  output “It is a weekend”, 
		 *  any other day  output “Invalid day”

		 */

		System.out.println("Please enter day");
		int day = input.nextInt();
		
		if (day >= 1 && day <= 5) {
		System.out.println("It is a weekday");
		}else if (day== 6 || day == 7) {
			System.out.println("It is a weekend");
		}else {
			System.out.println("Invalid entry");
		}
		System.out.println("------------------------------------------");
		
		
		System.out.println("Please enter your Score");
		int score=input.nextInt();
		if (score>=90) {
			System.out.println("Your grade is A");
		}else if(score>=70 && score<90){
			System.out.println("Your grade is B");
		}else if(score>=50 && score<70) {
			System.out.println("Your grade is C");
		}else if(score<50) {
			System.out.println("Your grade is F");
			}
		
		System.out.println("------------------------------");
		
		System.out.println("Please enter your month when you were born");
		
		String month= input.next();
		if (month=="June" || month=="July" || month=="August") {
			System.out.println("Summer");
		}else if (month=="September" || month=="October" || month=="November") {
			System.out.println("Spring");
		}else if(month=="December" || month =="January" || month =="February") {
			System.out.println("Winter");
		}else if (month=="March"|| month=="April" || month=="May") {
			System.out.println("Fall");
			
			
		}
		
	}

}
