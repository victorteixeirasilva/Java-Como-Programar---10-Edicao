import java.util.Scanner;

/**
 * @author Victor Teixeira Silva
 * @version 1.0
 * @description 7.40 - (Enquete) A internet e a web estão permitindo que mais pessoas trabalhem em rede, juntem-se a uma causa, expressem opiniões etc. Candidatos presidenciais recentes utilizaram a internet intensivamente para divulgar suas mensagens e levantar fundos para suas campanhas. Nesse exercício, você escreverá um programa de enquete simples que permite que os usuários classifiquem cinco questões da consciência social de 1 (menos importante) a 10 (mais importante). Escolha cinco causas que são importantes para você (por exemplo, questões políticas, questões ambientais globais). Use um array unidimensional topics (do tipo String) para armazenar as cinco causas. Para resumir as respostas à pesquisa, use um array bidimensional responses com 5 linhas e 10 colunas (do tipo int), cada linha correspondendo a um elemento no array topics. Quando o programa é executado, ele deve solicitar que o usuário avalie cada questão. Peça que seus amigos e família respondam à pesquisa. Então, faça o programa exibir um resumo dos resultados, incluindo:
 * @a) Um relatório tabular com os cinco temas no lado esquerdo inferior e as 10 classificações ao longo da parte superior, listando em cada coluna o número de classificações recebidas para cada tema.
 * @b) À direita de cada linha, mostre a média das classificações para essa questão.
 * @c) Qual questão recebeu o maior número de pontos? Exiba tanto a questão quanto o total de pontos.
 * @d) Qual tema recebeu o menor total de pontos? Exiba tanto a questão quanto o total de pontos.
 */
public class Main {
    public static void main(String[] args) {
        // Array unidimensional para armazenar os temas
        String[] topics = {
                "Mudanças Climáticas",
                "Educação",
                "Saúde Pública",
                "Igualdade de Gênero",
                "Tecnologia e Privacidade"
        };

        // Array bidimensional para armazenar as respostas
        int[][] responses = new int[5][10];

        // Scanner para entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita que o usuário avalie cada tema
        for (int i = 0; i < topics.length; i++) {
            System.out.println("Avalie o tema: " + topics[i] + " (1 = menos importante, 10 = mais importante)");
            int rating = scanner.nextInt();

            // Valida a entrada e armazena no array
            if (rating >= 1 && rating <= 10) {
                responses[i][rating - 1]++;
            } else {
                System.out.println("Por favor, insira uma classificação válida entre 1 e 10.");
                i--; // Repete a pergunta para o mesmo tema
            }
        }

        // Exibe o relatório tabular
        System.out.println("\nRelatório de Resultados:");
        System.out.printf("%-25s", "Tema");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println("   Média");

        int maxPoints = 0, minPoints = Integer.MAX_VALUE;
        String maxTopic = "", minTopic = "";

        for (int i = 0; i < topics.length; i++) {
            System.out.printf("%-25s", topics[i]);
            int totalPoints = 0;
            int totalResponses = 0;

            for (int j = 0; j < 10; j++) {
                System.out.printf("%4d", responses[i][j]);
                totalPoints += responses[i][j] * (j + 1);
                totalResponses += responses[i][j];
            }

            double average = totalResponses == 0 ? 0 : (double) totalPoints / totalResponses;
            System.out.printf("   %.2f\n", average);

            // Determina o tema com maior e menor pontuação
            if (totalPoints > maxPoints) {
                maxPoints = totalPoints;
                maxTopic = topics[i];
            }
            if (totalPoints < minPoints) {
                minPoints = totalPoints;
                minTopic = topics[i];
            }
        }

        // Exibe o tema com maior e menor pontuação
        System.out.println("\nTema com maior pontuação: " + maxTopic + " (Total: " + maxPoints + ")");
        System.out.println("Tema com menor pontuação: " + minTopic + " (Total: " + minPoints + ")");
    }
}