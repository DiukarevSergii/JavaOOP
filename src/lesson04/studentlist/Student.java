package lesson04.studentlist;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Student {
    //SimpleDateFormat sdf = new SimpleDateFormat("yyyy, MM, dd");
    DateTimeFormatter sdf = DateTimeFormatter.ofPattern("dd, MM, yyyy");
    private String name, res;
    private String surname;
    private LocalDate birth;

    public Student(String name, String surname, LocalDate birth) {
        this.name = name;
        this.surname = surname;
        this.birth = birth;
        res = sdf.format(birth);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getBirth() {
        return res;
    }

    public void setBirth(LocalDate birth) {
        this.birth = birth;
    }


//	public Date getBirth() {
//		return birth;
//	}
//
//	public void setBirth(Date birth) {
//		this.birth = birth;
//	}
}
