package lesson03.newfigure;

public class Triangle extends Figure {

    public Triangle(int height, int width ,int radius) {
        super(height, width, radius);
    }


    @Override
    protected int square() {
        return (int)(height * width);
    }
}
