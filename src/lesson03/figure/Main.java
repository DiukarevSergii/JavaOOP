package lesson03.figure;

public class Main {
    public static void main(String[] args) {
        Figure triangle = new Triangle(5,3,8);
        Figure rectangle = new Rectangle(5,3,8);
        Figure circle = new Circle(5,3,8);

        System.out.println(triangle.square());
        System.out.println(rectangle.square());
        System.out.println(circle.square());
    }
}
