package com.syntax.class05;

import java.util.Scanner;

public class Ripl2 {

	public static void main(String[] args) {

		String word1, word2, output = null;
		int int1, int2;
		Scanner userIn;

		userIn = new Scanner(System.in);

		System.out.println("Please enter 2 words");
		word1 = userIn.nextLine();
		word2 = userIn.nextLine();

		System.out.println("Please enter 2 numbers");
		int1 = userIn.nextInt();
		int2 = userIn.nextInt();

		if (int1 == int2 && word1.equals(word2)) {
			output = "AND";
		} else if (int1 == int2 || word1.equals(word2)) {
			output = "OR";
		} else if (!(int1 == int2 && word1.equals(word2))) {
			output = "NONE";
		}
		System.out.println("Output: "+output);

	}

}
