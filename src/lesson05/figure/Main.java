package lesson05.figure;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Figure[] figureList = {
                new Rectangle(10, 20), new Rectangle(1, 22),
                new Circle(23), new Circle(10),
                new Triangle(5, 5), new Triangle(10, 1)
        };
        Arrays.sort(figureList);
        for (Figure f : figureList)
            System.out.println(f.getSquar());
    }
}
