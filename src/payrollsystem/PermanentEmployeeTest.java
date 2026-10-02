
package payrollsystem;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PermanentEmployeeTest {

    private PermanentEmployee employee;

    @BeforeEach
    void setUp() {
        employee = new PermanentEmployee(
                500, 200, "EMP101", "Arun", 3000);
    }

    @Test
    void shouldCalculateGrossSalary() {
        assertEquals(3700, employee.calculateGrossSalary());
    }

    @Test
    void shouldCalculateDeduction() {
        assertEquals(370, employee.calculateDeduction());
    }

    @Test
    void shouldCalculateNetSalary() {
        assertEquals(3330, employee.calculateNetSalary());
    }
}
