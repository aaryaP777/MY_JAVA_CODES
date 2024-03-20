import java.util.Scanner;
public class StringWordOcc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        System.out.print("Enter the word: ");
        String word = sc.next();

        String a[] = s.split(" ");
        int count = 0;
        for(int i = 0; i<s.length(); i++){
            if(word.equals(a[i])){
                count++;
            }
        }
        System.out.println("Occurance: " + count);
    }
}
