class dog1 {
    void bark(){
        System.out.println("Mama dog is barking");
    }
}
class Childdog1 extends dog1{
    void bark(){
        System.out.println("Child dog is barking");
    }
}
public class methodOverridding {
    public static void main(String[] args) {
        Childdog1 cd = new Childdog1();
        cd.bark();

        dog1 d1 = new dog1();
        d1.bark();

        dog1 d2 = new Childdog1();  //upcasting
        d2.bark();
    }

}
