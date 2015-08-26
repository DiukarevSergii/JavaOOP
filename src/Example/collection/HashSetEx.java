package Example.collection;

import java.util.*;

public class HashSetEx {
    public static void main(String[] args) {
        HashSet<Integer> oldSet = new HashSet<>(20);
        for (int i = 0; i < 20; i++) {
//            int r = 0 + (int) (Math.random() * (20 - 0)+ 1);
//            System.out.print(r + " ");
//            oldSet.add(r);
            if (i == 5)
                oldSet.add(i + 1);
            else oldSet.add(i);
        }
//        HashSet<Integer> newSet = new HashSet<>();
//        for (Integer i : oldSet){
//            if (i < 10)
//                newSet.add(i);
//        }
//        System.out.println(newSet);

        NavigableSet mySet = new TreeSet<>(oldSet);
//        NavigableSet mySetNew = mySet.tailSet(10, true);
//        Object mySetNew = mySet.floor(5);
        System.out.println("\n" + mySet);
        Object mySetNew = mySet.pollLast();
        System.out.println(mySetNew);
        System.out.println(mySet);
    }
}
