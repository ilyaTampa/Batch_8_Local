package com.syntax.class06;

import java.util.Scanner;

public class Repl044 {

	public static void main(String[] args) {

		Scanner userIn = new Scanner(System.in);

		String make, carOrigin;

		System.out.println("Please enter your favorite car make ");

		make = userIn.next();

		switch (make) {
		case "BMW":
			carOrigin = "german car";
			break;
		case "Toyota":
			carOrigin = "japanese car";
			break;
		case "Maserati":
			carOrigin = "italian car";
			break;
			default:
			carOrigin = "unknown";
			}
System.out.println("Your favorite car is "+carOrigin);

	}

}
