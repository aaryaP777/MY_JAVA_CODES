class University {
    String location;
    public University() {
        System.out.println("Default constructor of University");
    }
    public University(String location) {
        this.location = location;
    }
    void displayUni() {
        System.out.println("University Location is: " + this.location);
    }
}
class department extends University {
    String DeptName;
    String location;
    public department() {
        //calling no args constructor of parent class
        super();
        // calling parameterized constructor of parent class
        System.out.println("Default constructor of Department");
    }
    public department(String DeptName) {
        this.DeptName = DeptName;
    }
    public department(String DeptName, String deptlocation) {
        this(DeptName);
        location = deptlocation;
    }
    public department(String DeptName, String deptlocation, String UniName) {
        this(DeptName, deptlocation);
        super.location = UniName;
    }

}
public class useOfSuperkeyword {

}
