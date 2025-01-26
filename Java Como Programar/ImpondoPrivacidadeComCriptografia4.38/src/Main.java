/*
    (Impondo privacidade com criptografia) O crescimento explosivo de comunicação e armazenamento de dados na "internet" e
em computadores conectados por ela aumentou muito a preocupação com a privacidade. O campo da criptografia envolve a
codificação de dados para torná-los difíceis de acessar (e espera-se - com esquemas mais avançados - impossíveis de
acessar) para usuários sem autorização de leitura. Nesse exercício, você investigará um esquema simples para criptografar
e descriptografar dados. Uma empresa que quer enviar dados pela "internet" pediu-lhe que escrevesse um programa que
criptografe dados a fim de que eles possam ser transmitidos com maior segurança. Todos os dados são transmitidos como
inteiros de quatro dígitos. O seu aplicativo deve ler um inteiro de quatro dígitos inserido pelo usuário e criptografá-lo
da seguinte maneira: substitua cada dígito pelo resultado da adição de 7 ao dígito, obtendo o restante depois da divisão
do novo valor por 10. Troque então o primeiro dígito pelo terceiro e o segundo dígito pelo quarto. Então, imprima o
inteiro criptografado. Escreva um aplicativo separado que receba a entrada de um inteiro de quatro dígitos criptografado
e descriptografe (revertendo o esquema de criptografia) para formar o número original. [Projeto de leitura opcional:
pesquise a "criptografia de chave pública" em gral e o esquema de chave pública específica PGP (Pretty Good Privacy).
Você também pode querer investigar o esquema RSA, que é amplamente usado em aplicativos robustos industriais.]


 */

import javax.swing.*;
import java.util.Scanner;

/**
 * @author Victor Teixeira Silva
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {

        String option = Interface.bemVindo();

        switch (Integer.parseInt(option)){
            case 1:
                Interface.criptografar();
                break;
            case 2:
                Interface.descriptografar();
                break;
            default:
                break;
        }
    }
}