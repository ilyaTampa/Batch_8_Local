package GroupProjects.Project2.Task1;

public class Square implements Shape {
    @Override
    public void calculateArea(double length) {
        System.out.println("The area of a square is " + (length*length));
    }

    @Override
    public void calculatePerimeter(double length) {
        System.out.println("The perimeter of a square is " + (4*length));
    }
}