package ReplTasks;
/*
Step1: Create three methods that will accept 2 in parameters on integer type
Step2: Write the logic in methods to perform actions below:

The first method for multiplication
The second method for addition
The third method for subtraction

Step3: execute all methods

1. for the addition method add two numbers to make 30
2. for multiplication multiply two numbers to make 30
3. for Subtraction subtract two numbers to equal 20
 */

public class Repl116 {
    void method1 (int a,int b){
        System.out.println("Addition "+(a+b));
    }
    void method2 (int a, int b){
        System.out.println("Multiplication "+(a*b));
    }
    void method3 (int a, int b){
        System.out.println("Subtraction "+(a-b));
    }

    public static void main(String[] args) {
        Repl116 x = new Repl116();
        x.method1(15,15);
        x.method2(15,2);
        x.method3(30,10);

    }

}