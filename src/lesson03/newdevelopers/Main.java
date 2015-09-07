package lesson03.newdevelopers;

import javax.lang.model.element.Name;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*Developer[] list = {
                new JuniorDeveloper("Mike", 500, 0),
				new JuniorDeveloper("Dima", 500, 1),
				new JuniorDeveloper("Vova", 500, 2),
				new SeniorDeveloper("Jack", 500, 5),
				new TeamLeadDeveloper("Robby", 500, 7),
				new SergDeveloper("Serg", 500, 1)
		};*/

        String[] names = {"Name 1", "Name 2", "Name 3", "Name 4", "Name 5"};

        int n = (int) (Math.random() * 30) + 1;
        Developer[] list = new Developer[n];

        for (int i = 0; i < list.length; i++) {
            int r = (int) (Math.random() * 5);
            int s = 500;
            int e = (int) (Math.random() * 10);
            Developer[] randomList = {
                    new JuniorDeveloper(names[r], s, e),
                    new SeniorDeveloper(names[r], s, e),
                    new TeamLeadDeveloper(names[r], s, e),
                    new SergDeveloper(names[r], s, e)
            };

            list[i] = randomList[(int) (Math.random() * 4)];
        }

//        System.out.println(n);

        StringBuilder sd;
        List<StringBuilder> senior = new ArrayList<>();
        StringBuilder jj;
        List<StringBuilder> junior = new ArrayList<>();
        StringBuilder tl;
        List<StringBuilder> team = new ArrayList<>();
        StringBuilder sergD;
        List<StringBuilder> serg = new ArrayList<>();

        for (Developer d : list) {
            if (d instanceof SeniorDeveloper) {
                sd = new StringBuilder() // !!!
                        .append(d.getName())
                        .append(": ")
                        .append(d.getBasicSalary())
                        .append(" -> ")
                        .append(d.getSalary());
                senior.add(sd);
            } else if (d instanceof JuniorDeveloper) {
                sd = new StringBuilder() // !!!
                        .append(d.getName())
                        .append(": ")
                        .append(d.getBasicSalary())
                        .append(" -> ")
                        .append(d.getSalary());
                junior.add(sd);
            }
        }

        for (StringBuilder s : senior)
            System.out.println(s.toString());

        System.out.println("-----------------------");

        for (StringBuilder s : junior)
            System.out.println(s.toString());
    }
}
