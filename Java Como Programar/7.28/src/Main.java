import java.security.SecureRandom;

/**
 * @author Victor Teixeira Silva
 * @version 1.0
 *
 * @description
 * 7.28 - (Simulação: a tartaruga e a lebre) Neste problema, você recriará a clássica corrida da tartaruga e da lebre. Você utilizará geração de números aleatórios para desenvolver uma simulação desse evento memorável. Nossos competidores começam a corrida no quadrado 1 de 70 quadrados. Cada um representa uma possível posição ao longo do percurso da competição. A linha de chegada está no quadrado 70. O primeiro competidor a alcançar ou passar  o quadrado 70 é recompensado com um cesto de cenouras frescas e alface. O percurso envolve subir uma montanha escorregadia, por isso, ocasionalmente os competidores perdem terreno. Um relógio emite um tique por segundo. A cada tique-taque do relógio, seu aplicativo deve ajustar a posição dos animais de acordo com as regras na Figura 7.32. Use variáveis para monitorar as posições dos animais (isto é, os números de posição são 1 a 70). Inicie cada animal na posição 1 (a “largada”). Se um animal escorregar para a esquerda do quadrado 1, mova-o novamente para o quadrado.
 *
 * | Animal | Tipo de movimento | Porcentagem de tempo | Movimento real |
 * | --- | --- | --- | --- |
 * | Tartaruga | Caminhada rápida | 50% | 3 quadrados à direita |
 * |  | Escorregão | 20% | 6 quadrados à esquerda |
 * |  | Caminhada lenta | 30% | 1 quadrado à direita |
 * | Lebre | Dormir | 20% | Sem nenhum movimento |
 * |  | Salto grande | 20% | 9 quadrados à direita |
 * |  | Escorregão grande | 10% | 12 quadrados à direita |
 * |  | Salto pequeno | 30% | 1 quadrado à direita |
 * |  | Escorregão pequeno | 20% | 2 quadrados à esquerda |
 *
 * Figura 7.32 | Regras para ajustar as posições da tartaruga e da lebre.
 *
 * ### Gere as porcentagens na Figura 7.32 produzindo um inteiro aleatório i no intervalo 1≤i≤10. Para a tartaruga, realize uma “caminhada rápida” quando 1≤i≤5, um “escorregão” quando 6≤i≤7 ou uma “caminhada lenta” quando 8≤i≤10. Utilize uma técnica semelhante para mover a lebre. Comece a corrida exibindo
 *
 * BANG !!!!!
 *
 * E LÁ VÃO ELES !!!!!
 *
 * ### Então, para cada tique do relógio (isto é, para cada repetição de um loop), exiba uma linha de 70 posições mostrando a letra T na posição da tartaruga e a letra H na posição da lebre. Ocasionalmente, os competidores ocuparão o mesmo quadrado. Nesse caso, a tartaruga morde a lebre e seu aplicativo deve exibir AI ! ! ! começando nessa posição. Todas as outras posições da saída diferentes de T, H ou AI ! ! ! (no caso de um empate) devem estar em branco. Depois de cada linha ser exibida, teste se o animal alcançou ou passou o quadrado 70. Se tiver alcançado, exiba o vencedor e termine a simulação. Se a tartaruga ganhar, exiba A TARTARUGA VENCEU ! ! ! EH ! ! ! Se a lebre ganhar, exiba A LEBRE GANHOU. OH. Se os dois ganharem na mesma hora, você pode querer favorecer a tartaruga (a “coitadinha”) ou exibir OCORREU UM EMPATE. Se nenhum animal ganhar, realize o loop novamente para simular o próximo tique do relógio. Quando você estiver pronto para executar seu aplicativo, monte um grupo de fãs para observar a corrida. Você se surpreenderá com a empolgação da sua audiência! Mais adiante no livro, introduziremos várias capacidades do Java, como gráficos, imagens, animação, som e multithreading. À medida que estudar esses recursos, você pode se divertir aprimorando sua simulação da competição entre a lebre e a tartaruga.
 *
 * ****************************************
 * Início
 *  |
 *  | (1) Inicializar posições da tartaruga e da lebre na posição 1
 *  |     Exibir "BANG !!!!!" e "E LÁ VÃO ELES !!!!!"
 *  V
 *  | (2) Iniciar loop da corrida (por segundo)
 *  |    |    Gerar número aleatório 'i' para determinar movimento da tartaruga
 *  |    |    Atualizar posição da tartaruga com base em 'i'
 *  |    |    Gerar número aleatório 'j' para determinar movimento da lebre
 *  |    |    Atualizar posição da lebre com base em 'j'
 *  |    |    Corrigir posição se algum animal for para a esquerda da posição 1
 *  |    |    Exibir linha de 70 posições com T e H
 *  |    |    Se tartaruga e lebre estiverem na mesma posição, exibir "AI!!!"
 *  |    |    Verificar se algum animal alcançou ou passou a posição 70
 *  |    |        | Se a tartaruga ganhar, exibir "A TARTARUGA VENCEU !!! EH !!!" e terminar
 *  |    |        | Se a lebre ganhar, exibir "A LEBRE GANHOU. OH." e terminar
 *  |    |        | Se ambos ganharem, exibir "OCORREU UM EMPATE" e terminar
 *  |    |    Repetir loop
 *  V
 * Fim
 * ******************************************
 *
 *
 */
