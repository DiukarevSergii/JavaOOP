package Lesson03_Figure;

public class Triangle extends Figure {

    public Triangle(int height, int width, int radius) {
        super(height, width, radius);
    }

    @Override
    public double square() {
        return 0.5 * height * width;
    }
}
