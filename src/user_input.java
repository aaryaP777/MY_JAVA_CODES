import java.util.Scanner;
public class user_input {
    public static void main(String[] args){

        System.out.println("Code to take input from user");
        System.out.println("\n1. Integer inputs: ");
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int a = scn.nextInt();
        System.out.print("Enter number 2: ");
        int b = scn.nextInt();
        int sum = a + b;
        System.out.print("The sum is: ");
        System.out.println(sum);

        System.out.println("\n2. Float inputs: ");
        System.out.print("Enter num 3: ");
        float c = scn.nextFloat();
        System.out.print("Enter num 4: ");
        float d = scn.nextFloat();
        float sum2 = c + d;
        System.out.print("The float sum is: ");
        System.out.println(sum2);
    }


}
