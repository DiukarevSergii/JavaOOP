package lesson01.circle;

public class Main {
    public static void main(String[] args) {
        System.out.println(Circle.Name);

        Circle c1 = new Circle();
        Circle c2 = new Circle();

        System.out.println("Result1: " + c1.getS());
        System.out.println("Result2: " + c2.getS());

        c2.setRadius(22);
        System.out.println("Result2: " + c2.getS());

        Circle c3 = Circle.combine(c1,c2);
        System.out.println("Result3 combine: " + c3.getS());

    }
}


