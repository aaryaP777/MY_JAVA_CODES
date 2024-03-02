// Base class Beverage
class Beverage {
    public void prepare() {
        System.out.println("Beverage prepared.");
    }

    public void serve() {
        System.out.println("Beverage served.");
    }
}

// Subclass Coffee
class Coffee extends Beverage {
    @Override
    public void prepare() {
        System.out.println("Coffee prepared.");
    }

    @Override
    public void serve() {
        System.out.println("Coffee served.");
    }
}

// Subclass Tea
class Tea extends Beverage {
    @Override
    public void prepare() {
        System.out.println("Tea prepared.");
    }

    @Override
    public void serve() {
        System.out.println("Tea served.");
    }
}

// Subclass Smoothie
class Smoothie extends Beverage {
    @Override
    public void prepare() {
        System.out.println("Smoothie prepared.");
    }

    @Override
    public void serve() {
        System.out.println("Smoothie served.");
    }
}

// Main class
public class BeverageService {
    public static void main(String[] args) {
        // Example of Beverage subclasses
        Beverage coffee = new Coffee();
        coffee.prepare();
        coffee.serve();

        Beverage tea = new Tea();
        tea.prepare();
        tea.serve();

        Beverage smoothie = new Smoothie();
        smoothie.prepare();
        smoothie.serve();
    }
}

