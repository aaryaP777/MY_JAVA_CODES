class Calc {
    public int op1, op2;
    public int getOp1() {
        return op1;
    }
    public int getOp2() {
        return op2;
    }
    public void setOp1(int op1) {
        this.op1 = op1;
    }
    public void setOp2(int op2) {
        this.op2 = op2;
    }
    public void add (int x, int y){
        int sum = x + y;
        System.out.printf("Sum is : " + sum);
    }
    public void sub (int x, int y){
        int diff = x - y;
        System.out.printf("Difference is : " + diff);
    }
    public void mul (int x, int y){
        int prdt = x * y;
        System.out.printf("Product is : " + prdt);
    }
    public void div (int x, int y){
        float quo = x / y;
        System.out.printf("Division is : " + quo);
    }
}
public class calculater {
    public static void main(String[] args) {
        Calc c = new Calc();
        c.setOp1(1);
        c.setOp2(2);
        c.add(c.getOp1(), c.getOp2());
        System.out.println();
        c.sub(c.getOp1(), c.getOp2());
        System.out.println();
        c.mul(c.getOp1(), c.getOp2());
        System.out.println();
        c.div(c.getOp1(), c.getOp2());
    }
}
