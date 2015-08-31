package lesson01.studentV2;

import java.util.Arrays;

public class StudentList {
    private int counter = 0;
    private Student[] list = new Student[10];

    public void add(Student student) {
        list[counter++] = student;
    }

    public int getCounter() {
        return counter;
    }

    public Student getList(int c) {
        return list[c];
    }

    public String findName(String name) {
        for (int i = 0; i < counter; i++) {
            if (list[i].getName().equals(name))
                return toString(list[i]);
        }
        return "Not found!";
    }

    public String findDate(String date) {
        for (int i = 0; i < counter; i++) {
            if (list[i].getDate().equals(date))
                return toString(list[i]);
        }
        return "Not found!";
    }


    public String toString(Student student) {
        return student.getName() + " " + student.getSurname() + " " + student.getDate();
    }
}
