package com.syntax.class06;

import java.util.Scanner;

public class Repl040 {

	public static void main(String[] args) {

		Scanner userIn;
		String instructor;

		userIn = new Scanner(System.in);

		System.out.println("Enter name of the instructor");
		instructor = userIn.next();

		switch (instructor.toLowerCase()) {
		
		case "asghar":
			instructor = "Will take care of Java Assignment";
			break;
		case "moazam":
			instructor = "Will take care of SDLC Assignment";
			break;
		case "weqas":
			instructor = "Will take care of Selenium Assignment";
			break;
		case "asel":
			instructor = "Will take care of every Assignment";
			break;
		default:
			instructor = "Invalid instructor selected";
		}
		System.out.println(instructor);

	}

}
