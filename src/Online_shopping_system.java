class Product{
    public String name;
    public int ID;
    public int cost;

    public void displayProduct(){
        System.out.println("-----------THE PRODUCT IS-----------");
    }
}

class Electronics extends Product{
    String type;
    public Electronics(String name, int ID, int cost, String type){
        this.name = name;
        this.ID = ID;
        this.cost = cost;
        this.type = type;
    }
    void displayP1(){
        System.out.println("Name of E-device is: " + name);
        System.out.println("ID of E-device is: " + ID);
        System.out.println("Type of E-device is: " + type);
        System.out.println("Cost of E-device is: " + cost + "Rs.");
        System.out.println();
    }
}
class Clothing extends Product{
    String size;
    public Clothing(String name, int ID, int cost,String size){
        this.name = name;
        this.ID = ID;
        this.cost = cost;
        this.size = size;
    }
    void displayP2(){
        System.out.println("Name of Clothing Brand is: " + name);
        System.out.println("ID of shirt is: " + ID);
        System.out.println("Size of shirt is: " + size);
        System.out.println("Cost of shirt is: " + cost + "Rs.");
        System.out.println();
    }
}
class Books extends Product{
    String Author;
    public Books(String name, int ID, int cost,String Author){
        this.name = name;
        this.ID = ID;
        this.cost = cost;
        this.Author = Author;
    }
    void displayP3(){
        System.out.println("Name of The Book is: " + name);
        System.out.println("ID of the Book is: " + ID);
        System.out.println("Author of the Book is: " + Author);
        System.out.println("Cost of book is: " + cost + "Rs.");
        System.out.println();
    }
}
public class Online_shopping_system{
    public static void main(String[] args) {
        System.out.println("ONLINE SHOPPING CART");
        Electronics e1 = new Electronics("Trimmer", 123, 23000, "bathroom appliance");
        e1.displayProduct();
        e1.displayP1();

        Clothing c1 = new Clothing("Peter England", 124, 1200, "M");
        c1.displayProduct();
        c1.displayP2();

        Books b1 = new Books("Harry Potter", 125, 800, "JK Rowling");
        b1.displayProduct();
        b1.displayP3();
    }
}
