import java.util.Scanner;
public class BankAccount {
    static private int TotalAccounts = 0;
    private int AccountNumber;
    private int Balance;
    private String Name;
    private String Branch;
    public static int getTotalAccounts() {
        return TotalAccounts;
    }
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public String getBranch() {
        return Branch;
    }
    public void setBranch(String branch) {
        Branch = branch;
    }
    public int getBalance() {
        return Balance;
    }
    public void setBalance(int balance) {
        Balance = balance;
    }
    public int getAccountNumber() {
        return AccountNumber;
    }
    public void setAccountNumber(int accountNumber) {
        AccountNumber = accountNumber;
    }
    public void depositMoney() {
        System.out.println();
        System.out.println("To Deposit Money");
        System.out.printf("Current Balance: " + Balance);
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount to deposit:  ");
        int damnt = sc.nextInt();
        Balance = Balance + damnt;
        System.out.printf("Current Balance after depositing amount: " + Balance);
        System.out.println();
    }
    public void withdrawMoney() {
        System.out.println();
        System.out.println("To Withdraw Money");
        System.out.printf("Current Balance: " + Balance);
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount to withdraw:  ");
        int wamnt = sc.nextInt();
        Balance = Balance - wamnt;
        System.out.printf("Current Balance after withdrawing amount: " + Balance);
        System.out.println();
    }
    public void DisplayInfo() {
        System.out.println();
        System.out.println("Account holder name is: " + Name);
        System.out.println("Account number is: " + AccountNumber);
        System.out.println("Current Balance is: " + Balance);
        System.out.println("Branch is: " + Branch);
        System.out.println();
    }
    public BankAccount () {
        TotalAccounts++;
    }
    public static void main(String[] args) {
        BankAccount ba1 = new BankAccount();
        ba1.setName("Adyasha");
        ba1.setAccountNumber(1);
        ba1.setBalance(1000);
        ba1.setBranch("Los Angeles");
        ba1.DisplayInfo();
        ba1.depositMoney();
        ba1.withdrawMoney();

        BankAccount ba2 = new BankAccount();
        ba2.setName("Aarya");
        ba2.setAccountNumber(2);
        ba2.setBalance(1000);
        ba2.setBranch("Los Angeles");
        ba2.DisplayInfo();

        System.out.println("Total number of accounts is: " + BankAccount.getTotalAccounts());

    }

}

