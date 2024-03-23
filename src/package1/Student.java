package package1;

public class Student {
    String name;
    String address;
    int PRN;
    public Student(String name, String address, int PRN){
        this.name = name;
        this.address = address;
        this.PRN = PRN;
    }
    public void displayS(){
        System.out.println("Student name: " + name);
        System.out.println("Student address: " + address);
        System.out.println("Student PRN: " + PRN);
    }


}
