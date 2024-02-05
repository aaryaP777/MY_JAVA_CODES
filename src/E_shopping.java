class e_shop {
    private String c_name;
    private int c_ID, quantity, cost;

    public e_shop(String c_name, int c_ID, int quantity, int cost) {
        this.c_name = c_name;
        this.c_ID = c_ID;
        this.cost = cost;
        this.quantity = quantity;
    }
    public void display() {
        System.out.println("Customer name: " + c_name);
        System.out.println("Customer ID: " + c_ID);
        System.out.println("Quantity: " + cost);
        System.out.println("Total cost: " + quantity);
    }
}
public class E_shopping {
    public static void main(String[] args) {
        e_shop cus1 = new e_shop("Jake", 104, 10, 50);
        cus1.display();
    }
}
