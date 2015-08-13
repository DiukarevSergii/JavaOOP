package Example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * Created by 1 on 13.08.2015.
 */
public class LinkedTime {

    //    private static void testCollections() {
    public static void main(String[] args) {


        final int MAX = 10000000;
        long startTime = 0;
        startTime = System.nanoTime();

        System.out.println(startTime);

        ArrayList<Integer> al = new ArrayList<Integer>(MAX);
        for (int i = 0; i < MAX; i++)
            al.add(i);
        System.out.println("AL add = " + (System.nanoTime() - startTime));
        startTime = System.nanoTime();

        LinkedList<Integer> ll = new LinkedList<Integer>();
        for (int i = 0; i < MAX; i++)
            ll.add(i);
        System.out.println("LL add = " + (System.nanoTime() - startTime));
        startTime = System.nanoTime();

        for (int i = 0; i < 100; i++)
            al.add(MAX / 2, i);
        System.out.println("AL expand = " + (System.nanoTime() - startTime));
        startTime = System.nanoTime();

        for (int i = 0; i < 100; i++) {
            ListIterator<Integer> it = ll.listIterator(MAX / 2);
            it.add(new Integer(i));
        }
        System.out.println("LL expand = " + (System.nanoTime() - startTime));
    }
}
