package lesson02.phoneV2;

public class MainClass {

	public static void main(String[] args) {
		// Phone p = new Phone(); ошибка т.к. класс абстрактный
		
//		Nokia3310 nokia = new Nokia3310();
//		System.out.println("Nokia3310 screent size: " + nokia.getScreenSize());
//		nokia.call("123-45-67");
//		nokia.sendSMS("567-78-89", "text message");
//
//		System.out.println("----------------------------------");
//
//		IPhone iphone = new IPhone();
//		System.out.println("IPhone screent size: " + iphone.getScreenSize());
//		iphone.call("123-45-67");
//		iphone.sendSMS("567-78-89", "text message");
//
//		System.out.println("----------------------------------");
//
//		IPhone5 iphone5 = new IPhone5();
//		System.out.println("IPhone screent size: " + iphone5.getScreenSize());
//		iphone5.call("123-45-67");
//		iphone5.sendSMS("567-78-89", "text message");
//
//
//		System.out.println("----------------------------------");

		SamsungS4 samsungS4 = new SamsungS4();
		SamsungS4 samsungS5 = new SamsungS4();
//		System.out.println("SamsungS4 screen size: " + samsungS4.getScreenSize());
		samsungS4.setNumber("113", samsungS4);
		samsungS4.setNumber("114", samsungS4);
		samsungS4.setNumber("118", samsungS4);

		System.out.println();

		samsungS4.call("114");
		samsungS4.call("113");
		samsungS4.call("911");
		samsungS4.setNumber("911", samsungS4);
		samsungS4.call("911");

//		samsungS4.sendSMS("911", "message1");
//		samsungS4.sendSMS("911", "message2");
//		samsungS4.sendSMS("911", "message2");
//		samsungS5.sendSMS("911", "message1");

//		System.out.println(samsungS4.countSMS);
//		System.out.println(samsungS5.countSMS);
	}
}
