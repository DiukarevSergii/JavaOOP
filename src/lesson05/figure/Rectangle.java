package lesson05.figure;

public class Rectangle extends Figure {
    private double height;
    private double width;

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
