abstract class Shape02 {
    static int NoOfShapes = 0;

    Shape02() {
        NoOfShapes++;
    }

    abstract void draw();

    static void displayTotalShapes() {
        System.out.println("Total number  of shapes: " + NoOfShapes);
    }

    void displayInfo() {
        System.out.println("This is a shape");
    }
}

class Circle extends Shape02{
    @Override
    void draw() {
        System.out.println("This is a drawing");
    }
}

class Square extends Shape02{
    @Override
    void draw() {
        System.out.println("This is a drawing");
    }
}

public class abstract_class01 {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.draw();
        c1.displayInfo();

        Shape02 square = new Square();
        square.draw();
        Circle circle = new Circle();
        circle.draw();

    }
}
