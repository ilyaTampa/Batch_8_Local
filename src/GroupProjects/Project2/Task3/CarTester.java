package GroupProjects.Project2.Task3;

public class CarTester {
    public static void main(String[] args) {
        Sedan sedan = new Sedan("white", 35000, 30);
        System.out.println(sedan.calculateSalePrice());

        Truck truck = new Truck("black", 45000, 4700);
        System.out.println(truck.calculateSalePrice());
    }
}
