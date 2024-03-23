package package2;

public class Employee {
    String name;
    String address;
    int emp_id;
    public Employee(String name, String address, int emp_id){
        this.name = name;
        this.address = address;
        this.emp_id = emp_id;
    }
    public void displayE(){
        System.out.println("Employee name: " + name);
        System.out.println("Employee address: " + address);
        System.out.println("Employee PRN: " + emp_id);
    }
}
