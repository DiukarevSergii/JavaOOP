package lesson05.replacement;

import util.Constants;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Replacement {
    private static final String filePath = Constants.FILE_PATH_LESSON05_FINDFILES;

    public static void main(String[] args) {
        String fromFile = filePath + "/HELLO.txt";
        String source = "";

        try (FileReader reader = new FileReader(fromFile)) {
            int c;

            // Read and display the file.
            while ((c = reader.read()) != -1) {
                source += String.valueOf((char) c);
            }
            System.out.println(source);

            source = source.replace("Hello", "1234");

            System.out.println(source);
            // Write the file.
            char []buffer = source.toCharArray();

            try (FileWriter fw1 = new FileWriter(fromFile)) {
                for (int i = 0; i < buffer.length; i++) {
                    fw1.write(buffer[i]);
                }
            } catch (IOException e) {
                System.out.println("An I/O Error Occured");
            }
        } catch (IOException e) {
            System.out.println("I/O Error: " + e);
        }
    }
}