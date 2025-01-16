// Figura 3.8: Account.java
// Classe Account com uma variável de instância balance do tipo double e um construtor.
// e método deposit que executa a validação.

public class Account {

    private String name; // Variavel de instância
    private double balance;

    //Construtor de Account que recebe dois parâmetros
    public Account(String name, double balance){
        this.name = name;// Atribui name á variavel de instância name.

        // Valida que o balance é maior que 0.0; se não for.
        // a variável de instância balance mantém seu valor inicial padrão de 0.0.
        if (balance > 0.0){ // se o saldo for válido
            this.balance = balance;
        }

    }

    public void deposit(double depositAmount) {
        if (depositAmount > 0.0) //Se depositAmount for válido
            this.balance = balance + depositAmount; // O adiciona ao saldo
    }

    public double getBalance(){
        return balance;
    }

    //Método que define o nome
    public void setName(String name){
        this.name = name;
    }

    //Método que retorna o nome
    public String getName(){
        return name;// Retorna o valor de name ao chamador
    } // Fim do método getName.
} // Fim da classe Account
