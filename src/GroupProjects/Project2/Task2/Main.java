package GroupProjects.Project2.Task2;

import Project2.Task2.StudentA;
import Project2.Task2.StudentB;

public class Main {
    public static void main(String[] args) {
        StudentA a = new StudentA(10, 20, 30);
        System.out.println(a.percentage());
        StudentB b = new StudentB(5, 6, 7, 8);
        System.out.println(b.percentage());
    }
}