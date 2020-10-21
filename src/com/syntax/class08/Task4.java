package com.syntax.class08;

public class Task4 {

	public static void main(String[] args) {
		// Print odd numbers between 20 and 50 (2 ways)

		for (int a = 20; a <= 50; a++) {
			if (a % 2 == 1) {
				System.out.print(a + " ");
			}
		}
		System.out.println();

		for (int a = 21; a <= 50; a += 2) {
			if (a % 2 == 1) {
				System.out.print(a + " ");
			}
		}
		System.out.println();

		int sum = 0;
		for (int i = 1; i < 6; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
	}
}
	
