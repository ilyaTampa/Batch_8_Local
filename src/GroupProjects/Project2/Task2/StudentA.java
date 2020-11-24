package GroupProjects.Project2.Task2;

public class StudentA extends Marks {
    public StudentA(double math, double history, double java) {
        super(math, history, java);
    }
    double percentage() {
        return (history+math+java)/3;
    }
}