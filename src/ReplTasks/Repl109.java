package ReplTasks;

import java.util.Scanner;

// Write a program that will print out only vowels of that string
public class Repl109 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();
        //write your code below
        String replace;
        replace = word.replaceAll("[^aAeEiIoOuU]", "");
        System.out.println(replace);
    }
}

