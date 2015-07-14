package lesson01.circle;

public class Circle {

    public static final String Name = "Circle";

    private double radius;
    private double s;

    public Circle() {
        radius = 50;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getS() {
        s = (Math.PI) * (radius * radius);
        return s;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public static Circle combine(Circle c1, Circle c2) {
        return new Circle(c1.getS() + c2.getS());

    }
}
