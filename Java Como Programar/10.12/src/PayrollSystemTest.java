// Figura 10.9: PayrollSystemTest.java
// Programa de teste da hierarquia Employee.

public class PayrollSystemTest
{
    public static void main(String[] args)
    {
        // cria objetos de subclasse
        SalariedEmployee salariedEmployee =
                new SalariedEmployee("John", "Smith", "111-11-1111", 800.00, new Date(4,8,2003));
        HourlyEmployee hourlyEmployee =
                new HourlyEmployee("Karen", "Price", "222-22-2222", 16.75, 40, new Date(8,8,2003));
        CommissionEmployee commissionEmployee =
                new CommissionEmployee(
                        "Sue", "Jones", "333-33-3333", 10000, .06, new Date(8,8,2003));
        BasePlusCommissionEmployee basePlusCommissionEmployee =
                new BasePlusCommissionEmployee(
                        "Bob", "Lewis", "444-44-4444", 5000, .04, 300, new Date(8,8,2003));

        System.out.println("Employees processed individually:");

        System.out.printf("%n%s%n%s: $%,.2f%n%n",
                salariedEmployee, "earned", salariedEmployee.earnings());
        System.out.printf("%s%n%s: $%,.2f%n%n",
                hourlyEmployee, "earned", hourlyEmployee.earnings());
        System.out.printf("%s%n%s: $%,.2f%n%n",
                commissionEmployee, "earned", commissionEmployee.earnings());
        System.out.printf("%s%n%s: $%,.2f%n%n",
                basePlusCommissionEmployee,
                "earned", basePlusCommissionEmployee.earnings());

        // cria um array Employee de quatro elementos
        Employee[] employees = new Employee[4];

        // inicializa o array com Employees
        employees[0] = salariedEmployee;
        employees[1] = hourlyEmployee;
        employees[2] = commissionEmployee;
        employees[3] = basePlusCommissionEmployee;

        System.out.printf("Employees processed polymorphically:%n%n");

        // processa genericamente cada elemento no employees
        for (Employee currentEmployee : employees)
        {
            System.out.println(currentEmployee); // invoca toString

            // determina se elemento é um BasePlusCommissionEmployee
            if (currentEmployee instanceof BasePlusCommissionEmployee employee) {
                // downcast da referência de Employee para
                // referência a BasePlusCommissionEmployee

                employee.setBaseSalary(1.10 * employee.getBaseSalary());

                System.out.printf(
                        "new base salary with 10%% increase is: $%,.2f%n",
                        employee.getBaseSalary());
            } // fim do if

            System.out.printf(
                    "earned $%,.2f%n%n", currentEmployee.earnings());
        } // for final

        // obtém o nome do tipo de cada objeto no array employees
        for (int j = 0; j < employees.length; j++)
            System.out.printf("Employee %d is a %s%n", j,
                    employees[j].getClass().getName());
    } // fim de main
} // fim da classe PayrollSystemTest