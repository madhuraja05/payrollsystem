package payrollsystem;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SalaryParameterizedTest {

    @ParameterizedTest
    @CsvSource({
            "3000, 500, 200, 3700",
            "4000, 600, 300, 4900",
            "5000, 800, 400, 6200"
    })
    void shouldCalculatePermanentEmployeeGrossSalary(
            double basicSalary,
            double houseAllowance,
            double transportAllowance,
            double expectedGross) {

        PermanentEmployee employee =
                new PermanentEmployee(
                        houseAllowance,
                        transportAllowance,
                        "EMP101",
                        "Arun",
                        basicSalary);

        assertEquals(
                expectedGross,
                employee.calculateGrossSalary()
        );
    }
}
