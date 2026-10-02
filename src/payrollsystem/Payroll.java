package payrollsystem;

public class Payroll {
    private Employee employee;

    public Payroll(Employee employee) {
        this.employee = employee;
    }

    public void processPayroll() {
        System.out.println("Payroll processed for: " + employee.getemployeename());
    }

    public void generatePayslip() {
        employee.displayEmployeeDetails();
        System.out.println("Gross Salary: " + employee.calculateGrossSalary());
        System.out.println("Deduction: " + employee.calculateDeduction());
        System.out.println("Net Salary: " + employee.calculateNetSalary());
    }
}

