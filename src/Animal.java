public class Animal {
    private int age;
    private String name;
    public Animal(int age){
        this.age = age;
    }
    public Animal(int age, String name){
        this(age);
        this.name = name;
    }
    public Animal(String name){
        this.name = name;
    }
    void display(){
        System.out.println("Age: " + age);
        System.out.println("Name: " + name);
    }
    void Display(){
        this.display();
    }
    public class InnerAnimal{
        public void innerDisplay(){
            System.out.println("Inner Age: " + age);
            System.out.println("Inner Name: " + name);
        }
        public static void main(String[] args) {
            Animal a1 = new Animal(10, "Tommy");
            a1.Display();
            Animal.InnerAnimal innerA1 = a1.new InnerAnimal();
            innerA1.innerDisplay();
            Animal a2 = new Animal("Cookie");
            a2.display();
            Animal a3 = new Animal(13, "Sammy");
            a3.display();
            Animal a4 = new Animal(12);
            a3.Display();
        }
    }
}
