package lesson05.figure;

public abstract class Figure implements Comparable {

    protected double squar;

    public abstract double getSquar();

    @Override
    public int compareTo(Object another) {
        Figure figure = (Figure) another;
        if (squar < figure.getSquar())
            return -1;
        else if (squar == figure.getSquar())
            return 0;
        else if (squar > figure.getSquar())
            return 1;
        else
            return 0;
    }
}
