public class Staticexample {
    public static void main(String[] args) {
        System.out.println("We are in the main block...");
    }
    static {
        System.out.println("We are in the static block....");
        System.out.println("It will always get executed first always...");
        System.out.println();
    }
}
