package GroupProjects.Project2.Task1;

public class Circle implements Shape {
    @Override
    public void calculateArea(double radius) {
        System.out.println("The Area of a circle is " + (Math.PI*radius*radius));
    }

    @Override
    public void calculatePerimeter(double radius) {
        System.out.println("The perimeter of a circle is " + (2*Math.PI*radius));
    }
}
