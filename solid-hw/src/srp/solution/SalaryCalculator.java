package srp.solution;

public class SalaryCalculator {

    public double calculateSalary(NewEmployee employee) {
        return employee.getHoursWorked() * employee.getHourlyRate();
    }

}
