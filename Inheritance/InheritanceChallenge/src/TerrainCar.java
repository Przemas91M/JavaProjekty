public class TerrainCar extends Car {
    boolean allWheelDrive;
    int gearBoxRatio;
    int tirePressure;
    boolean canItRunUnderwater;

    public TerrainCar(boolean allWheelDrive, int gearBoxRatio, int tirePressure, boolean canItRunUnderwater) {
        super("TerrainCar", "green", "gasoline", 5, 16, 5); //to mozemy ustawic na stale, bo wiemy jakie dane ma ten specyficzny samochod
        this.allWheelDrive = allWheelDrive;
        this.gearBoxRatio = gearBoxRatio;
        this.tirePressure = tirePressure;
        this.canItRunUnderwater = canItRunUnderwater;
    }


    public boolean isAllWheelDrive() {
        return allWheelDrive;
    }

    public int getGearBoxRatio() {
        return gearBoxRatio;
    }

    public int getTirePressure() {
        return tirePressure;
    }

    public boolean isCanItRunUnderwater() {
        return canItRunUnderwater;
    }

    @Override
    public void changeGear(int gear) {
        super.changeGear(gear * gearBoxRatio);
    }

    @Override
    public void changeSpeed(int speed) {
        changeVelocity(speed * gearBoxRatio * this.tirePressure);
    }
}
