package com.syntax.class06;

import java.util.Scanner;

public class Repl042 {

	public static void main(String[] args) {

		Scanner userIn = new Scanner(System.in);

		int roll;
		String name;

		System.out.println("enter the roll number of the Child");

		roll = userIn.nextInt();

		switch (roll) {
		case 101:
			name = "Student name: Ramesh ";
			break;
		case 102:
			name = "Student name: Mahesh ";
			break;
		case 103:
			name = "Stedent name: Mukesh ";
			break;
		default:
			name = "Not found Student name : in Class";
			break;
		}
		System.out.println(name);

	}

}
