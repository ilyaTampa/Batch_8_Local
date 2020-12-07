import java.util.Scanner;

public class Repl064 {

	public static void main(String[] args) {
		
		//Write a for loop that will print out a series of numbers
		//starting at 0 and ending at the doubled value of end (value must be taken from a user), exclusive.

        //Each number should be on the same line, separated by a space.

		Scanner userIn = new Scanner(System.in);

		int x, num;

		System.out.println("In:");

		x = userIn.nextInt();

		if (x > 0) {
			for (num = 0; num < x * 2; num++) {
				System.out.print(num + " ");

			}
		}
	}
}