package lesson03.randomdevelopers;

import java.util.Random;

public class MainRandom {
    public static void main(String[] args) {
        Random random = new Random();
        int n = (random.nextInt(10) + 5);

        DevelopersRandom[] randomList = new DevelopersRandom[n];


        StringBuilder sb;

        for (int x = 0; x < n; x++) {
            DevelopersRandom[] rList = {new JuniorDeveloperRandom(random.nextInt(500) + 10, random.nextInt(10)),
                                        new SeniorDeveloperRandom(random.nextInt(500) + 1000, random.nextInt(10)),
                                        new TeamLeadDeveloperRandom(random.nextInt(500) + 100, random.nextInt(10))};

            randomList[x] = rList[random.nextInt(rList.length)];

            if (randomList[x] instanceof SeniorDeveloperRandom && randomList[x].getSalary() > 1500) {
                sb = new StringBuilder()
                        .append(randomList[x].getName())
                        .append(" + ")
                        .append(randomList[x].getSalary());
                System.out.println(sb.toString());
            }
        }
    }
}
