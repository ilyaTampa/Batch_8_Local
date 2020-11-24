package ReplTasks;
public class Repl087 {

    String color;
    String make;
    int year;

    public static void main(String[] args) {

        Repl087 car1 = new Repl087();
        Repl087 car2 = new Repl087();

        car1.color = "Black";
        car1.year = 2019;
        car1.make ="BMW";

        car2.color = "White";
        car2.year = 2018;
        car2.make ="Toyota";

        System.out.println("Car color is "+car1.color+" and car year is "+car1.year+" and car model is "+car1.make);
        System.out.println("Car color is "+car2.color+" and car year is "+car2.year+" and car model is "+car2.make);

    }
}