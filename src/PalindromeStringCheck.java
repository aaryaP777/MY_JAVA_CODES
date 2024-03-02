import java.util.Scanner;
public class PalindromeStringCheck {
    public void Palindrome(String str){
        int flag = 0;
        int left = 0;
        int right = str.length() - 1;
        while(left < right){
            if(str.charAt(left) != str.charAt(right)){
                flag = 1;
            }
            else{
            }
            left ++;
            right--;
        }
        if(flag == 0){
            System.out.println("String is palindrome");
        }
        else{
            System.out.println("String not palindrome");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();
        PalindromeStringCheck p = new PalindromeStringCheck();
        p.Palindrome(s);
    }
}
