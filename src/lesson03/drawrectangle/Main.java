package lesson03.drawrectangle;

public class Main {

    public static void main(String[] args) {

        int height = 10;
        int wigth = 70;

        StringBuilder strWidth = new StringBuilder();
        StringBuilder strHeight = new StringBuilder();

        String[] rectangleWidth = new String[wigth];
        String[] rectangleHight = new String[height];

        for (int i = 0; i < rectangleWidth.length; i++){
            strWidth.append("*");
        }
        for (int i = 0; i < rectangleWidth.length; i++){
            if (i == 0 || i == rectangleWidth.length - 1){
                strHeight.append("*");
            } else
                strHeight.append(" ");
        }
        for (int i = 0; i < rectangleHight.length; i++){
            if (i == 0 || i == rectangleHight.length - 1){
                System.out.println(strWidth.toString());

            } else {
                System.out.println(strHeight.toString());
            }
        }
    }
}

