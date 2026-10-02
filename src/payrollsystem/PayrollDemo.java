package payrollsystem;

import java.util.ArrayList;
import java.util.List;

public class PayrollDemo {

    public static void main(String[] args) {

        Employee permanent =
                new PermanentEmployee(500, 200, "EMP101", "Arun", 3000);

        Employee contract =
                new ContractEmployee(400, "EMP102", "Ravi", 3000);

        Employee manager =
                new Manager(1000, 800, 300, "EMP103", "Priya", 5000);

        List<Employee> employees = new ArrayList<>();

        employees.add(permanent);
        employees.add(contract);
        employees.add(manager);

        PayrollReport report = new PayrollReport();

        report.displayReport(employees);
    }
}