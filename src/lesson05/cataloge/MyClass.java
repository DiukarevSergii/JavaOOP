package lesson05.cataloge;
import java.io.File;

public class MyClass {
    public static void main(String[] args) {
        try {
            File f = new File("C:\\test");
            String[] list1 = f.list();
            File[] list2 = f.listFiles();
            for (String s : list1)
                System.out.println(s);

            System.out.println("-----------");
            for (File t : list2)
                System.out.println(t.getCanonicalPath());
            list2[0].delete(); // удалить файл
            long sz = list1[0].length(); // размер файла
            System.out.println(sz);
            long date = f.lastModified();
            boolean b = f.isDirectory();
            new File("C:\\test").mkdir(); // создать пустой каталог
            new File("C:\\test\\1\\2\\3\\4").mkdirs(); // создать каталоги
        } catch (Exception ex) {}
    }
}