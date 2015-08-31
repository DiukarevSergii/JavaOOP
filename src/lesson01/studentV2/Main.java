package lesson01.studentV2;

import sun.util.resources.LocaleData;

import java.time.LocalDate;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
//        Student student01 = new Student("Viktor", "Petrovich", new Date(2004 - 1900, 01, 02));
//        Student student02 = new Student("Mitya", "Evgenov", new Date(1999 - 1900, 3, 3));

        Student student01 = new Student("Viktor", "Petrovich", LocalDate.of(2004, 01, 02));
        Student student02 = new Student("Mitya", "Evgenov", LocalDate.of(1999, 3, 3));

        StudentList list = new StudentList();

        list.add(student01);
        list.add(student02);

        System.out.println(list.getList(0).getName() + " " + list.getList(0).getSurname()
                + " " + list.getList(0).getDate());
        System.out.println(list.getList(1).getName() + " " + list.getList(1).getSurname()
                + " " + list.getList(1).getDate());

        System.out.println(list.findName("Vikto"));
        System.out.println(list.findName("Viktor"));

        System.out.println(list.findDate("02, 01, 2004"));
        System.out.println(list.findDate("02 01 2004"));
    }
}
