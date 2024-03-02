import java.util.Scanner;
public class newWrapper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an Integer: ");
        int a = sc.nextInt();
        System.out.print("Enter a Character: ");
        char b = sc.next().charAt(0); //to get first character of the string
        System.out.print("Enter a Float number: ");
        double c = sc.nextDouble();

        Integer newInt = a;   //autoboxing
        Character newChar = b;
        Double newDouble = c;

        System.out.println("This is wrapper class and autoboxing method");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
