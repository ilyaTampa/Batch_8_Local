import java.util.Scanner;

public class Repl065 {

	public static void main(String[] args) {
		
		// Write a for loop that will print out a series of numbers starting at one less than x and ending at 0
		
		Scanner userIn = new Scanner(System.in);

		int x, num;

		System.out.println("In:");

		x = userIn.nextInt();

		if (x > 0) {
			for (num = x-1; num >=0; num--) {
				System.out.print(num + " ");

			}
		}
	}
}