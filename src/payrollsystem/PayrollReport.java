package payrollsystem;

import java.util.List;

public class PayrollReport {

    public void displayReport(List<Employee> employees) {

        System.out.println("===== PAYROLL REPORT =====");

        for (Employee employee : employees) {

            System.out.println("Employee ID: "
                    + employee.getemployeeid());

            System.out.println("Employee Name: "
                    + employee.getemployeename());

            System.out.println("Gross Salary: "
                    + employee.calculateGrossSalary());

            System.out.println("Deduction: "
                    + employee.calculateDeduction());

            System.out.println("Net Salary: "
                    + employee.calculateNetSalary());

            System.out.println("--------------------------");
        }
    }
}