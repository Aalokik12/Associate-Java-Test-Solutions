import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// Test class for ProductPriceCalculator
class ProductPriceCalculatorTest {

    // Test various typical use cases with different prices and tax rates
    @Test
    void testCalculateGrossPriceExamples() {
        // Tax is 12%, net price is 99.95 -> gross should be approx. 89.24
        assertEquals(89.24, ProductPriceCalculator.calculateGrossPrice(99.95, 0.12), 0.01);

        // Tax is 28%, net price is 49999.00 -> gross should be approx. 39061.72
        assertEquals(39061.72, ProductPriceCalculator.calculateGrossPrice(49999.00, 0.28), 0.01);

        // Tax is 5%, net price is 720.00 -> gross should be approx. 685.71
        assertEquals(685.71, ProductPriceCalculator.calculateGrossPrice(720.00, 0.05), 0.01);

        // Tax is 0%, net price equals gross price
        assertEquals(45.00, ProductPriceCalculator.calculateGrossPrice(45.00, 0.00), 0.01);
    }

    // Test behavior when tax rate is zero
    @Test
    void testWithZeroTax() {
        // With zero tax, gross price should be same as net price
        assertEquals(100.00, ProductPriceCalculator.calculateGrossPrice(100.00, 0.0), 0.01);
    }

    // Test with an extreme case: 100% tax rate
    @Test
    void testWithHighTaxRate() {
        // With 100% tax, gross price should be half of net price
        assertEquals(500.00, ProductPriceCalculator.calculateGrossPrice(1000.00, 1.0), 0.01);
    }

    // Test negative inputs which should throw IllegalArgumentException
    @Test
    void testNegativeInputs() {
        // Negative net price should throw exception
        assertThrows(IllegalArgumentException.class, () -> ProductPriceCalculator.calculateGrossPrice(-100.0, 0.1));

        // Negative tax rate should throw exception
        assertThrows(IllegalArgumentException.class, () -> ProductPriceCalculator.calculateGrossPrice(100.0, -0.1));
    }
}
