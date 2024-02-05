class Animal {
    final int nooflegs; //value remains constant
    String color;
    String name;
    public Animal(String color, String name) {
        this.color = color;
        this.name = name;
        this.nooflegs = 4;
    }
    public Animal() {
        this.nooflegs = 4;
    }
    void displayAnimal() {
        System.out.println(name + "'s color is " + color + "and has" + nooflegs + "legs");
    }
}
class dog extends Animal {

}
public class useofFinalKeyword {
}
