package Lesson01_Student;

import java.util.Date;

public class MyClass {

    public static void main(String[] args) {
        StudentList sl = new StudentList();

        sl.add(new Student("Seva", "Evgienko", new Date(2014 - 1900, 3, 28)));
        sl.add(new Student("Vasya", "Pupkin", new Date(1975 - 1900, 11, 18)));
        sl.add(new Student("Vasya", "Bobov", new Date(1979 - 1900, 01, 8)));

		//We got below search by name, surname and date
		/*int n = sl.findName("Seva");
        System.out.println(sl.get(n).getBirth());

		int n1 = sl.findSurname("Bobov");
		System.out.println(sl.get(n1).getBirth());

		int n2 = sl.findDate("08/02/1979");
		System.out.println(sl.get(n2).getSurname());*/

        System.out.println("");
        System.out.println(sl.listtoString());

        System.out.println("");
        for (int i = 0; i < 3; i++) {
            System.out.println(sl.get(i).getName() + " " + sl.get(i).getSurname() + " " + sl.get(i).getBirth());
            System.out.println("");
        }
        //We use the delete function
        int n1 = sl.findSurname("Bobov");
        sl.delete(n1);
        System.out.println("");
        System.out.println(sl.listtoString());
    }
}
