import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class LoginDemo {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java1","root","root@123");
            if(conn != null){
                System.out.println("Connection Established");
                System.out.println();
            }

            Statement smt = conn.createStatement();
            ResultSet rs = smt.executeQuery("select * from login");
            while (rs.next()) {
                System.out.println(rs.getString(1)+ "\t\t"+ rs.getString(2));
            }
        }
        catch(Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
