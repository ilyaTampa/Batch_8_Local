package com.syntax.class08;

import java.util.Scanner;

public class RecapWIthDoWhile {

	public static void main(String[] args) {
		/* ask user to pay for a water
		 * water price is 5
		 * once user enters money then we need to tell if we need more money or less
		 * once user gives us exact 5 then --> enjoy your water!
		 */
		
		Scanner input;
		int money;
		int waterPrice = 5; 
		
		input= new Scanner(System.in);
		
		System.out.println("Please pay for you water");
		//money = input.nextInt();
		
		do {
			money = input.nextInt();
			if (money>waterPrice) {
				System.out.println("This is too much, you need to enter less money");
				//money = input.nextInt();
			}else if (money<waterPrice){
				System.out.println("Water is expensive, please insert more money");
				//money=input.nextInt();
			}
			//money = input.nextInt();
			
		}while(money!=waterPrice);
		
		System.out.println("Enjoy your water");
		
	}

}
