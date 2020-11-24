package GroupProjects.Project2.Task2;

public class StudentB extends Marks {
    double biology;
    public StudentB(double math, double history, double java, double biology) {
        super(math, history, java);
        this.biology = biology;
    }
    double percentage() {
        return (history+math+java+biology)/4;
    }
}