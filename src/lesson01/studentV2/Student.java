package lesson01.studentV2;

import sun.util.resources.LocaleData;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Formatter;


public class Student {
    private String name;
    private String surname;
//    private Date date;
    private LocalDate date;

//    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd MM YYYY");
    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd MM YYYY");

//    public Student(String name, String surname, Date date){
    public Student(String name, String surname, LocalDate date){
        this.name = name;
        this.surname = surname;
        this.date = date;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

//    public void setDate(Date date) {
    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getName() {

        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getDate() {
//        return simpleDateFormat.format(date);
    return dateTimeFormatter.format(date);
    }
}
