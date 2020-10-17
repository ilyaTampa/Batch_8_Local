package com.syntax.class06;

public class Test {

	public static void main(String[] args) {

		// NOT operator --> reverse the condition

		boolean isJavaEasy = false;

		if (!isJavaEasy) {
			System.out.println("Please try to spend more time with Java");
		}
		System.out.println("-------------------------------------------------------");

		String day = "Saturday";

		if (!(day.equals("Sunday") || day.equals("Saturday"))) {
			System.out.println("I am going to work");
		}
		System.out.println("-------------------------------------------------------");
		
		String day2 = "Sunday";

		if (!(day2.equals("Sunday") && day2.equals("Saturday"))) { // cant be this way, one day can be 2 days in same day
			System.out.println("I am going to work");
		}

	}

}
