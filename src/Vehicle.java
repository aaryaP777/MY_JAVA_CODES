public class Vehicle {
    private String type;
    private int modelNumber;
    private String model;
    private int manufactureYear;

    public Vehicle (String type, String model, int modelNumber, int manufactureYear){
        this.type = type;
        this.model = model;
        this.modelNumber = modelNumber;
        this.manufactureYear = manufactureYear;
    }
    public void display() {
        System.out.println("Type is: " + type);
        System.out.println("Model is: " + model);
        System.out.println("Model number: " + modelNumber);
        System.out.println("Year of Manufacture: " + manufactureYear);
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("2-wheeler", "Hero Pleasure", 1234, 2018);
        v1.display();
    }
}
