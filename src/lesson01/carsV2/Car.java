package lesson01.carsV2;

/*Написать класс «автомобиль», который должен уметь
 заводится, глушить мотор, ехать и держать необходимую скорость.*/

import java.util.Scanner;

public class Car {

    private boolean ignition;
    private int mileage;
    private int speed;
    private String name;
    private int time;

    public void setTime(int time) {
        this.time = time;
    }

    public Car(String name) {
        this.name = name;
        this.mileage = 0;
    }

    public Car(String name, int mileage) {
        this.name = name;
        this.mileage = mileage;
    }
    public void setIgnition(boolean ignition) {
        this.ignition = ignition;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isIgnition() {
        return ignition;
    }

    public int getMileage() {
        if (ignition)
            return this.mileage += speed * time;
        return this.mileage;
    }

    public int getSpeed() {
        return speed;
    }
}
