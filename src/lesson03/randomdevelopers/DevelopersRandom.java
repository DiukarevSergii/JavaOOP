package lesson03.randomdevelopers;

import java.util.Random;

public abstract class DevelopersRandom {

    protected String randomName;
    protected double basicSalary;
    protected int experience, name;

    public DevelopersRandom() {
        /*String[] nameList = {"Sergii", "Vove", "Misha", "Igor", "Ira"};
        Random random = new Random();
        this.name = nameList[random.nextInt(name)];*/
        /*this.basicSalary = random.nextInt(500) + 1;
        this.experience = random.nextInt(10);*/
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
}
