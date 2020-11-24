package ReplTasks;

import java.util.Scanner;

/*
Create an array of names that will hold 5 String elements.
Names must be taking from a user.
Print out the first three characters of each element of the array, one per line.
 */
public class Repl108 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arr = new String[5];

        //storing names into array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextLine();
        }

        //printing first 3 characters of each String element
        for (String a: arr) {
            for (int j = 0; j<3; j++) {
                System.out.print(a.charAt(j));
            }
            System.out.println();
        }
    }
}
