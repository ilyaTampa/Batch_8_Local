package ReplTasks;

import java.util.Scanner;

public class Repl095 {
    public static void main(String[] args) {

        String input;

        Scanner scan = new Scanner(System.in);
        input = scan.nextLine();

        System.out.println("The first 3 letters of "+ input +"  is "+input.substring(0,3));
    }
}