/*
    @Autor Victor Teixeira Silva

    3- Crie uma classe chamada DateOfBirth, (Com os atributos dia/mês/ano).

    7- A classe DateOfBirth também deve incluir um método que calcule e retorne a idade (em anos)

 */

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;

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
    /*
    incluindo nome, sobrenome e data de nascimento da pessoa -
    calcule e imprima a idade da pessoa (em anos), seu intervalo de frequência cardíaca máxima e sua fequência cardíaca alvo.
     */
}
