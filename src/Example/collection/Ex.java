package Example.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class Ex {
    public static void main(String[] args) {
//        Collection collection   = new HashSet();
////        collection.add("1");
//
//        Collection elements     = new HashSet();
//        boolean containsAll     = collection.containsAll(elements);
//        System.out.println(containsAll);

        ArrayList<String> list01 = new ArrayList<>();
        list01.add("1");
        ArrayList<String> list02 = new ArrayList<>();
        list02.add("1");
        list02.add("2");
        boolean containsAll = list01.containsAll(list02);

        System.out.println(containsAll);

    }
}
