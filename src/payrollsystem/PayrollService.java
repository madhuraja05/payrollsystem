package payrollsystem;

public class PayrollService {

    public void processEmployee(Employee employee) {

        System.out.println("Processing payroll for: "
                + employee.getemployeename());

        System.out.println("Gross Salary: "
                + employee.calculateGrossSalary());

        System.out.println("Deduction: "
                + employee.calculateDeduction());

        System.out.println("Net Salary: "
                + employee.calculateNetSalary());

        System.out.println();
    }
}
