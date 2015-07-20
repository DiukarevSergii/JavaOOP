package lesson05.figure;

public class Rectangle extends Figure {
    protected double height;
    protected double width;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
        this.squar=this.getSquar();
    }

    @Override
    public double getSquar() {
        return squar = this.height * this.width;
    }
}
