import java.util.Arrays;
import java.util.Scanner;
public class CountLetters {
    public static void main(String[] args) {
        int count=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        // new array of string datatype
        String[] wordArr = s.split("\\s+");
        for(int i=0; i< wordArr.length; i++){
            if(wordArr[i]!=" "){
                count++;
                wordArr[i] = wordArr[i].toUpperCase();
            }
        }
        System.out.println("Total words are: " + count);
        System.out.print("String in UPPER case: ");
        System.out.println(String.join(" ", wordArr));
    }
}
