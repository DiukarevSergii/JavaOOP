package lesson04.studentlist;

import java.util.Scanner;
import java.time.* ;

public class MyClass {

    public static void main(String[] args) {

        StudentList sl = new StudentList();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < sl.getLength(); i++){
            System.out.println("Please enter the name: ");
            String name = scanner.nextLine();
            System.out.println("Please enter the surname: ");
            String surname = scanner.nextLine();
            sl.add(new Student(name, surname, LocalDate.of(2011, 11, 10)));
            //sl.add(new Student(name, surname, new Date(2014 - 1900, 3, 28)));
        }
        System.out.println("");
        System.out.println(sl.listToString());

        System.out.println("");
        for (int i = 0; i < 3; i++) {
            System.out.println(sl.get(i).getName() + " " + sl.get(i).getSurname() + " " + sl.get(i).getBirth());
            System.out.println("");
        }
    }
}
