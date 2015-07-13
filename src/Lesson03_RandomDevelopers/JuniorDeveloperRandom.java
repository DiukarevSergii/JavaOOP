package Lesson03_RandomDevelopers;

public class JuniorDeveloperRandom  extends DevelopersRandom {

    public JuniorDeveloperRandom(int basicSalary, int experience){
        /*super(name, basicSalary, expirience);*/
        //super(name);
        this.basicSalary = basicSalary;
        this.experience = experience;
    }

    @Override
    public double getSalary(){
        return basicSalary + (experience > 0 ? basicSalary * experience * 0.1 : 0);
    }
}
