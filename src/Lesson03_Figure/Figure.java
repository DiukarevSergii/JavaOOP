package Lesson03_Figure;

public abstract class Figure {

    protected int height;
    protected int width;
    protected int radius;

    public Figure (int height, int width, int radius){
        this.height = height;
        this.width = width;
        this.radius = radius;
    }
    public abstract double square();

}
