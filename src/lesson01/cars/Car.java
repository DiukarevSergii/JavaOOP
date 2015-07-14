package lesson01.cars;

public class Car {
    private String name;
    private Engine engine;
    private Climate climate = new Climate();

    private double eat;

    public Car(String name) {
        this.name = name;
        engine = new Engine(0, 1);
    }

    public Car(String name, double mileage, int volume) {
        this.name = name;
        engine = new Engine(mileage, volume);
    }

    public String getName() {
        return name;
    }

    public double getMileage() {
        return engine.getMileage();
    }

/*    public double getEat(){
        return engine.getEat();
    }*/

    public void turnOn() {
        engine.turnOn();
        climate.turnOn();
        climate.setTemperature(21);
    }

    public void turnOff() {
        climate.turnOff();
        engine.turnOff();
    }
    public double getFuel() {
        return eat;
    }

    public void start(int speed, double hours) {
        if (engine.isStarted()) {

            double distance = hours * speed;
            engine.addMileage(distance);

            if (engine.getVolume() <= 1) {
                double e = (distance / 100) * 5;
                eat +=e;
                //engine.addEat(eat);
            } else if (engine.getVolume() > 1 && engine.getVolume() < 5) {
                double e = (distance / 100) * 15;
                eat +=e;
                //engine.addEat(eat);
            }
        }
    }
}