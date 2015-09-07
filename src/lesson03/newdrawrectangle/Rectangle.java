package lesson03.newdrawrectangle;

import java.util.Scanner;

public class Rectangle {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter width: ");
        int width = scanner.nextInt();
        System.out.println("Enter height: ");
        int height = scanner.nextInt();

        StringBuilder strbWidth = new StringBuilder();
        StringBuilder strbHeight = new StringBuilder();

        for (int i = 0; i < width; i++){
            strbWidth.append("*");
        }

        strbHeight.append("*");
        for (int i = 0; i < width - 2; i++){
            strbHeight.append(" ");
        }
        strbHeight.append("*");

        System.out.println(strbWidth);
        for (int i = 0; i < height - 2; i++) {
            System.out.println(strbHeight);
        }
        System.out.println(strbWidth);
    }
}
