class Bank1 {
    private String name;
    private int id;
    private int current_balance;
    private String transaction;

    public Bank1(String name, int id, int current_balance, String transaction) {
        this.name = name;
        this.id = id;
        this.current_balance = current_balance;
        this.transaction = transaction;
    }

    public void display() {
        System.out.println("Customer name is: " + name);
        System.out.println("Customer ID is: " + id);
        System.out.println("Customer current balance is: " + current_balance);
        System.out.println("Transaction: " + transaction);
        System.out.println();
    }

}
public class bank {
    public static void main(String[] args) {
        Bank1 c1 = new Bank1("Tony", 2340, 10000, "None");
        c1.display();

        Bank1 c2 = new Bank1("Tina", 2341, 20000, "Yes");
        c2.display();
    }
}
