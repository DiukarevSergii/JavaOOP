package lesson04.studentlist;

import java.time.LocalDate;
import java.util.Arrays;

public class StudentList{
    private Student[] list = new Student[5];
    private int p = 0;

    public void add(Student s) {
        list[p++] = s;
    }

    public int getLength() {
        return list.length;
    }

    public void delete(int n) {
        if (n < 0 || n >= list.length)
            return; // index out of bounds

        Student [] listNew = new Student[list.length - 1];
        System.arraycopy(list, 0, listNew, 0, n);
        System.arraycopy(list, n + 1, listNew, n, listNew.length - n);
        list = listNew;
    }

    public Student get(int n) {
        if (n >= 0 && n < list.length) {
            return list[n];
        }
        return null;
    }

    public String listToString() {
        return Arrays.toString(list);
    }

    public int findName(String name) {
        for (int i = 0; i < p; i++) {
            if (list[i].getName().equalsIgnoreCase(name))
                return i;
        }

        return -1;
    }

    public int findSurname(String surname) {
        for (int i = 0; i < p; i++) {
            if (list[i].getSurname().equalsIgnoreCase(surname))
                return i;
        }

        return -1;
    }

    public int findDate(LocalDate date) {
        for (int i = 0; i < p; i++) {
            if (list[i].getBirth().equals(date))
                return i;
        }

        return -1;
    }

    public void setVoid (String s) throws VoidException{
        if (s.equals(""))
            throw new VoidException("Format is incorrect! Please, try again!" + "\n");
    }
}
