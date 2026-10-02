package payrollsystem;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ManagerTest {

    private Manager employee;

    @BeforeEach
    void setUp() {
        employee = new Manager(
                1000, 800, 300,
                "EMP103", "Priya", 5000);
    }

    @Test
    void shouldCalculateGrossSalary() {
        assertEquals(7100, employee.calculateGrossSalary());
    }

    @Test
    void shouldCalculateDeduction() {
        assertEquals(852, employee.calculateDeduction());
    }

    @Test
    void shouldCalculateNetSalary() {
        assertEquals(6248, employee.calculateNetSalary());
    }
}
