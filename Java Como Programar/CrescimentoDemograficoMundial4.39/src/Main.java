/*
    (Crescimento Demográfico Mundial) A população mundial cresceu consideravelmente ao longo dos séculos. O crescimento
contínuo pode, por fim, desafiar os limites de ar respirável, água potável, terra fértil para agricultura e outros
recursos limitados. Há evidência de que o crescimento tem reduzido a velocidade nos últimos anos e a população mundial
pode chegar ao ponto máximo em algum momento nesse século e, então começar a diminuir. Para esse exercício, pesquise
questões de crescimento demográfico mundial "on-line". Não deixe de investigar vários pontos de vista. Obtenha
estimativas da população mundial atual e a sua taxa de crescimento (a porcentagem pela qual provavelmente aumentará
neste ano). Escreva um programa que calcule o crescimento demográfico mundial anual dos próximos 75 anos, utilizando a
premissa simplificadora de que a taxa de crescimento atual ficará constante. Imprima os resultados numa tabela. A
primeira Coluna deve exibir os anos de ano 1 ao ano 75. a segunda coluna deve exibir a população mundial esperada no fim
desse ano. Utilizando os seus resultados, determine o ano em que a população dobraria com relação ao número de hoje se a
taxa de crescimento do ano atual persistisse.

Anotações:
    Taxa 1,02% -> / 100 -> 0,012

    8,073

    Escreva um programa que calcule o crescimento demográfico mundial anual dos próximos 75 anos.

    Imprima os resultados numa tabela

    A primeira Coluna deve exibir os anos de ano 1 ao ano 75

    a segunda coluna deve exibir a população mundial esperada no fim desse ano

    determine o ano em que a população dobraria com relação ao número de hoje se a taxa de crescimento do ano atual persistisse.
 */
/**
 * @author Victor Teixeira Silva
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {

        System.out.print("* "+"Ano"+"  *" + " População Mundial Esperada   *\n");

        double quantidadeDePessoas = 8.073;
        double taxaDeCrescimentoAnual = 0.012;

        int ano2x = 0;

        for (int ano = 1; ano <= 75; ano++){
            quantidadeDePessoas = (quantidadeDePessoas*taxaDeCrescimentoAnual)+quantidadeDePessoas;

            if (quantidadeDePessoas>=8.073*2&&quantidadeDePessoas<=8.073*2.03) {
                 ano2x = ano;
            }

            System.out.print("* "+ano+"   *"+" "+quantidadeDePessoas+" milhoes   *\n");
        }

        System.out.println("No Ano("+ano2x+") a população dobra sua quantidade inicial.");

    }
}