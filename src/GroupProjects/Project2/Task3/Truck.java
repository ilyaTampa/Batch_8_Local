package GroupProjects.Project2.Task3;

public class Truck extends Car {
    double weight;

    Truck(String carColor, double carPrice, double weight) {
        super(carColor, carPrice);
        this.weight = weight;
    }
    double calculateSalePrice () {
        if (weight>2000) {
            carPrice-=carPrice*0.1;
        } else {
            carPrice-=carPrice*0.2;
        }
        return carPrice;
    }
}