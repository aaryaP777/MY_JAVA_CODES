class box{
    int boxID;
    public void setBoxID(int boxID) {
        this.boxID = boxID;
    }
}
class boxWeight extends box{
    double weight;
    public void setWeight(double weight) {
        this.weight = weight;
    }
    void displayWeight() {
        System.out.println("Box ID: " + boxID);
        System.out.println("Weight in kg: " + weight);
    }
}
class ShipmentCost extends boxWeight {
    int cost;
    public void setCost(int cost) {
        this.cost = cost;
    }
    void displayDetails() {
        System.out.println("Box ID: " + boxID);
        System.out.println("Weight in kg: " + weight);
        System.out.println("Cost is: " + cost);
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        ShipmentCost sc = new ShipmentCost();
        sc.setBoxID (2345);
        sc.setWeight(56.7);
        sc.setCost(2300);
        sc.displayDetails();


    }
}
