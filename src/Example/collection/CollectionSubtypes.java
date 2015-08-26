package Example.collection;

import java.util.*;

public class CollectionSubtypes {

    public static void doSomething(Collection collection) {

        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            Object object = iterator.next();

            System.out.println("hi"); //do something to object here...
        }
    }

    public static void main(String[] args) {
        Set set = new HashSet();
        List list = new ArrayList();

        doSomething(set);
        doSomething(list);

        String     anElement  = "an element";
        Collection collection = new HashSet();

        boolean didCollectionChange = collection.add(anElement);
        boolean wasElementRemoved   = collection.remove(anElement);

        Set  aSet  = new HashSet(); // get Set  with elements from somewhere
        List aList = new LinkedList(); // get List with elements from somewhere

//        Collection collection2 = new HashSet();


        collection.add(aSet);    //returns boolean too, but ignored here.
        collection.addAll(aList);   //returns boolean too, but ignored here.

        collection.removeAll(aList);   //returns boolean too...
        collection.retainAll(aSet);    //returns boolean too...

        Collection collection3   = new HashSet();

        String str = "an element";
//        collection3.add(str);

        boolean containsElement = collection3.contains("n element");
        System.out.println(containsElement);

        Collection elements = new HashSet();


        collection3.add(elements);
        boolean containsAll     = collection3.containsAll(elements);
        System.out.println(containsAll);
        System.out.println(collection3.size());
    }
}
