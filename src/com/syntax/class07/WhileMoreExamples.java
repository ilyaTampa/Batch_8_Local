package com.syntax.class07;

public class WhileMoreExamples {

	public static void main(String[] args) {

String day = "Saturday";
if (day.equals("Saturday")) {
	System.out.println("My favorite Java class");
}
while (day.equals("Saturday")) {
	System.out.println("My favorite Java class");// infinite loop
	day="Sunday";
	}
//while (day.equals("Saturday")) {
	//System.out.println("My favorite Java calss"); // infinite loop
	
//}
boolean isItBreakTime=true;
if (isItBreakTime) {
	System.out.println("I will get tea");
}
while (isItBreakTime) {
	System.out.println("I will get tea"); // infinite loop
	isItBreakTime=false; 
	}


	}

}
