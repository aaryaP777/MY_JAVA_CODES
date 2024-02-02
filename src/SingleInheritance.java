class Parent {
    int a = 20;
    void displayParent() {
        System.out.println("Parent A = " + a);
    }
}
class Child extends Parent{
    int b = 10;
    void displayChild() {
        System.out.println("Parent A = " + a);
        System.out.println("Child B = " + b);
    }
}
public class SingleInheritance {
    public static void main(String[] args) {
        Child child1 = new Child();
        child1.displayParent();
        child1.displayChild();
    }
}
