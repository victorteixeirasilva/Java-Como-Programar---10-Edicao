/*
 @Autor Victor Teixeira Silva

 (Classe Employee) Crie uma classe chamada Employee que inclua três variáveis de instância - um primeiro nome (tipo String),
 um sobrenome (tipo String) e um salário mensal (double). Forneça um construtor que inicializa as três variáveis de instância. Forneça
 um método set e um get para cada variável de instância. Se o salário mensal não for positivo, não configure seu valor. Escreva um aplicativo
 de teste chamado EmployeeTest que demonstre as capacidades da classe Employee. crie dois objetos Employee e exiba o salário anual de cada
 objeto. Então dê a cada Employee um qaumento de 10% e exiba novamente o salário anual de cada Employee.


 */
public class Employee {

    private String firstName;
    private String lastName;
    private double monthlySalary;

    public Employee(String firstName, String lastName, double monthlySalary){
        this.firstName = firstName;
        this.lastName = lastName;
        this.monthlySalary = monthlySalary;

    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        if (monthlySalary >= 0) this.monthlySalary = monthlySalary;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
