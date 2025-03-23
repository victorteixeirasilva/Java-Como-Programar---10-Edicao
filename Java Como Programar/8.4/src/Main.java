/**
 * @author Victor Teixeira Silva
 * @version 1.0
 *
 * @description
 * Crie uma classe Rectangle com os atributos length e width, cada um dos quais assume o padrão de 1.
 * Forneça os métodos que calculam o perímetro e a área do retângulo. A classe tem métodos set e get para o comprimento
 * (length) e a largura (width). Os métodos set devem verificar se length e width são, cada um, números de ponto
 * flutuante maiores que 0,0 e menores que 20,0. Escreva um programa para testar a classe Rectangle.
 */
public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();

        rectangle.setLength(2.0);
        rectangle.setWidth(4.0);

        System.out.println(rectangle.getLength());
        System.out.println(rectangle.getWidth());
        System.out.println(rectangle.calcualrPerimetro());
        System.out.println(rectangle.calcularArea());

    }
}