package lesson05.figure;

public class Rectangle extends Figure {

    public Rectangle(int height, int width, int radius) {
        super(height, width, radius);
    }

    @Override
    public double getSquar() {
        return super.squar = height * width;
    }
}
