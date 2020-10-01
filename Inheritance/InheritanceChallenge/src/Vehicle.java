public class Vehicle{
    private String name;
    private int speed;
    private String color;
    private int steering;
    private String fuel;

    public Vehicle(String name, String color, String fuel) {
        this.name = name;
        this.speed = 0;
        this.color = color;
        this.steering = 0;
        this.fuel = fuel;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public String getColor() {
        return color;
    }

    public int getSteering() {
        return steering;
    }

    public String getFuel() {
        return fuel;
    }

    public void changeDirection(int direction){
        this.steering = direction;
        System.out.println("Vehicle changed direction to: " + this.steering);
    }

    public void changeSpeed(int speed){
        this.speed += speed;
        System.out.println("Vehicle changed speed to: " + this.speed);
    }

    public void stop(){
        this.speed = 0;
        System.out.println("Vehicle stopped!");
    }
}
