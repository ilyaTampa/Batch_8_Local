package com.syntax.class08;

public class Task3 {

	public static void main(String[] args) {
		// Print even numbers from 20 to 1 (2 ways)
		
		for (int a=20; a>0; a-=2) {
			System.out.print(a+" ");
		}
		
		System.out.println();

for (int a=20; a>0; a--) {
	if (a%2==0) {
		System.out.print(a+" ");
	}
}
}
}