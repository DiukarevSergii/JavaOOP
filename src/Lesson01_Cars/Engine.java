package Lesson01_Cars;

public class Engine {
    private double mileage, eat;
    private int volume;
    private boolean started;

    public Engine(double mileage, int volume) {
        this.mileage = mileage;
        this.volume = volume;
    }

    public double getMileage() {
        return mileage;
    }

    public int getVolume() {
        return volume;
    }

 /*   public double getEat(){
        return eat;
    }*/

    public void addMileage(double mileage) {
        if (started)
            this.mileage += mileage;
    }

    public void addEat(double eat) {
        this.eat += eat;
    }

    public boolean isStarted() {
        return started;
    }

    public void turnOn() {
        started = true;
    }

    public void turnOff() {
        started = false;
    }
}
