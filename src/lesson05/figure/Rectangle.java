package lesson05.figure;

public class Rectangle extends Figure {
    private double squar;

    public Rectangle(int height, int width, int radius) {
        super(height, width, radius);
    }

    @Override
    public double getSquar() {
        return squar = height * width;
    }
}
