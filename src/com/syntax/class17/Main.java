package com.syntax.class17;

import com.syntax.class16.Task;

public class Main {
    Student qasim = new Student(); // now it is a instance variable
    public static void main(String[] args) {
    /*    Project2.Task1 task1=new Project2.Task1();
        String email = task1.createEmail("Ahmed", "Qasim", "Gmail");
        System.out.println(email);

        Project2.Task2 task2=new Project2.Task2();
        boolean prime = task2.isPrime(25);
        boolean prime1 = task2.isPrime(1);
        boolean prime2 = task2.isPrime(10);
        System.out.println("isPrime(25) "+prime);
        System.out.println("isPrime(1) "+prime1);
        System.out.println("isPrime(10) "+prime2);*/

/*
        Variables variables=new Variables();
        Variables var2=new Variables();
        variables.varsDemo();
        variables.varsDemo1();*/



        Student qasim = new Student();
        qasim.printInfo();

        qasim.StudentsRegistered();
        qasim.numberOfStudentsEnrolled++;


        Student danilo = new Student();

        danilo.name = "Danilo";
        danilo.age = 30;
        danilo.marks = 95;
        danilo.numberOfStudentsEnrolled++;
        danilo.StudentsRegistered();

        Student ilya = new Student();
        ilya.name = "Ilya";
        ilya.age = 40;
        ilya.marks = 98;
       // ilya.numberOfStudentsEnrolled++;
        ilya.StudentsRegistered();



     /*   com.syntax.class18.Student student1 = new com.syntax.class18.Student();
        student1.studentName = "Moneer is a bad DJ";
        student1.studentID = 123;
        com.syntax.class18.Student.numberOfStudents++;*/

    }
}
