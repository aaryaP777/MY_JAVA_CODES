import java.util.Scanner;

interface Draws{
    int area1();
    int volume1();
}

class Square1 implements Draws{
    int side;
    @Override
    public int area1() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side: ");
        side = sc.nextInt();
        return side*side;
    }
    @Override
    public int volume1() {
        return 0;
    }
}
class Rectangle1 implements Draws{
    int l,b;
    @Override
    public int area1() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        l = sc.nextInt();
        System.out.print("Enter breadth: ");
        b = sc.nextInt();
        return l*b;
    }
    @Override
    public int volume1() {
        return 0;
    }

}
class Cube1 implements Draws{
    int side;
    @Override
    public int area1() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side: ");
        side = sc.nextInt();
        return 6*side*side;
    }
    @Override
    public int volume1() {
        return side*side*side;
    }

}
public class Interface_exmple {
    public static void main(String[] args) {
        System.out.println("--------- Square --------");
        Square1 sq = new Square1();
        System.out.println("Area of Square: " + sq.area1());
        System.out.println("Volume of Square: " + sq.volume1());
        System.out.println("------- Rectangle -------");
        Rectangle1 rec = new Rectangle1();
        System.out.println("Area of Rectangle: " + rec.area1());
        System.out.println("Volume of Rectangle: " + rec.volume1());
        System.out.println("---------- Cube ---------");
        Cube1 cb = new Cube1();
        System.out.println("Area of Cube: " + cb.area1());
        System.out.println("Volume of Cube: " + cb.volume1());
    }
}
