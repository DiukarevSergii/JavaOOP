package lesson02.phoneV2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SamsungS4 extends Phone {

    public int countCall;
    public int countSMS;
    public static Map<String, String> set = new HashMap<>();

    public SamsungS4() {
        System.out.println("SamsungS4 constructor");

        countSMS = 0;
        countCall = 0;
        touch = true;
        screenSize = 5;
        hasWifi = true;
    }

    @Override
    final public void call(String number) {
        countCall++;
        System.out.println("SamsungS4 class is calling " + number);
    }

    @Override
    public void sendSMS(String number, String message) {
        countSMS++;
        System.out.println("SamsungS4 class is sending sms " + message + " to " + number + " Hello");
    }

}
