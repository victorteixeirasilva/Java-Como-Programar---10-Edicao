/*
    @Autor Victor Teixeira Silva

 */

import java.time.LocalDateTime;

public class DateOfBirth {

    private int day;
    private int month;
    private int year;

    public DateOfBirth(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int ageInYears(){
        int anoAtual = LocalDateTime.now().getYear();

        return anoAtual-year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return day + "/" + month + "/" + year;
    }


}
