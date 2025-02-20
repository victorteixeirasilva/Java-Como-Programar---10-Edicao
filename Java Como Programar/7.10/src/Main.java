/**
 * @author Victor Teixeira Silva
 * @version 1.0
 *
 * @description 7.10 - (Comissões de vendas) Utilize um array unidimensional para resolver o seguinte problema: uma
 *              empresa paga seu pessoal de vendas por comissão. O pessoal de vendas recebe R$ 200 por semana mais 9% de
 *              suas vendas brutas durante essa semana. Por exemplo, um vendedor que vende R$ 5.000 brutos em uma semana
 *              recebe R$ 200 mais 9% de R$ 5.000 ou um total de R$ 650. Escreva um aplicativo (utilizando um array de
 *              contadores) que determina quanto o pessoal de vendas ganhou em cada um dos seguintes intervalos (suponha
 *              que o salário de cada vendedor foi truncado para uma quantia inteira):
 *              A) $200-299
 *              B) $300-399
 *              C) $400-499
 *              D) $500-599
 *              E) $600-699
 *              F) $700-799
 *              G) $800-899
 *              H) $900-999
 *              I) $1.000 e acima.
 *              Resuma os resultados em formato tabular.
 */
public class Main {
    public static void main(String[] args) {
        // Array de contadores para as faixas de comissão
        int[] faixasComissao = new int[9];

        // Lista de vendas brutas dos vendedores durante a semana
        int[] vendasBrutas = {5000, 3000, 7000, 2000, 4500, 6000, 8000, 10000, 1500};

        // Calcula os salários e incrementa os contadores
        for (int vendas : vendasBrutas) {
            int salario = 200 + (int)(0.09 * vendas);
            if (200 <= salario && salario < 300) {
                faixasComissao[0]++;
            } else if (300 <= salario && salario < 400) {
                faixasComissao[1]++;
            } else if (400 <= salario && salario < 500) {
                faixasComissao[2]++;
            } else if (500 <= salario && salario < 600) {
                faixasComissao[3]++;
            } else if (600 <= salario && salario < 700) {
                faixasComissao[4]++;
            } else if (700 <= salario && salario < 800) {
                faixasComissao[5]++;
            } else if (800 <= salario && salario < 900) {
                faixasComissao[6]++;
            } else if (900 <= salario && salario < 1000) {
                faixasComissao[7]++;
            } else {
                faixasComissao[8]++;
            }
        }

        // Resumo dos resultados em formato tabular
        String[] faixas = {
                "200-299",
                "300-399",
                "400-499",
                "500-599",
                "600-699",
                "700-799",
                "800-899",
                "900-999",
                "1000 e acima"
        };

        System.out.printf("%-10s %-10s%n", "Faixa", "Vendedores");
        for (int i = 0; i < faixasComissao.length; i++) {
            System.out.printf("%-10s %-10d%n", faixas[i], faixasComissao[i]);
        }
    }
}