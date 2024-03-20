import java.util.*;
public class StringOps {
    // reverse a given string
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String rev = " ";
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        System.out.print("Reverse string is: ");
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);  // read character
            rev = ch + rev;
        }
        System.out.println(rev);


    }
}
