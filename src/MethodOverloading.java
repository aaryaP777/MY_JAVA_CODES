public class MethodOverloading {
    int add(int a, int b) {
        return a  + b;
    }
    float add(float a, float b) {
        return a  + b;
    }
    String add(String a, String b) {
        return a  + b;
    }
    String add(int a, String b) {
        return a  + b;
    }
    String add(String b, int a) {
        return b + a;
    }
    String add(String a, String b, String c) {
        return a  + b + c;
    }

    public static void main(String[] args) {
        MethodOverloading Mo = new MethodOverloading();
        System.out.println(Mo.add(1,2));
        System.out.println(Mo.add(1.2f, 2.4f));
        System.out.println(Mo.add("Hello", "world"));
        System.out.println(Mo.add(1," Direction"));
        System.out.println(Mo.add("Ra-",1));
        System.out.println(Mo.add("HI"," Hello", " Namaste"));

    }
}
