public class LocalInnercl {
    void outermethod01(){
        final int outerfinalvarib = 10;
        class LocalInner{
            void display(){
                System.out.println("Local inner class method");
                System.out.println("Outer variable: " + outerfinalvarib);
            }
        }
        LocalInner localinner = new LocalInner();
        localinner.display();
    }
    public static void main(String[] args) {
        LocalInnercl innercl = new LocalInnercl();

    }

}