public class Main {
    static int posicaoLebre = 1;
    static int posicaoTartaruga = 1;
    static SecureRandom secureRandom = new SecureRandom();
    static String[] corrida = new String[70];

    public static void main(String[] args) {

        System.out.println(" BANG !!!!!");
        System.out.println(" E LÁ VÃO ELES !!!!!");

        int relogio = 0;
        while (relogio > -1){
            System.out.println(" Relógio: "+ relogio);
            movimentoTartaruga();
            movimentoLebre();
            exibirCorrida();
            if ((posicaoLebre == 69) && (posicaoTartaruga == 69)) {
                System.out.println(" OCORREU UM EMPATE ");
                relogio = -1;
                posicaoLebre = 1;
                posicaoTartaruga = 1;
            } else if (posicaoTartaruga == 69) {
                System.out.println(" A TARTARUGA VENCEU !!! EH !!! ");
                break;
            } else if (posicaoLebre == 69) {
                System.out.println(" A LEBRE GANHOU. OH. ");
                break;
            }
            relogio++;

        }
    }

    public static void exibirCorrida(){
        for (int i = 0; i < 70; i++){
            if (posicaoTartaruga == posicaoLebre){
                System.out.println("AI!!!");
                corrida[posicaoTartaruga] = "TH";
            } else {
                corrida[posicaoLebre] = "H";
                corrida[posicaoTartaruga] = "T";
                if ((i != posicaoLebre) && (i != posicaoTartaruga)){
                    corrida[i] = "*";
                }
            }
        }
        for (int b = 0; b < 70; b++){
            System.out.print(corrida[b]);
        }
    }

    public static void movimentoTartaruga(){
        int movimentoTartaruga = secureRandom.nextInt(1, 10);
        if ((movimentoTartaruga >= 1) && (movimentoTartaruga <= 5)){
            if (posicaoTartaruga + 3 < 70){
                posicaoTartaruga += 3;
            } else {
                posicaoTartaruga = 69;
            }
        } else if ((movimentoTartaruga >= 6) && (movimentoTartaruga <= 8)) {
            if ((posicaoTartaruga - 6 >= 1)){
                posicaoTartaruga -= 6;
            } else {
                posicaoTartaruga = 1;
            }
        } else if ((movimentoTartaruga >= 9) && (movimentoTartaruga <= 10)) {
            if (posicaoTartaruga + 1 < 70){
                posicaoTartaruga += 1;
            } else {
                posicaoTartaruga = 69;
            }
        }
    }

    public static void movimentoLebre(){
        int movimentoLebre = secureRandom.nextInt(1, 10);
        if ((movimentoLebre >= 3) && (movimentoLebre <= 4)) {
            if (posicaoLebre + 9 < 70){
                posicaoLebre += 9;
            } else {
                posicaoLebre = 69;
            }
        } else if (movimentoLebre == 5) {
            if ((posicaoLebre - 12 >= 1)){
                posicaoLebre -= 12;
            } else {
                posicaoLebre = 1;
            }
        } else if ((movimentoLebre >= 6) && (movimentoLebre <= 8)) {
            if (posicaoLebre + 1 < 70) {
                posicaoLebre += 1;
            } else {
                posicaoLebre = 69;
            }
        } else if ((movimentoLebre >= 9) && (movimentoLebre <= 10)) {
            if (posicaoLebre - 2 >= 1) {
                posicaoLebre -= 2;
            } else {
                posicaoLebre = 1;
            }
        }
    }


}