import java.util.Scanner;

// program to find if a given number is palindrome
public class PalindromeCheck {
    public void Palindrome (int num){
        int ogNum = num;
        int count = 0;
        while(num > 0){
            int a = num%10;
            count = count*10 + a;
            num = num/10;
        }
        if(ogNum == count){
            System.out.println("Number is Palindrome");
        }
        else{
            System.out.println("Number is not Palindrome");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        PalindromeCheck p = new PalindromeCheck();
        p.Palindrome(n);
    }
}
