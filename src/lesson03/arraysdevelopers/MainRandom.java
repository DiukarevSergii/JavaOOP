package lesson03.arraysdevelopers;

import java.util.Random;

public class MainRandom {
    public static void main(String[] args) {
        Random random = new Random();
        int n = (random.nextInt(10) + 5);

        Developers[] randomList = new Developers[n];

        Developers[] juniorList = new Developers[n];
        int j = 0;
        Developers[] seniorList = new Developers[n];
        int s = 0;
        Developers[] teamLeadList = new Developers[n];
        int tl = 0;

        for (int i = 0; i < n; i++) {
            Developers[] rList = {new JuniorDeveloper(random.nextInt(500) + 10, random.nextInt(10)),
                    new SeniorDeveloper(random.nextInt(500) + 1000, random.nextInt(10)),
                    new TeamLeadDeveloper(random.nextInt(500) + 100, random.nextInt(10))};

            randomList[i] = rList[random.nextInt(rList.length)];

            if (randomList[i] instanceof JuniorDeveloper) {
                juniorList[j++] = randomList[i];
            } else if (randomList[i] instanceof SeniorDeveloper) {
                seniorList[s++] = randomList[i];
            } else if (randomList[i] instanceof TeamLeadDeveloper) {
                teamLeadList[tl++] = randomList[i];
            }
        }
        for (int i = 0; i < juniorList.length; i++) {
            if (juniorList[i] != null) {
                System.out.println("JuniorDeveloper" + " " + juniorList[i].getName() + " " + juniorList[i].getSalary());
            }
        }
        System.out.println("");
        for (int i = 0; i < seniorList.length; i++) {
            if (seniorList[i] != null) {
                System.out.println("SeniorDeveloper" + " " + seniorList[i].getName() + " " + seniorList[i].getSalary());
            }
        }
        System.out.println("");
        for (int i = 0; i < teamLeadList.length; i++) {
            if (teamLeadList[i] != null) {
                System.out.println("TeamLeadDeveloper" + " " + teamLeadList[i].getName() + " " + teamLeadList[i].getSalary());
            }
        }
    }
}
