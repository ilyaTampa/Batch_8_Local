package ReplTasks;

import java.util.Scanner;

public class Repl099 {
    public static void main(String[] args) {

        String givenString;

        String revStr = "";

        Scanner inp = new Scanner(System.in);

        System.out.println("In:");

        givenString = inp.nextLine();

        givenString = givenString.replaceAll("\\s", "");

        for (int i = givenString.length()-1; i>=0; i--) {
            revStr += givenString.charAt(i);
        }
        if (givenString.equalsIgnoreCase(revStr)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }}  }