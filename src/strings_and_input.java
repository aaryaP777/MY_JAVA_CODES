import java.util.Scanner;
public class strings_and_input {
    public static void main(String[] args) {
        // methods to print ONLY STRING
        String name1 = new String("Hello world"); // 1st method to input string
        System.out.println(name1); // gives space after printing string

        String name2 = "Hello Java"; // 2nd method to input string
        System.out.print(name2); // no space after printing the string

        // methods to print NUMBERS / CHARACTERS
        int a = 1, c = 3;
        float b = 2.33f;
        float d = 3.45f;
        System.out.printf("\nvalue of a is %d and b is %f", a, b);
        System.out.format("\nvalue of c is %d and d is %f", c, d);

        //methods to read USER INPUT STRINGS
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter string 1: ");
        String str1 = sc.next();
        System.out.println(str1);

        System.out.print("\nEnter string 2: ");
        String str2 = sc.nextLine();
        System.out.println(str2);






    }
}
