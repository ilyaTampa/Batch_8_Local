package Recap;

import java.util.Scanner;

public class class1 {

	public static void main(String[] args) {

		String name;
		int age;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter your name");
		name=scanner.nextLine();
		System.out.println("Please enter your age");
		age=scanner.nextInt();
		System.out.println("Hi "+name+" you are "+age+" years old");
		
		

		}

	}


