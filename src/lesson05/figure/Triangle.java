package lesson05.figure;

public class Triangle extends Figure {

    public Triangle(int height, int width) {
        this.height = height;
        this.width = width;
        this.squar = this.getSquar();
    }

    @Override
    public double getSquar() {
        return squar = 0.5 * this.height * this.width;
    }
}
