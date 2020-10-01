public class Car extends Vehicle {
    private int wheels;
    private int wheelSize;
    private int doors;
    private int gear;

    public Car(String name, String color, String fuel, int wheels, int wheelSize, int doors) {
        super(name, color, fuel);
        this.wheels = wheels;
        this.wheelSize = wheelSize;
        this.doors = doors;
        this.gear = 0;
    }

    public void changeGear(int gear) {
        this.gear = gear;
        System.out.println("Car changed gear to: " + this.gear);

    }

    public void changeVelocity(int speed) {
        changeSpeed(speed * wheelSize);
        System.out.println("Car changed velocity to: " + super.getSpeed());
    }
}
