import java.util.Scanner;

/**
 * @author Victor Teixeira Silva
 * @version 1.0
 *
 * @description 7.20 - (Vendas totais) Utilize um array bidimensional para resolver o seguinte problema: uma empresa tem
 *              quatro equipes de vendas (1 a 4) que vendem cinco produtos diferentes (1 a 5). Uma vez por dia, cada
 *              vendedor passa uma nota de cada tipo de produto diferente vendido. Cada nota contém o seguinte:
 *
 *               A) O número do vendedor
 *
 *               B) O número do produto
 *
 *               C) O valor total de reais desse produto vendido nesse dia
 *
 *              Portanto, cada vendedor entre 0 e 5 notas de vendas por dia. Suponha que as informações a partir de
 *              todas as notas durante o último mês estejam disponíveis. Escreva um aplicativo que leia todas as
 *              informações sobre as vendas do último mês e resuma as vendas totais por vendedor e por produto. Todos os
 *              totais devem ser armazenados no array bidimensional sales. Depois de processar todas as informações do
 *              último mês, exiba os resultados em formato tabular, com cada coluna representando um vendedor particular
 *              e cada linha representando um produto particular. Some cada linha para obter o total das vendas de cada
 *              produto no último mês. Some cada coluna para obter o total de vendas por vendedor no último mês. Sua
 *              saída tabular deve incluir esses totais cruzados à direita das linhas totalizadas e na parte inferior
 *              das colunas totalizadas.
 */
public class Main {
    public static void main(String[] args) {
        double[][] sales = new double[5][6];

        Scanner scanner = new Scanner(System.in);

        //Recebendo dados.
        for (int a = 1; a <= 4; a++){
            System.out.println();
            System.out.println("*** Vendedor " + a + " ***");
            for (int b = 1; b <= 5; b++){
                System.out.println("Informe o valor vendido no mês para o produto (" + b + ").");
                sales[a-1][b-1] = scanner.nextDouble();
            }
        }

        //Fazendo a soma de vendas totais de cada vendedor e colocando os resultados na última linha.
        int b;
        for ( b = 1; b < 5; b++){
            double soma = 0;
            int c;
            for (c = 1; c < 6; c++){
                soma += sales[b-1][c-1];
            }
            sales[b-1][c-1] = soma;
        }

        //Fazendo a soma de vendas totais de cada produto e colocando os resultados na última linha.
        int d;
        for ( d = 1; d < 6; d++){
            double soma = 0;
            int c;
            for (c = 1; c < 5; c++){
                soma += sales[c-1][d-1];
            }
            sales[c-1][d-1] = soma;
        }

        // Exibindo os resultados em formato tabular
        System.out.println("\nTabela de Vendas:");
        System.out.printf("%15s %15s %15s %15s %15s %15s %15s%n", "Produto/Vendedor", "Produto 1", "Produto 2", "Produto 3", "Produto 4", "Produto 5", "Total Vendedor");
        for (int i = 0; i < 5; i++) {
            if (i < 4) {
                System.out.printf("%15s", "Vendedor " + (i + 1));
            } else {
                System.out.printf("%15s", "Total Produto");
            }
            for (int j = 0; j < 6; j++) {
                System.out.printf("%15.2f", sales[i][j]);
            }
            System.out.println();
        }



    }
}