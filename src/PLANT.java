public class PLANT {
    private String type;
    private String  name;
    private float temperature;
    private int cost;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
    public void Display() {
        System.out.println("Plant name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Temperature: " + temperature);
        System.out.println("Cost: " + cost);
    }

    public static void main(String[] args) {
        PLANT plant = new PLANT();
        plant.setName("Rose");
        plant.setType("Indoor");
        plant.setTemperature(40);
        plant.setCost(500);

        plant.Display();
    }
}
