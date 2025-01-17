// Figura 3.9: AccountTest.Java
//Entrada e saída de números de ponto flutuante com objetos Account.
/*

    (Removendo código duplicado no método main) Na classe AccountTest da Figura 3.9 o método main contém seis instruçõess
e cada uma exibe name e balance do objeto Account. Estude essas instruções e você perceberá que elas só dizem no objeto
Account sendo manipulado - Account1 ou Account2. Neste exercício, Você difinirá um novo método displayAccount que contém
uma cópia dessa instrução de saída. O parametro do método será um objeto Account e o método irá gerar name e balance dele.
Então você substiruirá as seis instruções duplicadas em main por chamadas para displayAccount passando como argumento o
objeto específico Account para saída.
    Modifique a classe AccountTest da Figura 3.9 para declarar o seguinte método displayAccount após a chave direita de
fechamento de main antes da chave direita de fechamento da classe AccountTest:

public static void displayAccount(Account accountToDisplay){
        // coloque aqui a instrução que exibe
        // o name e o balance de accountToDisplay
}

    Substitua o comentário no corpo do método por uma instrução que exiba name e balance de accountToDisplay.
Le mbre-se de que main é um método static, assim pode ser chamado sem antes criar um objeto da classe em que é declarado.
Também declaramos p método displayAccount como método static. Quando main tem de chamar outro método na mesma classe
sem antes criar um objeto dela, o outro método também deve ser declarado static.


 */
import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {

        Account account1 = new Account("Jane Green", 50.0);
        Account account2 = new Account("John Blue", -7.53);

        // Exibe saldo inicial de cada objeto
        System.out.printf("%s balance: $"+account1.getBalance()+"%n", account1.getName());
        System.out.printf("%s balance: $"+account2.getBalance()+"%n", account2.getName());


        //Cria um Scanner para obter entrada a partir da janela de comando
        Scanner input = new Scanner(System.in);

        System.out.print("Enter deposit amount for account1: ");// prompt
        double depositAmount = input.nextDouble();
        System.out.printf("%nadding to account1 balance%n%n", depositAmount);
        account1.deposit(depositAmount);

        //Exibe os saldos
        displayAccount(account1);
        displayAccount(account2);

        System.out.print("Enter deposit amount for account2: ");// prompt
        depositAmount = input.nextDouble();
        System.out.printf("%nadding to account1 balance%n%n", depositAmount);
        account2.deposit(depositAmount);

        //Exibe os saldos
        displayAccount(account1);
        displayAccount(account2);

        System.out.print("Enter withdraw amount for account1: ");// prompt
        double withdrawAmount = input.nextDouble();
        account1.withdrawal(withdrawAmount);

        //Exibe os saldos
        displayAccount(account1);
        displayAccount(account2);

        System.out.print("Enter withdraw amount for account2: ");// prompt
        withdrawAmount = input.nextDouble();
        account2.withdrawal(withdrawAmount);

        //Exibe os saldos
        displayAccount(account1);
        displayAccount(account2);

    } // Fim de main

    public static void displayAccount(Account accountToDisplay){
        System.out.printf("%s balance: $"+accountToDisplay.getBalance()+"%n", accountToDisplay.getName());
    }
} // Fim da classe AcountTest