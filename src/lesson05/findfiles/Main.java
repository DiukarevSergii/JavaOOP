package lesson05.findfiles;

import util.Constants;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

    private static final String filePath = Constants.FILE_PATH_LESSON05_FINDFILES;

    private static void findFiles(ListFiles [] listFiles, ArrayList<String> list) throws IOException {

        for (int i = 0; i < listFiles.length; i++) {
            File dir = new File(listFiles[i].getSrcPath());
            String a = listFiles[i].getExt();
            File[] files = dir.listFiles(new MyFileFilter(a));

            for (int j = 0; j < files.length; j++) {
                list.add (files[j].getCanonicalPath());
            }
        }
    }
    public static void main(String[] args) {
        ListFiles [] listFiles = {
                new ListFiles(filePath, ".txt"),
                new ListFiles("c:\\", ".xt"),
                new ListFiles("d:\\", ".docx")};

        ArrayList<String> list = new ArrayList<String>();

        try {

            findFiles(listFiles, list);
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (String s : list)
            System.out.println(s);
    }

    static class MyFileFilter implements FilenameFilter {
        private String ext;

        public MyFileFilter(String ext) {
            this.ext = ext;
        }

        public boolean accept(File dir, String name) {
            return name.endsWith(ext);
        }
    }
}