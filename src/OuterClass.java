public class OuterClass {
    private int OuterVariable = 10;
    public int getOuterVariable() {
        return OuterVariable;
    }
    class Inner1 {
        public void displayOuterVariable() {
            System.out.println("Inner class method");
            System.out.println("Value of outer class variable is: " + OuterVariable);
        }
    }

    public static void main(String[] args) {
        OuterClass o1 = new OuterClass();
        System.out.println("Outer class method");
        System.out.println("Value of outer class variable is: " + o1.getOuterVariable());
        System.out.println();

        OuterClass.Inner1 i1 = o1.new Inner1();
        i1.displayOuterVariable();
    }
}
