package lesson03.arraysdevelopers;

public class TeamLeadDeveloper extends Developers {

    public TeamLeadDeveloper(int basicSalary, int experience) {
        this.basicSalary = basicSalary;
        this.experience = experience;
    }

    @Override
    public double getSalary() {
        return (basicSalary * 4) + (experience > 0 ? basicSalary * experience * 0.1 : 0);
    }
}
