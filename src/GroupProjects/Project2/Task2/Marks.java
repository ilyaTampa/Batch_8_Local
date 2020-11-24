package GroupProjects.Project2.Task2;

public abstract class Marks {
    double math;
    double history;
    double java;
    public Marks(double math, double history, double java) {
        this.math = math;
        this.history = history;
        this.java = java;
    }
    abstract double percentage();
}