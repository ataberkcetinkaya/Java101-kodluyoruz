public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;

    Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public void getEmployeeInfo() { //toString()
        System.out.println("Name: " + this.name);
        System.out.println("Salary: " + this.salary);
        System.out.println("Working Hours: " + this.workHours);
        System.out.println("Started year: " + this.hireYear);
    }

    int SalaryWithTaxAndBonus = 0; //90

    public void tax() {
        if (this.salary < 1000) {
            System.out.println("Salary: " + this.salary);;
        }
        else if (this.salary > 1000) {
            int tax = this.salary / 100 * 3;
            System.out.println("Tax: " + tax); //60
            SalaryWithTaxAndBonus = tax + SalaryWithTaxAndBonus;
        }
    }

    public void bonus() {
        if (this.workHours > 40) {
            int overtime = this.workHours - 40;
            int overTimeResult = overtime * 30;
            System.out.println("Bonus: " + overTimeResult); //150
            SalaryWithTaxAndBonus = overTimeResult - SalaryWithTaxAndBonus;
        }
    }

    public void salaryWithTaxAndBonus() {
        System.out.println("Salary With Taxes And Bonuses: " + (this.salary + SalaryWithTaxAndBonus));
    }

    public void raiseSalary() { //suanki yil 2021
        if ((hireYear <= 2021) && (hireYear > 2011)) { //10 yıldan az bir süredir çalışıyorsa maaşına %5 zam
            int bonus = this.salary / 100 * 5;
            int bonusYears = bonus + this.salary;
            System.out.println("Salary increase ratio: " + bonus);
            System.out.println("Total Salary: " + bonusYears);
        }
        else if ((hireYear <= 2012) && (hireYear > 2001)) { //9 yıldan fazla ve 20 yıldan az çalışıyorsa maaşına %10 zam
            int bonus = this.salary / 100 * 10;
            int bonusYears = bonus + this.salary;
            System.out.println("Salary increase ratio: " + bonus);
            System.out.println("Total Salary: " + bonusYears);
        }
        else if ((hireYear <= 2002)) { //19 yıldan fazla çalışıyorsa %15 zam
            int bonus = this.salary / 100 * 15;
            int bonusYears = bonus + this.salary;
            System.out.println("Salary increase ratio: " + bonus);
            System.out.println("Total Salary: " + bonusYears);
        }
    }
}
