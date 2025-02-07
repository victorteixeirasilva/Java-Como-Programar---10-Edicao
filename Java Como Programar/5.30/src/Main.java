/**
 * @author Victor Teixeira Silva
 * @version 1.0
 *
 * @description 5.30 - (Classe AutoPolicy modificada) Modifique a classe AutoPolicy na Figura 5.11 para validar códigos
 *              de estado de duas letras para os estados do nordeste dos EUA. Os códigos são: CT para Connecticut, MA
 *              para Massachusetts, ME para Maine, NH para New Hampshire, NJ para New Jersey, NY para Nova York, PA
 *              para Pensilvânia e VT para Vermont. No método AutoPolicy setState use o operador lógico OU (| |)(Seção
 *              5.9) para criar uma condição composta em uma instrução if…else que compara o argumento do método com
 *              cada código de duas letras. Se o código estiver incorreto, a parte else da instrução if…else deve exibir
 *              uma mensagem de erro. Nos próximos capítulos, você aprenderá a usar o tratamento de exceções para
 *              indicar que um método recebeu um valor inválido.
 */
public class Main {
    public static void main(String[] args) {
        // Cria dois objetos AutoPolicy
        AutoPolicy policy1 = new AutoPolicy(111111, "Toyota Carmy","NY");
        AutoPolicy policy2 = new AutoPolicy(222222, "Ford Fusion","CT");

        // Exibe se cada apólice está em um estado "sem culpa"
        policyInNoFaultState(policy1);
        policyInNoFaultState(policy2);
    }

    // Método que mostra se um AutoPolicy está em um estado com seguro de automóvel "sem culpa"
    public static void policyInNoFaultState(AutoPolicy policy) {
        System.out.println("The auto policy:");
        System.out.printf(
                "Account #: %d; Car: %s; State: %s %s a no-fault state%n%n",
                policy.getAccountNumber(), policy.getMakeAndModel(), policy.getState(),
                (policy.inNoFaultState() ? "is": "is not"));
    }
}