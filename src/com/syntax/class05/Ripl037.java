package com.syntax.class05;

import java.util.Scanner;

public class Ripl037 {

	public static void main(String[] args) {

		boolean q1, q2;
		String drink;

		Scanner userIn = new Scanner(System.in);

		System.out.println("Are you thirsty?");
		q1 = userIn.nextBoolean();

		System.out.println("Are you sleepy?");
		q2 = userIn.nextBoolean();

		if (q1 && !q2) {
			drink = "Water";
		} else if (q1 && q2) {
			drink = "Coffee";
		} else if (!q1 && q2) {
			drink = "Tea";
		} else{
		    drink = "Nothing";
		}
		System.out.println("Looks like you need to drink "+ drink);
	}
}