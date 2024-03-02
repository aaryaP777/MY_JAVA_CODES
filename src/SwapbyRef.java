public class SwapbyRef {
    public static class IntWrapper {
        int value;

        public IntWrapper(int value) {
            this.value = value;
        }
    }

    public static void swap(IntWrapper a, IntWrapper b) {
        int temp = a.value;
        a.value = b.value;
        b.value = temp;
    }

    public static void main(String[] args) {
        IntWrapper num1 = new IntWrapper(10);
        IntWrapper num2 = new IntWrapper(20);
        System.out.println("Before swapping: num1 = " + num1.value + ", num2 = " + num2.value);
        swap(num1, num2);
        System.out.println("After swapping: num1 = " + num1.value + ", num2 = " + num2.value);
    }
}

