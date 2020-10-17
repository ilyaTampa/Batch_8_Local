package com.syntax.class05;

import java.util.Scanner;

public class Ripl038 {

	public static void main(String[] args) {
	
		Scanner userIn= new Scanner(System.in);
		
		
		boolean q;
		String subject;
		
		System.out.println("Is it Weekend?");
		
		q=userIn.nextBoolean();
		
		if (!q) {
			subject = "Manual Testing";
		}else {
			subject = "Java";
		}
		System.out.println("Today you will be learning "+ subject);
		

	}

}
