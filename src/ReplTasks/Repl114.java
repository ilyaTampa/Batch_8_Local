package ReplTasks;
/*
1. Create a method name as newLine that should have print statement inside the method body as "newLine method implementation"
1. Create a method name as displayLine that should have print statement inside the method body as "displayLine method implementation"
3. Call both methods
 */

public class Repl114 {
    void newLine(){
        System.out.println("newLine method implementation");
    }
    void displayLine(){
        System.out.println("displayLine method implementation");
    }

    public static void main(String[] args) {
        Repl114 x = new Repl114();
        x.newLine();
        x.displayLine();
    }
}