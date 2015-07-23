package lesson05.oldfindfiles;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

    private static void findFiles(String srcPath, String ext, ArrayList<String> list) throws IOException {
        File dir = new File(srcPath);
        File[] files = dir.listFiles(new MyFileFilter(ext));

        for (int i = 0; i < files.length; i++) {
            list.add(srcPath + files[i].getName());
        }
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        try {
            findFiles("c:\\", ".txt", list);
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