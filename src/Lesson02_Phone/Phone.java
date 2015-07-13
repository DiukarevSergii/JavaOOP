package Lesson02_Phone;

public abstract class Phone {

    public static Phone[] numberList = new Phone[10];
    protected boolean touch;
    protected boolean hasWifi, n;
    protected int screenSize;
    protected String phoneNumber, f;
    private int p = 0;

    public Phone() {
        System.out.println("Phone constructor");
    }

    public void addnumber(Phone s) {
        numberList[p++] = s;
    }

    public boolean isTouch() {
        return touch;
    }

    public boolean isHasWifi() {
        return hasWifi;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void call(String number) {
        System.out.println("Phone class is calling " + number);
    }

    public abstract void sendSMS(String number, String message);

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAnswer(String number) {
        for (int i = 0; i < p; i++) { //why if I write here  'i < numberList.length' ERROR NullPointerException
            if (numberList[i].getPhoneNumber().equals(number)) {
                f = "All okey, bro!";
            } else
                f = "Not okey,  bro!";
        }
        return f;
    }
}
