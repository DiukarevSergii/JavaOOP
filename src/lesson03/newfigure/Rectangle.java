package lesson03.newfigure;

public class Rectangle extends Figure{


    protected Rectangle(int height, int width, int radius) {
        super(height, width, radius);
    }

    @Override
    public int square(){
        System.out.println("hi");
        return height * width;
    }

}
