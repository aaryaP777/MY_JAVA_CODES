public class cat {
    int age;
    public cat(){
        System.out.println("This is Default constructor");
        System.out.print("Default age is: ");
    }
    public cat(int age){
        System.out.println("This is Parametrized constructor");
        System.out.print("Actual age is: ");
        this.age = age;
    }
    public static void main(String[] args) {
        cat cat1 = new cat();
        System.out.println(cat1.age);

        cat cat2 = new cat(20);
        System.out.println(cat2.age);
    }
}
