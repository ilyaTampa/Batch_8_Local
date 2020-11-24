package GroupProjects.Project2.Task3;

public class Sedan extends Car {

    double length;
    Sedan(String carColor, double carPrice, double length) {
        super(carColor, carPrice);
        this.length = length;
    }
    double calculateSalePrice () {
        if (length>20) {
            carPrice-= carPrice*0.05;
        } else {
            carPrice-= carPrice*0.1;
        }
        return carPrice;
    }
}