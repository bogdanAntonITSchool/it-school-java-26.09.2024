package srp;

import srp.solution.NewEmployee;
import srp.solution.ReportGenerator;
import srp.solution.SalaryCalculator;

/**
 * Refactor the Employee class to adhere to SRP.
 * Split responsibilities into separate classes.
 */
public class Main {

    public static void main(String[] args) {
        NewEmployee employee = new NewEmployee("John Doe", 40, 25.0);

        SalaryCalculator salaryCalculator = new SalaryCalculator();
        System.out.println("Salary: $" + salaryCalculator.calculateSalary(employee));

        ReportGenerator reportGenerator = new ReportGenerator(salaryCalculator);
        reportGenerator.generateReport(employee);
    }

}