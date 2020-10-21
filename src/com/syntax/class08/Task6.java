package com.syntax.class08;

import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		// i want to create a multiplication table
/*
 * 1x1=1
 * 1x2=2
 * 1x3=3
 * 
 * 1x10=10
 */
		
		Scanner scan =new Scanner(System.in);
		System.out.println("Please enter which number");
		
		
		int num1=scan.nextInt();
		int mult;
		
		for (int i=1; i<=10; i++) {
			mult=num1*i;
			System.out.println(num1+" x "+i+" = "+mult);
		}
	}

}
