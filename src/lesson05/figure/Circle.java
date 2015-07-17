package lesson05.figure;

public class Circle extends Figure {
    private double squar;

    public Circle(int height, int width, int radius) {
        super(height, width, radius);
    }

    @Override
    public double getSquar() {
        return squar = Math.PI * (radius * radius);
    }
}
