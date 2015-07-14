package lesson02.phone;

public class SamsungS4 extends Phone {

    public SamsungS4() {
        System.out.println("SamsungS4 constructor");

        touch = false;
        hasWifi = true;
        screenSize = 5;
        phoneNumber = "044";
    }

    @Override
    public void sendSMS(String number, String message) {
        System.out.println(message + number + " Hello");
    }

}
