import javax.swing.*;

/*
    Introduzimos a calculadora de índice de massa corporal (IMC) no Exercício 1.10. As fórmulas para calcular o IMC são
IMC = pesoEmLibras X 703 / alturaEmPolegadas^2 ou IMC = pesoEmQuilogramas / alturaEmMetros^2 Crie um aplicativo de
calculadora IMC que leia o peso do usuário em libras e a altura em polegadas (ou, se prefirir, o peso em quilogramas a
altura em metros) e, então calcule exiba o índice de massa corporal dele. Além disso, que exiba as seguintes informações
do department of Health and Human Services/National Institutes of Health, assim o usuário pode avaliar o seu IMC:
================================
BMI VALUES
Underweight: less than 18.5
Normal: between 18.5 and 24.9
Overweight: beetween 25 and 29.9
Obese: 30 or greater
================================


 */

/**
 * @author Victor Teixeira Silva
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {

        String altura = JOptionPane.showInputDialog("Digite sua altura em Metro (Exemplo: 1.60");
        String peso = JOptionPane.showInputDialog("Informe seu peso em quilogramas (Exemplo: 77.5");

        double imc = Double.parseDouble(peso)/(Double.parseDouble(altura)*Double.parseDouble(altura));

        JOptionPane.showMessageDialog(null,
                "Seu IMC é: "+imc+"\n"+
                        "================================\n" +
                        "BMI VALUES\n" +
                        "Underweight: less than 18.5\n" +
                        "Normal: between 18.5 and 24.9\n" +
                        "Overweight: beetween 25 and 29.9\n" +
                        "Obese: 30 or greater\n" +
                        "================================"
        );

    }
}