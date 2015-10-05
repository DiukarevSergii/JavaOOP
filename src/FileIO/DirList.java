package FileIO;

//: io/DirList.java
// Вывод списка каталогов с использованием регулярных выражений.
// {Args: "D.*\.java"}
import java.util.regex.*;
import java.io.*;
import java.util.*;

public class DirList {
    public static void main(String[] args) {
        File path = new File(".");
        String[] list;
        if(args.length == 0)
            list = path.list();
        else
            list = path.list(new DirFilter(args[0]));
        Arrays.sort(list);
        for(String dirItem : list)
            System.out.println(dirItem);
    }
}
