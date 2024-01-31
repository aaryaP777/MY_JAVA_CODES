class Static_demon {
    static int count = 0;
    int a = 10;
    public Static_demon(int a) {
        System.out.println("new object created");
        this.a = a;
        count ++;
    }
    static int returnCount() {
        return count;
    }
}
public class static_demo {
    public static void main(String[] args) {
        Static_demon s1 = new Static_demon(10);
        System.out.println(Static_demon.returnCount());

        Static_demon s2 = new Static_demon(15);
        System.out.println(Static_demon.returnCount());

        Static_demon s3 = new Static_demon(20);
        System.out.println(Static_demon.returnCount());

        Static_demon s4 = new Static_demon(25);
        System.out.println(Static_demon.returnCount());
    }

}
