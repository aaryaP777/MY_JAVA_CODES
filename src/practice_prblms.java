import java.util.Scanner;
public class practice_prblms {
    public static void main(String[] args) {
//        // Star pattern
//        int n, i, j;
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter number of rows: ");
//        n = sc.nextInt();
//        for(i = 0; i < n; i--){
//            for(j = 0; j < i+1; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        // Sum of first n even numbers
//        int sum = 0;
//        Scanner sc1 = new Scanner(System.in);
//        System.out.print("Enter value of 'n' : ");
//        int n = sc1.nextInt();
//        for(int i = 0; i < n; i++){
//            sum += (2*i);
//        }
//        System.out.printf("The sum of first %d even numbers is: %d", n,sum);

        // Multiplication table of a given number in reverse

        Scanner sc2 = new Scanner(System.in);
        System.out.print("Enter value of 'n' : ");
        int n = sc2.nextInt();
        for(int i = 10; i >0; i--){
            System.out.println(i*n);
        }
    }
}
