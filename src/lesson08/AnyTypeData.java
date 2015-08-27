package lesson08;

//Write class, which can keep inside any type of data
//Implement, method that return any element from array by index

import java.util.ArrayList;
import java.util.Arrays;

public class AnyTypeData {

    public static void main(String[] args) {
        AnyType<Integer> m1 = new AnyType<>();
        AnyType<int[]> m2 = new AnyType<>();

        int[] arr = {1, 2, 3};
        m2.setValue(arr);
        System.out.println(Arrays.toString(m2.getValue()));

        int i = 11;
        m1.setValue(i);
        System.out.println(m1.getValue());
    }

    public static class AnyType<E> {
        protected E value;
//        private ArrayList<E> list;

        public E getValue() {
            return value;
        }

        public void setValue(E value) {
            this.value = value;
        }
    }
}

