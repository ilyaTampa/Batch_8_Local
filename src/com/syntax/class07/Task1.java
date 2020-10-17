package com.syntax.class07;

public class Task1 {

	public static void main(String[] args) {

		boolean workDay = true;

		int day = 1;

		workDay = true;
		while (workDay) {

			if (day < 6) {
				System.out.println("I need a day off");
			} else {
				System.out.println("It is weekend and I am off");
				workDay = false;
			}
			day++;
		}

	}

}
