package com.syntax.class06;

import java.util.Scanner;

public class NotOperator {

	public static void main(String[] args) {
		boolean b=!true;
		System.out.println(b);
		
		boolean anotherBoolean = !false;
		System.out.println(anotherBoolean);
		System.out.println("-----------------------------------");
		
		boolean isCold=false;
		if (!isCold) {
			System.out.println("I am going to the Beach");
		}
		
		Scanner userIn = new Scanner(System.in);
		double num1, num2, num3, largest;
		
		num1 = userIn.nextDouble();
		num2 = userIn.nextDouble();
		num3 = userIn.nextDouble();
		largest = 0;
		
		if (num1!=num2 && num2!=num3) {
			
		}
		
		if (num1 > num2) {
			if (num1 > num3) {
				largest = num1;
			}
		} else if (num2 > num3) {
			largest = num2;
		} else {
			largest = num3;
		}

	}

}
