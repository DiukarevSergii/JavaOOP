package lesson08;

import java.awt.List;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String args[]) {

        int[] k = {1, 2, 3, 4, 5, 6, 7};
        Integer[] i = {1, 2, 3, 4, 5, 6, 7};
        String[] s = {"abc", "def", "c", "d", "e"};

        Array2<Integer[]> array2 = new Array2<>(s);
//        Array2<int[]> array2 = new Array2<>(k);
        System.out.println(array2.get(1));
    }

    /* Написать класс, который умеет хранить в себе массив любых типов данных (int, long etc.).
     *  Реализовать метод, который возвращает любой элемент массива по индексу.
     * */
    static class Array<T> {
        private ArrayList<T> list;

        public Array(T[] t) {
            this.list = new ArrayList<T>();
            for (T i : t)
                list.add(i);
        }

        public T get(int index) {
            return this.list.get(index);
        }
    }

    static class Array2<T> {
        private ArrayList<Object> list;

        public Array2(Object[] t) {
            this.list = new ArrayList();
            for (Object i : t)
                list.add(i);
        }

        public T get(int index) {
            return (T) this.list.get(index);
        }
    }

}
