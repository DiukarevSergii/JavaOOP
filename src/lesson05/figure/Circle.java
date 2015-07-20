package lesson05.figure;

public class Circle extends Figure {

    public Circle(int height, int width, int radius) {
        super(height, width, radius);
    }

    @Override
    public double getSquar() {
        return super.squar = Math.PI * (radius * radius);
    }
}
