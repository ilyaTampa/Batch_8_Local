package com.syntax.class16;

public class Main {
    public static void main(String[] args) {

       /* VoidMethods.print();
        VoidMethods.print("Aladin");*/
       /* Project2.Task1.printLarger(10,20);
        Project2.Task1.printLarger(100.5,20);
        Project2.Task1.printLarger(10,10);

        //if we don't use methods
        double number1=10;
        double number2=20;
        if(number1>number2){
            System.out.println(number1+ " is larger");
        }else if(number2>number1){
            System.out.println(number2+ " is larger");
        }else {
            System.out.println( "Numbers are equal");
        }

         number1=100.5;
         number2=20.5;
        if(number1>number2){
            System.out.println(number1+ " is larger");
        }else if(number2>number1){
            System.out.println(number2+ " is larger");
        }else {
            System.out.println( "Numbers are equal");
        }

        number1=10;
        number2=10;
        if(number1>number2){
            System.out.println(number1+ " is larger");
        }else if(number2>number1){
            System.out.println(number2+ " is larger");
        }else {
            System.out.println( "Numbers are equal");
        }
        */


       /* Project2.Task2 task2 = new Project2.Task2();
        task2.printNumberEvenOrOdd(5);
        task2.printNumberEvenOrOdd(2);
        task2.printNumberEvenOrOdd(10);
        task2.printNumberEvenOrOdd(1000);*/

        Task3 task3=new Task3();
        task3.isStringpalindrome("Syntax");
        task3.isStringpalindrome("aba");
        task3.isStringpalindrome("a");
        task3.isStringpalindrome("eabae");
        task3.isStringpalindrome("eabaf");

        Temp temp=new Temp();
       int s= temp.hi;




    }

}
