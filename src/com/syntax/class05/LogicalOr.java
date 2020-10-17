package com.syntax.class05;

import java.util.Scanner;

public class LogicalOr {

	public static void main(String[] args) {

		String day = "Sunday";
		if (day.equals("Saturday") || day.equals("Sunday")) {
			System.out.println("Today I have a Java class at Syntax");
		}
		System.out.println("The End");
		
		System.out.println("----------------- more examples---------------------");
		
		/* if day is 1 or 5 --> I am off from Syntax
		 * if day 2 or 3 --> GIT classes
		 * if day is 4 --> Review Class
		 * Everything else will be invalid day
		 * 
		 */
		Scanner input;
		int number;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter todays day using numbers only");
		
		int today=scan.nextInt();
		
		if (today == 1 || today == 5) {
			System.out.println("I am off from Syntax");
		}else if (today==2 || today==3) {
			System.out.println("Today is GTI Class");
		}else if(today==4) {
			System.out.println("Today is Review Class");
		}else if(today==6 || today==7) {
			System.out.println("Today is Java CLass");
		}else {
			System.out.println("Please enter a valid day from 1 to 7");
		}
		
		

	}

}
