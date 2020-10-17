package com.syntax.class05;

public class ReviewClass2 {

	public static void main(String[] args) {
		int number=0;
		if(number>=0) {
			if (number<=100) {
				System.out.println("Number is between 0 and 100");
				}else {
					System.out.println("Number is not between  and 100");
				}
		}else {
			System.out.println ("Number is not between 0 and 100");
				}
		
// -------------------------------------------------------------------------------------------
		
		
		if (number >= 0 && number <= 100) {
			System.out.println("Number is between 0 and 100");
		}else {
			System.out.println("NUmber is not between 0 and 100");
		}
		

	}

}
