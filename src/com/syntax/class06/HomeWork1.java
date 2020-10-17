package com.syntax.class06;

import java.util.Scanner;

public class HomeWork1 {

	public static void main(String[] args) {
		/*
		 * Ask user to enter their country and capture it. Once values are captured,
		 * print which language user speaks.
		 */
		Scanner userIn;
		String country, language;

		userIn = new Scanner(System.in);

		System.out.println("Please enter your country");
		country = userIn.nextLine();

		switch (country.toLowerCase()) {
		case "russia":
			country = "You are Russian and you speak Russian";
			break;
		case "usa":
			country = "You are American and you speak English";
			break;
		case "india":
			country = "You are Indian and you speak Hindi";
			break;
		case "ukraine":
			country = "You are Ukranians and you speak Ukrainian";
			break;
		case "china":
			country = "You are Chineese and you speak Mandarin";
			break;
		case "kazakhstan":
			country = "You are Kazakh and you speak Kazakh";
			break;
		default:
			country = "Sorry, please ask Google for this country";
		}
		System.out.println(country);

	}

}
