package lesson08;

import java.util.ArrayList;

/*Написать метод для конвертации массива строк/чисел в список.*/

public class ToList {
    public static void main(String[] args) {
        int[]arr = {1,2,2,2,3,5,6,4,2,0};
        System.out.println(byList(arr));
    }

    public static ArrayList<Integer> byList(int[] arr){
        ArrayList<Integer>list = new ArrayList<>(20);
      for (int i = 0; i < arr.length;i++)
          list.add(arr[i]);
        return list;
    }
}
