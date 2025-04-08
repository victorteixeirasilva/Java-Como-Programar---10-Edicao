import java.time.LocalDate;

//Modifique o sistema de folha de pagamento das figuras 10.4 a 10.9 para
// incluir a variável de instância private birthDate na classe Employee.
// Utilize a classe Date da Figura 8.7 para representar o aniversário de
// um funcionário. Adicione métodos get à classe Date. Suponha que a folha
// de pagamento seja processada uma vez por mês. Crie um array de variáveis
// Employee para armazenar referências aos vários objetos de funcionário.
// Em um loop, calcule a folha de pagamento para cada Employee (polimorficamente)
// e adicione um bônus de US$ 100.00 à quantia da folha de pagamento do funcionário
// se o mês atual for aquele em que ocorre o aniversário do Employee.
public class Main {
    public static void main(String[] args) {
        // Criação de array de objetos Employee
        Employee[] employees = new Employee[2];

        employees[0] = new SalariedEmployee("John", "Doe", "123", 3000.00, new Date(4,8,2003));
        employees[1] = new HourlyEmployee("Jane", "Smith", "213",20.00, 160, new Date(8,23,2003));

        // Data atual
        LocalDate today = LocalDate.now();

        // Processa cada Employee
        for (Employee emp : employees) {
            double totalPay = emp.earnings();

            // Adiciona bônus se for o mês de aniversário
            if (emp.getBirthDate().getMonth() == today.getMonthValue()) {
                totalPay += 100.00;
            }

            System.out.printf("%s - Total Payment: $%,.2f%n", emp, totalPay);
        }
    }

}
