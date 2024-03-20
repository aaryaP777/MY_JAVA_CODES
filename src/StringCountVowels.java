import java.util.Locale;
import java.util.Scanner;

public class StringCountVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        s = s.toLowerCase(Locale.ROOT);
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count += 1;
            }
        }
        System.out.println("Number of vowels is: " + count);
    }
}
