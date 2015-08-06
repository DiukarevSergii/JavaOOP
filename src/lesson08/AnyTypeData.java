package lesson08;

/*Ќаписать класс, который умеет хранить в себе массив
любых типов данных (int, long etc.). –еализовать метод,
который возвращает любой элемент массива по индексу.*/

import java.util.ArrayList;
import java.util.List;

public class AnyTypeData {

    private static class AnyType{

        public AnyType(int [] array){
            List<Integer> list = new ArrayList<>(20);
            for (int e : array)
                list.add(e);
        }
    }

    public static void main(String[] args) {
        int[]arr = {1,2,3,4};
        AnyType anyType = new AnyType(arr);
        System.out.println(anyType.toString());
    }
}
