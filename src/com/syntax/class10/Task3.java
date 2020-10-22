package com.syntax.class10;

public class Task3 {

	public static void main(String[] args) {

		String[] classDay = { " Java", "Saturday ", " day", " coding", "is" };
		System.out.println(classDay[1] + classDay[4] + classDay[0] + classDay[3] + classDay[2]);

		String[] classDay2 = new String[5];
		classDay2[0] = "Java";
		classDay2[1] = "Saturday";
		classDay2[2] = "day";
		classDay2[3] = "coding";
		classDay2[4] = "is";

		System.out.println(classDay2[1] + " " + classDay2[4] + " " + classDay2[0] + " " + classDay2[3] + " " + classDay2[2]);
	}

}
