// USED IN MULTI-THREADING

import java.util.ArrayList;
public class Arraylist {
    public static void main(String[] args) {
        ArrayList<String> listOfWords = new ArrayList<String>();

        listOfWords.add("hello");
        listOfWords.add("hello");
        listOfWords.add("hello");
        listOfWords.add("mic");
        listOfWords.add("check..");

        listOfWords.add(2,",");
        System.out.println(listOfWords.get(2));
        //listOfWords.remove(2);

        for(String word: listOfWords){
            System.out.print(" " + word);
        }
    }
}
