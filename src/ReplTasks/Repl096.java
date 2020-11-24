package ReplTasks;

import java.util.Scanner;

public class Repl096 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any programming language");
        String language = sc.nextLine();

        switch (language.toLowerCase()){
            case"java":
                System.out.println("Java is a programming language");
                break;
            case"c":
                System.out.println("C is a procedural programming language");
                break;
            case"c++":
                System.out.println("C++ is a middle-level programming language");
                break;
            default:
                System.out.println("Doesn't match any programming language");
        }

    }
}