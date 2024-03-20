public class overRide {
    private int id;
    private String name;

    public overRide(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Overriding toString() method
    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name;
    }

    public static void main(String[] args) {
        overRide obj = new overRide(10, "James");
        System.out.println(obj); // This will print the overridden toString() method

        overRide obj2 = new overRide(11, "Timon");
        System.out.println(obj2);
    }
}

