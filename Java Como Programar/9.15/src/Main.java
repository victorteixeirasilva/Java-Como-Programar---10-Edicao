public class Main {
    public static void main(String[] args) {
        // Instanciação do HourlyEmployee
        HourlyEmployee employee = new HourlyEmployee(
                "Victor", "Silva", "123-45-6789", 20.0, 50.0);

        // Exibição dos dados do HourlyEmployee
        System.out.println(employee);

        // Atualização de horas e salário por hora
        employee.setHours(35.0);
        employee.setWage(22.0);

        // Exibição dos dados atualizados
        System.out.println("\nApós a atualização:");
        System.out.println(employee);
    }

}