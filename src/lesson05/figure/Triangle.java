package lesson05.figure;

public class Triangle extends Figure {

    public Triangle(int height, int width, int radius) {
        super(height, width, radius);
    }

    @Override
    public double getSquar() {
        return super.squar = 0.5 * height * width;
    }
}
