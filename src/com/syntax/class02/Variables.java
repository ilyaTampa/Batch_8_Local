package com.syntax.class02;

public class Variables {

	public static void main(String[] args) {
		
		String name;
		String lastName;
		int grade;
		String city;
		String state;
		long phoneNumber;
		
		name="Ilya";
		lastName="Ivanov";
		grade=5;
		city="Tampa";
		state="Fl";
		phoneNumber=1234567890L;
		
		System.out.println(name);
		System.out.println(lastName);
		System.out.println(grade);
		System.out.println(city);
		System.out.println(state);
		System.out.println(phoneNumber);
		
		city="Washington DC";
		System.out.println(city);//shortcut to autocomplete ctrl+space
		
	}

}
