package com.syntax.class08;

public class Task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = 1;
		for (int i = 10; i > 1; i -= 2) {
			result *= i;
			System.out.println("Result = " + result);
		}
// calculate sum of even and odd numbers from 1 to 50

		int sumOdd = 0;
		int sumEven = 0;
		for (int i = 1; i <= 51; i ++) {
			if (i%2==0) {
				sumOdd = i + sumEven;
			}else {
			sumOdd=i + sumOdd;
			}
		}
			System.out.println("The sum of even number from 1 to 50 is " + sumEven);
			System.out.println("The sum of even number from 1 to 50 is " + sumOdd);
		}
	}

