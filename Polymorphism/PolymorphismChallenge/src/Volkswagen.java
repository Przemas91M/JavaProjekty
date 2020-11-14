class Volkswagen extends Car {
    public Volkswagen(String name, int cylinders, String color) {
        super(name, cylinders, color);
    }

    @Override
    public void startEngine() {
        System.out.println(getClass().getSimpleName()+" is starting"); //tak tez mozna pobrac nazwe klasy, bez kazdorazowego zmieniania
    }

    @Override
    public void stopEngine() {
        System.out.println("Engine in Volkswagen stopped");
    }

    @Override
    public void accelerate() {
        System.out.println("Volkswagen is accelerating");
    }

    @Override
    public void brake() {
        System.out.println("Volkswagen is braking");
    }
}

