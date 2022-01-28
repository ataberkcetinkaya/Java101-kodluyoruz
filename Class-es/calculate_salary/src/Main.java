public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Kemal", 2000, 45, 1985);
        Employee employee2 = new Employee("Ahmet", 2500, 43, 1986);
        Employee employee3 = new Employee("Yeliz", 1500, 55, 2009);

        employee1.getEmployeeInfo();
        employee1.tax();
        employee1.bonus();
        employee1.salaryWithTaxAndBonus();
        employee1.raiseSalary();

        System.out.println("================================");

        employee2.getEmployeeInfo();
        employee2.tax();
        employee2.bonus();
        employee2.salaryWithTaxAndBonus();
        employee2.raiseSalary();

        System.out.println("================================");

        employee3.getEmployeeInfo();
        employee3.tax();
        employee3.bonus();
        employee3.salaryWithTaxAndBonus();
        employee3.raiseSalary();
    }}
