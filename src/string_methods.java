public class string_methods {
    public static void main(String[] args){
        String s1 = "WorLd";

        System.out.println(s1); //print og string

        int v = s1.length();
        System.out.println(v); // print string length

        System.out.println(s1.toLowerCase()); // print string in lowercase

        String s = s1.toUpperCase();
        System.out.println(s); // print string in uppercase

        // print substring starting from 2nd index
        System.out.println(s1.substring(2));

        // print substring starting from 1 and going upto 3.
        System.out.println(s1.substring(1,4));

        //print substring replacing the characters
        System.out.println(s1.replace('o', 'u'));
        System.out.println(s1.replace("Ld", "St"));




    }
}
