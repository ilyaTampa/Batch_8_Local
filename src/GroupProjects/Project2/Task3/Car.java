package GroupProjects.Project2.Task3;

public class Car {
    double carPrice;
    String carColor;
    Car (String carColor, double carPrice) {
        this.carColor = carColor;
        this.carPrice = carPrice;
    }

    double calculateSalePrice () {
        return carPrice;
    }
}
