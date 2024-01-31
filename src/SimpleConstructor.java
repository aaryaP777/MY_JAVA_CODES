public class SimpleConstructor {
    int a;

    public SimpleConstructor(int a) {                             // parametrized constructor
        System.out.println("Parametrized constructor called");
        this.a = a;
    }

    public SimpleConstructor() {                                 // default constructor
        System.out.println("Default constructor is called");
        a = 10;

    }
    public static void main(String[] args) {
        SimpleConstructor simpleconstructor = new SimpleConstructor(); //call default const.
        System.out.println(simpleconstructor.a);

        SimpleConstructor SimpleConstructor = new SimpleConstructor(50); //call parametrized cont.
        System.out.println(SimpleConstructor.a);
    }
}
