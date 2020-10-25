package com.syntax.class11;

public class Creating2Darrays {

	public static void main(String[] args) {
		
		// create 2D of food
		// American
		// Italian
		// Asian
		// Indian
		
		String[][] food = {
				{"steak", "hot dog", "cheesburger"},
				{"pizza", "pasta", "canoli"},
				{"sushi", "ramen","fried rice", "dumplings"},
				{"kebab", "manto"},
				{"beriyana", "masal", "curry", "chiken tikka masai"}
		};
		
		for (String[] dishes:food) {
			
			for(String dish:dishes) {
				System.out.print(dish + "  ");
			}
			System.out.println();
			}
		System.out.println("-------------------------------------------------------------");
		
		for (int i=0; i<food.length; i++) {
			for (int j =0; j<food[i].length; j++) {
				System.out.print(food[i][j]+ "   ");
				}
			System.out.println();
			
		}
	}

}
