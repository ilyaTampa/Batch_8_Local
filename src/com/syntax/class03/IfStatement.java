package com.syntax.class03;

public class IfStatement {

	public static void main(String[] args) {
		
		int num1=180;
		int num2=900;
		
		System.out.println("writing my first if statement");
		
		if(num1>num2) {
			System.out.println("num1 is bigger then num2");
		}
		System.out.println("End of if statement");
		
		System.out.println("------------------------------------");
		
		int temp=60;
		
		if (temp>=60) {
			System.out.println("I am going to the beach");
			}else {
				System.out.println("I will go for a walk");
			}
		System.out.println("------------------------------------");
		
		double expectedHours=15;
		double actualHours=2;
		
		if (actualHours>expectedHours) { // true
			System.out.println("You will love the course and will succeed");
		}else {//false
			System.out.println("Course will be to hard for you");
			
		}

		int day = 7;

		switch(day) {
		case 1:
		System.out.println("Monday");
		case 2:
		System.out.println("Tuesday");
		case 3:
		System.out.println("Wednesday");
		case 4:
		System.out.println("Thursday");
		case 5:
		System.out.println("Friday");
		
		

	}
	}
}
