package payrollsystem;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContractEmployeeTest {

    private ContractEmployee employee;

    @BeforeEach
    void setUp() {
        employee = new ContractEmployee(
                400, "EMP102", "Ravi", 3000);
    }

    @Test
    void shouldCalculateGrossSalary() {
        assertEquals(3400, employee.calculateGrossSalary());
    }

    @Test
    void shouldCalculateDeduction() {
        assertEquals(170, employee.calculateDeduction());
    }

    @Test
    void shouldCalculateNetSalary() {
        assertEquals(3230, employee.calculateNetSalary());
    }
}
