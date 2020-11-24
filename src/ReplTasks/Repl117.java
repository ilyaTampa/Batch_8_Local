package ReplTasks;
/*
1. Create a method in which you will be printing numbers from 1 to 10
2. Call the method in the main method
 */
public class Repl117 {
    void printNumbers() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        Repl117 x = new Repl117();
        x.printNumbers();
    }
    }