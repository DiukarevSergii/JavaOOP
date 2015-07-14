package lesson03.developers;

public class SergeyDeveloper extends Developer {

    public SergeyDeveloper(String name, double basicSalary, int experience) {
        super(name, basicSalary, experience);
    }
    @Override
    public double getSalary() {
        return (basicSalary * 777) + (experience > 0 ? basicSalary * experience * 0.1 : 0);
    }
}
