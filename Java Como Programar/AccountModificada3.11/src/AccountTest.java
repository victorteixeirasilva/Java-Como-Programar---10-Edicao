// Figura 3.9: AccountTest.Java
//Entrada e saída de números de ponto flutuante com objetos Account.
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
        System.out.printf("%s balance: $"+account1.getBalance()+"%n", account1.getName());
        System.out.printf("%s balance: $"+account2.getBalance()+"%n", account2.getName());

        System.out.print("Enter deposit amount for account2: ");// prompt
        depositAmount = input.nextDouble();
        System.out.printf("%nadding to account1 balance%n%n", depositAmount);
        account2.deposit(depositAmount);

        //Exibe os saldos
        System.out.printf("%s balance: $"+account1.getBalance()+"%n", account1.getName());
        System.out.printf("%s balance: $"+account2.getBalance()+"%n", account2.getName());

        System.out.print("Enter withdraw amount for account1: ");// prompt
        double withdrawAmount = input.nextDouble();
        account1.withdrawal(withdrawAmount);

        //Exibe os saldos
        System.out.printf("%s balance: $"+account1.getBalance()+"%n", account1.getName());
        System.out.printf("%s balance: $"+account2.getBalance()+"%n", account2.getName());

        System.out.print("Enter withdraw amount for account2: ");// prompt
        withdrawAmount = input.nextDouble();
        account2.withdrawal(withdrawAmount);

        //Exibe os saldos
        System.out.printf("%s balance: $"+account1.getBalance()+"%n", account1.getName());
        System.out.printf("%s balance: $"+account2.getBalance()+"%n", account2.getName());

    } // Fim de main
} // Fim da classe AcountTest