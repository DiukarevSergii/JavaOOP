package lesson08;

//Write class, which can keep inside any type of data
//Implement, method that return any element from array by index

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnyTypeData {

    private static class AnyType{
        protected List<Integer> listInt = new ArrayList<>(20);
        protected List<Long> listLong = new ArrayList<>(20);


        public AnyType(int[] array){
            for (int e : array)
                listInt.add(e);
            System.out.println(listInt.toString());


        }
        public AnyType(long [] array){
            for (long e : array)
                listLong.add(e);
            System.out.println(listLong.toString());
        }

    }

    public static void main(String[] args) {
        int[]arrInt = {1,2,3,4};
        AnyType anyType1 = new AnyType(arrInt);
        long[]arrLong = {1,2,4};
        AnyType anyType2 = new AnyType(arrLong);
        System.out.println(anyType1.listInt.get(2));
        System.out.println(anyType2.listLong.get(0));
    }
}
