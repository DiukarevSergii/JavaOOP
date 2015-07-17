package lesson05.humancomparator;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Human[] list = {
                new Human(40), new Human(20), new Human(3), new Human(7)
        };
        Arrays.sort(list, new HumanComparator());

        for (int i = list.length - 1; i >= 0; i--)
            System.out.println(list[i].getAge());
    }
}