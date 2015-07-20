package lesson05.figure;

public class Circle extends Figure {
    protected double radius;

    public Circle(int radius) {
        this.radius = radius;
        this.squar=this.getSquar();
    }

    @Override
    public double getSquar() {
        return squar = Math.PI * (this.radius * this.radius);
    }
}
