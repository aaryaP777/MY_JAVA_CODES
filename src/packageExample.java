import com.sun.security.jgss.GSSUtil;
import package1.Student;
import package2.Employee;
import java.util.Scanner;
public class packageExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student name: ");
        String sn = sc.next();
        System.out.print("Enter student Address: ");
        String sa = sc.next();
        System.out.print("Enter student PRN: ");
        int sp = sc.nextInt();
        Student stud = new Student(sn, sa, sp);
        stud.displayS();
        System.out.println();
        Employee emp = new Employee("Aarya", "xyz", 123);
        emp.displayE();
    }
}
