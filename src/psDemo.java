import java.sql.*;
import java.io.*;
class psDemo{
    public static void main(String args[])throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java1", "root", "root@123");

        PreparedStatement ps=con.prepareStatement("insert into login values(?,?,?)");

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        do{
            System.out.println("enter id:");
            int id=Integer.parseInt(br.readLine());
            System.out.println("enter name:");
            String name=br.readLine();
            System.out.println("enter salary:");
            float salary=Float.parseFloat(br.readLine());

            ps.setInt(1,id);
            ps.setString(2,name);
            ps.setFloat(3,salary);
            int i=ps.executeUpdate();
            System.out.println(i+" records affected");

            System.out.println("Do you want to continue: y/n");
            String s=br.readLine();
            if(s.startsWith("n")){
                break;
            }
        }while(true);

        con.close();
    }}
