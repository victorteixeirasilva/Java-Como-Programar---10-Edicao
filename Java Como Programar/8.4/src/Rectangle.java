/**
 * @author Victor Teixeira Silva
 * @version 1.0
 *
 * @description
 * Crie uma classe Rectangle com os atributos length e width, cada um dos quais assume o padrão de 1.
 * Forneça os métodos que calculam o perímetro e a área do retângulo. A classe tem métodos set e get para o comprimento
 * (length) e a largura (width). Os métodos set devem verificar se length e width são, cada um, números de ponto
 * flutuante maiores que 0,0 e menores que 20,0. Escreva um programa para testar a classe Rectangle.
 *
 */
public class Rectangle {

    private double length = 1;
    private double width = 1;

    public double calcualrPerimetro() {
        return 2*(length+width);
    }

    public double calcularArea(){
        return length*width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length > 0.0 && length < 20.0) {
            this.length = length;
        } else {
            throw new IllegalArgumentException("Valor informado menor que 0.0 ou maior que 20.0");
        }
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width > 0.0 && width < 20.0) {
            this.width = width;
        } else {
            throw new IllegalArgumentException("Valor informado menor que 0.0 ou maior que 20.0");
        }
    }
}
