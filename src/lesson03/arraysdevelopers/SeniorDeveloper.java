package lesson03.arraysdevelopers;

public class SeniorDeveloper extends Developers {

    public SeniorDeveloper(int basicSalary, int experience) {

        this.basicSalary = basicSalary;
        this.experience = experience;


    }

    @Override
    public double getSalary() {
        return (basicSalary * 2) + (experience > 0 ? basicSalary * experience * 0.1 : 0);

    }

}
