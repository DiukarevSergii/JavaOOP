package Lesson03_RandomDevelopers;

public class SeniorDeveloperRandom extends DevelopersRandom {

    public SeniorDeveloperRandom(int basicSalary, int experience) {
        /*super(name, basicSalary, experience);*/
        /*Random random = new Random();
        String[] nameList = {"Sergii", "Vove", "Misha", "Igor", "Ira"};
        this.name = nameList[name];*/
        this.basicSalary = basicSalary;
        this.experience = experience;


    }

    @Override
    public double getSalary() {
        return (basicSalary * 2) + (experience > 0 ? basicSalary * experience * 0.1 : 0);

    }

}
