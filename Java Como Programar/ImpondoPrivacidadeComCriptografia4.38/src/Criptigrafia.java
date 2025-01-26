/*
substitua cada dígito pelo resultado da adição de 7 ao dígito, obtendo o restante depois da divisão
do novo valor por 10. Troque então o primeiro dígito pelo terceiro e o segundo dígito pelo quarto.
 */

import javax.swing.*;

/**
 * @author Victor Teixeira Silva
 * @version 1.0
 */
public class Criptigrafia {

    public static void criptografar(int numero) {
        // Extraindo os dígitos
        int milhar = numero / 1000;
        int centena = (numero % 1000) / 100;
        int dezena = (numero % 100) / 10;
        int unidade = numero % 10;

        milhar = milhar+7;
        centena = centena+7;
        dezena = dezena+7;
        unidade = unidade+7;

        milhar = milhar%10;
        centena = centena%10;
        dezena = dezena%10;
        unidade = unidade%10;

        String trocaDeNumerosString = String.valueOf(dezena+""+unidade+""+milhar+""+centena);


        JOptionPane.showMessageDialog(null,"Número Criptografado: "+trocaDeNumerosString);

    }

    public static void descriptografar(int numero) {

        // Inverter a ordem dos dígitos
        int unidade = numero % 10;
        int dezena = (numero / 10) % 10;
        int centena = (numero / 100) % 10;
        int milhar = numero / 1000;

        // Subtrair 7 e ajustar valores negativos
        unidade = (unidade - 7 + 10) % 10;
        dezena = (dezena - 7 + 10) % 10;
        centena = (centena - 7 + 10) % 10;
        milhar = (milhar - 7 + 10) % 10;

        // Reconstruir o número original
        int numeroOriginal = milhar * 1000 + centena * 100 + dezena * 10 + unidade;

        JOptionPane.showMessageDialog(null,"Número Criptografado: "+numeroOriginal);

    }

}
