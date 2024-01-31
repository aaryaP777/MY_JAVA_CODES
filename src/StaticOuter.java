public class StaticOuter {
    private static  int outerStaticVarib = 5;
    private int outerInstanceVarib = 10;

    static class StaticNested {
        void display(){
            System.out.println("StaticNested class  method. Outer static variable: " + outerStaticVarib);
        }
    }
    void useStaticNestedClass(){
        StaticNested staticNestedObj = new StaticNested();
        staticNestedObj.display();
    }
    public static void main(String[] args) {
        StaticOuter outerObj = new StaticOuter();
        outerObj.useStaticNestedClass();
        StaticOuter.StaticNested staticNested = new StaticOuter.StaticNested();
        staticNested.display();
    }



}
