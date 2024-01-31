import com.sun.security.jgss.GSSUtil;

class Dog {
    private int age;
    private String name;
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void dogBarks() {
        System.out.println(this.name + " is barking");
    }

}
public class dogfunc {
    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.println("Before getter setter");
        System.out.println(dog.getName());
        System.out.println(dog.getAge());

        dog.setAge(2);
        dog.setName("Tommy");

        System.out.println("After getter-setter");
        System.out.println(dog.getName());
        System.out.println(dog.getAge());
        dog.dogBarks();


    }
}
