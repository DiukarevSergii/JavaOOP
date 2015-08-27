package lesson08;

import java.util.ArrayList;
import java.util.List;

public class ToListTwo {
//    Написать метод для конвертации массива строк/чисел в
//    список.

    public static  <T> ArrayList toList(T[] array) {
        ArrayList<T> list = new ArrayList<>(20);
        for (T element : array)
            list.add(element);
        return list;
    }

    public static void main(String[] args) {
        int[] ints = {1, 2, 3, 4, 5, 6, 678, 7, 0, 6, 45, 3, 5};

        Integer[] integer = new Integer[ints.length];
        int i = 0;
        for (int value : ints)
            integer[i++] = Integer.valueOf(value);

        System.out.println(toList(integer));

        String [] string = {"1", "fgfg", "gh"};
        System.out.println(toList(string));


    }
}
