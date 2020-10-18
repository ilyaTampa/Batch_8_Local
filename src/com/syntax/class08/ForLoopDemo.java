package com.syntax.class08;

public class ForLoopDemo {

	public static void main(String[] args) {

		// i want to say Good Morning 5 times
		/*
		 * FOR SYNTAX
		 * 
		 * for (initialization; condition; increment/decrement{ code; }
		 */

		for (int i = 5; i <= 10; i++) {
			System.out.println("Good Morning");

		}
// i want to print number 1 to 100

		/*
		 * FOR SYNTAX
		 * 
		 * for (start point; end point; increment/ decrement) { code; }
		 */

		for (int a = 1; a <= 100; a++) {
			System.out.print(a + " ");
		}
		System.out.println("---------------------I want to print number 10 to 0----------------");

		for (int b = 10; b >= 0; b--) {
			System.out.print(b + " ");
		}
		for (int i = 0; i <= 30; i += 3) {
			System.out.print(i + " ");
		}
	}
}
