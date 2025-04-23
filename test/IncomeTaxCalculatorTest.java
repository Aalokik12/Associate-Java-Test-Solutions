import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// Test class for the IncomeTaxCalculator class
class IncomeTaxCalculatorTest {

    // Test case for income below taxable limit
    @Test
    void testZeroTax() {
        // Income is 190000, which should result in zero tax
        assertEquals(0.0, IncomeTaxCalculator.computeTax(190000), 0.001);
    }

    // Test case for income in the middle slab
    @Test
    void testMiddleSlab() {
        // Income is 345000, expected tax calculated based on slab rules
        assertEquals(9500.0, IncomeTaxCalculator.computeTax(345000), 0.001);
    }

    // Test case for income in the upper slab
    @Test
    void testUpperSlab() {
        // Income is 780000, test if tax for upper range is computed correctly
        assertEquals(81000.0, IncomeTaxCalculator.computeTax(780000), 0.001);
    }

    // Test case for income in the highest slab
    @Test
    void testHighestSlab() {
        // Income is 2400000, test if maximum slab logic is handled
        assertEquals(545000.0, IncomeTaxCalculator.computeTax(2400000), 0.001);
    }

    // Edge case: income exactly at the threshold of tax-free slab
    @Test
    void testEdge() {
        // Income is 250000, boundary of tax-free limit
        assertEquals(0.0, IncomeTaxCalculator.computeTax(250000), 0.001);
    }
}
