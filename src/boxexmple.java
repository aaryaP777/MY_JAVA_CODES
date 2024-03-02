import java.util.Scanner;
class Box {
    private int height;
    private int length;
    private int width;

    public void displayValues(int height, int length, int width){
        System.out.println("Height in cm is: " + height);
        System.out.println("Length in cm is: " + length);
        System.out.println("Width in cm is: " + width);
    }
    public void displayVolume(int height, int length, int width){
        int volume = height*length*width;
        System.out.println("Volume of the box is: " + volume);
    }
}
public class boxexmple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter height: ");
        int h = sc.nextInt();
        System.out.print("Enter length: ");
        int l = sc.nextInt();
        System.out.print("Enter width: ");
        int w = sc.nextInt();

        Box box1 = new Box();
        box1.displayValues(h, l, w);
        System.out.println();
        box1.displayVolume(h, l, w);
    }
}
