package com.syntax.class05;

public class ReviewClass {

	public static void main(String[] args) {

		String day = "Sunday";
		if (day.equalsIgnoreCase("Sunday")) {
			System.out.println("Relax its just dont't blink or it be over");

		} else if (day.equalsIgnoreCase("Saturday")) {
			System.out.println("Relax its just dont't blink or it be over");
		} else {
			System.out.println("Go to work");
		}
//----------------------------------------------------------------------------------------------------
		
		if (day.equalsIgnoreCase("Sunday") || day.equalsIgnoreCase("Saturday")) {
			System.out.println("Relax its just dont't blink or it be over");
		} else {
			System.out.println("Go to work");
		}
		
	    boolean a, b, c;
	     a = b = c = true;

	          if( !a || ( b && c ) ) {
	             System.out.println("If executed");
	          } else {
	             System.out.println("else executed");
		
		
		
	}}
}
