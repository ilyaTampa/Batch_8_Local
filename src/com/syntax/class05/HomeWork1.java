package com.syntax.class05;

import java.util.Scanner;

public class HomeWork1 {

	public static void main(String[] args) {
		/*
		 * You are working in sales and have to calculate commission for the employees;
		 * You need to ask user a sales amount and based on the amount you need to
		 * define their commission
		 * 
		 * if user sold products for more than $10 but less than 100 --> commission is 10% 
		 * if sales is more than 100 but less then 200 --> commission is 20% 
		 * if sales is more than 200 but less then 500 --> commission is 30% 
		 * if sales is more than 500 --> commission is 50%
		 * 
		 * You program should print How much in commission user will get
		 */

		Scanner input;
		double sales;
		double commission;

		input = new Scanner(System.in);
		
		System.out.println("Please enter your sales amount");
		
		sales = input.nextDouble();
		commission = 0;

		if (sales > 10 && sales < 100) {
			commission = sales * 0.1;
		} else if (sales > 100 && sales < 200) {
			commission = sales * 0.2;
		} else if (sales > 200 && sales < 500) {
			commission = sales * 0.3;
		} else if (sales > 500) {
			commission = sales * 0.5;
		} else {
			commission = 0;
		}
			System.out.println("The commission amount is $"+commission);
			
			// if you sell more that 1K --> you are an awesome seller
			
			if (commission>1000) {
				System.out.println("You are an awesome seller");
			}
		}

	}


