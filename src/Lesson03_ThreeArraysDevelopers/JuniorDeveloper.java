package Lesson03_ThreeArraysDevelopers;

public class JuniorDeveloper extends Developers {

    public JuniorDeveloper(int basicSalary, int experience){

        this.basicSalary = basicSalary;
        this.experience = experience;
    }

    @Override
    public double getSalary(){
        return basicSalary + (experience > 0 ? basicSalary * experience * 0.1 : 0);
    }

}


