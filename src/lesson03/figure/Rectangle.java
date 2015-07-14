package lesson03.figure;

public class Rectangle extends Figure {

    public Rectangle(int height, int width, int radius) {
        super(height, width, radius);
    }

    @Override
    public double square() {
        return height * width;
    }
}
