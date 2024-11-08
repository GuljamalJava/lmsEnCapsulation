import javax.swing.*;
import java.time.LocalDate;
import java.time.Period;

public class School {
    private String name;
    private int dateOfStart;
    private String place;


    public School() {

    }

    public School(String name,int dateOfStart, String place) {
        this.name = name;
        this.dateOfStart = dateOfStart;
        this.place = place;


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDateOfStart() {
        return dateOfStart;
    }

    public void setDateOfStart(int dateOfStart) {
        this.dateOfStart = dateOfStart;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }


}