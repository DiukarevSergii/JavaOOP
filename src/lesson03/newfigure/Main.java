package lesson03.newfigure;

public class Main {

    public static void main(String[] args) {
        Triangle triangle = new Triangle(20, 33, 8);
        Rectangle rectangle = new Rectangle(5, 5, 8);
        Circle circle = new Circle(12, 12, 12);

        System.out.println(triangle.square());
        System.out.println(rectangle.square());
        System.out.println(circle.square());
    }
}
