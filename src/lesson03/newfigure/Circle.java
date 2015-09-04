package lesson03.newfigure;

public class Circle extends Figure {


    protected Circle(int height, int weidth, int radius) {
        super(height, weidth, radius);
    }

    @Override
    protected int square() {
        return (int) Math.PI * radius * radius;
    }

}
