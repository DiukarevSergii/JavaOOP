package lesson02.phoneV2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SamsungS4 extends Phone {

    public int countCall;
    public int countSMS;
    public static Map<String, SamsungS4> map = new HashMap<>();

    public SamsungS4() {
        System.out.println("SamsungS4 constructor");

        countSMS = 0;
        countCall = 0;
        touch = true;
        screenSize = 5;
        hasWifi = true;
    }

    public void setNumber(String n, SamsungS4 samsungS4) {
        String number = n;
        map.put(number, samsungS4);
    }

    @Override
    final public void call(String number) {
        countCall++;
//        System.out.println("SamsungS4 class is calling " + number);
        findPhone(number);
    }

    @Override
    public void sendSMS(String number, String message) {
        countSMS++;
        System.out.println("SamsungS4 class is sending sms " + message + " to " + number + " Hello");
    }

    public void findPhone(String number){
        boolean found = false;

        for (Map.Entry<String,SamsungS4> pair : map.entrySet()){
            if (pair.getKey().equals(number)) {
                pair.getValue().answer(number);
                found = true;
                break;
            }
        }

        if (!found)
            System.out.println(number + ": Not found!");

        System.out.println();
    }

    public void answer(String number){
        System.out.println(number + ": Answer");
    }
}
