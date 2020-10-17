package com.syntax.class06;

import java.util.Scanner;

public class Repl041 {

	public static void main(String[] args) {
		
		Scanner userIn = new Scanner(System.in);
		
		int age;
		
		String baby;
		
		System.out.println("enter the age of the Child");
		
		age=userIn.nextInt();
		
		switch (age) {
		case 1:
			baby = "You can Crawl";
			break;
		case 2:
			baby = "You can Talk";
			break;
		case 3:
			baby = "You can Dance";
			break;
		case 4:
			baby = "You can get Trouble";
			break;
			default:
				baby = "I don't know how old you are";
				break;				
		}
		System.out.println(baby);

	}

}
