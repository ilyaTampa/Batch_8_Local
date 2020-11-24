package ReplTasks;
/*
1. Create one method as syntaxTechnologies and write the logic for that method in println statement as "Welcome to Syntax Technologies!"
2. Create another method as syntaxStudents and write the logic for that method in println statement as "Welcome Syntax Students!"
3. Call both methods
 */


public class Repl115 {
    void syntaxTechnologies(){
        System.out.println("Welcome to Syntax Technologies!");
    }
    void syntaxStudents(){
        System.out.println("Welcome Syntax Students!");
    }

    public static void main(String[] args) {
        Repl115 x = new Repl115();
        x.syntaxTechnologies();
        x.syntaxStudents();
    }

}
