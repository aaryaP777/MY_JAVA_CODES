import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class DBMSD {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java1", "root", "root@123");
            System.out.println("Connection established");

            Statement smt = conn.createStatement();
            ResultSet rs = smt.executeQuery("SELECT * FROM login");

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter username: ");
            String username = scanner.nextLine();
            System.out.print("Enter password: ");
            String pass = scanner.nextLine();

            boolean login = false;

            while (rs.next()) {
                String dbUsername = rs.getString("uname");
                String dbPassword = rs.getString("pass");

                if (username.equals(dbUsername) && pass.equals(dbPassword)) {
                    login = true;
                    break;
                }
            }

            if (login) {
                System.out.println("Login successful!");
            }
            else {
                System.out.println("Invalid username or password. Please try again.");
            }
            conn.close();
        }
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
