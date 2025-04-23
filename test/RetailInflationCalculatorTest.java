import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// Test class for RetailInflationCalculator
public class RetailInflationCalculatorTest {

    // Tests a standard example: 20% inflation rate over 5 years
    @Test
    void testExampleCase() {
        // Expected compounded inflation: approx. 149.02%
        assertEquals(149.02, RetailInflationCalculator.calculateCompoundedInflation(0.20, 5), 0.01);
    }

    // Tests the case when the number of years is zero
    @Test
    void testZeroYears() {
        // No time to compound = 0% inflation
        assertEquals(0.0, RetailInflationCalculator.calculateCompoundedInflation(0.10, 0));
    }

    // Tests the case when the inflation rate is zero
    @Test
    void testZeroRate() {
        // Zero rate over any number of years = 0% inflation
        assertEquals(0.0, RetailInflationCalculator.calculateCompoundedInflation(0.0, 10));
    }

    // Tests with a high inflation rate over several years
    @Test
    void testHighRate() {
        // 30% rate over 5 years -> Expected compounded inflation: approx. 259.37%
        assertEquals(259.37, RetailInflationCalculator.calculateCompoundedInflation(0.3, 5), 0.01);
    }

    // Tests that the method throws an exception for invalid (negative) inputs
    @Test
    void testNegativeInput() {
        // Negative inflation rate should throw IllegalArgumentException
        assertThrows(IllegalArgumentException.class, () -> {
            RetailInflationCalculator.calculateCompoundedInflation(-0.1, 5);
        });

        // Negative years should also throw IllegalArgumentException
        assertThrows(IllegalArgumentException.class, () -> {
            RetailInflationCalculator.calculateCompoundedInflation(0.1, -2);
        });
    }
}
