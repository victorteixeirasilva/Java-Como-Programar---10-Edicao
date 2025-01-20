/*
(CLasse Date) Crie uma classe chamada Date que inclua três variáveis de instância - Mês (tipo int), dia (tipo int)
e ano (tipo int). Forneça construtor que inicializa as três variáveis de instância supondo que os valores fornecidos
estejam corretos. Ofereça um método set e get para cada variável de instância. Apresente um método displayDate que
exiba mês, dia e ano separados por barras normais (/). Escreva um aplicativo de teste chamado DateTest que demonstre as
capacidades da classe Date.
 */

/**
 * @author Victor Teixeira Silva
 * @version 1.0
 */
public class Date {

    private int month;
    private int day;
    private int year;

    public Date(int month, int day, int year){
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public void displayDate(){
        System.out.println(this.day+"/"+this.month+"/"+this.year);
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
