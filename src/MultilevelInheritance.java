class Vehicle {
    int ManufacYear;
    void displayVehicle() {
        System.out.println("Manufacturing year: " + ManufacYear);
    }
}
class Car extends Vehicle {
    int NoOfDoors;
    String color;
    void displayCar() {
        System.out.println("Manufacturing year: " + ManufacYear);
        System.out.println("No. of Doors: " + NoOfDoors);
        System.out.println("Colour is: " + color);
    }
}
class SportsCar extends Car {
    boolean IsConvertible;
    void displaySportsCar() {
        System.out.println("Manufacturing year: " + ManufacYear);
        System.out.println("No. of Doors: " + NoOfDoors);
        System.out.println("Colour is: " + color);
        System.out.println("Convertible: " + IsConvertible);
    }
}
public class MultilevelInheritance {
    public static void main(String[] args) {
        SportsCar sc1 = new SportsCar();
        sc1.ManufacYear = 2011;
        sc1.NoOfDoors = 4;
        sc1.color = "Red";
        sc1.IsConvertible = true;
        sc1.displaySportsCar();
    }
}
