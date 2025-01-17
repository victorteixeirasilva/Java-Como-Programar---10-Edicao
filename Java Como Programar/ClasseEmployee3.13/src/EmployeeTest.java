public class EmployeeTest {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Victor", "Teixeira", 5000);
        Employee employee2 = new Employee("Arthur", "Teixeira", 3000);

        System.out.println(employee1.getMonthlySalary());
        System.out.println(employee2.getMonthlySalary());

        employee1.setMonthlySalary(employee1.getMonthlySalary()+400);
        employee2.setMonthlySalary(employee2.getMonthlySalary()+1000);

        System.out.println(employee1.getMonthlySalary());
        System.out.println(employee2.getMonthlySalary());

        System.out.println(employee1.getMonthlySalary()*12);
        System.out.println(employee2.getMonthlySalary()*12);

    }
}