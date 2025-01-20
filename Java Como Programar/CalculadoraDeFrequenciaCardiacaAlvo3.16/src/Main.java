/**
 * @author Victor Teixeira Silva
 * @version 1.0
 */
/*

   Ao fazer exercícios físicos, você pode utilizar um monitor de frequência cardíaca para ver se sua frequência permanece
dentro de um intervalo seguro sugerido pelos seus treinadores e médicos. Segundo a American Heart Association (AHA), a
fórmula para calcular a frquência cardiaca máxima por minuto é 220 menos a idade em anos. Sua frequência cardiaca alvo é
um intervalo entre 50-85% da sua frequência cardíaca máxima. [Observação: essas fórmulas são estimativas fornecidas pela
AHA. as frquências cardíacas máximas e alvo podem variar com base na saúde, capacidade física e sexo da pessoa. Sempre
consulte um médico ou profissional da saúde qualificado antes de começar ou modificar um programa de exercícios físicos.]
Crie uma classe chamada HeartRates. Os atributos da classe devem incluir o nome, sobrenome e data de nascimento da pessoa
(consistindo em atributos separados para mês, dia e ano de nascimento). Sua classe deve ter um construtor que receba esses
dados como parâmetros. Para cada atributo forneça métodos set e get. A classe também deve incluir um método que calcule
e retorne a idade (em anos), um que calcule e retorne a frequência cardíaca máxima e um que calcule e retorne a frequência
cardíaca alvo da pessoa. Escreva um aplicativo Java que solicite as informações da pessoa, instancie um objeto da classe
HeartRates e imprima as informações a partir desse objeto - incluindo nome, sobrenome e data de nascimento da pessoa -
calcule e imprima a idade da pessoa (em anos), seu intervalo de frequência cardíaca máxima e sua fequência cardíaca alvo.

Use JOptionPane

Anotações para solução:

Escreva um aplicativo Java que solicite as informações da pessoa, instancie um objeto da classe
HeartRates e imprima as informações a partir desse objeto - incluindo nome, sobrenome e data de nascimento da pessoa -
calcule e imprima a idade da pessoa (em anos), seu intervalo de frequência cardíaca máxima e sua fequência cardíaca alvo.

    1- frquência cardiaca máxima por minuto é 220 menos a idade em anos.

    2- Sua frequência cardiaca alvo é um intervalo entre 50-85% da sua frequência cardíaca máxima.

    3- Crie uma classe chamada DateOfBirth, (Com os atributos dia/mês/ano).

    4- Crie uma classe chamada HeartRates.

    5- Os atributos da classe devem incluir o nome, sobrenome e data de nascimento da pessoa

    6- Sua classe deve ter um construtor que receba esses dados como parâmetros. Para cada atributo forneça métodos set e get.

    7- A classe DateOfBirth também deve incluir um método que calcule e retorne a idade (em anos)

    8- A classe HeartRates dete incluir um método que calcule e retorne a frequência cardíaca máxima

    9- A classe HeartRates dete incluir um método que calcule e retorne a frequência cardíaca alvo da pessoa.

    10- Monte o front-end

 */

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null,
                "Bem Vindo! \n " +
                        "A Calculadora de Frequência Cardiaca Alvo \n" +
                        "Desenvolvido por: Victor Teixeira Silva");

        String firstName = JOptionPane.showInputDialog("Informe seu primeiro nome:");
        String lastName = JOptionPane.showInputDialog("Informe seu sobrenome:");
        String yearString = JOptionPane.showInputDialog("Informe o ano em que você nasceu:");
        String monthString = JOptionPane.showInputDialog("Informe o Mês em que você nasceu:");
        String dayString = JOptionPane.showInputDialog("Informe o dia que você nasceu:");

        DateOfBirth dateOfBirth = new DateOfBirth(Integer.parseInt(dayString),Integer.parseInt(monthString),Integer.parseInt(yearString));

        HeartRates heartRates = new HeartRates(firstName, lastName, dateOfBirth);

        JOptionPane.showMessageDialog(null,
                "\n" +
                "\n" +
                "Olá " + heartRates.getFirstName() + " " + heartRates.getLastName() + ",\n" +
                "Data de Nascimento: " + dateOfBirth + ",\n" +
                "Idade em Anos: " + dateOfBirth.ageInYears() + " anos,\n" +
                "Sua Frequência cardiaca máxima é: " + heartRates.maximumHeartRate() + ",\n" +
                "Seu intervalo de Frequência cardiaca alvo é: " + heartRates.targetHeartRate() + ".\n" +
                "\n" +
                "\n");
    }
}