package lesson08;

import java.util.ArrayList;

public class ToListWithRemove {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 7, 5, 6, 4, 2, 0};
        System.out.println(byList(arr));
    }

    public static ArrayList<Integer> byList(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>(20);
        for (int i = 0; i < arr.length; i++)
            list.add(arr[i]);
        list.remove(0);
        list.remove(0);
        list.remove(list.size() - 1);
        return list;
    }
}
