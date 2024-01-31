import java.util.Scanner;

public class Loops_java {
    public static void main(String[] args){
        // WHILE LOOP
        int i = 0;
        while(i < 5){
            System.out.println(i);
            i++;
        }

        // DO-WHILE LOOP to print first 'n' natural numbers.
        int n;
        Scanner num = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        n = num.nextInt();
        System.out.printf("The first %d natural numbers are:\n", n);
        int a = 1;
        do{
            System.out.println(a);
            a++;
        }while(a <= n);

        // FOR LOOP to print first 'n' natural numbers in reverse order.
        int j, m;
        System.out.print("Enter a natural number: ");
        m = num.nextInt();
        System.out.printf("The first %d natural numbers in reverse order are:\n", m);
        for(j = m; j > 0; j--){
            System.out.println(j);
        }
    }
}
