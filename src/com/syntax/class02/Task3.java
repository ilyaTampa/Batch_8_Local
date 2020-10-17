package com.syntax.class02;

public class Task3 {

	public static void main(String[] args) {
		
		double num1 = 5.25;
		double num2 = 15.75;
		double mult = num1 * num2;
		double dif = num1 - num2;
		double div = num2 / num1;
		double sum = num1 + num2;
		
		double width = 5;
		double height = 8;
		
		
		float f1=3.9f;
		float f2=f1*f1;
		
			
		
		
		System.out.println("The result of " + num1 + " + " + num2 + " = " + sum);
		System.out.println("The result of " + num1 + " * " + num2 + " = " + mult);
		System.out.println("The result of " + num2 + " / " + num1 + " = " + div);
		System.out.println("The result of " + num1 + " - " + num2 + " = " + dif);
		System.out.println("The perimeter of a rectangle with width " +
				width + " and height " + height + " is equal to " + (2 * (width + height)) +
				" and the area is " + (width*height));
		System.out.println("The square of the "+f1+" will be "+f2);
				
		 
		
	}

}
