package lesson04.parsestring;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class Value {

    public void parseValue(String value) throws MyException {

        if (value.equals("para"))
            throw new MyException("Ok!");

        ArrayList<String[]> valueArrayList = new ArrayList<>();

        String[] valueList = value.split("&");

        for (String s : valueList) {
            valueArrayList.add(s.split("="));
        }
        try {

            Map<String, String> map = new TreeMap<>();
            for (String[] s : valueArrayList) {
                map.put(s[0], s[1]);
            }


            for (Map.Entry<String, String> pair : map.entrySet()) {
                System.out.println(pair.getKey() + " " + pair.getValue());
            }
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            throw new MyException("\n!!!hello");
        }


    }
}
