import java.util.Scanner;
public class compare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of V: ");
        float v = sc.nextInt();
        System.out.print("Enter value of U: ");
        float u = sc.nextInt();
        System.out.print("Enter value of a: ");
        float a = sc.nextInt();
        System.out.print("Enter value of s: ");
        float s = sc.nextInt();
        float result = (float)((v*v - u*u)/(2*a*s));
        System.out.println(result);

        /* int num = 100;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        System.out.print(a > num);
         */
    }

}
