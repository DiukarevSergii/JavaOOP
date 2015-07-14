package lesson03.figure;

public class Circle extends Figure{

    public Circle(int height, int width, int radius) {
        super(height, width, radius);
    }

    @Override
    public double square() {
        return Math.PI * (radius * radius);
    }
}
