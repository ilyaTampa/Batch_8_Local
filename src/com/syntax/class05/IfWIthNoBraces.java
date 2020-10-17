package com.syntax.class05;

public class IfWIthNoBraces {

	public static void main(String[] args) {
		boolean isSaturday = false;

		if (isSaturday)
			System.out.println("Today is a Java class");// if no braces only one line will be treated as code for if
														// block
		System.out.println("And tomorrow I will have a Java class"); // this code doesn't belong to if statement

		System.out.println("Im a code outside of if statement");
	}

}
