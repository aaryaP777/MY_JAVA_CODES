interface Switchable {  // interface name should be adjective
    void turnOn();
    void turnOff();
}

class Fan implements Switchable{

    @Override
    public void turnOn() {
        System.out.println("Fan is ON");
    }

    @Override
    public void turnOff() {
        System.out.println("Fan is OFF");
    }
}

class TV implements Switchable{

    @Override
    public void turnOn() {
        System.out.println("TV is ON");
    }

    @Override
    public void turnOff() {
        System.out.println("TV is OFF");
    }
}
public class Interface_example {
    public static void main(String[] args) {
        Fan fan = new Fan();
        fan.turnOn();
        fan.turnOff();

        TV tv = new TV();
        tv.turnOn();
        tv.turnOff();
    }
}
