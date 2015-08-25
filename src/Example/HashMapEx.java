package Example;

import java.util.*;

public class HashMapEx {
    public static void main(String[] args) {
        HashMap<String, String> oldMap = new HashMap<>();
        oldMap.put("key 1", "value 1");
        oldMap.put("key 2", "value 2");
        oldMap.put("key 3", "value 2");
        oldMap.put("key 4", "value 3");
        oldMap.put("key 5", "value 4");
        oldMap.put("key 6", "value 3");
        oldMap.put("key 7", "value 2");
        oldMap.put("key 8", "value 42");
        oldMap.put("key 9", "value 42");
        oldMap.put("key 10", "value 42");

        Iterator itr = oldMap.entrySet().iterator();
        while (itr.hasNext())
            System.out.println(itr.next());
    }
}