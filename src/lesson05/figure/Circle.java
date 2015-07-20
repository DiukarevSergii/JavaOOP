package lesson05.figure;

public class Circle extends Figure {

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double getSquar() {
        return squar = Math.PI * (this.radius * this.radius);
    }
}
