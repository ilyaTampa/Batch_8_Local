package com.syntax.class07;

public class WhileLoopsIntro {

	public static void main(String[] args) {

		// int time = 15;

		// if (time > 12) { // condition is true
		// System.out.println("good day"); // code executes 1 time
		// }

		// System.out.println("------------------------WHILE
		// LOOP----------------------");

		// while (time > 12) {
		//System.out.println("good day");// infinite loop
		// }
		// while (time > 12) {
		// System.out.println("good day");// 3 times
		// time--;
		// }
		// while (time > 12) {
		// System.out.println("good day");// infinite loop
		// time++;
		// }

		// i want to print number from 1 to 50
	//	int num = 0;

		//while (num <= 50) {
		//	System.out.println(num);
		//	num++;
	//	}
		// i want to print numbers from 10 to 60
		//int a = 10;
		
		//while (a < 61) {
			//System.out.print(a+" ");
			//a++;
		//}
int b = 100;
		
		while (b >= 60) {
			System.out.print(b+" ");
			b--;
		}
			
		int c = 10;
			
			while (c < 31) {
				
				if (c%2==0) {
					System.out.print(c+" ");
					// c++ --> if we keep increment here --> we will get infinite loop
			}
				c++;
			}
			System.out.println("---------Another way");
			int d = 10;
			while (d<=30) {
				System.out.print(d +" ");
				d+=2;
			}
			
			int e=99;
			while (e>=1) {
				System.out.print(e+" ");
				e-=2;
			}
	}
}
