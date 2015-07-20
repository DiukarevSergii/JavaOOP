package lesson05.figure;

public class Rectangle extends Figure {

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public double getSquar() {
        return squar = this.height * this.width;
    }
}
