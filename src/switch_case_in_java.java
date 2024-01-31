import java.util.Scanner;

public class switch_case_in_java {

    public static void main(String[] args){
        int n1, n2, n3, op;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        n1 = sc.nextInt();
        System.out.print("Enter number 2: ");
        n2 = sc.nextInt();
        System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\nEnter choice: ");
        op = sc.nextInt();
        //enhanced switch method
        switch (op) {
            case 1 -> {
                n3 = n1 + n2;
                System.out.printf("Addition is: %d", n3); //case integer can be any integer
            }
            case 2 -> {
                n3 = n1 - n2;
                System.out.printf("Subtraction is: %d", n3);
            }
            case 3 -> {
                n3 = n1 * n2;
                System.out.printf("Product is: %d", n3);
            }
            case 4 -> {
                n3 = n1 / n2;
                System.out.printf("Division is: %d", n3);
            }
            default -> System.out.println("Invalid Entry!!");
        }

    }
}
