package com.syntax.class17;

public class Student {

    String name;
    int age;
    double marks;
    static int numberOfStudentsEnrolled;

    public void printInfo() {
        int number=12;
        System.out.println("Name " + name + " Age " + age + " Marks " + marks);
    }

    public void printMarks() {
       // number=15 CE
        System.out.println(" Marks " + marks);
    }

    public void StudentsRegistered() {
        System.out.println("Total number of student up till now " + numberOfStudentsEnrolled);
    }
}
