package lesson03.newdevelopers;

public class SergDeveloper extends Developer{

    public SergDeveloper(String name, double basicSalary, int experience) {
        super(name, basicSalary, experience);
    }


    @Override
    public double getSalary() {
        return basicSalary * 2 +(experience > 0 ? basicSalary * experience : 0);
    }
}
