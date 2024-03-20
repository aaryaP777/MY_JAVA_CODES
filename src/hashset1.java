import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
public class hashset1 {
    public static void main(String[] args) {
        HashSet<String> stringStore = new HashSet<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();

        Set<Character> uniqueCharacters = new HashSet<>();
        for (char ch : s.toCharArray()) {
            uniqueCharacters.add(ch);
        }
        System.out.println("Unique characters in the string:");
        for (char ch : uniqueCharacters) {
            System.out.print(ch + " ");
        }


//        stringStore.add(s);
//        System.out.println(stringStore);

//        System.out.println("Elements in the HashSet:");
//        Iterator<Character> iterator = stringStore.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
    }
}
