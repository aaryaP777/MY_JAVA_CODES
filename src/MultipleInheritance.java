class Member{
    private String Name;
    private int age;
    private int phone_no;
    private String address;
    private int salary;

    public String getName() {
        return Name;
    }
    public int getAge() {
        return age;
    }
    public int getphone_no() {
        return phone_no;
    }
    public String getAddress() {
        return address;
    }
    public int getSalary() {
        return salary;
    }
    public Member(String Name, int age, String address, int phone_no, int salary ){
        this.Name = Name;
        this.age = age;
        this.address = address;
        this.salary = salary;
        this.phone_no = phone_no;
    }
    public void printSalary(){
        System.out.println("Salary of "+ Name + " is "+ salary + " $");
    }
}
class Employee extends Member{
    private String specialization;
    public String getSpecialization() {
        return specialization;
    }
    public Employee(String Name, int age, String address, int phone_no, int salary, String specialization){
        super(Name, age, address, phone_no, salary);
        this.specialization = specialization;
    }
}
class Manager extends Member{
    private String department;

    public String getDepartment() {
        return department;
    }

    public Manager(String Name, int age, String address, int phone_no, int salary, String department){
        super(Name, age, address, phone_no, salary);
        this.department = department;
    }
}
public class MultipleInheritance{
    public static void main(String[] args) {
        Employee emp = new Employee("James", 23, "XYZ", 123455, 25000, "CSE");
        System.out.println("Employee Details:");
        System.out.println("Name: " + emp.getName());
        System.out.println("Age: " + emp.getAge());
        System.out.println("Phone Number: " + emp.getphone_no());
        System.out.println("Address: " + emp.getAddress());
        emp.printSalary();
        System.out.println("Specialization: " + emp.getSpecialization());
        System.out.println();

        Manager m1 = new Manager("Tony", 34, "ABC", 876543, 34000, "AIML");
        System.out.println("Name: " + m1.getName());
        System.out.println("Age: " + m1.getAge());
        System.out.println("Phone Number: " + m1.getphone_no());
        System.out.println("Address: " + m1.getAddress());
        m1.printSalary();
        System.out.println("Department: " + m1.getDepartment());

    }
}
