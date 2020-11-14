class Car {
    private boolean engine;
    private int cylinders;
    private int wheels;
    private String color;
    private String name;

    public Car(String name, int cylinders, String color) {
        this.wheels = 4;
        this.engine = true;
        this.name = name;
        this.color = color;
        this.cylinders = cylinders;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public void startEngine() {
        System.out.println("Engine started");
    }

    public void stopEngine() {
        System.out.println("Engine stopped");
    }

    public void accelerate() {
        System.out.println("Speeding up");
    }

    public void brake() {
        System.out.println("Car is losing speed");
    }
}

class BmwE90 extends Car {
    public BmwE90(String name, int cylinders, String color) {
        super(name, cylinders, color);
    }

    @Override
    public void startEngine() {
        System.out.println("BMW is starting");
    }

    @Override
    public void stopEngine() {
        System.out.println("BMW's engine is off");
    }

    @Override
    public void accelerate() {
        System.out.println("BMW is gaining speed");
    }

    @Override
    public void brake() {
        System.out.println("BMW is loosing speed");
    }
}

class Audi extends Car {
    public Audi(String name, int cylinders, String color) {
        super(name, cylinders, color);
    }

    @Override
    public void startEngine() {
        System.out.println("Audi is starting");
    }

    @Override
    public void stopEngine() {
        System.out.println("Engine in Audi stopped");
    }

    @Override
    public void accelerate() {
        System.out.println("Audi is accelerating");
    }

    @Override
    public void brake() {
        System.out.println("Audi is braking");
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Generic car", 4, "White");
        BmwE90 bmwE90 = new BmwE90("BMW E90", 6, "Black");
        Audi audi = new Audi("Audi A4 B6", 4, "Silver");
        Volkswagen volkswagen = new Volkswagen("Golf 5", 8, "Red");

        car.startEngine();
        car.accelerate();
        car.brake();
        car.stopEngine();

        bmwE90.startEngine();
        bmwE90.accelerate();
        bmwE90.brake();
        bmwE90.stopEngine();

        audi.startEngine();
        audi.accelerate();
        audi.brake();
        audi.stopEngine();

        volkswagen.startEngine();
        volkswagen.accelerate();
        volkswagen.brake();
        volkswagen.stopEngine();

        System.out.println(audi.getColor());
        System.out.println(bmwE90.getColor());
        System.out.println(car.getColor());
        System.out.println(volkswagen.getColor());
    }
}
