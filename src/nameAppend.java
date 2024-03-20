import java.util.Scanner;
public class nameAppend {
    public void appendMiddleName(String fName, String mName, String lName){
        System.out.println("Full name: " + " " + fName + " " + mName + " " + lName);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String firstname = sc.nextLine();

        System.out.print("Enter your last name: ");
        String lastname = sc.nextLine();

        System.out.println("Name: "+ firstname + " " + lastname);

        nameAppend n1 = new nameAppend();
        n1.appendMiddleName(firstname, "Yogesh", lastname);

        System.out.println();

        System.out.print("Enter your PRN: ");
        String prn = sc.nextLine();
        String newPRN = "CS" + prn.substring(8);
        System.out.println("New PRN: " + newPRN);

    }
}
