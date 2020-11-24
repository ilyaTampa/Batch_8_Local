package ReplTasks;

import java.util.Scanner;

public class Repl100 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("In:");
        String s = inp.nextLine();
        String reversed = "";

        for (int i = s.length()-1; i>=0; i--){
            reversed = reversed + s.charAt(i);
        }
        System.out.println(reversed);

    }

}