package lesson05.figure;

public abstract class Figure implements Comparable {

    protected int height;
    protected int width;
    protected int radius;
    protected double squar;

    public abstract double getSquar();

    @Override
    public int compareTo(Object another) {
        Figure figure = (Figure) another;
        if (squar < figure.squar)
            return -1;
        else if (squar == figure.squar)
            return 0;
        else if (squar > figure.squar)
            return 1;
        else
            return 0;
    }
}
