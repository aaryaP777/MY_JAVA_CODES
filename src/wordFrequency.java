import java.util.Scanner;

public class wordFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        System.out.print("Enter a word: ");
        String w = sc.nextLine();

        int count=0;
        // new array of string datatype
        String[] wordArr = s.split("\\s+");
        for(int i=0; i< wordArr.length; i++){
            if(wordArr[i].equals(w)){
                count++;
            }
        }
        int finalCount = count;
        System.out.println("Word '"+w+"' appeared "+finalCount+" number of times ");
    }
}
