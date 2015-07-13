package Lesson03_ThreeArraysDevelopers;

import java.util.Random;

public abstract class Developers {

    protected String randomName;
    protected double basicSalary;
    protected int experience, name;

    public Developers() {

    }

    public String getName() {
        String[] nameList = {"Sergii", "Vove", "Misha", "Igor", "Ira"};
        Random random = new Random();
        this.randomName = nameList[random.nextInt(nameList.length)];
        return randomName;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public abstract double getSalary();

    @Override
    public String toString() {
        return "Developers{" +
                "basicSalary=" + basicSalary +
                ", randomName='" + randomName + '\'' +
                ", experience=" + experience +
                ", name=" + name +
                '}';
    }
}
