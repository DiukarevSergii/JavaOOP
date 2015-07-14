package lesson02.phone;

public class MainClass {

    public static void main(String[] args) {

        // Phone p = new Phone(); ошибка т.к. класс абстрактный

        Nokia3310 nokia = new Nokia3310();
        nokia.addnumber(new Nokia3310());
        System.out.println("Nokia3310 screent size: " + nokia.getScreenSize());
        nokia.call("123-45-67");
        nokia.sendSMS("567-78-89", "text message");


        System.out.println("----------------------------------");

        IPhone iphone = new IPhone();
        System.out.println("IPhone screent size: " + iphone.getScreenSize());
        iphone.call("123-45-67");
        iphone.sendSMS("567-78-89", "text message");

        System.out.println("----------------------------------");

        IPhone5 iphone5 = new IPhone5();
        System.out.println("IPhone screent size: " + iphone5.getScreenSize());
        iphone5.call("123-45-67");
        iphone5.sendSMS("567-78-89", "text message");

        System.out.println("----------------------------------");

        SamsungS4 samsungS4 = new SamsungS4();
        samsungS4.addnumber(new SamsungS4());
        System.out.println("SamsungS4 screent size: " + samsungS4.getScreenSize());
        System.out.println("Has WiFi? -" + samsungS4.hasWifi);
        samsungS4.sendSMS(" 460-14-83 ", "HomeWork ");
        System.out.println(samsungS4.getAnswer(samsungS4.getPhoneNumber()));


    }
}
