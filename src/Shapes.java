
import java.util.Scanner;
abstract class Diagram{
    abstract void input();
    abstract int area();
    abstract int volume();
}
class Square extends Diagram{
    int side;
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side: ");
        side = sc.nextInt();
    }
    @Override
    int area() {
        return side*side;
    }
    @Override
    int volume() {
        return 0;
    }
}
class Rectangle extends Diagram{
    int l,b;
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        l = sc.nextInt();
        System.out.print("Enter breadth: ");
        b = sc.nextInt();
    }
    @Override
    int area() {
        return l*b;
    }
    @Override
    int volume() {
        return 0;
    }
}
class Cube extends Diagram{
    int side;
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side: ");
        side = sc.nextInt();
    }
    @Override
    int area() {
        return 6*side*side;
    }
    @Override
    int volume() {
        return side*side*side;
    }
}

public class Shapes {
    public static void main(String[] args) {
        System.out.println("--------- Square --------");
        Square sq = new Square();
        sq.input();
        System.out.println("Area of Square: " + sq.area());
        System.out.println("------- Rectangle -------");
        Rectangle rec = new Rectangle();
        rec.input();
        System.out.println("Area of Rectangle: " + rec.area());
        System.out.println("---------- Cube ---------");
        Cube cb = new Cube();
        cb.input();
        System.out.println("Area of Cube: " + cb.area());
        System.out.println("Volume of Cube: " + cb.volume());
    }
}
