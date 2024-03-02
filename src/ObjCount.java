public class ObjCount {
    public static int count = 0;
    public ObjCount(){
        count++;
    }
    public static int getCount(){
        return count;
    }
    public static void main(String[] args) {
        ObjCount oc1 = new ObjCount();
        ObjCount oc2 = new ObjCount();
        ObjCount oc3 = new ObjCount();
        ObjCount oc4 = new ObjCount();
        System.out.println("Number of objects is: " + ObjCount.getCount());
    }
}
