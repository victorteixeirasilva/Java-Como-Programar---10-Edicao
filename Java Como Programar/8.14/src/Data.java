public class Data {

    private int dia;
    private int mes;
    private int ano;


    public Data(String mes, int dia, int ano) {
        setDia(dia);
        setMes(stringToMes(mes.toUpperCase()));
        this.ano = ano;
    }

    public Data(int dia, int mes, int ano) {
        setDia(dia);
        setMes(mes);
        this.ano = ano;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        if (dia > 0 && dia <= 31) {
            this.dia = dia;
        } else {
            throw new IllegalArgumentException("Dia invalido!");
        }
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        if (mes > 0 && mes <= 12) {
            this.mes = mes;
        } else {
            throw new IllegalArgumentException("Mês Invalido!");
        }
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }


    @Override
    public String toString() {
        return "\n" +
                this.mes + "/" + this.dia + "/" + this.ano + "\n" +
                mesToString(this.mes) + " " + this.dia + ", " + this.ano + "\n" +
                this.dia + " " + this.ano;
    }

    private String mesToString(int mes) {
        return switch (mes) {
            case 1 -> "Janeiro";
            case 2 -> "Fevereiro";
            case 3 -> "Março";
            case 4 -> "Abril";
            case 5 -> "Maio";
            case 6 -> "Junho";
            case 7 -> "Julho";
            case 8 -> "Agosto";
            case 9 -> "Setembro";
            case 10 -> "Outubro";
            case 11 -> "Novembro";
            case 12 -> "Dezembro";
            default -> "";
        };
    }

    private int stringToMes(String mes) {
        return switch (mes.toUpperCase()) {
            case "JANEIRO" -> 1;
            case "FEVEREIRO" -> 2;
            case "MARÇO" -> 3;
            case "ABRIL"-> 4;
            case "MAIO" -> 5;
            case "JUNHO" -> 6;
            case "JULHO" -> 7;
            case "AGOSTO" -> 8;
            case "SETEMBRO" -> 9;
            case "OUTUBRO" -> 10;
            case "NOVEMBRO" -> 11;
            case "DEZEMBRO" -> 12;
            default -> throw new IllegalStateException("Unexpected value: " + mes.toUpperCase());
        };
    }
}
