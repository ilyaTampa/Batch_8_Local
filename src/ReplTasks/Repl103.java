package ReplTasks;

import java.util.Scanner;

public class Repl103 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("In:");
        String s = inp.nextLine();

        for (int i=0; i<=s.length()-1; i++){
            System.out.print(s.charAt(i)+" ");
        }
    }
}
