package Lesson03_RandomDevelopers;

public class TeamLeadDeveloperRandom extends DevelopersRandom {

    public TeamLeadDeveloperRandom(int basicSalary, int experience) {
        /*super(name, basicSalary, experience);*/
        //super(name);
        this.basicSalary = basicSalary;
        this.experience = experience;
    }

    @Override
    public double getSalary() {
        return (basicSalary * 4 ) +(experience > 0 ? basicSalary * experience * 0.1 : 0);
    }
}
