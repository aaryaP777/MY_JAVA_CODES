import java.util.Vector;

public class Vectorexample {
        public static void main(String[] args) {

            Vector<String> listOfWords = new Vector<>();

            listOfWords.add("hello");
            listOfWords.add("hello");
            listOfWords.add("hello");
            listOfWords.add("Kya bol reli");
            listOfWords.add("publiccc");

            Vector<Integer> intVector = new Vector<Integer>();

            intVector.add(10);
            intVector.add(20);
            intVector.add(30);
            intVector.add(40);
            intVector.add(50);

            for(int num: intVector){
                System.out.print(" " + num);
            }
        }
}

