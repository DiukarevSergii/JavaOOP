package lesson04.studentlist;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class MyClass {

    public static void main(String[] args) {

        StudentList sl = new StudentList();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < sl.getLength(); i++) {

            //Enter name, surname, date
           /* System.out.println("Please enter the name: ");
            String name = scanner.nextLine();
            System.out.println("Please enter the surname: ");
            String surname = scanner.nextLine();*/
            System.out.println("Please enter the date (year, month, day): ");
            DateTimeFormatter sdf = DateTimeFormatter.ofPattern("dd, MM, yyyy");
            String date = scanner.nextLine();
            sl.add(new Student("name", "surname", LocalDate.parse(date, sdf)));
        }
        System.out.println("");
        System.out.println(sl.listToString());

        System.out.println("");
        for (int i = 0; i < 3; i++) {
            System.out.println(sl.get(i).getName() + " " + sl.get(i).getSurname() + " " + sl.get(i).getBirth());
            System.out.println(sl.get(i).getBirth());
            System.out.println("");
        }

        //We got below search by name, surname and date
		/*int n = sl.findName("Seva");
        System.out.println(sl.get(n).getBirth());

		int n1 = sl.findSurname("Bobov");
		System.out.println(sl.get(n1).getBirth());

		int n2 = sl.findDate("08/02/1979");
		System.out.println(sl.get(n2).getSurname());*/
    }
}
