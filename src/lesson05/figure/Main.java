package lesson05.figure;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Figure[] figureList = {
                new Rectangle(1, 20, 0), new Rectangle(1, 22, 0),
                new Circle(0, 0, 23), new Circle(0, 0, 10),
                new Triangle(5, 5, 0), new Triangle(10, 1, 0)
        };
        Arrays.sort(figureList);
        for (Figure f : figureList)
            System.out.println(f.getSquar());
    }
}
