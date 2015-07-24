package lesson05.report;

import util.Constants;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Report {
    private static final String oldFilePath = Constants.FILE_PATH_LESSON05_FINDFILES;
    private static String description;

    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        File dir = new File(oldFilePath);
        File[] files = dir.listFiles();
        FileOutputStream report = null;

        try {
            report = new FileOutputStream(oldFilePath + "/report.txt");

            for (int i = 0; i < files.length; i++) {
                try {
                    long l = files[i].lastModified();
                    Date d = new Date(l);
                    description = files[i].getCanonicalPath() + "\n" + files[i].getName() + "\n" + sdf.format(d) + "\n\n";
                    byte[] bytes = description.getBytes();
                    report.write(bytes);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}