package lesson05.figure;

public class Triangle extends Figure {

    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.squar = this.getSquar();
    }

    @Override
    public double getSquar() {
        double p = (a + b + c) / 2;
        return squar = Math.sqrt((p * (p - a) * (p - b) * (p - c)));
    }
}
