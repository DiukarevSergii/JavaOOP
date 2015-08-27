package lesson08;

import java.awt.List;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

public class AnyType {

    public static void main(String args[]) {

        int[] k = {1, 2, 3, 4, 5, 6, 7};
        Integer[] i = {1, 2, 3, 4, 5, 6, 7};
        String[] s = {"abc", "def", "c", "d", "e"};

        Array1<Integer> array1 = new Array1<>(i);
        Array1<String> array2 = new Array1<>(s);

//        Array2<int[]> array2 = new Array2<>(k);
        System.out.println(array2.get(1));
    }

    /* Написать класс, который умеет хранить в себе массив любых типов данных (int, long etc.).
     *  Реализовать метод, который возвращает любой элемент массива по индексу.
     * */
    static class Array1<T> {
        private ArrayList<T> list;

        public Array1(T[] t) {
            this.list = new ArrayList<T>();
            for (T i : t)
                list.add(i);
        }

        public T get(int index) {
            return this.list.get(index);
        }
    }
//    class Array2 <T>{
//        private ArrayList<Object> aL;
//
//        public Array2 (Object[] t){
//            this.aL = new ArrayList();
//            for(Object i: t) aL.add(i);
//        }
//
//        public T get(int index){
//            return (T)this.aL.get(index);
//
//        }
//    }
}
