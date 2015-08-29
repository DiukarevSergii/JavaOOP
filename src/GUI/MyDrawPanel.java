package GUI;

import javax.swing.*;
import java.awt.*;

public class MyDrawPanel extends JPanel {

    public void paintComponent(Graphics g) {

//        g.fillRect(0, 0, this.getWidth(), this.getHeight());
//
//        int red = (int) (Math.random() * 255);
//        int green = (int) (Math.random() * 255);
//        int blue = (int) (Math.random() * 255);
//
//        Color randomColor = new Color(red, blue, green);
//        g.setColor(randomColor);
//        g.fillOval(100, 100, 300, 300);

        Graphics2D g2d = (Graphics2D) g;
        float start = (float) (Math.random() * 255);
        float start1 = (float) (Math.random() * 255);
        float midle1 = (float) (Math.random() * 255);
        float midle = (float) (Math.random() * 255);
        float end1 = (float) (Math.random() * 255);
        float end = (float) (Math.random() * 255);
        GradientPaint gradient = new GradientPaint( 70,70, Color.getHSBColor(start,midle,end),
                                                    150,150, Color.getHSBColor(start1,midle1,end1));
        g2d.setPaint(gradient);
        g2d.fillOval(70,70,300,300);


    }
}
