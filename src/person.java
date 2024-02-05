public class person {
    private int age;
    private String name, nickname;
    private int height;
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getNickname() {
        return nickname;
    }
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public void display() {
        System.out.println("Name is: " + name);
        System.out.println("also known as: " + nickname);
        System.out.println("Height is: " + height);
        System.out.println("Age is: " + age);
    }
    public static void main(String[] args) {
        person p1 = new person();
        p1.setAge(45);
        p1.setName("john");
        p1.setNickname("johny");
        p1.setHeight(170);
        p1.display();
    }
}
