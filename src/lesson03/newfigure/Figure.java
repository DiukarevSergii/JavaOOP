package lesson03.newfigure;

public abstract class Figure {

    protected int radius;
    protected int height;
    protected int width;

    protected Figure(int height, int width, int radius){
        this.height = height;
        this.width = height;
        this.radius = radius;
    }

    protected abstract int square();

}
