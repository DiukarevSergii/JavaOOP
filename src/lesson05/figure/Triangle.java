package lesson05.figure;

public class Triangle extends Figure {
    private double squar;

    public Triangle(int height, int width, int radius) {
        super(height, width, radius);
    }

    @Override
    public double getSquar() {
        return squar = 0.5 * height * width;
    }
}
