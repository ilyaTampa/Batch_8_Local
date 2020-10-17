package com.syntax.class05;

import java.util.Scanner;

public class Repl39 {

	public static void main(String[] args) {
		Scanner userIn = new Scanner(System.in);
		
		int num;
		char grade = 0;
		
		System.out.println("Please enter your mark");
		num = userIn.nextInt();
		
		if (num > 0 && num < 25) {
			grade = 'F';
		} else if (num >= 25 && num < 45) {
			grade = 'E';
		} else if (num >= 45 && num < 50) {
			grade = 'D';
		} else if (num >= 50 && num < 60) {
			grade = 'C';
		} else if (num >= 60 && num < 80) {
			grade = 'B';
		} else if (num >= 80 && num <= 100) {
			grade = 'A';
		} else {
			System.out.println("Please enter valid mark");
		}
		if (grade !=0) {
			System.out.println("Your grade is " + grade);
		}
		
	}
}