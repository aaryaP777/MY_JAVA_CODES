public class WrapperExample01 {
    public static void main(String[] args) {

       int a = 20;

       Integer w1 = Integer.valueOf(a);
       System.out.println("w1 without autoboxing: " + w1);

       // Auto Boxing
       System.out.println("This is autoboxing");
       Integer w2 = a;
       System.out.println("w2 with autoboxing: " + w2);

       Integer b1 = 50;
       int a1 = b1.intValue();
       int a2 = b1;
       float a3 = b1;
       long a4 = b1;
       double a5 = b1;

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a4);
        System.out.println(a5);

        // auto boxing is used implicitly in 'System.out.println()'

    }
}
