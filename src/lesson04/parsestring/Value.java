package lesson04.parsestring;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class Value {

    public void parseValue(String value) throws MyException {

        ArrayList<String[]> valueArrayList = new ArrayList<>();

        String[] valueList = value.split("&");

        for (String s : valueList) {
            valueArrayList.add(s.split("="));
        }

        Map<String, String> map = new TreeMap<>();
        for (String[] s : valueArrayList) {
            map.put(s[0], s[1]);
        }

        for (Map.Entry<String, String> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }

    }
}
