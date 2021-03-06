package lesson01.student;

import java.util.Arrays;

public class StudentList {
    private Student[] list = new Student[10];
    private int p = 0;

    public void add(Student s) {
        list[p++] = s;
    }

    public void delete(int n){
        list[n] = null;
    }

    public Student get(int n) {
        return list[n];
    }

    public String listtoString() {
        String i = Arrays.toString(list);
        return  i;
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

    public int findDate(String res) {
        for (int i = 0; i < p; i++) {
            if (list[i].getBirth().equalsIgnoreCase(res))
                return i;
        }

        return -1;
    }


}
