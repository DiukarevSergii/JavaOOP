package lesson05.copyinnewdir;

import util.Constants;
import java.io.*;
import java.util.ArrayList;

public class CopyInNewDir {
    private static final String oldFilePath = Constants.FILE_PATH_LESSON05_FINDFILES;
    private static final String newFilePath = Constants.FILE_PATH_LESSON05_INNER;

    private static void findFiles(String srcPath, ArrayList<String> list) throws IOException {
        File dir = new File(srcPath);
        File[] files = dir.listFiles();

        for (int i = 0; i < files.length; i++) {
            if (files[i].isFile())
                list.add(files[i].getName());
        }
    }

    public static void copyFile(String src, String dest) throws Exception {
        FileInputStream in = new FileInputStream(src);
        try {
            FileOutputStream out = new FileOutputStream(dest);
            try {
                byte[] buf = new byte[1000000]; // 1 MB
                int r;
                do {
                    r = in.read(buf, 0, buf.length);
                    if (r > 0)
                        out.write(buf, 0, r);
                } while (r > 0);
            } finally {
                out.close();
            }
        } finally {
            in.close();
        }
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        try {
            findFiles(oldFilePath, list);
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (String s : list)
            System.out.println(s);

        try {
            for (int i = 0; i < list.size(); i++) {
                copyFile(oldFilePath+ "/" + list.get(i), newFilePath + "/" + list.get(i));
            }

        } catch (IOException e) {
            System.out.println("An I/O Error Occured");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

