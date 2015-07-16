package lesson04.studentlist;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class MyClass {

    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern(("dd, MM, yyyy"));
        StudentList sl = new StudentList();
        Scanner scanner = new Scanner(System.in);

        String name = "";
        String surname = "";
        boolean b;
        LocalDate forLoop = null;

        for (int i = 0; i < sl.getLength(); i++) {
            b = false;
            //Enter name, surname, date
            while (!b) {
                try {
                    System.out.println("Please enter the name: ");
                    name = scanner.nextLine();
                    sl.setVoid(name);
                    System.out.println("Please enter the surname: ");
                    surname = scanner.nextLine();
                    sl.setVoid(surname);
                    b = true;
                } catch (VoidException s) {
                    System.out.println(s.getMessage());
                }
            }
            b = false;
            while (!b) {
                try {
                    System.out.println("Please enter the date (dd, MM, yyyy): ");
                    String date = scanner.nextLine();
                    forLoop = LocalDate.parse(date, dtf);
                    b = true;
                } catch (DateTimeParseException d) {
                    System.out.println("Format is incorrect! Please, try again!");
                }
            }
            sl.add(new Student(name, surname, forLoop));
        }
        System.out.println("\n" + sl.listToString() + "\n");

        for (int i = 0; i < sl.getLength(); i++) {
            System.out.println(sl.get(i).getName() + " " + sl.get(i).getSurname() + " "
                    + dtf.format(sl.get(i).getBirth()));
        }

        try {
            int findNumberOfDate = sl.findDate(LocalDate.parse("08, 02, 1979", dtf));
            System.out.println(sl.get(findNumberOfDate).getSurname());
        } catch (NullPointerException n) {
            System.out.println("\n" + "That date does not exist!");
        }

        int n = sl.findName("Seva");
        System.out.println(sl.get(n).getBirth());

        //We got below search by name, surname and date
        /*int n = sl.findName("Seva");
        System.out.println(sl.get(n).getBirth());

		int n1 = sl.findSurname("Bobov");
		System.out.println(sl.get(n1).getBirth());

		int findNumberOfDate = sl.findDate(LocalDate.parse("08, 02, 1979", dtf));
        System.out.println(sl.get(findNumberOfDate).getSurname());*/
    }
}
