public class SwapbyValue {
    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        System.out.println("Before swapping: num1 = " + num1 + ", num2 = " + num2);
        swap(num1, num2);
        System.out.println("After swapping: num1 = " + num1 + ", num2 = " + num2);
    }
}

