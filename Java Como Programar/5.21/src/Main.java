/*
    5.21 - (Triplos de Pitágoras) Um triângulo retângulo pode ter lados cujos comprimentos são todos inteiros.
    O conjunto de três valores inteiros para os comprimentos dos lados de um triângulo retângulo é chamado de
    triplo de Pitágoras. Os comprimentos dos três lados devem satisfazer a relação de que a soma dos quadrados
    de dois do lados é igual ao quadrado da hipotenusa. Escreva um aplicativo para exibir uma tabela dos triplos
    de Pitágoras para side1, side2 e hypotenuse, todos são maiores que 500. Utilize um loop for triplamente aninhado
    que tenta todas as possibilidades. Esse é um método de computação de “força bruta”. você aprenderá nos cursos de
    ciência da computação mais avançados que para muitos problemas interessantes não há uma abordagem algorítmica
    conhecida além do uso de força bruta absoluta.
 */
/**
 * @author Victor Teixeira Silva
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {

        System.out.println("Triplos Pitagóricos (lado1 > 500, lado2 > 500):");
        System.out.println("-----------------------------------------");
        System.out.println(" lado1 | lado2 | hipotenusa");
        System.out.println("-----------------------------------------");

        for (int lado1 = 501; lado1 <= 1000; lado1++) { // Lado 1 deve ser maior que 500
            for (int lado2 = 501; lado2 <= 1000; lado2++) { // Lado 2 deve ser maior que 500
                for (int hipotenusa = 501; hipotenusa <= 1500; hipotenusa++) { // Hipotenusa também
                    if (lado1 * lado1 + lado2 * lado2 == hipotenusa * hipotenusa) {
                        System.out.printf(" %5d | %5d | %8d\n", lado1, lado2, hipotenusa);
                    }
                }
            }
        }

        System.out.println("-----------------------------------------");
    }
}