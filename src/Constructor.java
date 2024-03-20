class Parent {
    int parentVar;

    // Default constructor
    Parent() {
        parentVar = 0;
        System.out.println("Parent Default Constructor Called");
    }

    // Parameterized constructor
    Parent(int var) {
        parentVar = var;
        System.out.println("Parent Parameterized Constructor Called");
    }
}

class Child extends Parent {
    int childVar;

    // Default constructor
    Child() {
        // Call the default constructor of the parent class using super()
        super();
        childVar = 0;
        System.out.println("Child Default Constructor Called");
    }

    // Parameterized constructor
    Child(int var1, int var2) {
        // Call the parameterized constructor of the parent class using super()
        super(var1);
        childVar = var2;
        System.out.println("Child Parameterized Constructor Called");
    }
}

public class Constructor {
    public static void main(String[] args) {
        // Creating objects of Child class
        Child obj1 = new Child(); // Calls default constructors of both Parent and Child
        Child obj2 = new Child(10, 20); // Calls parameterized constructors of both Parent and Child
    }
}

